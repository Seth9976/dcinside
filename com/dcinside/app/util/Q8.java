package com.dcinside.app.util;

import rx.functions.p;

public final class q8 implements p {
    public final String a;
    public final int b;
    public final int[] c;

    public q8(String s, int v, int[] arr_v) {
        this.a = s;
        this.b = v;
        this.c = arr_v;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.pw(this.a, this.b, this.c, ((String)object0));
    }
}

