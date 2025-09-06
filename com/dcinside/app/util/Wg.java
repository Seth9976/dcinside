package com.dcinside.app.util;

import rx.functions.p;

public final class wg implements p {
    public final boolean a;
    public final String b;
    public final String c;

    public wg(boolean z, String s, String s1) {
        this.a = z;
        this.b = s;
        this.c = s1;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.KD(this.a, this.b, this.c, ((String)object0));
    }
}

