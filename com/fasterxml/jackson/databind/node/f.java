package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.o;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.util.C;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class f extends b implements l {
    protected final m b;
    private static final long c = 1L;

    protected f() {
        this.b = null;
    }

    protected f(m m0) {
        this.b = m0;
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z A(Byte byte0) {
        return this.b.A(byte0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z B(String s) {
        return this.v2(s);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final a E(int v) {
        return this.b.E(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z F(Double double0) {
        return this.b.F(double0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z I(C c0) {
        return this.b.I(c0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z K(Float float0) {
        return this.b.K(float0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public abstract p M0(int arg1);

    @Override  // com.fasterxml.jackson.databind.node.l
    public z N() {
        return this.k2();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public abstract p N0(String arg1);

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z O(BigInteger bigInteger0) {
        return this.b.O(bigInteger0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final a R() {
        return this.b.R();
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z S(boolean z) {
        return this.f2(z);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z T(Integer integer0) {
        return this.b.T(integer0);
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    protected abstract u X1(o arg1, o arg2, com.fasterxml.jackson.databind.p.b arg3, boolean arg4);

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z a(Long long0) {
        return this.b.a(long0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z b(BigDecimal bigDecimal0) {
        return this.b.b(bigDecimal0);
    }

    public final d b2(byte[] arr_b) {
        return this.b.f(arr_b);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z c(byte[] arr_b, int v, int v1) {
        return this.c2(arr_b, v, v1);
    }

    public final d c2(byte[] arr_b, int v, int v1) {
        return this.b.g(arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z d(Object object0) {
        return this.b.d(object0);
    }

    public final e f2(boolean z) {
        return this.b.h(z);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G get(int v) {
        return this.M0(v);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G get(String s) {
        return this.N0(s);
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public abstract r h();

    public p h2() {
        return this.b.q();
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final z i(Short short0) {
        return this.b.i(short0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z j(float f) {
        return this.n2(f);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return "";
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z k(int v) {
        return this.q2(v);
    }

    public final s k2() {
        return this.b.r();
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z l(byte b) {
        return this.l2(b);
    }

    public final t l2(byte b) {
        return this.b.s(b);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z m(double f) {
        return this.m2(f);
    }

    public final t m2(double f) {
        return this.b.w(f);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z n(long v) {
        return this.r2(v);
    }

    public final t n2(float f) {
        return this.b.x(f);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z o(short v) {
        return this.s2(v);
    }

    public final t q2(int v) {
        return this.b.z(v);
    }

    public final t r2(long v) {
        return this.b.C(v);
    }

    public final t s2(short v) {
        return this.b.D(v);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public abstract int size();

    @Override  // com.fasterxml.jackson.databind.node.l
    public z u(byte[] arr_b) {
        return this.b2(arr_b);
    }

    public abstract f u2();

    public final x v2(String s) {
        return this.b.G(s);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public final u y() {
        return this.b.y();
    }
}

