package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.entity.b;
import com.apm.insight.l.k;
import com.apm.insight.runtime.m;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    private static Runnable a;
    private static int b;

    static {
        a.a = new Runnable() {
            @Override
            public final void run() {
                if(k.b(e.g())) {
                    a.i();
                }
            }
        };
        a.b = 0;
    }

    public static void a() {
        a.b = 40;
        m.a().a(a.a);
    }

    public static void b() {
        j.c();
        if(k.b(e.g()) && j.g()) {
            a.i();
        }
    }

    public static boolean c() [...] // Inlined contents

    public static void d() {
    }

    static int f() [...] // 潜在的解密器

    static Runnable g() {
        return a.a;
    }

    @Nullable
    private static byte[] h() {
        try {
            return com.apm.insight.k.e.a("", b.a().toString().getBytes());
        }
        catch(Throwable throwable0) {
            com.apm.insight.a.a(throwable0);
            return null;
        }
    }

    private static void i() {
        JSONArray jSONArray0;
        synchronized(a.class) {
            int v1 = a.b;
            if(v1 > 0) {
                a.b = v1 - 1;
            }
            com.apm.insight.a.a("try fetchApmConfig");
            if(com.apm.insight.l.a.c(e.g())) {
                try {
                    jSONArray0 = null;
                    byte[] arr_b = a.h();
                    if(arr_b != null) {
                        jSONArray0 = new JSONObject(new String(arr_b)).optJSONArray("data");
                    }
                }
                catch(Throwable throwable0) {
                    if(e.i().isDebugMode()) {
                        Log.e("npth", "npth NPTH Catch Error", throwable0);
                    }
                }
                com.apm.insight.a.a(("after fetchApmConfig net " + jSONArray0));
                if(jSONArray0 != null) {
                    com.apm.insight.runtime.a.a(jSONArray0, true);
                    a.b = 0;
                    return;
                }
                a.b -= 10;
                return;
            }
            j.c();
        }
    }
}

