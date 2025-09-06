package com.google.common.util.concurrent;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public final class P0 implements Callable {
    public final Method a;
    public final Object b;
    public final Object[] c;

    public P0(Method method0, Object object0, Object[] arr_object) {
        this.a = method0;
        this.b = object0;
        this.c = arr_object;
    }

    @Override
    public final Object call() {
        return a.b(this.a, this.b, this.c);
    }
}

