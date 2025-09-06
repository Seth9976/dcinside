package com.apm.insight.b;

import androidx.annotation.CallSuper;

public abstract class e {
    public static long a;
    public static long b;
    public volatile boolean c;

    static {
    }

    public e() {
        this.c = false;
    }

    @CallSuper
    public void a(String s) {
        this.c = true;
    }

    public boolean a() {
        return false;
    }

    @CallSuper
    public void b(String s) {
        this.c = false;
    }
}

