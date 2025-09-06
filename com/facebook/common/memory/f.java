package com.facebook.common.memory;

import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class f implements e {
    @h
    private static f a;

    static {
    }

    @Override  // com.facebook.common.memory.e
    public void a(d d0) {
    }

    @Override  // com.facebook.common.memory.e
    public void b(d d0) {
    }

    public static f c() {
        synchronized(f.class) {
            if(f.a == null) {
                f.a = new f();
            }
            return f.a;
        }
    }
}

