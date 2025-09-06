package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.l.f;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {
    private static JSONObject a;

    static {
        k.a = new JSONObject();
    }

    public static void a(@Nullable JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            String s = a.a(jSONObject0);
            File file0 = new File("/sdcard/", "apminsight/configCrash/configNative");
            if(s != null) {
                JSONObject jSONObject1 = new JSONObject(s);
                k.a = jSONObject1;
                f.a(file0, k.b(jSONObject1));
                return;
            }
            k.a = new JSONObject();
            return;
        }
        catch(JSONException unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        j.a(throwable0, "NPTH_CATCH");
    }

    public static boolean a(String s, e e0) {
        JSONObject jSONObject0 = k.a;
        if(jSONObject0 == null) {
            return false;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
        if(jSONObject1 == null) {
            return false;
        }
        return k.a(jSONObject1.optJSONArray("disable"), e0) ? false : k.a(jSONObject1.optJSONArray("enable"), e0);
    }

    private static boolean a(JSONArray jSONArray0, e e0) {
        if(com.apm.insight.a.a(jSONArray0)) {
            return false;
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            if(jSONObject0 == null) {
                j.a(new IllegalArgumentException("err config: " + jSONArray0), "NPTH_CATCH");
            }
            else if(k.a(jSONObject0, e0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject0, e e0) {
        boolean z = false;
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                if(s.startsWith("header_")) {
                    if(!k.a(jSONObject0.optJSONObject(s), e0.b(s.substring(7)))) {
                        com.apm.insight.a.a(("not match " + s));
                        return false;
                    }
                }
                else if(!s.startsWith("java_")) {
                    com.apm.insight.a.a(("no rules match " + s));
                }
                else if(!k.a(jSONObject0.optJSONObject(s), e0.a(s.substring(5)))) {
                    com.apm.insight.a.a(("not match " + s));
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    private static boolean a(JSONObject jSONObject0, Object object0) {
        JSONArray jSONArray0 = jSONObject0.optJSONArray("values");
        if(jSONArray0.length() == 0) {
            return false;
        }
        String s = jSONObject0.optString("op");
        String s1 = String.valueOf(object0);
        if(s.equals("=")) {
            return s1.equals(String.valueOf(jSONArray0.opt(0)));
        }
        if(s.equals("in")) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                if(String.valueOf(jSONArray0.opt(v)).equals(s1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static JSONArray b(JSONArray jSONArray0, e e0) {
        JSONArray jSONArray1 = new JSONArray();
        if(com.apm.insight.a.a(jSONArray0)) {
            return jSONArray1;
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            if(jSONObject0 == null) {
                j.a(new IllegalArgumentException("err config: " + jSONArray0), "NPTH_CATCH");
            }
            else if(k.a(jSONObject0, e0)) {
                jSONArray1.put(jSONObject0);
            }
        }
        return jSONArray1;
    }

    private static JSONObject b(JSONObject jSONObject0) {
        Iterator iterator0 = jSONObject0.keys();
        e e0 = new e();
        JSONObject jSONObject1 = new JSONObject();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(!"configType".equals(s)) {
                JSONObject jSONObject2 = jSONObject0.optJSONObject(s);
                if(jSONObject2 == null) {
                    j.a(new IllegalArgumentException("err config with key: " + s), "NPTH_CATCH");
                }
                else if(k.a(jSONObject2.optJSONArray("disable"), e0)) {
                    com.apm.insight.a.a(("match diable " + s));
                }
                else {
                    JSONArray jSONArray0 = k.b(jSONObject2.optJSONArray("enable"), e0);
                    if(com.apm.insight.a.a(jSONArray0)) {
                        com.apm.insight.a.a(("not match " + s));
                    }
                    else {
                        try {
                            jSONObject1.put(s, new JSONObject().put("enable", jSONArray0));
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                }
            }
        }
        return jSONObject1;
    }
}

