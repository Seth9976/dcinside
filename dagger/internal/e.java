package dagger.internal;

import r3.c;

public final class e implements g {
    private c a;

    c a() {
        return (c)p.b(this.a);
    }

    public static void b(c c0, c c1) {
        p.b(c1);
        if(((e)c0).a != null) {
            throw new IllegalStateException();
        }
        ((e)c0).a = c1;
    }

    @Deprecated
    public void c(c c0) {
        e.b(this, c0);
    }

    @Override  // r3.c
    public Object get() {
        c c0 = this.a;
        if(c0 == null) {
            throw new IllegalStateException();
        }
        return c0.get();
    }
}

