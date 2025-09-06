package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.Iterator;
import o3.a;

@b(serializable = true)
@C1
final class x4 extends c4 implements Serializable {
    final c4 c;
    private static final long d;

    x4(c4 c40) {
        this.c = (c4)H.E(c40);
    }

    @Override  // com.google.common.collect.c4
    public Object C(Iterable iterable0) {
        return this.c.G(iterable0);
    }

    @Override  // com.google.common.collect.c4
    public Object D(@d4 Object object0, @d4 Object object1) {
        return this.c.H(object0, object1);
    }

    @Override  // com.google.common.collect.c4
    public Object E(@d4 Object object0, @d4 Object object1, @d4 Object object2, Object[] arr_object) {
        return this.c.I(object0, object1, object2, arr_object);
    }

    @Override  // com.google.common.collect.c4
    public Object F(Iterator iterator0) {
        return this.c.J(iterator0);
    }

    @Override  // com.google.common.collect.c4
    public Object G(Iterable iterable0) {
        return this.c.C(iterable0);
    }

    @Override  // com.google.common.collect.c4
    public Object H(@d4 Object object0, @d4 Object object1) {
        return this.c.D(object0, object1);
    }

    @Override  // com.google.common.collect.c4
    public Object I(@d4 Object object0, @d4 Object object1, @d4 Object object2, Object[] arr_object) {
        return this.c.E(object0, object1, object2, arr_object);
    }

    @Override  // com.google.common.collect.c4
    public Object J(Iterator iterator0) {
        return this.c.F(iterator0);
    }

    @Override  // com.google.common.collect.c4
    public c4 P() {
        return this.c;
    }

    @Override  // com.google.common.collect.c4
    public int compare(@d4 Object object0, @d4 Object object1) {
        return this.c.compare(object1, object0);
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof x4 ? this.c.equals(((x4)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return -this.c.hashCode();
    }

    @Override
    public String toString() {
        return this.c + ".reverse()";
    }
}

