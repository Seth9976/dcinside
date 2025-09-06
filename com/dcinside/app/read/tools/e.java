package com.dcinside.app.read.tools;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class e implements b {
    public final AppCompatActivity a;
    public final s b;

    public e(AppCompatActivity appCompatActivity0, s s0) {
        this.a = appCompatActivity0;
        this.b = s0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        s.K(this.a, this.b, ((Throwable)object0));
    }
}

