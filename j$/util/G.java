package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

class g extends f implements List, java.util.List {
    final java.util.List c;
    private static final long serialVersionUID = 0x9463EFE38344107CL;

    g(java.util.List list0) {
        super(list0);
        this.c = list0;
    }

    g(java.util.List list0, Object object0) {
        super(list0, object0);
        this.c = list0;
    }

    @Override
    public final void add(int v, Object object0) {
        synchronized(this.b) {
            this.c.add(v, object0);
        }
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        synchronized(this.b) {
        }
        return this.c.addAll(v, collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Object object1 = this.b;
        return this.c.equals(object0);
    }

    @Override
    public final Object get(int v) {
        synchronized(this.b) {
        }
        return this.c.get(v);
    }

    @Override
    public final int hashCode() {
        synchronized(this.b) {
        }
        return this.c.hashCode();
    }

    @Override
    public final int indexOf(Object object0) {
        synchronized(this.b) {
        }
        return this.c.indexOf(object0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        synchronized(this.b) {
        }
        return this.c.lastIndexOf(object0);
    }

    @Override
    public final ListIterator listIterator() {
        return this.c.listIterator();
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.c.listIterator(v);
    }

    private Object readResolve() {
        java.util.List list0 = this.c;
        return list0 instanceof RandomAccess ? new i(list0) : this;  // 初始化器: Lj$/util/g;-><init>(Ljava/util/List;)V
    }

    @Override
    public final Object remove(int v) {
        synchronized(this.b) {
        }
        return this.c.remove(v);
    }

    @Override  // j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator0) {
        synchronized(this.b) {
            java.util.List list0 = this.c;
            if(list0 instanceof List) {
                ((List)list0).replaceAll(unaryOperator0);
            }
            else {
                List.-CC.$default$replaceAll(list0, unaryOperator0);
            }
        }
    }

    @Override
    public final Object set(int v, Object object0) {
        synchronized(this.b) {
        }
        return this.c.set(v, object0);
    }

    @Override  // j$.util.List
    public final void sort(Comparator comparator0) {
        synchronized(this.b) {
            List.-EL.sort(this.c, comparator0);
        }
    }

    @Override
    public java.util.List subList(int v, int v1) {
        synchronized(this.b) {
        }
        return new g(this.c.subList(v, v1), this.b);
    }
}

