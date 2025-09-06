package com.dcinside.app.response;

import com.dcinside.app.util.Ik.a;
import com.google.gson.annotations.c;
import y4.m;

public final class l {
    @c("result")
    @m
    private String a;
    @c("cause")
    @m
    private String b;
    @c("memo")
    @m
    private String c;
    @a
    @m
    private String d;

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.c;
    }

    @m
    public final String c() {
        return this.d;
    }

    @m
    public final String d() {
        return this.a;
    }

    public final void e(@m String s) {
        this.d = s;
    }
}

