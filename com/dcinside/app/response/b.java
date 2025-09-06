package com.dcinside.app.response;

import com.dcinside.app.model.f0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import m0.a;
import y4.m;

public final class b extends f0 {
    @c("use_list")
    @m
    private final ArrayList e;
    @c("unuse_list")
    @m
    private final ArrayList f;

    // 去混淆评级： 低(20)
    @Override  // com.dcinside.app.model.f0
    public boolean f() {
        return a.a.i(this.d()) && a.a.i(this.a());
    }

    @m
    public final ArrayList g() {
        return this.f;
    }

    @m
    public final ArrayList h() {
        return this.e;
    }
}

