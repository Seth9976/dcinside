package io.realm;

import io.realm.internal.OsSet.b;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import o3.h;

class d0 extends n1 {
    d0(a a0, OsSet osSet0, Class class0) {
        super(a0, osSet0, class0);
    }

    @Override  // io.realm.n1
    boolean D(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.i(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.c);
    }

    @Override  // io.realm.n1
    boolean G(@h Object object0) {
        return this.b.U(((Long)object0));
    }

    @Override  // io.realm.n1
    boolean I(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.i(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.d);
    }

    boolean L(@h Long long0) {
        return this.b.f(long0);
    }

    @Override  // io.realm.n1
    boolean a(@h Object object0) {
        return this.L(((Long)object0));
    }

    @Override  // io.realm.n1
    boolean c(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.i(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.b);
    }

    @Override  // io.realm.n1
    boolean i(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.i(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.a);
    }

    @Override  // io.realm.n1
    boolean j(@h Object object0) {
        return this.b.w(((Long)object0));
    }
}

