package com.dcinside.app.model;

import com.dcinside.app.util.Ik.a;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.m;

public final class z {
    @c("thumb_img")
    @m
    private final String a;
    @c("subject")
    @m
    private final String b;
    @c("no")
    @m
    private final String c;
    @c("ko_name")
    @m
    private final String d;
    @a
    @m
    private String e;

    public z() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public z(@m String s, @m String s1, @m String s2, @m String s3, @m String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    public z(String s, String s1, String s2, String s3, String s4, int v, w w0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null));
    }

    @m
    public final String a() {
        return this.d;
    }

    @m
    public final String b() {
        return this.e;
    }

    @m
    public final String c() {
        return this.c;
    }

    public final int d() {
        String s = this.c;
        if(s != null) {
            Integer integer0 = v.b1(s);
            return integer0 == null ? 0 : ((int)integer0);
        }
        return 0;
    }

    @m
    public final String e() {
        return this.b;
    }

    @m
    public final String f() {
        return this.a;
    }

    public final void g(@m String s) {
        this.e = s;
    }
}

