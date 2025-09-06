package V;

import com.google.gson.annotations.c;
import y4.m;

public final class q {
    @c("galleryId")
    @m
    private final String a;
    @c("galleryName")
    @m
    private final String b;
    @c("postNumber")
    @m
    private final String c;
    @c("subject")
    @m
    private final String d;
    @c("name")
    @m
    private final String e;
    @c("writeDate")
    private final long f;
    @c("saveDate")
    private final long g;

    public q(@m String s, @m String s1, @m String s2, @m String s3, @m String s4, long v, long v1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = v;
        this.g = v1;
    }

    @m
    public final String a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final String c() {
        return this.e;
    }

    @m
    public final String d() {
        return this.c;
    }

    public final long e() {
        return this.g;
    }

    @m
    public final String f() {
        return this.d;
    }

    public final long g() {
        return this.f;
    }
}

