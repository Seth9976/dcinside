package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class d {
    private static HashMap a;
    private JSONObject b;
    private JSONObject c;
    private boolean d;
    private String e;

    static {
        d.a = new HashMap();
    }

    private d(JSONObject jSONObject0, String s) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = s;
        this.a(jSONObject0);
        d.a.put(this.e, this);
        a.a(("after update aid " + s));
    }

    public static void a(String s, JSONObject jSONObject0) {
        d d0 = (d)d.a.get(s);
        if(d0 != null) {
            d0.a(jSONObject0);
            return;
        }
        new d(jSONObject0, s);
    }

    private void a(JSONObject jSONObject0) {
        this.b = jSONObject0;
        if(jSONObject0 != null) {
            boolean z = true;
            JSONObject jSONObject1 = jSONObject0.optJSONObject("error_module");
            if(jSONObject1 != null) {
                if(jSONObject1.optInt("switcher") != 1 || jSONObject1.optInt("err_sampling_rate") != 1) {
                    z = false;
                }
                this.d = z;
            }
        }
    }

    public static boolean a(String s) {
        return d.a.get(s) != null;
    }

    public final boolean a() {
        return this.b == null ? false : this.d;
    }

    @Nullable
    public static JSONObject b(String s) {
        d d0 = (d)d.a.get(s);
        return d0 == null ? null : d0.b;
    }

    public static d c(String s) {
        return (d)d.a.get(s);
    }

    public static long d(String s) {
        d d0 = (d)d.a.get(s);
        if(d0 != null) {
            try {
                return ((long)Long.decode(a.a(d0.b, new String[]{"over_all", "get_settings_interval"}))) * 1000L;
            }
            catch(Throwable unused_ex) {
            }
        }
        return 3600000L;
    }

    public static boolean e(String s) {
        d d0 = (d)d.a.get(s);
        return d0 != null && (d0.b != null && 1 == a.a(d0.b, 0, new String[]{"crash_module", "switcher"}));
    }

    public static boolean f(String s) {
        d d0 = (d)d.a.get(s);
        return d0 != null && (d0.b != null && 1 == a.a(d0.b, 0, new String[]{"crash_module", "switcher"}));
    }

    public static boolean g(String s) {
        d d0 = (d)d.a.get(s);
        return d0 != null && (d0.b != null && 1 == a.a(d0.b, 0, new String[]{"crash_module", "switcher"}));
    }
}

