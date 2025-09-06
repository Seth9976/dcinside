package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class j1 extends x1 {
    protected final Class c;
    protected final Class d;

    j1(a a0, OsMap osMap0, Class class0, Class class1) {
        super(a0, osMap0);
        this.c = class0;
        this.d = class1;
    }

    @Override  // io.realm.x1
    public R0 a(a a0) {
        return new R0(a0, this.b, this.d);
    }

    @Override  // io.realm.x1
    Class d() {
        return this.d;
    }

    @Override  // io.realm.x1
    String e() {
        return this.d.getSimpleName();
    }

    @Override  // io.realm.x1
    public Collection f() {
        k3.a a0 = this.b.x();
        return this.i(this.a, a0, !p.e(this.d), this.d);
    }

    @Override  // io.realm.x1
    public Set g() {
        k3.a a0 = this.b.w();
        return new HashSet(this.i(this.a, a0, true, this.c));
    }

    private g1 i(a a0, k3.a a1, boolean z, Class class0) {
        return new g1(a0, OsResults.k(a0.e, ((long)(((Long)a1.b)))), class0, z);
    }
}

