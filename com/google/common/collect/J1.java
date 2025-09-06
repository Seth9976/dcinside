package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.Comparator;
import o3.a;

@b(serializable = true)
@C1
final class j1 extends c4 implements Serializable {
    final Comparator c;
    private static final long d;

    j1(Comparator comparator0) {
        this.c = (Comparator)H.E(comparator0);
    }

    @Override  // com.google.common.collect.c4
    public int compare(@d4 Object object0, @d4 Object object1) {
        return this.c.compare(object0, object1);
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof j1 ? this.c.equals(((j1)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        return this.c.toString();
    }
}

