package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.s;
import java.util.Collections;

class Z0 extends J0 {
    private final Class c;
    private final X0 d;

    Z0(X0 x00) {
        super(a.l);
        this.d = x00;
        this.c = x00.getClass();
    }

    Z0(io.realm.a a0, NativeRealmAny nativeRealmAny0, Class class0) {
        super(a.l, nativeRealmAny0);
        this.c = class0;
        this.d = Z0.j(a0, class0, nativeRealmAny0);
    }

    @Override  // io.realm.J0
    public void a(io.realm.a a0) {
        if(!d1.I5(this.d) || !d1.H5(this.d)) {
            throw new IllegalArgumentException("Realm object is not a valid managed object.");
        }
        if(((s)this.d).R3().f() != a0) {
            throw new IllegalArgumentException("Realm object belongs to a different Realm.");
        }
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        if(!(this.d instanceof s)) {
            throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
        }
        return new NativeRealmAny(((s)this.i(s.class)));
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 != null && this.getClass().equals(object0.getClass())) {
            X0 x00 = ((Z0)object0).d;
            return this.d == null ? x00 == null : this.d.equals(x00);
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // io.realm.J0
    Class h() {
        return s.class.isAssignableFrom(this.c) ? this.c.getSuperclass() : this.c;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @Override  // io.realm.J0
    Object i(Class class0) {
        return class0.cast(this.d);
    }

    private static X0 j(io.realm.a a0, Class class0, NativeRealmAny nativeRealmAny0) {
        return a0.L(class0, nativeRealmAny0.getRealmModelRowKey(), false, Collections.emptyList());
    }

    @Override
    public String toString() {
        return this.d.toString();
    }
}

