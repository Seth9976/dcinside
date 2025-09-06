package com.dcinside.app.post.fragments;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class z4 implements b {
    public final v4 a;
    public final AppCompatActivity b;

    public z4(v4 v40, AppCompatActivity appCompatActivity0) {
        this.a = v40;
        this.b = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        t.h(this.a, this.b, ((Throwable)object0));
    }
}

