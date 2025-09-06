package com.dcinside.app.util;

import rx.functions.p;

public final class vg implements p {
    public final String a;
    public final String b;

    public vg(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.Nm(this.a, this.b, ((String)object0));
    }
}

