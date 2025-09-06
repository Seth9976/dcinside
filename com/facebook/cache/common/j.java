package com.facebook.cache.common;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class j implements b {
    @h
    private static j a;

    static {
    }

    @Override  // com.facebook.cache.common.b
    public void a(com.facebook.cache.common.b.a b$a0, Class class0, String s, @h Throwable throwable0) {
    }

    public static j b() {
        synchronized(j.class) {
            if(j.a == null) {
                j.a = new j();
            }
            return j.a;
        }
    }
}

