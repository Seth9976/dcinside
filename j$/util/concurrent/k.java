package j$.util.concurrent;

import java.util.Map.Entry;

final class k implements Map.Entry {
    final Object a;
    Object b;
    final ConcurrentHashMap c;

    k(Object object0, Object object1, ConcurrentHashMap concurrentHashMap0) {
        this.a = object0;
        this.b = object1;
        this.c = concurrentHashMap0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 != null) {
                Object object2 = ((Map.Entry)object0).getValue();
                return object2 != null && (object1 == this.a || object1.equals(this.a)) && (object2 == this.b || object2.equals(this.b));
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override
    public final Object setValue(Object object0) {
        object0.getClass();
        Object object1 = this.b;
        this.b = object0;
        this.c.put(this.a, object0);
        return object1;
    }

    @Override
    public final String toString() {
        return u.a(this.a, this.b);
    }
}

