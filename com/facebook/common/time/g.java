package com.facebook.common.time;

import k1.n.a;
import k1.n;

@n(a.a)
public class g implements com.facebook.common.time.a {
    private static final g b;

    static {
        g.b = new g();
    }

    public static g a() {
        return g.b;
    }

    @Override  // com.facebook.common.time.a
    public long now() {
        return System.currentTimeMillis();
    }
}

