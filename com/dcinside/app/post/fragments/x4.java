package com.dcinside.app.post.fragments;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class x4 implements b {
    public final N a;
    public final v4 b;
    public final AppCompatActivity c;

    public x4(N n0, v4 v40, AppCompatActivity appCompatActivity0) {
        this.a = n0;
        this.b = v40;
        this.c = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        s.h(this.a, this.b, this.c, ((Throwable)object0));
    }
}

