package com.kakao.adfit.ads.ba;

import com.kakao.adfit.a.a;
import com.kakao.adfit.a.f;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class b implements a {
    public static final class com.kakao.adfit.ads.ba.b.a {
        private com.kakao.adfit.ads.ba.b.a() {
        }

        public com.kakao.adfit.ads.ba.b.a(w w0) {
        }
    }

    public static final class com.kakao.adfit.ads.ba.b.b implements d {
        private final int a;
        private final int b;

        public com.kakao.adfit.ads.ba.b.b(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    public static final class c implements d {
        private final int a;
        private final int b;
        private final int c;

        public c(int v, int v1, int v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }
    }

    public interface d {
    }

    private final String a;
    private final String b;
    private final d c;
    private final f d;
    private final String e;
    public static final com.kakao.adfit.ads.ba.b.a f;
    private static final AtomicInteger g;

    static {
        b.f = new com.kakao.adfit.ads.ba.b.a(null);
        b.g = new AtomicInteger(1);
    }

    public b(String s, String s1, d b$d0, f f0) {
        L.p(s, "dspId");
        L.p(s1, "content");
        L.p(b$d0, "size");
        L.p(f0, "tracker");
        super();
        this.a = s;
        this.b = s1;
        this.c = b$d0;
        this.d = f0;
        this.e = "BannerAd-" + b.g.getAndIncrement();
    }

    @Override  // com.kakao.adfit.a.a
    public f a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public String d() {
        return this.e;
    }

    public final d e() {
        return this.c;
    }
}

