package com.dcinside.app.model;

import com.google.gson.annotations.c;
import java.util.List;
import y4.m;

public final class c0 {
    @c("name")
    @m
    private final String a;
    @c("gallery")
    @m
    private final List b;
    private int c;

    @m
    public final List a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final void d(int v) {
        this.c = v;
    }
}

