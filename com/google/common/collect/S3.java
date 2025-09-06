package com.google.common.collect;

import J1.b;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import o3.a;

@b(serializable = true)
@C1
final class s3 extends c4 implements Serializable {
    final Comparator c;
    private static final long d;

    s3(Comparator comparator0) {
        this.c = comparator0;
    }

    public int S(Iterable iterable0, Iterable iterable1) {
        Iterator iterator0 = iterable0.iterator();
        Iterator iterator1 = iterable1.iterator();
        while(iterator0.hasNext()) {
            if(!iterator1.hasNext()) {
                return 1;
            }
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            int v = this.c.compare(object0, object1);
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return iterator1.hasNext() ? -1 : 0;
    }

    @Override  // com.google.common.collect.c4
    public int compare(Object object0, Object object1) {
        return this.S(((Iterable)object0), ((Iterable)object1));
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof s3 ? this.c.equals(((s3)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() ^ 0x7BB78CF5;
    }

    @Override
    public String toString() {
        return this.c + ".lexicographical()";
    }
}

