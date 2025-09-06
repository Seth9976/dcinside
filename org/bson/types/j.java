package org.bson.types;

import java.io.Serializable;

public class j implements Serializable {
    private final String a;
    private static final long b = 0x1267DAEB68224358L;

    public j(String s) {
        this.a = s;
    }

    public String a() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((j)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a;
    }
}

