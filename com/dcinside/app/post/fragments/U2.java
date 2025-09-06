package com.dcinside.app.post.fragments;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class u2 implements b {
    public final AppCompatActivity a;

    public u2(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        N3.N4(this.a, ((Throwable)object0));
    }
}

