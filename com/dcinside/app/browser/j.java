package com.dcinside.app.browser;

import androidx.appcompat.app.AppCompatActivity;

public final class j implements Runnable {
    public final AppCompatActivity a;

    public j(AppCompatActivity appCompatActivity0) {
        this.a = appCompatActivity0;
    }

    @Override
    public final void run() {
        n.g(this.a);
    }
}

