package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.b;
import com.apm.insight.k.j;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    static {
        new ConcurrentLinkedQueue();
    }

    public static int a(int v, String[] arr_s) {
        return com.apm.insight.a.a(a.i(), v, arr_s);
    }

    public static int a(String[] arr_s) {
        return com.apm.insight.a.a(a.i(), -1, arr_s);
    }

    @Nullable
    public static String a(@Nullable JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("exception_modules");
        return jSONObject1 == null ? null : jSONObject1.optString("npth");
    }

    @Nullable
    private static JSONObject a(JSONArray jSONArray0, String s) {
        if(jSONArray0 != null && jSONArray0.length() != 0) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v).optJSONObject(s);
                if(jSONObject0 != null) {
                    return jSONObject0;
                }
            }
        }
        return null;
    }

    public static void a(JSONArray jSONArray0, boolean z) {
        if(jSONArray0 == null) {
            return;
        }
        com.apm.insight.a.a("apmconfig", "fromnet " + z + " : " + jSONArray0);
        if(z) {
            j.f();
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                Object object0 = jSONObject0.keys().next();
                String s = (String)object0;
                JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
                com.apm.insight.a.a(("update config " + s + " : " + jSONObject1));
                d.a(s, jSONObject1);
                if(z) {
                    j.a(s);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        k.a(a.a(jSONArray0, "4444"));
        if(z) {
            j.a(jSONArray0);
        }
    }

    // 去混淆评级： 低(20)
    public static boolean a() [...] // 潜在的解密器

    public static boolean a(Object object0) {
        String s = b.b(object0);
        return s == null ? false : d.a(s);
    }

    public static boolean a(String s) {
        if(!d.a(s)) {
            com.apm.insight.k.a.b();
        }
        return d.e(s);
    }

    @Nullable
    public static JSONArray b() {
        JSONObject jSONObject0 = com.apm.insight.a.b(a.i(), new String[]{"custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore"});
        if(jSONObject0 == null) {
            return null;
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("max_utm_thread_ignore");
        com.apm.insight.a.a("ApmConfig", "normal get configArray: max_utm_thread_ignore : " + jSONArray0);
        return jSONArray0;
    }

    public static boolean b(Object object0) {
        String s = b.b(object0);
        if(s != null) {
            d d0 = d.c(s);
            return d0 == null ? false : d0.a();
        }
        return false;
    }

    public static boolean b(String s) {
        if(!d.a(s)) {
            com.apm.insight.k.a.b();
        }
        return d.g(s);
    }

    public static boolean c() {
        return a.a(new String[]{"custom_event_settings", "npth_simple_setting", "disable_looper_monitor"}) == 1;
    }

    public static boolean c(String s) {
        if(!d.a(s)) {
            com.apm.insight.k.a.b();
        }
        return d.f(s);
    }

    public static boolean d() {
        return a.a(new String[]{"custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native"}) == 1;
    }

    public static boolean e() {
        return a.a(new String[]{"custom_event_settings", "npth_simple_setting", "anr_with_traces_txt"}) == 1;
    }

    public static boolean f() {
        return a.a(new String[]{"custom_event_settings", "npth_simple_setting", "upload_crash_crash"}) == 1;
    }

    public static boolean g() {
        return a.a(new String[]{"custom_event_settings", "npth_simple_setting", "force_apm_crash"}) == 1;
    }

    public static boolean h() {
        return a.a(new String[]{"custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace"}) == 1;
    }

    // 去混淆评级： 低(20)
    @Nullable
    private static JSONObject i() {
        return d.b("4444");
    }
}

