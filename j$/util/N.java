package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

class n extends l implements List, java.util.List {
    final java.util.List b;
    private static final long serialVersionUID = 0xFC0F2531B5EC8E10L;

    n(java.util.List list0) {
        super(list0);
        this.b = list0;
    }

    @Override
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this || this.b.equals(object0);
    }

    @Override
    public final Object get(int v) {
        return this.b.get(v);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final int indexOf(Object object0) {
        return this.b.indexOf(object0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return this.b.lastIndexOf(object0);
    }

    @Override
    public final ListIterator listIterator() {
        return new m(this, 0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new m(this, v);
    }

    private Object readResolve() {
        java.util.List list0 = this.b;
        return list0 instanceof RandomAccess ? new t(list0) : this;  // 初始化器: Lj$/util/n;-><init>(Ljava/util/List;)V
    }

    @Override
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.List
    public final void sort(Comparator comparator0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.List subList(int v, int v1) {
        return new n(this.b.subList(v, v1));
    }
}

