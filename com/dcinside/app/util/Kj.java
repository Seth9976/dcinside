package com.dcinside.app.util;

import rx.functions.p;

public final class kj implements p {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public kj(boolean z, String s, String s1, String s2) {
        this.a = z;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.bD(this.a, this.b, this.c, this.d, ((String)object0));
    }
}

