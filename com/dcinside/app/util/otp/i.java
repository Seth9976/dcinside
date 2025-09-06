package com.dcinside.app.util.otp;

import J1.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class i implements d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        @l
        public final String a() {
            return "timeCorrectionMinutes";
        }

        @e
        public static void b() {
        }
    }

    @l
    private final d a;
    private final SharedPreferences b;
    @l
    private final Object c;
    @m
    private Integer d;
    @l
    public static final a e;
    @l
    private static final String f;

    static {
        i.e = new a(null);
        i.f = "timeCorrectionMinutes";
    }

    public i(@m Context context0, @l d d0) {
        L.p(d0, "systemWallClock");
        super();
        this.a = d0;
        this.b = PreferenceManager.getDefaultSharedPreferences(context0);
        this.c = new Object();
    }

    @Override  // com.dcinside.app.util.otp.d
    public long a() {
        return this.a.a() + ((long)this.d()) * 60000L;
    }

    // 去混淆评级： 低(20)
    public static final String b() [...] // 潜在的解密器

    @l
    public final d c() {
        return this.a;
    }

    private final int d() {
        Integer integer0;
        synchronized(this.c) {
            if(this.d == null) {
                this.d = this.b.getInt("timeCorrectionMinutes", 0);
            }
            integer0 = this.d;
            L.m(integer0);
        }
        return (int)integer0;
    }

    private final void e(int v) {
        synchronized(this.c) {
            this.b.edit().putInt("timeCorrectionMinutes", v).apply();
            this.d = null;
        }
    }
}

