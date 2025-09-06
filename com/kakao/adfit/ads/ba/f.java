package com.kakao.adfit.ads.ba;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.jvm.internal.L;

public final class f {
    public static final class a {
        private final d a;
        private final String b;
        private final long c;

        public a(d d0, long v) {
            L.p(d0, "ad");
            super();
            this.a = d0;
            this.b = d0.d();
            this.c = SystemClock.elapsedRealtime() + v;
        }

        public final d a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            if((this.a.c().d().e() || this.a.c().b().e() ? this.a : null) == null) {
                long v = SystemClock.elapsedRealtime();
                return this.c <= v;
            }
            return true;
        }
    }

    public static final f a;
    private static final HashMap b;

    static {
        f.a = new f();
        f.b = new HashMap();
    }

    public final a a(String s) {
        L.p(s, "adUnitId");
        HashMap hashMap0 = f.b;
        a f$a0 = (a)hashMap0.get(s);
        if(f$a0 == null) {
            return null;
        }
        if(f$a0.c()) {
            hashMap0.remove(s);
            return null;
        }
        return f$a0;
    }

    public final void a(String s, d d0) {
        L.p(s, "adUnitId");
        if(d0 == null) {
            f.b.remove(s);
        }
        else {
            a f$a0 = (a)f.b.get(s);
            if(L.g((f$a0 == null ? null : f$a0.a()), d0)) {
                f.b.remove(s);
            }
        }
    }

    public final void a(String s, d d0, long v) {
        L.p(s, "adUnitId");
        L.p(d0, "ad");
        a f$a0 = new a(d0, v);
        f.b.put(s, f$a0);
    }
}

