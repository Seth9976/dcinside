package org.bson;

public final class Y extends Z {
    @Override  // org.bson.Z
    public X G() {
        return X.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Y.class == class0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

