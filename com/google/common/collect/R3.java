package com.google.common.collect;

import java.util.Comparator;

public final class r3 implements Comparator {
    public final Comparator a;

    public r3(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return n.b(this.a, ((e4)object0), ((e4)object1));
    }
}

