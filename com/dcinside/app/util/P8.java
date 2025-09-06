package com.dcinside.app.util;

import rx.functions.p;

public final class p8 implements p {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public p8(boolean z, String s, String s1, String s2, String s3, String s4, String s5) {
        this.a = z;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.IC(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((String)object0));
    }
}

