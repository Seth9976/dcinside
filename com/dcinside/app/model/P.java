package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class p extends f0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @c("detail_idx")
    private final int e;
    @c("package_idx")
    private final int f;
    @c("title")
    @m
    private String g;
    @c("img")
    @m
    private final String h;
    @l
    public static final a i = null;
    public static final int j = -999;

    static {
        p.i = new a(null);
    }

    public p() {
        this(0, 0, null, null, 15, null);
    }

    public p(int v, int v1, @m String s, @m String s1) {
        this.e = v;
        this.f = v1;
        this.g = s;
        this.h = s1;
    }

    public p(int v, int v1, String s, String s1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            s = null;
        }
        if((v2 & 8) != 0) {
            s1 = null;
        }
        this(v, v1, s, s1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(this.e != ((p)object0).e) {
            return false;
        }
        if(this.f != ((p)object0).f) {
            return false;
        }
        return L.g(this.g, ((p)object0).g) ? L.g(this.h, ((p)object0).h) : false;
    }

    public final int g() {
        return this.e;
    }

    public final int h() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = (this.e * 0x1F + this.f) * 0x1F;
        int v1 = 0;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        String s = this.h;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @m
    public final String i() {
        return this.g;
    }

    @m
    public final String l() {
        return this.h;
    }

    @l
    public final p m(int v, int v1, @m String s, @m String s1) {
        return new p(v, v1, s, s1);
    }

    public static p o(p p0, int v, int v1, String s, String s1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = p0.e;
        }
        if((v2 & 2) != 0) {
            v1 = p0.f;
        }
        if((v2 & 4) != 0) {
            s = p0.g;
        }
        if((v2 & 8) != 0) {
            s1 = p0.h;
        }
        return p0.m(v, v1, s, s1);
    }

    public final int q() {
        return this.e;
    }

    @m
    public final String r() {
        return this.h;
    }

    public final int s() {
        return this.f;
    }

    @m
    public final String t() {
        return this.g;
    }

    @Override
    @l
    public String toString() {
        return "DcConIcon(detailIndex=" + this.e + ", packageIndex=" + this.f + ", title=" + this.g + ", imageUrl=" + this.h + ")";
    }

    public final void u(@m String s) {
        this.g = s;
    }
}

