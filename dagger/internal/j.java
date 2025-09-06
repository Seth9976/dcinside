package dagger.internal;

import a3.e;

public final class j implements e, g {
    private final Object a;
    private static final j b;

    static {
        j.b = new j(null);
    }

    private j(Object object0) {
        this.a = object0;
    }

    public static g a(Object object0) {
        return new j(p.c(object0, "instance cannot be null"));
    }

    public static g b(Object object0) {
        return object0 == null ? j.c() : new j(object0);
    }

    private static j c() {
        return j.b;
    }

    @Override  // a3.e, r3.c
    public Object get() {
        return this.a;
    }
}

