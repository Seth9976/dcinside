package dagger.internal;

import a3.e;
import r3.c;

public final class q implements c {
    private final c a;
    static final boolean b;

    static {
    }

    private q(c c0) {
        this.a = c0;
    }

    public static c a(c c0) {
        return new q(((c)p.b(c0)));
    }

    public e b() {
        return f.a(this.a);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

