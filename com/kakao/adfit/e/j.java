package com.kakao.adfit.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.kakao.adfit.a.t;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class j {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final SharedPreferences a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    public static final a f;

    static {
        j.f = new a(null);
    }

    public j(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "adUnitId");
        super();
        this.a = B.a(context0);
        this.b = s + "_refreshinterval";
        this.c = s + "_waitingtime";
        this.d = s + "_reqinterval";
        this.e = s + "_lastrequestedtime";
    }

    static long a(j j0, String s, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        return j0.a(s, v);
    }

    private final long a(String s, long v) {
        return Math.max(this.a.getLong(s, v), 0L);
    }

    private final void a(Long long0) {
        if(long0 == null) {
            this.b(this.b);
            return;
        }
        this.c(((long)long0));
    }

    public static boolean a(j j0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = D.a.a().a();
        }
        return j0.a(v);
    }

    private final boolean a(String s) {
        return this.a.contains(s);
    }

    public final void a(t t0) {
        Long long0 = null;
        this.c((t0 == null ? null : t0.g()));
        this.a((t0 == null ? null : t0.c()));
        if(t0 != null) {
            long0 = t0.d();
        }
        this.b(long0);
    }

    public final boolean a() {
        return this.a(this.e);
    }

    public final boolean a(long v) {
        long v1 = this.d();
        if(v1 > 0L) {
            long v2 = v - this.c();
            return 0L <= v2 && v2 < v1;
        }
        return false;
    }

    private final void b(Long long0) {
        if(long0 != null && ((long)long0) > 0L) {
            this.d(((long)long0));
            if(!this.a()) {
                this.b(D.a.a().a());
            }
            return;
        }
        this.b(this.d);
        this.b(this.e);
    }

    private final void b(String s) {
        this.a.edit().remove(s).apply();
    }

    private final void b(String s, long v) {
        this.a.edit().putLong(s, v).apply();
    }

    public final void b(long v) {
        this.b(this.e, v);
    }

    public final boolean b() {
        return this.a(this.d);
    }

    private final void c(Long long0) {
        if(long0 != null && ((long)long0) > 0L) {
            this.b(this.c, ((long)long0));
            return;
        }
        this.b(this.c);
    }

    public final long c() {
        return j.a(this, this.e, 0L, 2, null);
    }

    public final void c(long v) {
        this.b(this.b, v);
    }

    public final long d() {
        return j.a(this, this.d, 0L, 2, null);
    }

    public final void d(long v) {
        this.b(this.d, v);
    }

    public final void e() {
        if(this.b()) {
            this.b(D.a.a().a());
        }
    }
}

