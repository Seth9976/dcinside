package org.bson;

public class H extends Z {
    private final String a;

    public H(String s) {
        this.a = s;
    }

    @Override  // org.bson.Z
    public X G() {
        return X.o;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((H)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public String j0() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BsonJavaScript{code=\'" + this.a + '\'' + '}';
    }
}

