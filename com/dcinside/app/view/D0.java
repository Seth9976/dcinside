package com.dcinside.app.view;

import rx.functions.o;

public final class d0 implements o {
    public final String a;
    public final int b;
    public final String c;

    public d0(String s, int v, String s1) {
        this.a = s;
        this.b = v;
        this.c = s1;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return n0.h0(this.a, this.b, this.c);
    }
}

