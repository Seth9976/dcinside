package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

public final class f {
    private final Object a;

    private f() {
        this.a = null;
    }

    private f(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.a = object0;
    }

    public static f a() {
        return new f();
    }

    public static f b(Object object0) {
        return object0 == null ? f.a() : f.e(object0);
    }

    public Object c() {
        Object object0 = this.a;
        if(object0 == null) {
            throw new NoSuchElementException("No value present");
        }
        return object0;
    }

    public boolean d() {
        return this.a != null;
    }

    public static f e(Object object0) {
        return new f(object0);
    }
}

