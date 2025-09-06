package com.dcinside.app.read.tools;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.a;

public final class c implements a {
    public final AppCompatActivity a;

    public c(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override  // rx.functions.a
    public final void call() {
        s.I(this.a);
    }
}

