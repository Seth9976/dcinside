package com.dcinside.app.post.fragments;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class o1 implements b {
    public final AppCompatActivity a;
    public final r1 b;

    public o1(AppCompatActivity appCompatActivity0, r1 r10) {
        this.a = appCompatActivity0;
        this.b = r10;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        r1.H0(this.a, this.b, ((Throwable)object0));
    }
}

