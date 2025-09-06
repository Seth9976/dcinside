package org.slf4j.helpers;

import org.slf4j.a;
import org.slf4j.d;

public abstract class e extends j implements a {
    private static final long c = 0x7D83B1554E5D279BL;

    @Override  // org.slf4j.a
    public void B(d d0, String s, Object object0) {
        this.W(s, object0);
    }

    @Override  // org.slf4j.a
    public void C(d d0, String s) {
        this.n(s);
    }

    @Override  // org.slf4j.a
    public void D(d d0, String s) {
        this.o(s);
    }

    @Override  // org.slf4j.a
    public void E(d d0, String s, Throwable throwable0) {
        this.e(s, throwable0);
    }

    @Override  // org.slf4j.a
    public void H(d d0, String s, Object object0, Object object1) {
        this.q(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void J(d d0, String s, Object[] arr_object) {
        this.s(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void K(d d0, String s, Object[] arr_object) {
        this.j0(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void L(d d0, String s, Object[] arr_object) {
        this.P(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void M(d d0, String s, Object[] arr_object) {
        this.N(s, arr_object);
    }

    @Override  // org.slf4j.a
    public void Q(d d0, String s, Object[] arr_object) {
        this.O(s, arr_object);
    }

    @Override  // org.slf4j.a
    public boolean R(d d0) {
        return this.k();
    }

    @Override  // org.slf4j.a
    public boolean S(d d0) {
        return this.l();
    }

    @Override  // org.slf4j.a
    public void T(d d0, String s) {
        this.j(s);
    }

    @Override  // org.slf4j.a
    public void U(d d0, String s, Throwable throwable0) {
        this.d(s, throwable0);
    }

    @Override  // org.slf4j.a
    public void V(d d0, String s, Throwable throwable0) {
        this.c(s, throwable0);
    }

    @Override  // org.slf4j.a
    public void X(d d0, String s, Object object0, Object object1) {
        this.r(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void Y(d d0, String s, Object object0) {
        this.z(s, object0);
    }

    @Override  // org.slf4j.a
    public void Z(d d0, String s, Object object0, Object object1) {
        this.F(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public void b0(d d0, String s, Object object0) {
        this.G(s, object0);
    }

    @Override  // org.slf4j.a
    public boolean c0(d d0) {
        return this.m();
    }

    @Override  // org.slf4j.a
    public void e0(d d0, String s, Object object0, Object object1) {
        this.p(s, object0, object1);
    }

    @Override  // org.slf4j.a
    public boolean f0(d d0) {
        return this.g();
    }

    @Override  // org.slf4j.a
    public void g0(d d0, String s, Throwable throwable0) {
        this.h(s, throwable0);
    }

    @Override  // org.slf4j.helpers.j, org.slf4j.a
    public String getName() {
        return super.getName();
    }

    @Override  // org.slf4j.a
    public void h0(d d0, String s, Throwable throwable0) {
        this.f(s, throwable0);
    }

    @Override  // org.slf4j.a
    public boolean i0(d d0) {
        return this.b();
    }

    @Override  // org.slf4j.a
    public void k0(d d0, String s, Object object0) {
        this.I(s, object0);
    }

    @Override  // org.slf4j.a
    public void m0(d d0, String s) {
        this.i(s);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "(" + this.getName() + ")";
    }

    @Override  // org.slf4j.a
    public void u(d d0, String s) {
        this.a(s);
    }

    @Override  // org.slf4j.a
    public void x(d d0, String s, Object object0) {
        this.A(s, object0);
    }

    @Override  // org.slf4j.a
    public void y(d d0, String s, Object object0, Object object1) {
        this.w(s, object0, object1);
    }
}

