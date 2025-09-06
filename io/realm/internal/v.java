package io.realm.internal;

import io.realm.v0.a;
import io.realm.v0.b;
import io.realm.v0;
import o3.h;

public class v implements v0 {
    private final v0 a;
    private final Throwable b;
    private final b c;

    public v(OsCollectionChangeSet osCollectionChangeSet0) {
        this.a = osCollectionChangeSet0;
        boolean z = osCollectionChangeSet0.h();
        Throwable throwable0 = osCollectionChangeSet0.getError();
        this.b = throwable0;
        if(throwable0 != null) {
            this.c = b.c;
            return;
        }
        this.c = z ? b.a : b.b;
    }

    @Override  // io.realm.v0
    public int[] a() {
        return this.a.a();
    }

    @Override  // io.realm.v0
    public int[] b() {
        return this.a.b();
    }

    @Override  // io.realm.v0
    public int[] c() {
        return this.a.c();
    }

    @Override  // io.realm.v0
    public a[] d() {
        return this.a.d();
    }

    @Override  // io.realm.v0
    public a[] e() {
        return this.a.e();
    }

    @Override  // io.realm.v0
    public a[] f() {
        return this.a.f();
    }

    @Override  // io.realm.v0
    @h
    public Throwable getError() {
        return this.b;
    }

    @Override  // io.realm.v0
    public b getState() {
        return this.c;
    }
}

