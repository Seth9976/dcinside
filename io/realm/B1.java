package io.realm;

import io.realm.internal.OsSet.b;
import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import io.realm.internal.s;
import java.util.ArrayList;
import java.util.Collection;

class b1 extends n1 {
    b1(a a0, OsSet osSet0, Class class0) {
        super(a0, osSet0, class0);
    }

    @Override  // io.realm.n1
    boolean D(Collection collection0) {
        this.M(collection0);
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.l(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.c);
    }

    @Override  // io.realm.n1
    boolean G(Object object0) {
        this.N(((X0)object0));
        long v = ((s)object0).R3().g().F();
        return this.b.d0(v);
    }

    @Override  // io.realm.n1
    boolean I(Collection collection0) {
        this.M(collection0);
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.l(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.d);
    }

    @Override  // io.realm.n1
    RealmQuery K() {
        return new RealmQuery(this.a, this.b, this.c);
    }

    boolean L(X0 x00) {
        long v = ((s)this.O(x00)).R3().g().F();
        return this.b.o(v);
    }

    private void M(Collection collection0) {
        for(Object object0: collection0) {
            this.N(((X0)object0));
        }
    }

    private void N(X0 x00) {
        if(x00 == null) {
            throw new NullPointerException("This set does not permit null values.");
        }
        if(!d1.I5(x00) || !d1.H5(x00)) {
            throw new IllegalArgumentException("\'value\' is not a valid managed object.");
        }
        if(((s)x00).R3().f() != this.a) {
            throw new IllegalArgumentException("\'value\' belongs to a different Realm.");
        }
    }

    private X0 O(X0 x00) {
        if(x00 == null) {
            throw new NullPointerException("This set does not permit null values.");
        }
        return p.a(this.a, x00, this.c.getName(), "set") ? p.c(this.a, x00) : x00;
    }

    @Override  // io.realm.n1
    boolean a(Object object0) {
        return this.L(((X0)object0));
    }

    @Override  // io.realm.n1
    boolean c(Collection collection0) {
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            arrayList0.add(this.O(((X0)object0)));
        }
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.l(arrayList0);
        return this.b.r(nativeRealmAnyCollection0, b.b);
    }

    @Override  // io.realm.n1
    boolean i(Collection collection0) {
        this.M(collection0);
        NativeRealmAnyCollection nativeRealmAnyCollection0 = NativeRealmAnyCollection.l(collection0);
        return this.b.r(nativeRealmAnyCollection0, b.a);
    }

    @Override  // io.realm.n1
    boolean j(Object object0) {
        this.N(((X0)object0));
        long v = ((s)object0).R3().g().F();
        return this.b.F(v);
    }
}

