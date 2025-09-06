package com.google.common.collect;

import J1.b;
import java.io.Serializable;

@b(serializable = true)
@C1
final class x5 extends c4 implements Serializable {
    static final x5 c;
    private static final long d;

    static {
        x5.c = new x5();
    }

    private Object S() {
        return x5.c;
    }

    @Override  // com.google.common.collect.c4
    public int compare(Object object0, Object object1) {
        return object0.toString().compareTo(object1.toString());
    }

    @Override
    public String toString() {
        return "Ordering.usingToString()";
    }
}

