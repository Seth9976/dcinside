package com.google.firebase.crashlytics.internal.settings;

import W1.a;
import W1.b;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class c implements m {
    private final String a;
    private final b b;
    private final g c;
    static final String d = "X-CRASHLYTICS-GOOGLE-APP-ID";
    static final String e = "X-CRASHLYTICS-API-CLIENT-TYPE";
    static final String f = "X-CRASHLYTICS-API-CLIENT-VERSION";
    static final String g = "User-Agent";
    static final String h = "Accept";
    static final String i = "Crashlytics Android SDK/";
    static final String j = "application/json";
    static final String k = "android";
    static final String l = "build_version";
    static final String m = "display_version";
    static final String n = "instance";
    static final String o = "source";
    static final String p = "X-CRASHLYTICS-DEVICE-MODEL";
    static final String q = "X-CRASHLYTICS-OS-BUILD-VERSION";
    static final String r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    static final String s = "X-CRASHLYTICS-INSTALLATION-ID";

    public c(String s, b b0) {
        this(s, b0, g.f());
    }

    c(String s, b b0, g g0) {
        if(s == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = g0;
        this.b = b0;
        this.a = s;
    }

    @Override  // com.google.firebase.crashlytics.internal.settings.m
    public JSONObject a(l l0, boolean z) {
        com.google.firebase.crashlytics.internal.concurrency.l.d();
        if(z) {
            try {
                Map map0 = this.f(l0);
                a a0 = this.b(this.d(map0), l0);
                this.c.b("Requesting settings from " + this.a);
                this.c.k("Settings query params were: " + map0);
                return this.g(a0.c());
            }
            catch(IOException iOException0) {
                this.c.e("Settings request failed.", iOException0);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    private a b(a a0, l l0) {
        this.c(a0, "X-CRASHLYTICS-GOOGLE-APP-ID", l0.a);
        this.c(a0, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        this.c(a0, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.2.0");
        this.c(a0, "Accept", "application/json");
        this.c(a0, "X-CRASHLYTICS-DEVICE-MODEL", l0.b);
        this.c(a0, "X-CRASHLYTICS-OS-BUILD-VERSION", l0.c);
        this.c(a0, "X-CRASHLYTICS-OS-DISPLAY-VERSION", l0.d);
        this.c(a0, "X-CRASHLYTICS-INSTALLATION-ID", l0.e.a().c());
        return a0;
    }

    private void c(a a0, String s, String s1) {
        if(s1 != null) {
            a0.d(s, s1);
        }
    }

    // 去混淆评级： 低(20)
    protected a d(Map map0) {
        return this.b.b(this.a, map0).d("User-Agent", "Crashlytics Android SDK/19.2.0").d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    private JSONObject e(String s) {
        try {
            return new JSONObject(s);
        }
        catch(Exception exception0) {
            this.c.n("Failed to parse settings JSON from " + this.a, exception0);
            this.c.m("Settings response " + s);
            return null;
        }
    }

    private Map f(l l0) {
        Map map0 = new HashMap();
        map0.put("build_version", l0.h);
        map0.put("display_version", l0.g);
        map0.put("source", Integer.toString(l0.i));
        String s = l0.f;
        if(!TextUtils.isEmpty(s)) {
            map0.put("instance", s);
        }
        return map0;
    }

    JSONObject g(W1.c c0) {
        int v = c0.b();
        this.c.k("Settings response code was: " + v);
        if(this.h(v)) {
            return this.e(c0.a());
        }
        this.c.d("Settings request failed; (status: " + v + ") from " + this.a);
        return null;
    }

    boolean h(int v) {
        return v == 200 || v == 201 || v == 202 || v == 203;
    }
}

