package io.realm;

import io.realm.internal.OsSet;

class m extends m1 {
    m(OsSet osSet0, a a0) {
        super(osSet0, a0);
    }

    @Override  // io.realm.m1
    protected Object a(int v) {
        return this.b(v);
    }

    protected Byte b(int v) {
        Object object0 = this.a.M(v);
        return object0 == null ? null : ((Long)object0).byteValue();
    }
}

