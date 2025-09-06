package com.google.common.eventbus;

import com.google.common.base.H;
import java.lang.reflect.Method;

@e
public class k {
    private final f a;
    private final Object b;
    private final Object c;
    private final Method d;

    k(f f0, Object object0, Object object1, Method method0) {
        this.a = (f)H.E(f0);
        this.b = H.E(object0);
        this.c = H.E(object1);
        this.d = (Method)H.E(method0);
    }

    public Object a() {
        return this.b;
    }

    public f b() {
        return this.a;
    }

    public Object c() {
        return this.c;
    }

    public Method d() {
        return this.d;
    }
}

