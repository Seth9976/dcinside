package com.google.android.datatransport.runtime.dagger.internal;

public final class d implements c, y1.d {
    private final Object a;
    private static final d b;

    static {
        d.b = new d(null);
    }

    private d(Object object0) {
        this.a = object0;
    }

    public static c a(Object object0) {
        return new d(e.c(object0, "instance cannot be null"));
    }

    public static c b(Object object0) {
        return object0 == null ? d.c() : new d(object0);
    }

    private static d c() {
        return d.b;
    }

    @Override  // y1.d, r3.c
    public Object get() {
        return this.a;
    }
}

