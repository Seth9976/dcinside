package com.dcinside.app.wv;

import androidx.appcompat.app.AppCompatActivity;
import rx.functions.b;

public final class w implements b {
    public final AppCompatActivity a;
    public final String b;
    public final int c;

    public w(AppCompatActivity appCompatActivity0, String s, int v) {
        this.a = appCompatActivity0;
        this.b = s;
        this.c = v;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        WebViews.p(this.a, this.b, this.c, ((Boolean)object0));
    }
}

