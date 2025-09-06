package rx.internal.operators;

import rx.g.a;
import rx.g;
import rx.n;
import rx.plugins.c;

public enum v implements a {
    INSTANCE;

    static final g b;

    static {
        v.b = new g(c.G(v.a));
    }

    public void a(n n0) {
        n0.d();
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }

    public static g c() {
        return v.b;
    }
}

