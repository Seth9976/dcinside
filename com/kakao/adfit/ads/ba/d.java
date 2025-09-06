package com.kakao.adfit.ads.ba;

import com.kakao.adfit.a.c;
import com.kakao.adfit.a.p;
import com.kakao.adfit.a.t;
import kotlin.jvm.internal.L;

public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final com.kakao.adfit.ads.ba.b.d d;
    private final c e;
    private final p f;
    private final Long g;

    public d(String s, String s1, String s2, com.kakao.adfit.ads.ba.b.d b$d0, c c0, t t0) {
        L.p(s, "adUnitId");
        L.p(s1, "name");
        L.p(s2, "content");
        L.p(b$d0, "size");
        L.p(c0, "event");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = b$d0;
        this.e = c0;
        this.f = p.c.a(t0);
        this.g = t0 == null ? null : t0.c();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final c c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final Long e() {
        return this.g;
    }

    public final com.kakao.adfit.ads.ba.b.d f() {
        return this.d;
    }

    public final p g() {
        return this.f;
    }
}

