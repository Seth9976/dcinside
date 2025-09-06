package com.apm.insight.entity;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.d;
import com.apm.insight.l.f;
import com.apm.insight.l.m;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    public interface a {
        void a(JSONObject arg1);
    }

    private static ConcurrentLinkedQueue a;

    static {
        b.a = new ConcurrentLinkedQueue();
        new ConcurrentHashMap();
    }

    public static File a(File file0) {
        return new File(file0, "all_data.json");
    }

    @NonNull
    public static JSONArray a() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: b.a) {
            if(((d)object0) == null) {
                break;
            }
            jSONArray0.put(((d)object0).c());
        }
        return jSONArray0;
    }

    @NonNull
    public static JSONArray a(Object object0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object1: b.a) {
            d d0 = (d)object1;
            if(d0 != null && d0.a(object0)) {
                jSONArray0.put(d0.a(CrashType.JAVA, null));
                return jSONArray0;
            }
            if(false) {
                break;
            }
        }
        return jSONArray0;
    }

    public static JSONArray a(Object object0, Throwable throwable0, StackTraceElement[] arr_stackTraceElement) {
        for(Object object1: b.a) {
            d d0 = (d)object1;
            if(d0 != null && d0.a(object0)) {
                JSONArray jSONArray0 = d0.a(arr_stackTraceElement, throwable0);
                JSONArray jSONArray1 = new JSONArray();
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("aid", d0.b());
                    jSONObject0.put("lines", jSONArray0);
                    jSONArray1.put(jSONObject0);
                }
                catch(Throwable unused_ex) {
                }
                return jSONArray1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NonNull
    public static JSONArray a(String s) {
        JSONArray jSONArray0 = new JSONArray();
        String[] arr_s = s.split("\n");
        for(Object object0: b.a) {
            d d0 = (d)object0;
            if(d0 == null) {
                break;
            }
            if(com.apm.insight.runtime.a.b(d0.b())) {
                JSONArray jSONArray1 = d0.a(arr_s);
                if(!com.apm.insight.a.a(jSONArray1)) {
                    jSONArray0.put(d0.a(CrashType.ANR, jSONArray1));
                }
            }
        }
        return jSONArray0;
    }

    @NonNull
    public static JSONArray a(String s, String s1, JSONArray jSONArray0) {
        JSONArray jSONArray1 = new JSONArray();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            if(jSONObject0 != null) {
                JSONObject jSONObject1 = jSONObject0.optJSONObject("header");
                if(jSONObject1 != null && com.apm.insight.runtime.a.c(String.valueOf(jSONObject1.opt("aid")))) {
                    if(TextUtils.isEmpty(jSONObject1.optString("package"))) {
                        jSONArray1.put(jSONObject0);
                    }
                    else if(b.a(s, jSONObject1.optJSONArray("so_list"), s1, jSONObject1.optJSONArray("so_list"))) {
                        jSONArray1.put(jSONObject0);
                    }
                }
            }
        }
        return jSONArray1;
    }

    @Nullable
    public static JSONArray a(Throwable throwable0, Thread thread0, @Nullable File file0) {
        JSONArray jSONArray0 = new JSONArray();
        StackTraceElement[] arr_stackTraceElement = m.b(throwable0);
        Iterator iterator0 = b.a.iterator();
        while(true) {
            String s = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            d d0 = (d)object0;
            if(d0 == null) {
                break;
            }
            if(com.apm.insight.runtime.a.a(d0.b())) {
                if(thread0 != null) {
                    s = thread0.getName();
                }
                JSONArray jSONArray1 = d0.a(arr_stackTraceElement, throwable0, s);
                if(!com.apm.insight.a.a(jSONArray1)) {
                    jSONArray0.put(d0.a(CrashType.JAVA, jSONArray1));
                }
            }
            else {
                com.apm.insight.a.a(("not enable javaCrash aid: " + d0.b()));
            }
        }
        if(com.apm.insight.a.a(jSONArray0)) {
            return null;
        }
        try {
            f.a(new File(file0, "all_data.json"), jSONArray0);
        }
        catch(IOException unused_ex) {
        }
        return jSONArray0;
    }

    public static void a(@NonNull d d0) {
        b.a.add(d0);
    }

    public static void a(JSONObject jSONObject0, JSONArray jSONArray0, a b$a0) {
        com.apm.insight.a.a(("uploadFromFile with allData " + jSONArray0));
        JSONArray jSONArray1 = new JSONArray();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
            if(jSONObject1 == null) {
                break;
            }
            if(com.apm.insight.a.a(jSONObject1, 0, new String[]{"header", "single_upload"}) == 1) {
                JSONObject jSONObject2 = new JSONObject();
                com.apm.insight.entity.a.b(jSONObject2, jSONObject0);
                com.apm.insight.entity.a.b(jSONObject2, jSONObject1);
                b$a0.a(jSONObject2);
            }
            else {
                jSONArray1.put(jSONObject1);
            }
        }
        if(jSONArray1.length() == 0) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        com.apm.insight.entity.a.b(jSONObject3, jSONObject0);
        try {
            jSONObject3.put("all_data", jSONArray1);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        b$a0.a(jSONObject3);
    }

    public static boolean a(String s, JSONArray jSONArray0, String s1, JSONArray jSONArray1) {
        if(!com.apm.insight.a.a(jSONArray0)) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                if(s.contains(jSONArray0.optString(v))) {
                    return true;
                }
            }
        }
        if(!com.apm.insight.a.a(jSONArray1)) {
            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                String s2 = jSONArray1.optString(v1);
                if(s2 != null && s2.contains(s1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public static String b(Object object0) {
        for(Object object1: b.a) {
            d d0 = (d)object1;
            if(d0 != null && d0.a(object0)) {
                return d0.b();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NonNull
    public static JSONArray b() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: b.a) {
            if(((d)object0) == null) {
                break;
            }
            jSONArray0.put(((d)object0).a(null, null));
        }
        return jSONArray0;
    }

    public static int c() [...] // 潜在的解密器

    public static List d() {
        List list0 = new ArrayList();
        for(Object object0: b.a) {
            if(((d)object0) == null) {
                break;
            }
            ((ArrayList)list0).add(((d)object0).b());
        }
        return list0;
    }
}

