package com.kakao.adfit.ads.na;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.L;

public final class n {
    public static final class a {
        private final String a;
        private final List b;
        private final String c;
        private final long d;

        public a(String s, String s1, List list0, long v) {
            L.p(s, "adUnitId");
            L.p(s1, "responseId");
            L.p(list0, "ads");
            super();
            this.a = s1;
            this.b = list0;
            this.c = "NativeAds(" + s + '/' + s1 + ')';
            this.d = SystemClock.elapsedRealtime() + v;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            Object object0 = null;
            for(Object object1: this.b) {
                if(((m)object1).g().d().e() || ((m)object1).g().b().e()) {
                    object0 = object1;
                    break;
                }
            }
            if(object0 == null) {
                long v = SystemClock.elapsedRealtime();
                return this.d <= v;
            }
            return true;
        }
    }

    public static final n a;
    private static final HashMap b;

    static {
        n.a = new n();
        n.b = new HashMap();
    }

    public final a a(String s) {
        L.p(s, "adUnitId");
        HashMap hashMap0 = n.b;
        a n$a0 = (a)hashMap0.get(s);
        if(n$a0 == null) {
            return null;
        }
        if(n$a0.c()) {
            hashMap0.remove(s);
            return null;
        }
        return n$a0;
    }

    public final void a(String s, String s1) {
        L.p(s, "adUnitId");
        if(s1 == null) {
            n.b.remove(s);
        }
        else {
            a n$a0 = (a)n.b.get(s);
            if(L.g((n$a0 == null ? null : n$a0.b()), s1)) {
                n.b.remove(s);
            }
        }
    }

    public final void a(String s, String s1, List list0, long v) {
        L.p(s, "adUnitId");
        L.p(s1, "responseId");
        L.p(list0, "ads");
        a n$a0 = new a(s, s1, list0, v);
        n.b.put(s, n$a0);
    }
}

