package com.tiktok.appevents;

import android.app.Application;
import android.os.Build.VERSION;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.tiktok.b;
import com.tiktok.util.g;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

class z {
    private static final String a = "com.tiktok.appevents.z";
    private static JSONObject b;
    private static JSONObject c;
    private static JSONObject d;

    static {
    }

    private static JSONObject a(@Nullable c v$c0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("name", com.tiktok.util.c.b());
        jSONObject0.put("namespace", com.tiktok.util.c.h());
        jSONObject0.put("version", "");
        jSONObject0.put("build", com.tiktok.util.c.c() + "");
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.put("platform", "Android");
        if(v$c0 != null) {
            jSONObject1.put("gaid", v$c0.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", "tiktok/" + y.k);
        jSONObject2.put("version", "1.3.7");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject0.put("tiktok_app_id", "");
        jSONObject3.put("app", jSONObject0);
        jSONObject3.put("library", jSONObject2);
        jSONObject3.put("device", jSONObject1);
        jSONObject3.put("locale", z.e());
        jSONObject3.put("ip", com.tiktok.util.c.e());
        jSONObject3.put("user_agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
        return jSONObject3;
    }

    private static JSONObject b(JSONObject jSONObject0) throws JSONException {
        JSONObject jSONObject1 = new JSONObject(jSONObject0.toString());
        jSONObject1.put("id", g.e(b.l(), false));
        jSONObject1.put("user_agent", "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
        jSONObject1.put("ip", com.tiktok.util.c.e());
        jSONObject1.put("network", "?");
        jSONObject1.put("session", "13b2155b-5ca1-47fe-be16-d105c40aa5f0");
        jSONObject1.put("locale", z.e());
        jSONObject1.put("ts", System.currentTimeMillis() - SystemClock.elapsedRealtime());
        return jSONObject1;
    }

    private static void c(JSONObject jSONObject0, a a0) {
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject("device");
            if(a0 != null && jSONObject1 != null) {
                jSONObject1.put("os_version", "33");
                jSONObject1.remove("version");
                return;
            }
            jSONObject1.put("version", "33");
            jSONObject1.remove("os_version");
            return;
        }
        catch(Throwable throwable0) {
        }
        throwable0.printStackTrace();
    }

    public static JSONObject d() {
        g.a("com.tiktok.appevents.z");
        JSONObject jSONObject0 = z.b;
        if(jSONObject0 != null) {
            return jSONObject0;
        }
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("app_id", "");
            if(b.A().booleanValue()) {
                jSONObject1.put("test_event_code", "");
            }
            jSONObject1.put("event_source", "APP_EVENTS_SDK");
            z.b = jSONObject1;
            return jSONObject1;
        }
        catch(Exception exception0) {
        }
        u.b("com.tiktok.appevents.z", exception0, 2);
        JSONObject jSONObject2 = new JSONObject();
        z.b = jSONObject2;
        return jSONObject2;
    }

    static String e() {
        return z.g().toLanguageTag();
    }

    public static JSONObject f(a a0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject(z.i(a0).toString());
        jSONObject0.put("user", a0.h().j());
        return jSONObject0;
    }

    private static Locale g() {
        Application application0 = b.l();
        return Build.VERSION.SDK_INT < 24 ? application0.getResources().getConfiguration().locale : application0.getResources().getConfiguration().getLocales().get(0);
    }

    public static JSONObject h() throws JSONException {
        JSONObject jSONObject0 = z.c;
        if(jSONObject0 != null) {
            jSONObject0.put("device", z.b(jSONObject0.getJSONObject("device")));
            return z.c;
        }
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(z.i(null).getJSONObject("app").toString());
        jSONObject2.put("app_namespace", com.tiktok.util.c.h());
        jSONObject1.put("app", jSONObject2);
        jSONObject1.put("library", z.i(null).get("library"));
        jSONObject1.put("device", z.b(z.i(null).getJSONObject("device")));
        jSONObject1.put("log_extra", null);
        z.c = jSONObject1;
        return jSONObject1;
    }

    private static JSONObject i(a a0) throws JSONException {
        JSONObject jSONObject0 = z.d;
        if(jSONObject0 != null) {
            z.c(jSONObject0, a0);
            return z.d;
        }
        try {
            long v = System.currentTimeMillis();
            b.j().I("did_start", g.c(v), null);
            long v1 = System.currentTimeMillis();
            g.c(v1).put("latency", v1 - v);
        }
        catch(Exception unused_ex) {
        }
        JSONObject jSONObject1 = z.a(null);
        z.d = jSONObject1;
        z.c(jSONObject1, a0);
        return z.d;
    }
}

