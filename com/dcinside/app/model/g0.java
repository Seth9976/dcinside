package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class g0 {
    @c("gallery_name")
    @l
    private final String a;
    @c("memo")
    @l
    private final String b;
    @c("thumb")
    @l
    private final String c;
    @c("origin")
    @l
    private final String d;
    @c("date")
    @l
    private final String e;

    public g0() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public g0(@l String s, @l String s1, @l String s2, @l String s3, @l String s4) {
        L.p(s, "gallName");
        L.p(s1, "memo");
        L.p(s2, "thumbnailUrl");
        L.p(s3, "imageUrl");
        L.p(s4, "date");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    public g0(String s, String s1, String s2, String s3, String s4, int v, w w0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? s1 : ""), ((v & 4) == 0 ? s2 : ""), ((v & 8) == 0 ? s3 : ""), ((v & 16) == 0 ? s4 : ""));
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
        if(!(object0 instanceof g0)) {
            return false;
        }
        if(!L.g(this.a, ((g0)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((g0)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((g0)object0).c)) {
            return false;
        }
        return L.g(this.d, ((g0)object0).d) ? L.g(this.e, ((g0)object0).e) : false;
    }

    @l
    public final g0 f(@l String s, @l String s1, @l String s2, @l String s3, @l String s4) {
        L.p(s, "gallName");
        L.p(s1, "memo");
        L.p(s2, "thumbnailUrl");
        L.p(s3, "imageUrl");
        L.p(s4, "date");
        return new g0(s, s1, s2, s3, s4);
    }

    public static g0 g(g0 g00, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = g00.a;
        }
        if((v & 2) != 0) {
            s1 = g00.b;
        }
        if((v & 4) != 0) {
            s2 = g00.c;
        }
        if((v & 8) != 0) {
            s3 = g00.d;
        }
        if((v & 16) != 0) {
            s4 = g00.e;
        }
        return g00.f(s, s1, s2, s3, s4);
    }

    @l
    public final String h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @l
    public final String i() [...] // 潜在的解密器

    @l
    public final String j() [...] // 潜在的解密器

    @l
    public final String k() [...] // 潜在的解密器

    @l
    public final String l() [...] // 潜在的解密器

    @Override
    @l
    public String toString() {
        return "TransferInfo(gallName=" + this.a + ", memo=" + this.b + ", thumbnailUrl=" + this.c + ", imageUrl=" + this.d + ", date=" + this.e + ")";
    }
}

