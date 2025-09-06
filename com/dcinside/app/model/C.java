package com.dcinside.app.model;

import java.util.List;
import y4.m;

public final class c extends f0 {
    @com.google.gson.annotations.c("ListTop_ad")
    @m
    private final List e;
    @com.google.gson.annotations.c("MainCenter_ad")
    @m
    private final List f;
    @com.google.gson.annotations.c("Exit_ad")
    @m
    private final List g;
    @com.google.gson.annotations.c("auto_picture_ad")
    @m
    private final List h;
    @com.google.gson.annotations.c("chk_traffic_list")
    @m
    private final List i;
    @com.google.gson.annotations.c("chk_traffic_view")
    @m
    private final List j;

    @Override  // com.dcinside.app.model.f0
    public boolean f() {
        return this.e != null || this.f != null || this.g != null || this.h != null || this.i != null || this.j != null;
    }

    @m
    public final List g() {
        return this.h;
    }

    @m
    public final List h() {
        return this.g;
    }

    @m
    public final List i() {
        return this.f;
    }

    @m
    public final List l() {
        return this.e;
    }

    @m
    public final List m() {
        return this.i;
    }

    @m
    public final List o() {
        return this.j;
    }
}

