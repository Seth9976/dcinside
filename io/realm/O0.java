package io.realm;

import io.realm.internal.core.NativeRealmAny;

final class o0 extends J0 {
    o0() {
        super(a.n);
    }

    o0(NativeRealmAny nativeRealmAny0) {
        super(a.n, nativeRealmAny0);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 != null) {
            Class class0 = object0.getClass();
            return o0.class.equals(class0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // io.realm.J0
    public Object i(Class class0) {
        return null;
    }

    @Override
    public String toString() {
        return "null";
    }
}

