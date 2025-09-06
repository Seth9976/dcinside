package com.google.common.graph;

import com.google.common.base.H;
import com.google.common.collect.a3;
import com.google.common.collect.q3;
import com.google.common.collect.u5;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o3.a;

@x
final class v extends AbstractSet {
    private final Map a;
    private final Object b;

    v(Map map0, Object object0) {
        this.a = (Map)H.E(map0);
        this.b = H.E(object0);
    }

    @a
    private Object a() {
        return this.a.get(this.b);
    }

    public u5 b() {
        Object object0 = this.a();
        return object0 == null ? a3.B().i() : q3.X(object0);
    }

    @Override
    public boolean contains(@a Object object0) {
        Object object1 = this.a();
        return object1 != null && object1.equals(object0);
    }

    @Override
    public Iterator iterator() {
        return this.b();
    }

    @Override
    public int size() {
        return this.a() == null ? 0 : 1;
    }
}

