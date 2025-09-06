package com.tiktok.appevents;

import android.text.TextUtils;
import com.tiktok.b.c;
import com.tiktok.b;
import com.tiktok.util.f;
import com.tiktok.util.g;
import com.tiktok.util.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class y {
    private static final String a = "com.tiktok.appevents.y";
    private static final f b = null;
    private static final int c = 50;
    private static int d;
    private static int e;
    private static int f;
    private static final TreeSet g;
    private static final List h;
    private static final Map i;
    private static final Map j;
    public static String k;

    static {
        y.b = new f(y.class.getCanonicalName(), b.o());
        y.d = 0;
        y.e = 0;
        y.f = 0;
        y.g = new TreeSet();
        y.h = new ArrayList();
        HashMap hashMap0 = new HashMap();
        y.i = hashMap0;
        y.j = new HashMap();
        y.k = "tiktok-business-android-sdk";
        hashMap0.put("Content-Type", "application/json");
        hashMap0.put("Connection", "Keep-Alive");
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            y.k = "tiktok-business-unity-android-sdk";
        }
        catch(Throwable unused_ex) {
        }
        y.i.put("User-Agent", "tiktok-business-android-sdk/1.3.7/v1.2");
        y.j.put("Connection", "Keep-Alive");
        y.j.put("User-Agent", "tiktok-business-android-sdk/1.3.7/v1.2");
    }

    public static List a(List list0, int v) {
        List list1 = new ArrayList();
        int v1 = list0.size();
        for(int v2 = 0; v2 < (v1 % v == 0 ? v1 / v : v1 / v + 1); ++v2) {
            list1.add(new ArrayList(list0.subList(v2 * v, Math.min(v1, v2 * v + v))));
        }
        return list1;
    }

    public static JSONObject b(Map map0) {
        long v = System.currentTimeMillis();
        f f0 = y.b;
        f0.c("Try to fetch global configs", new Object[0]);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("app_id", "");
        hashMap0.put("client", "android");
        if(b.A().booleanValue()) {
            hashMap0.put("debug", "true");
        }
        hashMap0.put("sdk_version", "1.3.7");
        hashMap0.put("app_version", "");
        hashMap0.put("tiktok_app_id", "");
        hashMap0.putAll(map0);
        f0.a(g.f("https://analytics.us.tiktok.com/api/v1/app_sdk/config", hashMap0), new Object[0]);
        try {
            JSONObject jSONObject0 = g.c(v).put("latency", System.currentTimeMillis() - v).put("success", false).put("log_id", "");
            b.j().I("config_api", jSONObject0, null);
        }
        catch(Exception unused_ex) {
        }
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.optBoolean("enable_sdk", false);
        return jSONObject1;
    }

    public static List c() {
        synchronized(y.class) {
        }
        return y.h;
    }

    private static void d() {
        com.tiktok.b.f b$f0 = b.v;
        if(b$f0 != null) {
            int v = y.d;
            int v1 = y.f;
            int v2 = y.e;
            int v3 = s.e();
            b$f0.a(v, v1, v2, y.g.size() + v3, y.h.size());
        }
    }

    public static List e(JSONObject jSONObject0, List list0) {
        synchronized(y.class) {
            g.a("com.tiktok.appevents.y");
            if(list0 != null && list0.size() != 0) {
                y.d = list0.size();
                for(Object object0: list0) {
                    Long long0 = ((a)object0).g();
                    y.g.add(long0);
                }
                y.e = 0;
                y.f = 0;
                y.d();
                List list1 = new ArrayList();
                int v1 = 0;
                for(Object object1: y.a(list0, 50)) {
                    List list2 = (List)object1;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: list2) {
                        JSONObject jSONObject1 = y.g(((a)object2));
                        if(jSONObject1 != null) {
                            arrayList0.add(jSONObject1);
                        }
                    }
                    try {
                        jSONObject0.put("batch", new JSONArray(arrayList0));
                    }
                    catch(Exception exception0) {
                        list1.addAll(list2);
                        u.b("com.tiktok.appevents.y", exception0, 2);
                        continue;
                    }
                    try {
                        String s = jSONObject0.toString(4);
                        y.b.a("To Api:\n" + s, new Object[0]);
                    }
                    catch(JSONException unused_ex) {
                    }
                    String s1 = com.tiktok.util.a.d("https://analytics.us.tiktok.com/api/v1/app_sdk/batch", y.i, jSONObject0.toString());
                    if(s1 == null) {
                        list1.addAll(list2);
                        y.e += list2.size();
                    }
                    else {
                        try {
                            int v2 = new JSONObject(s1).getInt("code");
                            if(b.A().booleanValue() || v2 == ((int)com.tiktok.util.d.a.c.a) || v2 == ((int)com.tiktok.util.d.a.b.a)) {
                                v1 += list2.size();
                                y.e += list2.size();
                            }
                            else if(v2 == 0) {
                                y.f += list2.size();
                                y.h.addAll(list2);
                            }
                            else {
                                list1.addAll(list2);
                                y.e += list2.size();
                            }
                        }
                        catch(JSONException jSONException0) {
                            y.e += list2.size();
                            list1.addAll(list2);
                            u.b("com.tiktok.appevents.y", jSONException0, 2);
                        }
                        String s2 = g.g(s1);
                        y.b.a(s2, new Object[0]);
                    }
                    y.d();
                }
                f f0 = y.b;
                f0.a("Flushed %d events successfully", new Object[]{y.f});
                if(list1.size() != 0) {
                    f0.a("Failed to flush %d events, will save them to disk", new Object[]{list1.size()});
                }
                if(v1 != 0) {
                    f0.a("Failed to flush " + v1 + " events, will discard them", new Object[0]);
                    p.q += v1;
                    c b$c0 = b.t;
                    if(b$c0 != null) {
                        b$c0.a(p.q);
                    }
                }
                f0.a("Failed to flush %d events in total", new Object[]{y.e});
                y.d = 0;
                y.e = 0;
                y.f = 0;
                y.d();
                return list1;
            }
            return new ArrayList();
        }
    }

    // 去混淆评级： 中等(60)
    public static String f(JSONObject jSONObject0) {
        return com.tiktok.util.a.d("https://analytics.us.tiktok.com/api/v1/app_sdk/monitor", y.i, jSONObject0.toString());
    }

    private static JSONObject g(a a0) {
        if(a0 == null) {
            return null;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("type", a0.f());
            if(a0.b() != null) {
                jSONObject0.put("event", a0.b());
            }
            if(!TextUtils.isEmpty(a0.a())) {
                jSONObject0.put("event_id", a0.a());
            }
            jSONObject0.put("timestamp", h.b(a0.e()));
            if(b.B().booleanValue()) {
                jSONObject0.put("limited_data_use", true);
            }
            JSONObject jSONObject1 = new JSONObject(a0.c());
            if(jSONObject1.length() != 0) {
                jSONObject0.put("properties", jSONObject1);
            }
            jSONObject0.put("context", z.f(a0));
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
        }
        u.b("com.tiktok.appevents.y", jSONException0, 2);
        return null;
    }
}

