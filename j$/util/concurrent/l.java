package j$.util.concurrent;

import java.util.Map.Entry;

class l implements Map.Entry {
    final int a;
    final Object b;
    volatile Object c;
    volatile l d;

    l(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
    }

    l(int v, Object object0, Object object1, l l0) {
        this(v, object0, object1);
        this.d = l0;
    }

    l a(int v, Object object0) {
        do {
            if(this.a == v && (this.b == object0 || this.b != null && object0.equals(this.b))) {
                return this;
            }
            this = this.d;
        }
        while(this != null);
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 != null) {
                Object object2 = ((Map.Entry)object0).getValue();
                return object2 != null && (object1 == this.b || object1.equals(this.b)) && (object2 == this.c || object2.equals(this.c));
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        return u.a(this.b, this.c);
    }
}

