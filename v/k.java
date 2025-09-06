package V;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.l;

public final class k {
    @c("galleryId")
    @l
    private final String a;
    @c("galleryName")
    @l
    private final String b;
    @c("postNumber")
    private final int c;
    @c("subject")
    @l
    private final String d;
    @c("date")
    @l
    private final String e;
    @c("writeUserName")
    @l
    private final String f;
    @c("folder")
    @l
    private final String g;
    @c("time")
    private final long h;

    public k(@l String s, @l String s1, int v, @l String s2, @l String s3, @l String s4, @l String s5, long v1) {
        L.p(s, "galleryId");
        L.p(s1, "galleryName");
        L.p(s2, "subject");
        L.p(s3, "date");
        L.p(s4, "writeUserName");
        L.p(s5, "folder");
        super();
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = v1;
    }

    @l
    public final String a() {
        return this.e;
    }

    @l
    public final String b() {
        return this.g;
    }

    @l
    public final String c() {
        return this.a;
    }

    @l
    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    @l
    public final String f() {
        return this.d;
    }

    public final long g() {
        return this.h;
    }

    @l
    public final String h() {
        return this.f;
    }
}

