package com.dcinside.app.ad.naver;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final String a;
    @l
    private final String b;
    @l
    private final String c;
    @l
    private final String d;
    @l
    private final String e;
    @l
    private final String f;
    @l
    private final String g;
    @l
    private final String h;
    @l
    public static final a i = null;
    @l
    public static final String j = "list";
    @l
    public static final String k = "view";
    @l
    public static final String l = "search";
    @l
    public static final String m = "on";
    @l
    public static final String n = "off";

    static {
        d.i = new a(null);
    }

    public d() {
        this(null, null, null, null, null, null, null, null, 0xFF, null);
    }

    public d(@l String s, @l String s1, @l String s2, @l String s3, @l String s4, @l String s5, @l String s6, @l String s7) {
        L.p(s, "mode");
        L.p(s1, "categoryId");
        L.p(s2, "galleryId");
        L.p(s3, "no");
        L.p(s4, "subject");
        L.p(s5, "memo");
        L.p(s6, "keywords");
        L.p(s7, "small");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        this.h = s7;
    }

    public d(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, w w0) {
        this(((v & 1) == 0 ? s : "list"), ((v & 2) == 0 ? s1 : ""), ((v & 4) == 0 ? s2 : ""), ((v & 8) == 0 ? s3 : ""), ((v & 16) == 0 ? s4 : ""), ((v & 0x20) == 0 ? s5 : ""), ((v & 0x40) == 0 ? s6 : ""), ((v & 0x80) == 0 ? s7 : "off"));
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String b() {
        return this.b;
    }

    @l
    public final String c() {
        return this.c;
    }

    @l
    public final String d() {
        return this.d;
    }

    @l
    public final String e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!L.g(this.a, ((d)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((d)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((d)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((d)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((d)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((d)object0).f)) {
            return false;
        }
        return L.g(this.g, ((d)object0).g) ? L.g(this.h, ((d)object0).h) : false;
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
    public final String h() {
        return this.h;
    }

    @Override
    public int hashCode() {
        return ((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @l
    public final d i(@l String s, @l String s1, @l String s2, @l String s3, @l String s4, @l String s5, @l String s6, @l String s7) {
        L.p(s, "mode");
        L.p(s1, "categoryId");
        L.p(s2, "galleryId");
        L.p(s3, "no");
        L.p(s4, "subject");
        L.p(s5, "memo");
        L.p(s6, "keywords");
        L.p(s7, "small");
        return new d(s, s1, s2, s3, s4, s5, s6, s7);
    }

    public static d j(d d0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, Object object0) {
        String s8 = (v & 1) == 0 ? s : d0.a;
        String s9 = (v & 2) == 0 ? s1 : d0.b;
        String s10 = (v & 4) == 0 ? s2 : d0.c;
        String s11 = (v & 8) == 0 ? s3 : d0.d;
        String s12 = (v & 16) == 0 ? s4 : d0.e;
        String s13 = (v & 0x20) == 0 ? s5 : d0.f;
        String s14 = (v & 0x40) == 0 ? s6 : d0.g;
        return (v & 0x80) == 0 ? d0.i(s8, s9, s10, s11, s12, s13, s14, s7) : d0.i(s8, s9, s10, s11, s12, s13, s14, d0.h);
    }

    @l
    public final String k() [...] // 潜在的解密器

    @l
    public final String l() [...] // 潜在的解密器

    @l
    public final String m() [...] // 潜在的解密器

    @l
    public final String n() {
        return this.f;
    }

    @l
    public final String o() [...] // 潜在的解密器

    @l
    public final String p() [...] // 潜在的解密器

    @l
    public final String q() [...] // 潜在的解密器

    @l
    public final String r() [...] // 潜在的解密器

    @Override
    @l
    public String toString() {
        return "NaverScriptAdParams(mode=" + this.a + ", categoryId=" + this.b + ", galleryId=" + this.c + ", no=" + this.d + ", subject=" + this.e + ", memo=" + this.f + ", keywords=" + this.g + ", small=" + this.h + ")";
    }
}

