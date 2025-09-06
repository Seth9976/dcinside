package com.dcinside.app.util;

import rx.functions.p;

public final class jj implements p {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jj(boolean z, String s, String s1, String s2, String s3) {
        this.a = z;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.WD(this.a, this.b, this.c, this.d, this.e, ((String)object0));
    }
}

