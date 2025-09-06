package io.realm;

import io.realm.internal.OsMap;

class q1 extends T {
    q1(a a0, OsMap osMap0, x1 x10) {
        super(Short.class, a0, osMap0, x10, k.c);
    }

    @Override  // io.realm.T
    Object s(Object object0) {
        return this.t(object0);
    }

    Short t(Object object0) {
        return ((Long)object0).shortValue();
    }
}

