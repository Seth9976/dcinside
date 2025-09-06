package com.google.android.datatransport.runtime.dagger.internal;

import r3.c;
import y1.d;

public final class b implements c, d {
    private volatile c a;
    private volatile Object b;
    private static final Object c;
    static final boolean d;

    static {
        b.c = new Object();
    }

    private b(c c0) {
        this.b = b.c;
        this.a = c0;
    }

    public static d a(c c0) {
        return c0 instanceof d ? ((d)c0) : new b(((c)e.b(c0)));
    }

    public static c b(c c0) {
        e.b(c0);
        return c0 instanceof b ? c0 : new b(c0);
    }

    private static Object c(Object object0, Object object1) {
        if(object0 != b.c && object0 != object1) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object0 + " & " + object1 + ". This is likely due to a circular dependency.");
        }
        return object1;
    }

    @Override  // r3.c, y1.d
    public Object get() {
        Object object0 = this.b;
        Object object1 = b.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.b;
                if(object0 == object1) {
                    object0 = this.a.get();
                    this.b = b.c(this.b, object0);
                    this.a = null;
                }
            }
        }
        return object0;
    }
}

