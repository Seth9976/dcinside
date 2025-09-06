package com.google.common.collect;

import java.util.Comparator;
import java.util.Map.Entry;

public final class c3 implements Comparator {
    public final Comparator a;

    public c3(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return d3.n0(this.a, ((Map.Entry)object0), ((Map.Entry)object1));
    }
}

