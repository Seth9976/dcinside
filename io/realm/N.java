package io.realm;

import io.realm.internal.OsMap;

class n extends T {
    n(a a0, OsMap osMap0, x1 x10) {
        super(Byte.class, a0, osMap0, x10, k.b);
    }

    @Override  // io.realm.T
    Object s(Object object0) {
        return this.t(object0);
    }

    Byte t(Object object0) {
        return ((Long)object0).byteValue();
    }
}

