package io.realm;

import io.realm.internal.OsCollectionChangeSet;

public class l1 {
    private final OsCollectionChangeSet a;

    public l1(OsCollectionChangeSet osCollectionChangeSet0) {
        this.a = osCollectionChangeSet0;
    }

    public int a() {
        return this.a.a().length;
    }

    public int b() {
        return this.a.b().length;
    }

    public boolean c() {
        return this.a.getNativePtr() == 0L;
    }
}

