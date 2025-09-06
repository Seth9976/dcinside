package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

public final class k1 implements Supplier {
    public final int a;
    public final Comparator b;

    public k1(int v, Comparator comparator0) {
        this.a = v;
        this.b = comparator0;
    }

    @Override
    public final Object get() {
        return k5.e(this.a, this.b);
    }
}

