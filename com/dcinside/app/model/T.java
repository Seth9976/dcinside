package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import y4.m;

public final class t extends f0 {
    @c("img_src")
    @m
    private final String e;
    @c("alt")
    @m
    private final String f;
    @c("img_tag")
    @m
    private final String g;

    @Override  // com.dcinside.app.model.f0
    public boolean f() {
        return L.g("ok", this.d());
    }

    @m
    public final String g() {
        return this.f;
    }

    @m
    public final String h() {
        return this.g;
    }

    @m
    public final String i() {
        return this.e;
    }
}

