package org.bson;

public class v extends Z implements Comparable {
    private final long a;

    public v(long v) {
        this.a = v;
    }

    @Override  // org.bson.Z
    public X G() {
        return X.k;
    }

    @Override
    public int compareTo(Object object0) {
        return this.j0(((v)object0));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a == ((v)object0).a;
    }

    @Override
    public int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    public int j0(v v0) {
        return this.a.compareTo(v0.a);
    }

    public long k0() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BsonDateTime{value=" + this.a + '}';
    }
}

