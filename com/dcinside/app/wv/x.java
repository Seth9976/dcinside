package com.dcinside.app.wv;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class x implements b {
    public final AppCompatActivity a;

    public x(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        WebViews.q(this.a, ((Throwable)object0));
    }
}

