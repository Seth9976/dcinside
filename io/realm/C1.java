package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.s;
import io.realm.internal.u;
import java.util.Set;
import o3.h;

class c1 extends k0 {
    c1(a a0, OsMap osMap0, x1 x10) {
        super(X0.class, a0, osMap0, x10, k.o);
    }

    @Override  // io.realm.k0
    boolean c(@h Object object0) {
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!X0.class.isAssignableFrom(class0)) {
                throw new ClassCastException("Only RealmModel values can be used with \'containsValue\'.");
            }
        }
        return this.d(object0);
    }

    @Override  // io.realm.k0
    boolean d(@h Object object0) {
        if(object0 == null) {
            return this.c.c(null);
        }
        if(!(object0 instanceof s)) {
            throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
        }
        u u0 = ((s)object0).R3().g();
        long v = u0.b().getNativePtr();
        long v1 = u0.F();
        return this.c.e(v1, v);
    }

    @Override  // io.realm.k0
    Set e() {
        return new V0(this.b, this.c, k.o, this.d);
    }

    @Override  // io.realm.k0
    @h
    Object g(Object object0) {
        long v = this.c.l(object0);
        return v == -1L ? null : this.d.c(this.b, v);
    }

    @Override  // io.realm.k0
    @h
    Object l(Object object0, @h Object object1) {
        return this.d.h(this.b, this.c, object0, object1);
    }
}

