package com.dcinside.app.util;

import rx.functions.p;

public final class h6 implements p {
    public final String a;
    public final String b;
    public final String c;

    public h6(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Qp(this.a, this.b, this.c, ((String)object0));
    }
}

