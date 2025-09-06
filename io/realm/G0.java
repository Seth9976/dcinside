package io.realm;

import io.realm.internal.ObservableMap.b;
import io.realm.internal.ObservableMap.c;
import io.realm.internal.ObservableMap;
import io.realm.internal.OsMap;
import io.realm.internal.f;
import io.realm.internal.j;
import io.realm.internal.n;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o3.h;

abstract class g0 implements ObservableMap, f, j, Map {
    protected final a a;
    protected final k0 b;
    protected final x1 c;
    protected final n d;

    g0(a a0, k0 k00, x1 x10) {
        this.d = new n();
        this.a = a0;
        this.b = k00;
        this.c = x10;
    }

    @Override  // io.realm.internal.j
    public boolean L() [...] // Inlined contents

    @Override  // io.realm.internal.j
    public boolean M3() {
        return this.b.i();
    }

    void a(U0 u00, h0 h00) {
        p.b(this.a, h00, true);
        if(this.d.d()) {
            this.b.p(this);
        }
        b observableMap$b0 = new b(u00, h00);
        this.d.a(observableMap$b0);
    }

    void b(U0 u00, P0 p00) {
        this.a(u00, new c(p00));
    }

    abstract i0 c(long arg1);

    @Override
    public void clear() {
        this.b.a();
    }

    @Override
    public boolean containsKey(@h Object object0) {
        return this.d(object0);
    }

    @Override
    public boolean containsValue(@h Object object0) {
        return this.b.c(object0);
    }

    abstract boolean d(@h Object arg1);

    public U0 e() {
        return this.f(this.b.f());
    }

    @Override
    public abstract Set entrySet();

    abstract U0 f(k3.a arg1);

    @Override  // io.realm.internal.f
    public Object freeze() {
        return this.e();
    }

    String g() {
        return this.c.e();
    }

    OsMap h() {
        return this.b.c;
    }

    Class i() {
        return this.c.d();
    }

    @Override
    public boolean isEmpty() {
        return this.b.h();
    }

    boolean j() {
        return !this.d.d();
    }

    @Override
    public Set keySet() {
        return this.b.k();
    }

    boolean l(@h Object object0, Class class0) {
        return object0 == null || object0.getClass() == class0;
    }

    void m() {
        p.b(this.a, null, false);
        this.d.b();
        this.b.q();
    }

    @Override  // io.realm.internal.ObservableMap
    public void notifyChangeListeners(long v) {
        j0 j00 = new j0(this.c(v));
        if(j00.isEmpty()) {
            return;
        }
        io.realm.internal.ObservableMap.a observableMap$a0 = new io.realm.internal.ObservableMap.a(j00);
        this.d.c(observableMap$a0);
    }

    void o(U0 u00, h0 h00) {
        this.d.e(u00, h00);
        if(this.d.d()) {
            this.b.q();
        }
    }

    @Override
    public abstract Object put(@h Object arg1, @h Object arg2);

    @Override
    public void putAll(Map map0) {
        this.r(map0);
        this.b.m(map0);
    }

    void q(U0 u00, P0 p00) {
        this.o(u00, new c(p00));
    }

    abstract void r(Map arg1);

    @Override
    public Object remove(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null keys are not allowed.");
        }
        Object object1 = this.b.g(object0);
        this.b.n(object0);
        return object1;
    }

    @Override  // io.realm.internal.j
    public boolean s() {
        return this.b.j();
    }

    @Override
    public int size() {
        return this.b.o();
    }

    @Override
    public Collection values() {
        return this.b.r();
    }
}

