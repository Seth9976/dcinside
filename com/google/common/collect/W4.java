package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.Iterator;

@b(serializable = true)
@C1
final class w4 extends c4 implements Serializable {
    static final w4 c;
    private static final long d;

    static {
        w4.c = new w4();
    }

    @Override  // com.google.common.collect.c4
    public Object C(Iterable iterable0) {
        return this.V(iterable0);
    }

    @Override  // com.google.common.collect.c4
    public Object D(Object object0, Object object1) {
        return this.T(((Comparable)object0), ((Comparable)object1));
    }

    @Override  // com.google.common.collect.c4
    public Object E(Object object0, Object object1, Object object2, Object[] arr_object) {
        return this.U(((Comparable)object0), ((Comparable)object1), ((Comparable)object2), ((Comparable[])arr_object));
    }

    @Override  // com.google.common.collect.c4
    public Object F(Iterator iterator0) {
        return this.W(iterator0);
    }

    @Override  // com.google.common.collect.c4
    public Object G(Iterable iterable0) {
        return this.Z(iterable0);
    }

    @Override  // com.google.common.collect.c4
    public Object H(Object object0, Object object1) {
        return this.X(((Comparable)object0), ((Comparable)object1));
    }

    @Override  // com.google.common.collect.c4
    public Object I(Object object0, Object object1, Object object2, Object[] arr_object) {
        return this.Y(((Comparable)object0), ((Comparable)object1), ((Comparable)object2), ((Comparable[])arr_object));
    }

    @Override  // com.google.common.collect.c4
    public Object J(Iterator iterator0) {
        return this.a0(iterator0);
    }

    @Override  // com.google.common.collect.c4
    public c4 P() {
        return c4.K();
    }

    public int S(Comparable comparable0, Comparable comparable1) {
        H.E(comparable0);
        return comparable0 == comparable1 ? 0 : comparable1.compareTo(comparable0);
    }

    public Comparable T(Comparable comparable0, Comparable comparable1) {
        return (Comparable)V3.e.H(comparable0, comparable1);
    }

    public Comparable U(Comparable comparable0, Comparable comparable1, Comparable comparable2, Comparable[] arr_comparable) {
        return (Comparable)V3.e.I(comparable0, comparable1, comparable2, arr_comparable);
    }

    public Comparable V(Iterable iterable0) {
        return (Comparable)V3.e.G(iterable0);
    }

    public Comparable W(Iterator iterator0) {
        return (Comparable)V3.e.J(iterator0);
    }

    public Comparable X(Comparable comparable0, Comparable comparable1) {
        return (Comparable)V3.e.D(comparable0, comparable1);
    }

    public Comparable Y(Comparable comparable0, Comparable comparable1, Comparable comparable2, Comparable[] arr_comparable) {
        return (Comparable)V3.e.E(comparable0, comparable1, comparable2, arr_comparable);
    }

    public Comparable Z(Iterable iterable0) {
        return (Comparable)V3.e.C(iterable0);
    }

    public Comparable a0(Iterator iterator0) {
        return (Comparable)V3.e.F(iterator0);
    }

    private Object b0() {
        return w4.c;
    }

    @Override  // com.google.common.collect.c4
    public int compare(Object object0, Object object1) {
        return this.S(((Comparable)object0), ((Comparable)object1));
    }

    @Override
    public String toString() {
        return "Ordering.natural().reverse()";
    }
}

