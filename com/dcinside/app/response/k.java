package com.dcinside.app.response;

import com.google.gson.annotations.c;
import java.util.List;
import y4.m;

public final class k {
    @c("result")
    @m
    private String a;
    @c("cause")
    @m
    private String b;
    @c("total_comment")
    private int c;
    @c("total_page")
    private int d;
    @c("re_page")
    @m
    private String e;
    @c("comment_list")
    @m
    private List f;
    @c("preview_list")
    @m
    private List g;

    @m
    public final String a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.e;
    }

    @m
    public final List c() {
        return this.f;
    }

    @m
    public final List d() {
        return this.g;
    }

    @m
    public final String e() {
        return this.a;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.c;
    }

    public final void h(@m List list0) {
        this.f = list0;
    }

    public final void i(@m List list0) {
        this.g = list0;
    }

    public final void j(int v) {
        this.d = v;
    }
}

