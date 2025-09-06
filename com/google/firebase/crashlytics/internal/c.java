package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.G;
import h2.a.a;
import h2.b;

public final class c implements a {
    public final String a;
    public final String b;
    public final long c;
    public final G d;

    public c(String s, String s1, long v, G g0) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = g0;
    }

    @Override  // h2.a$a
    public final void a(b b0) {
        d.h(this.a, this.b, this.c, this.d, b0);
    }
}

