package com.dcinside.app.read.tools;

import rx.functions.o;

public final class l implements o {
    public final boolean a;
    public final s b;
    public final int c;
    public final String d;

    public l(boolean z, s s0, int v, String s1) {
        this.a = z;
        this.b = s0;
        this.c = v;
        this.d = s1;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return s.W(this.a, this.b, this.c, this.d);
    }
}

