package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.a;
import org.slf4j.d;
import org.slf4j.event.b;

public class k implements a {
    private final String a;
    private volatile a b;
    private Boolean c;
    private Method d;
    private b e;
    private Queue f;
    private final boolean g;

    public k(String s, Queue queue0, boolean z) {
        this.a = s;
        this.f = queue0;
        this.g = z;
    }

    @Override  // org.slf4j.a
    public void A(String s, Object object0) {
        this.t().A(s, object0);
    }

    @Override  // org.slf4j.a
    public void B(d d0, String s, Object object0) {
        this.t().B(d0, s, object0);
    }

    @Override  // org.slf4j.a
    public void C(d d0, String s) {
        this.t().C(d0, s);
    }

    @Override  // org.slf4j.a
    public void D(d d0, String s) {
        this.t().D(d0, s);
    }

    @Override  // org.slf4j.a
    public void E(d d0, String s, Throwable throwable0) {
        this.t().E(d0, s, throwable0);
    }

    @Override  // org.slf4j.a
    public void F(String s, Object object0, Object object1) {
        this.t().F(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void G(String s, Object object0) {
        this.t().G(s, object0);
    }

    @Override  // org.slf4j.a
    public void H(d d0, String s, Object object0, Object object1) {
        this.t().H(d0, s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void I(String s, Object object0) {
        this.t().I(s, object0);
    }

    @Override  // org.slf4j.a
    public void J(d d0, String s, Object[] arr_object) {
        this.t().J(d0, s, arr_object);
    }

    @Override  // org.slf4j.a
    public void K(d d0, String s, Object[] arr_object) {
        this.t().K(d0, s, arr_object);
    }

    @Override  // org.slf4j.a
    public void L(d d0, String s, Object[] arr_object) {
        this.t().L(d0, s, arr_object);
    }

    @Override  // org.slf4j.a
    public void M(d d0, String s, Object[] arr_object) {
        this.t().M(d0, s, arr_object);
    }

    @Override  // org.slf4j.a
    public void N(String s, Object[] arr_object) {
        this.t().N(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void O(String s, Object[] arr_object) {
        this.t().O(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void P(String s, Object[] arr_object) {
        this.t().P(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void Q(d d0, String s, Object[] arr_object) {
        this.t().Q(d0, s, arr_object);
    }

    @Override  // org.slf4j.a
    public boolean R(d d0) {
        return this.t().R(d0);
    }

    @Override  // org.slf4j.a
    public boolean S(d d0) {
        return this.t().S(d0);
    }

    @Override  // org.slf4j.a
    public void T(d d0, String s) {
        this.t().T(d0, s);
    }

    @Override  // org.slf4j.a
    public void U(d d0, String s, Throwable throwable0) {
        this.t().U(d0, s, throwable0);
    }

    @Override  // org.slf4j.a
    public void V(d d0, String s, Throwable throwable0) {
        this.t().V(d0, s, throwable0);
    }

    @Override  // org.slf4j.a
    public void W(String s, Object object0) {
        this.t().W(s, object0);
    }

    @Override  // org.slf4j.a
    public void X(d d0, String s, Object object0, Object object1) {
        this.t().X(d0, s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void Y(d d0, String s, Object object0) {
        this.t().Y(d0, s, object0);
    }

    @Override  // org.slf4j.a
    public void Z(d d0, String s, Object object0, Object object1) {
        this.t().Z(d0, s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void a(String s) {
        this.t().a(s);
    }

    @Override  // org.slf4j.a
    public boolean b() {
        return this.t().b();
    }

    @Override  // org.slf4j.a
    public void b0(d d0, String s, Object object0) {
        this.t().b0(d0, s, object0);
    }

    @Override  // org.slf4j.a
    public void c(String s, Throwable throwable0) {
        this.t().c(s, throwable0);
    }

    @Override  // org.slf4j.a
    public boolean c0(d d0) {
        return this.t().c0(d0);
    }

    @Override  // org.slf4j.a
    public void d(String s, Throwable throwable0) {
        this.t().d(s, throwable0);
    }

    public boolean d0() {
        Boolean boolean0 = this.c;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", org.slf4j.event.d.class);
            this.c = Boolean.TRUE;
            return this.c.booleanValue();
        }
        catch(NoSuchMethodException unused_ex) {
            this.c = Boolean.FALSE;
            return false;
        }
    }

    @Override  // org.slf4j.a
    public void e(String s, Throwable throwable0) {
        this.t().e(s, throwable0);
    }

    @Override  // org.slf4j.a
    public void e0(d d0, String s, Object object0, Object object1) {
        this.t().e0(d0, s, object0, object1);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((k)object0).a);
    }

    @Override  // org.slf4j.a
    public void f(String s, Throwable throwable0) {
        this.t().f(s, throwable0);
    }

    @Override  // org.slf4j.a
    public boolean f0(d d0) {
        return this.t().f0(d0);
    }

    @Override  // org.slf4j.a
    public boolean g() {
        return this.t().g();
    }

    @Override  // org.slf4j.a
    public void g0(d d0, String s, Throwable throwable0) {
        this.t().g0(d0, s, throwable0);
    }

    @Override  // org.slf4j.a
    public String getName() {
        return this.a;
    }

    @Override  // org.slf4j.a
    public void h(String s, Throwable throwable0) {
        this.t().h(s, throwable0);
    }

    @Override  // org.slf4j.a
    public void h0(d d0, String s, Throwable throwable0) {
        this.t().h0(d0, s, throwable0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // org.slf4j.a
    public void i(String s) {
        this.t().i(s);
    }

    @Override  // org.slf4j.a
    public boolean i0(d d0) {
        return this.t().i0(d0);
    }

    @Override  // org.slf4j.a
    public void j(String s) {
        this.t().j(s);
    }

    @Override  // org.slf4j.a
    public void j0(String s, Object[] arr_object) {
        this.t().j0(s, arr_object);
    }

    @Override  // org.slf4j.a
    public boolean k() {
        return this.t().k();
    }

    @Override  // org.slf4j.a
    public void k0(d d0, String s, Object object0) {
        this.t().k0(d0, s, object0);
    }

    @Override  // org.slf4j.a
    public boolean l() {
        return this.t().l();
    }

    public boolean l0() {
        return this.b instanceof g;
    }

    @Override  // org.slf4j.a
    public boolean m() {
        return this.t().m();
    }

    @Override  // org.slf4j.a
    public void m0(d d0, String s) {
        this.t().m0(d0, s);
    }

    @Override  // org.slf4j.a
    public void n(String s) {
        this.t().n(s);
    }

    public boolean n0() {
        return this.b == null;
    }

    @Override  // org.slf4j.a
    public void o(String s) {
        this.t().o(s);
    }

    public void o0(org.slf4j.event.d d0) {
        if(this.d0()) {
            try {
                this.d.invoke(this.b, d0);
            }
            catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException unused_ex) {
            }
        }
    }

    @Override  // org.slf4j.a
    public void p(String s, Object object0, Object object1) {
        this.t().p(s, object0, object1);
    }

    public void p0(a a0) {
        this.b = a0;
    }

    @Override  // org.slf4j.a
    public void q(String s, Object object0, Object object1) {
        this.t().q(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void r(String s, Object object0, Object object1) {
        this.t().r(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void s(String s, Object[] arr_object) {
        this.t().s(s, arr_object);
    }

    a t() {
        if(this.b != null) {
            return this.b;
        }
        return this.g ? g.e : this.v();
    }

    @Override  // org.slf4j.a
    public void u(d d0, String s) {
        this.t().u(d0, s);
    }

    private a v() {
        if(this.e == null) {
            this.e = new b(this, this.f);
        }
        return this.e;
    }

    @Override  // org.slf4j.a
    public void w(String s, Object object0, Object object1) {
        this.t().w(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void x(d d0, String s, Object object0) {
        this.t().x(d0, s, object0);
    }

    @Override  // org.slf4j.a
    public void y(d d0, String s, Object object0, Object object1) {
        this.t().y(d0, s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void z(String s, Object object0) {
        this.t().z(s, object0);
    }
}

