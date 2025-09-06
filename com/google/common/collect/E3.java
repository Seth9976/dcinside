package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

public final class e3 implements Supplier {
    public final Comparator a;

    public e3(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final Object get() {
        return q5.A(this.a);
    }
}

