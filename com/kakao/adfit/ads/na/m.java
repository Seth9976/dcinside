package com.kakao.adfit.ads.na;

import android.content.Context;
import com.kakao.adfit.a.p;
import com.kakao.adfit.a.t;
import com.kakao.adfit.m.q;
import java.util.List;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class m {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final b a(d k$d0) {
            L.p(k$d0, "image");
            return new b(k$d0.c(), k$d0.d(), k$d0.a(), this.a(k$d0.b()));
        }

        public final c a(f k$f0) {
            if(k$f0 != null) {
                String s = k$f0.b();
                return s == null ? null : new c(s, k$f0.a());
            }
            return null;
        }

        public final com.kakao.adfit.ads.na.m.d a(g k$g0) {
            if(k$g0 instanceof l) {
                return this.b(((l)k$g0));
            }
            return k$g0 instanceof d ? this.b(((d)k$g0)) : null;
        }

        public final e a(String s, f k$f0, JSONObject jSONObject0) {
            if(s == null && k$f0 == null && jSONObject0 == null) {
                return null;
            }
            c m$c0 = this.a(k$f0);
            if(jSONObject0 != null) {
                Map map0 = q.a(jSONObject0);
                return map0 == null ? new e(s, m$c0, Y.z()) : new e(s, m$c0, map0);
            }
            return new e(s, m$c0, Y.z());
        }

        public final com.kakao.adfit.ads.na.m.f a(l k$l0) {
            L.p(k$l0, "video");
            return new com.kakao.adfit.ads.na.m.f(k$l0.b(), this.b(k$l0.a()));
        }

        public final m a(Context context0, String s, String s1, int v, k k0, t t0, boolean z) {
            L.p(context0, "context");
            L.p(s, "adUnitId");
            L.p(s1, "responseId");
            L.p(k0, "nativeAd");
            return new m(context0, s, s1, v, k0, t0, z);
        }

        public final b b(d k$d0) {
            return k$d0 == null ? null : this.a(k$d0);
        }

        public final com.kakao.adfit.ads.na.m.f b(l k$l0) {
            return k$l0 == null ? null : this.a(k$l0);
        }
    }

    public static final class b implements com.kakao.adfit.ads.na.m.d {
        private final String a;
        private final int b;
        private final int c;
        private final c d;

        public b(String s, int v, int v1, c m$c0) {
            L.p(s, "url");
            super();
            this.a = s;
            this.b = v;
            this.c = v1;
            this.d = m$c0;
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }
    }

    public static final class c {
        private final String a;
        private final List b;

        public c(String s, List list0) {
            L.p(s, "url");
            L.p(list0, "trackers");
            super();
            this.a = s;
            this.b = list0;
        }
    }

    public interface com.kakao.adfit.ads.na.m.d {
    }

    public static final class e {
        private final String a;
        private final c b;
        private final Map c;

        public e(String s, c m$c0, Map map0) {
            L.p(map0, "ext");
            super();
            this.a = s;
            this.b = m$c0;
            this.c = map0;
        }

        public final Map a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }
    }

    public static final class com.kakao.adfit.ads.na.m.f implements com.kakao.adfit.ads.na.m.d {
        private final com.kakao.adfit.n.e a;
        private final b b;
        private int c;
        private int d;
        private boolean e;

        public com.kakao.adfit.ads.na.m.f(com.kakao.adfit.n.e e0, b m$b0) {
            L.p(e0, "vast");
            super();
            this.a = e0;
            this.b = m$b0;
            this.c = (int)com.kakao.adfit.n.f.a(e0.a());
            this.e = true;
        }

        public final int a() {
            return this.c;
        }

        public final void a(int v) {
            this.c = v;
        }

        public final void a(boolean z) {
            this.e = z;
        }

        public final b b() {
            return this.b;
        }

        public final void b(int v) {
            this.d = v;
        }

        public final boolean c() {
            return this.e;
        }

        public final int d() {
            return this.d;
        }

        public final com.kakao.adfit.n.e e() {
            return this.a;
        }
    }

    private final String a;
    private final int b;
    private final boolean c;
    private final String d;
    private final String e;
    private final int f;
    private final e g;
    private final e h;
    private final b i;
    private final e j;
    private final com.kakao.adfit.ads.na.m.d k;
    private final String l;
    private final e m;
    private final String n;
    private final b o;
    private final String p;
    private final boolean q;
    private final boolean r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final p w;
    private final com.kakao.adfit.a.c x;
    public static final a y;

    static {
        m.y = new a(null);
    }

    public m(Context context0, String s, String s1, int v, k k0, t t0, boolean z) {
        L.p(context0, "context");
        Object object0;
        L.p(s, "adUnitId");
        L.p(s1, "responseId");
        L.p(k0, "nativeAd");
        super();
        this.a = s;
        this.b = v;
        this.c = z;
        this.d = "NativeAd(" + s + '/' + s1 + '/' + v + ')';
        String s2 = k0.k();
        this.e = s2;
        this.f = k0.o();
        String s3 = null;
        this.g = m.y.a(k0.s(), k0.t(), null);
        e m$e0 = m.y.a(k0.e(), k0.g(), k0.f());
        this.h = m$e0;
        this.i = m.y.b(k0.p());
        this.j = m.y.a(k0.q(), k0.r(), null);
        this.k = m.y.a(k0.n());
        this.l = k0.d();
        this.m = m.y.a(k0.h(), null, null);
        this.n = k0.m();
        this.o = m.y.b(k0.b());
        this.p = k0.c();
        this.q = k0.u();
        this.r = k0.v();
        if(m$e0 == null) {
            object0 = null;
        }
        else {
            Map map0 = m$e0.a();
            object0 = map0 == null ? null : map0.get("text");
        }
        if(object0 instanceof String) {
            s3 = (String)object0;
        }
        this.s = s3;
        this.t = k0.j();
        this.u = k0.i();
        this.v = k0.l();
        this.w = p.c.a(t0);
        this.x = new com.kakao.adfit.a.c(context0, k0, new com.kakao.adfit.a.e(context0, s1, s, s2));
    }

    public final b a() {
        return this.o;
    }

    public final String b() {
        return this.p;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.l;
    }

    public final e e() {
        return this.h;
    }

    public final e f() {
        return this.m;
    }

    public final com.kakao.adfit.a.c g() {
        return this.x;
    }

    public final String h() {
        return this.n;
    }

    public final com.kakao.adfit.ads.na.m.d i() {
        return this.k;
    }

    public final String j() {
        return this.d;
    }

    public final b k() {
        return this.i;
    }

    public final e l() {
        return this.j;
    }

    public final e m() {
        return this.g;
    }

    public final p n() {
        return this.w;
    }
}

