package com.kakao.adfit.ads.na;

import com.kakao.adfit.a.a;
import com.kakao.adfit.a.f;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class k implements a {
    public static final class com.kakao.adfit.ads.na.k.a {
        private com.kakao.adfit.ads.na.k.a() {
        }

        public com.kakao.adfit.ads.na.k.a(w w0) {
        }
    }

    public static final class b {
        private final d a;
        private final d b;
        private final d c;

        public b(d k$d0, d k$d1, d k$d2) {
            L.p(k$d0, "backgroundImage");
            L.p(k$d1, "textImage");
            super();
            this.a = k$d0;
            this.b = k$d1;
            this.c = k$d2;
        }
    }

    public static abstract class c {
        private final f a;

        public c(f f0) {
            L.p(f0, "trackers");
            super();
            this.a = f0;
        }
    }

    public static final class d implements g {
        private final String a;
        private final int b;
        private final int c;
        private final com.kakao.adfit.ads.na.k.f d;

        public d(String s, int v, int v1, com.kakao.adfit.ads.na.k.f k$f0) {
            L.p(s, "url");
            super();
            this.a = s;
            this.b = v;
            this.c = v1;
            this.d = k$f0;
        }

        public final int a() {
            return this.c;
        }

        public final com.kakao.adfit.ads.na.k.f b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }
    }

    public static final class e extends c {
        private final d b;
        private final com.kakao.adfit.ads.na.k.k c;

        public e(d k$d0, com.kakao.adfit.ads.na.k.k k$k0, f f0) {
            L.p(k$d0, "image");
            L.p(f0, "trackers");
            super(f0);
            this.b = k$d0;
            this.c = k$k0;
        }
    }

    public static final class com.kakao.adfit.ads.na.k.f {
        private final String a;
        private final List b;

        public com.kakao.adfit.ads.na.k.f(String s, List list0) {
            L.p(s, "url");
            L.p(list0, "trackers");
            super();
            this.a = s;
            this.b = list0;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    public interface g {
    }

    public static final class h {
        private final l a;
        private final d b;
        private final d c;
        private final List d;
        private final long e;
        private final String f;

        public h(l k$l0, d k$d0, d k$d1, List list0, long v, String s) {
            L.p(k$l0, "video");
            L.p(k$d0, "backgroundImage");
            L.p(k$d1, "textImage");
            L.p(list0, "objectImages");
            super();
            this.a = k$l0;
            this.b = k$d0;
            this.c = k$d1;
            this.d = list0;
            this.e = v;
            this.f = s;
        }
    }

    public static final class i extends c {
        public static final class com.kakao.adfit.ads.na.k.i.a {
            private final d a;
            private final String b;
            private final String c;
            private final String d;
            private final com.kakao.adfit.ads.na.k.k e;
            private final String f;
            private final f g;

            public com.kakao.adfit.ads.na.k.i.a(d k$d0, String s, String s1, String s2, com.kakao.adfit.ads.na.k.k k$k0, String s3, f f0) {
                L.p(k$d0, "image");
                L.p(s3, "landingUrl");
                L.p(f0, "trackers");
                super();
                this.a = k$d0;
                this.b = s;
                this.c = s1;
                this.d = s2;
                this.e = k$k0;
                this.f = s3;
                this.g = f0;
            }
        }

        private final List b;

        public i(List list0, f f0) {
            L.p(list0, "items");
            L.p(f0, "trackers");
            super(f0);
            this.b = list0;
        }
    }

    public static final class j {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        public j(int v, int v1, int v2, int v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }
    }

    public static final class com.kakao.adfit.ads.na.k.k {
        private final String a;
        private final com.kakao.adfit.ads.na.k.f b;
        private final JSONObject c;

        public com.kakao.adfit.ads.na.k.k(String s, com.kakao.adfit.ads.na.k.f k$f0, JSONObject jSONObject0) {
            L.p(s, "text");
            super();
            this.a = s;
            this.b = k$f0;
            this.c = jSONObject0;
        }
    }

    public static final class l implements g {
        private final com.kakao.adfit.n.e a;
        private final d b;

        public l(com.kakao.adfit.n.e e0, d k$d0) {
            L.p(e0, "vast");
            super();
            this.a = e0;
            this.b = k$d0;
        }

        public final d a() {
            return this.b;
        }

        public final com.kakao.adfit.n.e b() {
            return this.a;
        }
    }

    public static final class m extends c {
        private final l b;
        private final com.kakao.adfit.ads.na.k.k c;

        public m(l k$l0, com.kakao.adfit.ads.na.k.k k$k0, f f0) {
            L.p(k$l0, "video");
            L.p(f0, "trackers");
            super(f0);
            this.b = k$l0;
            this.c = k$k0;
        }
    }

    private final String A;
    public static final com.kakao.adfit.ads.na.k.a B;
    private static final AtomicInteger C;
    private final String a;
    private final com.kakao.adfit.ads.na.k.f b;
    private final String c;
    private final com.kakao.adfit.ads.na.k.f d;
    private final JSONObject e;
    private final d f;
    private final String g;
    private final com.kakao.adfit.ads.na.k.f h;
    private final g i;
    private final String j;
    private final h k;
    private final b l;
    private final c m;
    private final d n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final j r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final boolean w;
    private final String x;
    private final String y;
    private final f z;

    static {
        k.B = new com.kakao.adfit.ads.na.k.a(null);
        k.C = new AtomicInteger(1);
    }

    public k(String s, com.kakao.adfit.ads.na.k.f k$f0, String s1, com.kakao.adfit.ads.na.k.f k$f1, JSONObject jSONObject0, d k$d0, String s2, com.kakao.adfit.ads.na.k.f k$f2, g k$g0, String s3, h k$h0, b k$b0, c k$c0, d k$d1, String s4, boolean z, boolean z1, j k$j0, String s5, String s6, String s7, String s8, boolean z2, String s9, String s10, f f0) {
        L.p(s4, "adInfoUrl");
        L.p(s8, "landingUrl");
        L.p(s9, "dspId");
        L.p(f0, "tracker");
        super();
        this.a = s;
        this.b = k$f0;
        this.c = s1;
        this.d = k$f1;
        this.e = jSONObject0;
        this.f = k$d0;
        this.g = s2;
        this.h = k$f2;
        this.i = k$g0;
        this.j = s3;
        this.k = k$h0;
        this.l = k$b0;
        this.m = k$c0;
        this.n = k$d1;
        this.o = s4;
        this.p = z;
        this.q = z1;
        this.r = k$j0;
        this.s = s5;
        this.t = s6;
        this.u = s7;
        this.v = s8;
        this.w = z2;
        this.x = s9;
        this.y = s10;
        this.z = f0;
        this.A = "NativeAd-" + k.C.getAndIncrement();
    }

    @Override  // com.kakao.adfit.a.a
    public f a() {
        return this.z;
    }

    public final d b() {
        return this.n;
    }

    public final String c() {
        return this.o;
    }

    public final String d() {
        return this.s;
    }

    public final String e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.e;
    }

    public final com.kakao.adfit.ads.na.k.f g() {
        return this.d;
    }

    public final String h() {
        return this.j;
    }

    public final String i() {
        return this.u;
    }

    public final String j() {
        return this.y;
    }

    public final String k() {
        return this.x;
    }

    public final String l() {
        return this.t;
    }

    public final String m() {
        return this.v;
    }

    public final g n() {
        return this.i;
    }

    public final int o() {
        g k$g0 = this.i;
        if(k$g0 instanceof l) {
            return 2;
        }
        return k$g0 instanceof d ? 1 : 0;
    }

    public final d p() {
        return this.f;
    }

    public final String q() {
        return this.g;
    }

    public final com.kakao.adfit.ads.na.k.f r() {
        return this.h;
    }

    public final String s() {
        return this.a;
    }

    public final com.kakao.adfit.ads.na.k.f t() {
        return this.b;
    }

    public final boolean u() {
        return this.p;
    }

    public final boolean v() {
        return this.q;
    }
}

