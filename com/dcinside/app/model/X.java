package com.dcinside.app.model;

import com.google.gson.annotations.c;
import java.util.List;
import m0.a;
import y4.m;

public final class x extends f0 {
    @c("mygall")
    @m
    private final List e;
    @c("favori")
    @m
    private final List f;

    // 去混淆评级： 低(20)
    @Override  // com.dcinside.app.model.f0
    public boolean f() {
        return a.a.h(this.d()) && a.a.h(this.a());
    }

    @m
    public final List g() {
        return this.f;
    }

    @m
    public final List h() {
        return this.e;
    }
}

