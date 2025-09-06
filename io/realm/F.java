package io.realm;

import io.realm.internal.OsSet;

class f extends m1 {
    f(OsSet osSet0, a a0) {
        super(osSet0, a0);
    }

    @Override  // io.realm.m1
    protected Object a(int v) {
        return this.b(v);
    }

    protected byte[] b(int v) {
        Object object0 = this.a.M(v);
        return object0 == null ? null : ((byte[])object0);
    }
}

