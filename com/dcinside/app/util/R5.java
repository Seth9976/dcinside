package com.dcinside.app.util;

import rx.functions.p;

public final class r5 implements p {
    public final String a;
    public final String b;
    public final int c;

    public r5(String s, String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.yx(this.a, this.b, this.c, ((String)object0));
    }
}

