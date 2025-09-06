package io.realm;

import io.realm.internal.OsSet.b;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

class h extends n1 {
    h(a a0, OsSet osSet0, Class class0) {
        super(a0, osSet0, class0);
    }

    @Override  // io.realm.n1
    boolean D(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.d(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.c);
    }

    @Override  // io.realm.n1
    boolean G(@o3.h Object object0) {
        return this.b.P(((Boolean)object0));
    }

    @Override  // io.realm.n1
    boolean I(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.d(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.d);
    }

    boolean L(@o3.h Boolean boolean0) {
        return this.b.a(boolean0);
    }

    @Override  // io.realm.n1
    boolean a(@o3.h Object object0) {
        return this.L(((Boolean)object0));
    }

    @Override  // io.realm.n1
    boolean c(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.d(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.b);
    }

    @Override  // io.realm.n1
    boolean i(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.d(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.a);
    }

    @Override  // io.realm.n1
    boolean j(@o3.h Object object0) {
        return this.b.t(((Boolean)object0));
    }
}

