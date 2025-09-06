package org.bson;

import org.bson.types.ObjectId;

public class w extends Z {
    private final String a;
    private final ObjectId b;

    public w(String s, ObjectId objectId0) {
        if(s == null) {
            throw new IllegalArgumentException("namespace can not be null");
        }
        if(objectId0 == null) {
            throw new IllegalArgumentException("id can not be null");
        }
        this.a = s;
        this.b = objectId0;
    }

    @Override  // org.bson.Z
    public X G() {
        return X.n;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.b.equals(((w)object0).b) ? this.a.equals(((w)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    public ObjectId j0() {
        return this.b;
    }

    public String k0() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BsonDbPointer{namespace=\'" + this.a + '\'' + ", id=" + this.b + '}';
    }
}

