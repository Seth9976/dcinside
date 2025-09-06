package io.realm;

import io.realm.internal.OsMapChangeSet;

class t1 implements i0 {
    private final OsMapChangeSet a;

    t1(long v) {
        this.a = new OsMapChangeSet(v);
    }

    @Override  // io.realm.i0
    public Object[] a() {
        return this.e();
    }

    @Override  // io.realm.i0
    public Object[] b() {
        return this.f();
    }

    @Override  // io.realm.i0
    public Object[] c() {
        return this.d();
    }

    public String[] d() {
        return this.a.c();
    }

    public String[] e() {
        return this.a.a();
    }

    public String[] f() {
        return this.a.b();
    }

    @Override  // io.realm.i0
    public boolean isEmpty() {
        return this.a.d();
    }
}

