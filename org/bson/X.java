package org.bson;

import R3.a;
import org.bson.types.Decimal128;

public final class x extends N {
    private final Decimal128 a;

    public x(Decimal128 decimal1280) {
        a.e("value", decimal1280);
        this.a = decimal1280;
    }

    @Override  // org.bson.Z
    public X G() {
        return X.u;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return x.class == class0 && this.a.equals(((x)object0).a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // org.bson.N
    public Decimal128 j0() {
        return this.a;
    }

    @Override  // org.bson.N
    public double k0() {
        return this.a.a().doubleValue();
    }

    @Override  // org.bson.N
    public int m0() {
        return this.a.a().intValue();
    }

    @Override  // org.bson.N
    public long n0() {
        return this.a.a().longValue();
    }

    public Decimal128 o0() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BsonDecimal128{value=" + this.a + '}';
    }
}

