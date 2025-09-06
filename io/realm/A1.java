package io.realm;

import io.realm.internal.OsSet;
import java.util.ArrayList;

class a1 extends m1 {
    private final Class d;

    a1(OsSet osSet0, a a0, Class class0) {
        super(osSet0, a0);
        this.d = class0;
    }

    @Override  // io.realm.m1
    protected Object a(int v) {
        return this.b(v);
    }

    protected X0 b(int v) {
        long v1 = this.a.K(v);
        ArrayList arrayList0 = new ArrayList();
        return this.b.L(this.d, v1, false, arrayList0);
    }
}

