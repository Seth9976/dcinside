package com.google.common.collect;

import J1.b;
import java.io.Serializable;
import o3.a;

@b(serializable = true)
@C1
final class Y3 extends c4 implements Serializable {
    final c4 c;
    private static final long d;

    Y3(c4 c40) {
        this.c = c40;
    }

    @Override  // com.google.common.collect.c4
    public c4 L() {
        return this.c.L();
    }

    @Override  // com.google.common.collect.c4
    public c4 M() {
        return this;
    }

    @Override  // com.google.common.collect.c4
    public c4 P() {
        return this.c.P().L();
    }

    @Override  // com.google.common.collect.c4
    public int compare(@a Object object0, @a Object object1) {
        if(object0 == object1) {
            return 0;
        }
        if(object0 == null) {
            return 1;
        }
        return object1 == null ? -1 : this.c.compare(object0, object1);
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof Y3 ? this.c.equals(((Y3)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() ^ -921210296;
    }

    @Override
    public String toString() {
        return this.c + ".nullsLast()";
    }
}

