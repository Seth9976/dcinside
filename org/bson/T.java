package org.bson;

public final class t extends Z implements Comparable {
    private final boolean a;
    public static final t b;
    public static final t c;

    static {
        t.b = new t(true);
        t.c = new t(false);
    }

    public t(boolean z) {
        this.a = z;
    }

    @Override  // org.bson.Z
    public X G() {
        return X.j;
    }

    @Override
    public int compareTo(Object object0) {
        return this.j0(((t)object0));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return t.class == class0 && this.a == ((t)object0).a;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public int j0(t t0) {
        return Boolean.valueOf(this.a).compareTo(Boolean.valueOf(t0.a));
    }

    public boolean k0() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    public static t m0(boolean z) {
        return z ? t.b : t.c;
    }

    @Override
    public String toString() {
        return "BsonBoolean{value=" + this.a + '}';
    }
}

