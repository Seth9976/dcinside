package io.realm;

import io.realm.internal.OsSet.b;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import java.util.Date;
import o3.h;

class r extends n1 {
    r(a a0, OsSet osSet0, Class class0) {
        super(a0, osSet0, class0);
    }

    @Override  // io.realm.n1
    boolean D(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.e(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.c);
    }

    @Override  // io.realm.n1
    boolean G(@h Object object0) {
        return this.b.X(((Date)object0));
    }

    @Override  // io.realm.n1
    boolean I(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.e(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.d);
    }

    boolean L(@h Date date0) {
        return this.b.i(date0);
    }

    @Override  // io.realm.n1
    boolean a(@h Object object0) {
        return this.L(((Date)object0));
    }

    @Override  // io.realm.n1
    boolean c(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.e(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.b);
    }

    @Override  // io.realm.n1
    boolean i(Collection collection0) {
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.e(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.a);
    }

    @Override  // io.realm.n1
    boolean j(@h Object object0) {
        return object0 == null ? this.b.y(null) : this.b.y(((Date)object0));
    }
}

