package com.dcinside.app.gallery;

import kotlin.jvm.internal.w;
import y4.m;

public final class c {
    @com.google.gson.annotations.c("category")
    @h3.c
    private final int a;
    @com.google.gson.annotations.c("name")
    @h3.c
    @m
    private final String b;
    @com.google.gson.annotations.c("ko_name")
    @h3.c
    @m
    private final String c;
    @com.google.gson.annotations.c("linkto")
    @h3.c
    @m
    private final String d;
    @com.google.gson.annotations.c("depth")
    @h3.c
    @m
    private final String e;

    public c() {
        this(0, null, null, null, null, 0x1F, null);
    }

    public c(int v, @m String s, @m String s1, @m String s2, @m String s3) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    public c(int v, String s, String s1, String s2, String s3, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v, ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? s1 : null), ((v1 & 8) == 0 ? s2 : null), ((v1 & 16) == 0 ? s3 : null));
    }

    public final int a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.e;
    }

    @m
    public final String c() {
        return this.b;
    }

    @m
    public final String d() {
        return this.d;
    }

    @m
    public final String e() {
        return this.c;
    }
}

