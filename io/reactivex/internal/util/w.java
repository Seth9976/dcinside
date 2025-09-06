package io.reactivex.internal.util;

import e3.o;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class w implements o {
    final Comparator a;

    public w(Comparator comparator0) {
        this.a = comparator0;
    }

    public List a(List list0) throws Exception {
        Collections.sort(list0, this.a);
        return list0;
    }

    @Override  // e3.o
    public Object apply(Object object0) throws Exception {
        return this.a(((List)object0));
    }
}

