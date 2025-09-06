package com.coupang.ads.coupangapp;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f {
    @m
    private final String a;
    private final long b;
    private final long c;
    @m
    private final String d;
    private final int e;
    @l
    private final String f;
    @l
    private final String g;

    public f(@m String s, long v, long v1, @m String s1, int v2, @l String s2, @l String s3) {
        L.p(s2, "message");
        L.p(s3, "appVersion");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = s1;
        this.e = v2;
        this.f = s2;
        this.g = s3;
    }

    public f(String s, long v, long v1, String s1, int v2, String s2, String s3, int v3, w w0) {
        this(s, ((v3 & 2) == 0 ? v : 0L), ((v3 & 4) == 0 ? v1 : 0L), ((v3 & 8) == 0 ? s1 : null), ((v3 & 16) == 0 ? v2 : 0), s2, s3);
    }

    @m
    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    @m
    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(!L.g(this.a, ((f)object0).a)) {
            return false;
        }
        if(this.b != ((f)object0).b) {
            return false;
        }
        if(this.c != ((f)object0).c) {
            return false;
        }
        if(!L.g(this.d, ((f)object0).d)) {
            return false;
        }
        if(this.e != ((f)object0).e) {
            return false;
        }
        return L.g(this.f, ((f)object0).f) ? L.g(this.g, ((f)object0).g) : false;
    }

    @l
    public final String f() {
        return this.f;
    }

    @l
    public final String g() {
        return this.g;
    }

    @l
    public final f h(@m String s, long v, long v1, @m String s1, int v2, @l String s2, @l String s3) {
        L.p(s2, "message");
        L.p(s3, "appVersion");
        return new f(s, v, v1, s1, v2, s2, s3);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = (int)(this.b ^ this.b >>> 0x20);
        int v3 = (int)(this.c ^ this.c >>> 0x20);
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + this.e) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode();
    }

    public static f i(f f0, String s, long v, long v1, String s1, int v2, String s2, String s3, int v3, Object object0) {
        String s4 = (v3 & 1) == 0 ? s : f0.a;
        long v4 = (v3 & 2) == 0 ? v : f0.b;
        long v5 = (v3 & 4) == 0 ? v1 : f0.c;
        String s5 = (v3 & 8) == 0 ? s1 : f0.d;
        int v6 = (v3 & 16) == 0 ? v2 : f0.e;
        String s6 = (v3 & 0x20) == 0 ? s2 : f0.f;
        return (v3 & 0x40) == 0 ? f0.h(s4, v4, v5, s5, v6, s6, s3) : f0.h(s4, v4, v5, s5, v6, s6, f0.g);
    }

    @l
    public final String j() {
        return this.g;
    }

    public final int k() {
        return this.e;
    }

    public final long l() {
        return this.b;
    }

    @l
    public final String m() {
        return this.f;
    }

    @m
    public final String n() {
        return this.a;
    }

    @m
    public final String o() {
        return this.d;
    }

    public final long p() {
        return this.c;
    }

    public final boolean q() {
        return this.a != null && System.currentTimeMillis() < (this.b + this.c) * 1000L;
    }

    @Override
    @l
    public String toString() {
        return "AdsTokenResponse(token=" + this.a + ", createdTime=" + this.b + ", ttl=" + this.c + ", tokenId=" + this.d + ", code=" + this.e + ", message=" + this.f + ", appVersion=" + this.g + ')';
    }
}

