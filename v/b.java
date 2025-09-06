package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.w;
import y4.m;

public final class b {
    @c("galleryName")
    @m
    private final String a;
    @c("idx")
    @m
    private final Integer b;
    @c("nickname")
    @m
    private final String c;
    @c("galleryId")
    @m
    private final String d;
    @c("postNumber")
    @m
    private final String e;
    @c("subject")
    @m
    private final String f;
    @c("article_type")
    @m
    private String g;
    @c("comment_no")
    @m
    private String h;
    @c("type")
    @m
    private String i;

    public b(@m String s, @m Integer integer0, @m String s1, @m String s2, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7) {
        this.a = s;
        this.b = integer0;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = s6;
        this.i = s7;
    }

    public b(String s, Integer integer0, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, w w0) {
        this(s, integer0, s1, s2, s3, s4, ((v & 0x40) == 0 ? s5 : null), ((v & 0x80) == 0 ? s6 : null), ((v & 0x100) == 0 ? s7 : null));
    }

    @m
    public final String a() {
        return this.g;
    }

    @m
    public final String b() {
        return this.d;
    }

    @m
    public final String c() {
        return this.a;
    }

    @m
    public final Integer d() {
        return this.b;
    }

    @m
    public final String e() {
        return this.c;
    }

    @m
    public final String f() {
        return this.e;
    }

    @m
    public final String g() {
        return this.i;
    }

    @m
    public final String h() {
        return this.h;
    }

    @m
    public final String i() {
        return this.f;
    }

    public final void j(@m String s) {
        this.g = s;
    }

    public final void k(@m String s) {
        this.i = s;
    }

    public final void l(@m String s) {
        this.h = s;
    }
}

