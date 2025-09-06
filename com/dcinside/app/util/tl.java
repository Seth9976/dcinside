package com.dcinside.app.util;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class tl implements b {
    public final AppCompatActivity a;

    public tl(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Al.G(this.a, ((Throwable)object0));
    }
}

