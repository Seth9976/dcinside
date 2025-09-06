package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

public final class o0 implements Supplier {
    public final Comparator a;

    public o0(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final Object get() {
        return a1.a0(this.a);
    }
}

