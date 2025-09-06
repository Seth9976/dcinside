package io.realm;

import h3.f;
import io.reactivex.B;
import io.reactivex.l;
import io.realm.internal.i;
import io.realm.internal.j;
import io.realm.internal.s;
import io.realm.internal.u;
import io.realm.log.RealmLog;
import java.util.Collections;
import o3.h;

@f
public abstract class d1 implements X0, j {
    static final String a = "\'model\' is null.";
    static final String b = "the object is already deleted.";
    static final String c = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.";

    public static void A5(X0 x00) {
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
        }
        if(((s)x00).R3().g() == null) {
            throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        if(((s)x00).R3().f() == null) {
            throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        ((s)x00).R3().f().k();
        u u0 = ((s)x00).R3().g();
        u0.b().g0(u0.F());
        ((s)x00).R3().s(i.a);
    }

    public final X0 B5() {
        return d1.C5(this);
    }

    public static X0 C5(X0 x00) {
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("It is only possible to freeze valid managed Realm objects.");
        }
        a a0 = ((s)x00).R3().f();
        a a1 = a0.x0() ? a0 : a0.x();
        u u0 = ((s)x00).R3().g().X(a1.e);
        if(a1 instanceof E) {
            return new G(a1, u0);
        }
        if(!(a1 instanceof F0)) {
            throw new UnsupportedOperationException("Unknown Realm type: " + a1.getClass().getName());
        }
        Class class0 = x00.getClass().getSuperclass();
        return a1.T().s().x(class0, a1, u0, a0.e0().j(class0), false, Collections.emptyList());
    }

    public F0 D5() {
        return d1.E5(this);
    }

    public static F0 E5(X0 x00) {
        if(x00 == null) {
            throw new IllegalArgumentException("\'model\' is null.");
        }
        if(x00 instanceof G) {
            throw new IllegalStateException("the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.");
        }
        if(!(x00 instanceof s)) {
            return null;
        }
        a a0 = ((s)x00).R3().f();
        a0.k();
        if(!d1.I5(x00)) {
            throw new IllegalStateException("the object is already deleted.");
        }
        return (F0)a0;
    }

    // 去混淆评级： 低(20)
    public static boolean F5(X0 x00) {
        return x00 instanceof s ? ((s)x00).R3().f().x0() : false;
    }

    public static boolean G5(X0 x00) {
        if(x00 instanceof s) {
            ((s)x00).R3().f().k();
            return ((s)x00).R3().h();
        }
        return true;
    }

    public static boolean H5(X0 x00) {
        return x00 instanceof s;
    }

    public static boolean I5(@h X0 x00) {
        if(x00 instanceof s) {
            u u0 = ((s)x00).R3().g();
            return u0 != null && u0.s();
        }
        return x00 != null;
    }

    public static boolean J5(X0 x00) {
        if(d1.G5(x00)) {
            return true;
        }
        if(x00 instanceof s) {
            ((s)x00).R3().j();
            return true;
        }
        return false;
    }

    public final void K5() {
        d1.L5(this);
    }

    @Override  // io.realm.internal.j
    public boolean L() {
        return d1.H5(this);
    }

    public static void L5(X0 x00) {
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)");
        }
        a a0 = ((s)x00).R3().f();
        if(a0.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", new Object[]{a0.c.n()});
        }
        ((s)x00).R3().m();
    }

    @Override  // io.realm.internal.j
    public final boolean M3() {
        return d1.F5(this);
    }

    public final void M5(P0 p00) {
        d1.N5(this, p00);
    }

    public static void N5(X0 x00, P0 p00) {
        d1.O5(x00, new c(p00));
    }

    public static void O5(X0 x00, e1 e10) {
        if(x00 == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if(e10 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
        }
        a a0 = ((s)x00).R3().f();
        if(a0.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", new Object[]{a0.c.n()});
        }
        ((s)x00).R3().n(e10);
    }

    public final void P5(e1 e10) {
        d1.O5(this, e10);
    }

    public final boolean e0() {
        return d1.G5(this);
    }

    public final void r5(P0 p00) {
        d1.s5(this, p00);
    }

    @Override  // io.realm.internal.j
    public final boolean s() {
        return d1.I5(this);
    }

    public static void s5(X0 x00, P0 p00) {
        d1.t5(x00, new c(p00));
    }

    public static void t5(X0 x00, e1 e10) {
        if(x00 == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if(e10 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
        }
        a a0 = ((s)x00).R3().f();
        a0.k();
        a0.e.capabilities.c("Listeners cannot be used on current thread.");
        ((s)x00).R3().b(e10);
    }

    public final void u5(e1 e10) {
        d1.t5(this, e10);
    }

    public final B v5() {
        return d1.w5(this);
    }

    public final boolean w() {
        return d1.J5(this);
    }

    public static B w5(X0 x00) {
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
        }
        a a0 = ((s)x00).R3().f();
        if(a0 instanceof F0) {
            return a0.c.r().p(((F0)a0), x00);
        }
        if(!(a0 instanceof E)) {
            throw new UnsupportedOperationException(a0.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        return a0.c.r().k(((E)a0), ((G)x00));
    }

    public final l x5() {
        return d1.y5(this);
    }

    public static l y5(X0 x00) {
        if(!(x00 instanceof s)) {
            throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
        }
        a a0 = ((s)x00).R3().f();
        if(a0 instanceof F0) {
            return a0.c.r().h(((F0)a0), x00);
        }
        if(!(a0 instanceof E)) {
            throw new UnsupportedOperationException(a0.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        return a0.c.r().c(((E)a0), ((G)x00));
    }

    public final void z5() {
        d1.A5(this);
    }
}

