package org.slf4j.event;

import java.util.Queue;
import org.slf4j.a;
import org.slf4j.d;
import org.slf4j.helpers.k;

public class b implements a {
    String a;
    k b;
    Queue c;

    public b(k k0, Queue queue0) {
        this.b = k0;
        this.a = k0.getName();
        this.c = queue0;
    }

    @Override  // org.slf4j.a
    public void A(String s, Object object0) {
        this.t(c.d, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void B(d d0, String s, Object object0) {
        this.v(c.g, d0, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void C(d d0, String s) {
        this.v(c.f, d0, s, null, null);
    }

    @Override  // org.slf4j.a
    public void D(d d0, String s) {
        this.t(c.d, s, null, null);
    }

    @Override  // org.slf4j.a
    public void E(d d0, String s, Throwable throwable0) {
        this.v(c.g, d0, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void F(String s, Object object0, Object object1) {
        this.t(c.c, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void G(String s, Object object0) {
        this.t(c.f, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void H(d d0, String s, Object object0, Object object1) {
        this.v(c.g, d0, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void I(String s, Object object0) {
        this.t(c.c, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void J(d d0, String s, Object[] arr_object) {
        this.v(c.c, d0, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void K(d d0, String s, Object[] arr_object) {
        this.v(c.e, d0, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void L(d d0, String s, Object[] arr_object) {
        this.v(c.g, d0, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void M(d d0, String s, Object[] arr_object) {
        this.v(c.d, d0, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void N(String s, Object[] arr_object) {
        this.t(c.d, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void O(String s, Object[] arr_object) {
        this.t(c.f, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void P(String s, Object[] arr_object) {
        this.t(c.g, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public void Q(d d0, String s, Object[] arr_object) {
        this.v(c.f, d0, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public boolean R(d d0) {
        return true;
    }

    @Override  // org.slf4j.a
    public boolean S(d d0) {
        return true;
    }

    @Override  // org.slf4j.a
    public void T(d d0, String s) {
        this.v(c.g, d0, s, null, null);
    }

    @Override  // org.slf4j.a
    public void U(d d0, String s, Throwable throwable0) {
        this.v(c.d, d0, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void V(d d0, String s, Throwable throwable0) {
        this.v(c.e, d0, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void W(String s, Object object0) {
        this.t(c.g, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void X(d d0, String s, Object object0, Object object1) {
        this.v(c.d, d0, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void Y(d d0, String s, Object object0) {
        this.v(c.e, d0, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void Z(d d0, String s, Object object0, Object object1) {
        this.v(c.c, d0, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void a(String s) {
        this.t(c.c, s, null, null);
    }

    @Override  // org.slf4j.a
    public boolean b() {
        return true;
    }

    @Override  // org.slf4j.a
    public void b0(d d0, String s, Object object0) {
        this.v(c.f, d0, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void c(String s, Throwable throwable0) {
        this.t(c.e, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public boolean c0(d d0) {
        return true;
    }

    @Override  // org.slf4j.a
    public void d(String s, Throwable throwable0) {
        this.t(c.d, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void e(String s, Throwable throwable0) {
        this.t(c.g, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void e0(d d0, String s, Object object0, Object object1) {
        this.v(c.f, d0, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void f(String s, Throwable throwable0) {
        this.t(c.c, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public boolean f0(d d0) {
        return true;
    }

    @Override  // org.slf4j.a
    public boolean g() {
        return true;
    }

    @Override  // org.slf4j.a
    public void g0(d d0, String s, Throwable throwable0) {
        this.v(c.f, d0, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public String getName() {
        return this.a;
    }

    @Override  // org.slf4j.a
    public void h(String s, Throwable throwable0) {
        this.t(c.f, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void h0(d d0, String s, Throwable throwable0) {
        this.v(c.c, d0, s, null, throwable0);
    }

    @Override  // org.slf4j.a
    public void i(String s) {
        this.t(c.e, s, null, null);
    }

    @Override  // org.slf4j.a
    public boolean i0(d d0) {
        return true;
    }

    @Override  // org.slf4j.a
    public void j(String s) {
        this.t(c.g, s, null, null);
    }

    @Override  // org.slf4j.a
    public void j0(String s, Object[] arr_object) {
        this.t(c.e, s, arr_object, null);
    }

    @Override  // org.slf4j.a
    public boolean k() {
        return true;
    }

    @Override  // org.slf4j.a
    public void k0(d d0, String s, Object object0) {
        this.v(c.c, d0, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public boolean l() {
        return true;
    }

    @Override  // org.slf4j.a
    public boolean m() {
        return true;
    }

    @Override  // org.slf4j.a
    public void m0(d d0, String s) {
        this.v(c.e, d0, s, null, null);
    }

    @Override  // org.slf4j.a
    public void n(String s) {
        this.t(c.g, s, null, null);
    }

    @Override  // org.slf4j.a
    public void o(String s) {
        this.t(c.d, s, null, null);
    }

    @Override  // org.slf4j.a
    public void p(String s, Object object0, Object object1) {
        this.t(c.f, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void q(String s, Object object0, Object object1) {
        this.t(c.g, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void r(String s, Object object0, Object object1) {
        this.t(c.d, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void s(String s, Object[] arr_object) {
        this.t(c.c, s, arr_object, null);
    }

    private void t(c c0, String s, Object[] arr_object, Throwable throwable0) {
        this.v(c0, null, s, arr_object, throwable0);
    }

    @Override  // org.slf4j.a
    public void u(d d0, String s) {
        this.v(c.c, d0, s, null, null);
    }

    private void v(c c0, d d0, String s, Object[] arr_object, Throwable throwable0) {
        e e0 = new e();
        e0.q(System.currentTimeMillis());
        e0.j(c0);
        e0.k(this.b);
        e0.l(this.a);
        e0.m(d0);
        e0.n(s);
        e0.i(arr_object);
        e0.p(throwable0);
        e0.o("jeb-dexdec-sb-st-12466");
        this.c.add(e0);
    }

    @Override  // org.slf4j.a
    public void w(String s, Object object0, Object object1) {
        this.t(c.e, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void x(d d0, String s, Object object0) {
        this.t(c.d, s, new Object[]{object0}, null);
    }

    @Override  // org.slf4j.a
    public void y(d d0, String s, Object object0, Object object1) {
        this.v(c.e, d0, s, new Object[]{object0, object1}, null);
    }

    @Override  // org.slf4j.a
    public void z(String s, Object object0) {
        this.t(c.e, s, new Object[]{object0}, null);
    }
}

