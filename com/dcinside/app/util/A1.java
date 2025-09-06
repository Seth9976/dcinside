package com.dcinside.app.util;

import com.dcinside.app.type.f;
import rx.functions.o;

public final class a1 implements o {
    public final f a;
    public final String b;
    public final String c;

    public a1(f f0, String s, String s1) {
        this.a = f0;
        this.b = s;
        this.c = s1;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return uk.tm(this.a, this.b, this.c);
    }
}

