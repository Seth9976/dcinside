package org.bson.codecs;

import R3.a;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;
import org.bson.q0;

public class d0 implements b {
    private final D a;
    private final q0 b;

    public d0() {
        this(new D());
    }

    public d0(D d0) {
        this(d0, null);
    }

    public d0(D d0, q0 q00) {
        this.a = (D)a.e("bsonTypeClassMap", d0);
        this.b = q00;
    }

    public d0(q0 q00) {
        this(new D(), q00);
    }

    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, d d0) {
        return Iterable.class.isAssignableFrom(class0) ? new c0(d0, this.a, this.b) : null;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !this.a.equals(((d0)object0).a)) {
            return false;
        }
        q0 q00 = ((d0)object0).b;
        return this.b == null ? q00 == null : this.b.equals(q00);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }
}

