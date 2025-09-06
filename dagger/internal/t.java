package dagger.internal;

import r3.c;

public final class t implements c {
    private volatile c a;
    private volatile Object b;
    private static final Object c;
    static final boolean d;

    static {
        t.c = new Object();
    }

    private t(c c0) {
        this.b = t.c;
        this.a = c0;
    }

    public static c a(c c0) {
        return !(c0 instanceof t) && !(c0 instanceof f) ? new t(((c)p.b(c0))) : c0;
    }

    @Override  // r3.c
    public Object get() {
        Object object0 = this.b;
        if(object0 == t.c) {
            c c0 = this.a;
            if(c0 == null) {
                return this.b;
            }
            object0 = c0.get();
            this.b = object0;
            this.a = null;
        }
        return object0;
    }
}

