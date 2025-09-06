package V;

import kotlin.jvm.internal.L;
import y4.l;

public final class c {
    @com.google.gson.annotations.c("galleryId")
    @l
    private final String a;
    @com.google.gson.annotations.c("isBlockEnable")
    private final boolean b;
    @com.google.gson.annotations.c("isHidden")
    private final boolean c;
    @com.google.gson.annotations.c("words")
    @l
    private final String[] d;
    @com.google.gson.annotations.c("ids")
    @l
    private final String[] e;
    @com.google.gson.annotations.c("nicks")
    @l
    private final String[] f;
    @com.google.gson.annotations.c("ips")
    @l
    private final String[] g;

    public c(@l String s, boolean z, boolean z1, @l String[] arr_s, @l String[] arr_s1, @l String[] arr_s2, @l String[] arr_s3) {
        L.p(s, "galleryId");
        L.p(arr_s, "words");
        L.p(arr_s1, "ids");
        L.p(arr_s2, "nicks");
        L.p(arr_s3, "ips");
        super();
        this.a = s;
        this.b = z;
        this.c = z1;
        this.d = arr_s;
        this.e = arr_s1;
        this.f = arr_s2;
        this.g = arr_s3;
    }

    @l
    public final String a() {
        return this.a;
    }

    @l
    public final String[] b() {
        return this.e;
    }

    @l
    public final String[] c() {
        return this.g;
    }

    @l
    public final String[] d() {
        return this.f;
    }

    @l
    public final String[] e() {
        return this.d;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }
}

