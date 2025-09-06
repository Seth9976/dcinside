package com.google.common.collect;

import java.util.Comparator;

public final class u4 implements Comparator {
    public final Comparator a;
    public final Comparator b;

    public u4(Comparator comparator0, Comparator comparator1) {
        this.a = comparator0;
        this.b = comparator1;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return v4.L(this.a, this.b, ((a)object0), ((a)object1));
    }
}

