package com.dcinside.app.browser;

import androidx.appcompat.app.AppCompatActivity;

public final class k implements Runnable {
    public final String a;
    public final AppCompatActivity b;
    public final String c;

    public k(String s, AppCompatActivity appCompatActivity0, String s1) {
        this.a = s;
        this.b = appCompatActivity0;
        this.c = s1;
    }

    @Override
    public final void run() {
        n.e(this.a, this.b, this.c);
    }
}

