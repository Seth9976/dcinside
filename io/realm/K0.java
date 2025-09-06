package io.realm;

import io.realm.internal.ObservableMap;
import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import o3.h;

abstract class k0 {
    protected final Class a;
    protected final a b;
    protected final OsMap c;
    protected final x1 d;
    protected final k e;

    k0(Class class0, a a0, OsMap osMap0, x1 x10, k v0$k0) {
        this.a = class0;
        this.b = a0;
        this.c = osMap0;
        this.d = x10;
        this.e = v0$k0;
    }

    void a() {
        this.c.a();
    }

    boolean b(Object object0) {
        return this.c.b(object0);
    }

    boolean c(@h Object object0) {
        if(object0 != null && object0.getClass() != this.a) {
            throw new ClassCastException("Only \'" + this.a.getSimpleName() + "\'  values can be used with \'containsValue\'.");
        }
        return this.d(object0);
    }

    abstract boolean d(@h Object arg1);

    abstract Set e();

    k3.a f() {
        a a0 = this.b.x();
        return new k3.a(a0, this.c.g(a0.e));
    }

    @h
    abstract Object g(Object arg1);

    boolean h() {
        return this.c.t() == 0L;
    }

    boolean i() {
        return this.b.x0();
    }

    // 去混淆评级： 低(20)
    boolean j() {
        return this.b.isClosed() ? false : this.c.o();
    }

    Set k() {
        return this.d.g();
    }

    @h
    abstract Object l(Object arg1, @h Object arg2);

    void m(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.l(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    void n(Object object0) {
        this.c.s(object0);
    }

    int o() {
        return (int)this.c.t();
    }

    void p(ObservableMap observableMap0) {
        this.c.u(observableMap0);
    }

    void q() {
        this.c.v();
    }

    Collection r() {
        return this.d.f();
    }
}

