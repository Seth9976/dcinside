package com.dcinside.app.push;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class c0 implements b {
    public final AppCompatActivity a;

    public c0(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        e0.h1(this.a, ((Throwable)object0));
    }
}

