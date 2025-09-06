package com.dcinside.app.util;

import rx.functions.p;

public final class i4 implements p {
    public final String[] a;
    public final com.dcinside.app.http.p b;

    public i4(String[] arr_s, com.dcinside.app.http.p p0) {
        this.a = arr_s;
        this.b = p0;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.pE(this.a, this.b, ((String)object0));
    }
}

