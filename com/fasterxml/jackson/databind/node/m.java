package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.util.C;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class m implements l, Serializable {
    @Deprecated
    private final boolean a;
    private static final long b = 1L;
    protected static final int c = 0x270F;
    public static final m d;

    static {
        m.d = new m();
    }

    protected m() {
        this(false);
    }

    public m(boolean z) {
        this.a = z;
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z A(Byte byte0) {
        return byte0 == null ? this.r() : j.f2(byte0.intValue());
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z B(String s) {
        return this.G(s);
    }

    public t C(long v) {
        return o.f2(v);
    }

    public t D(short v) {
        return w.f2(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public a E(int v) {
        return new a(this, v);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z F(Double double0) {
        return double0 == null ? this.r() : h.f2(((double)double0));
    }

    public x G(String s) {
        return x.h2(s);
    }

    public boolean H() {
        return !this.a;
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z I(C c0) {
        return new v(c0);
    }

    @Deprecated
    public static m J(boolean z) {
        return new m(z);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z K(Float float0) {
        return float0 == null ? this.r() : i.f2(((float)float0));
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z N() {
        return this.r();
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z O(BigInteger bigInteger0) {
        return bigInteger0 == null ? this.r() : c.f2(bigInteger0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public a R() {
        return new a(this);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z S(boolean z) {
        return this.h(z);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z T(Integer integer0) {
        return integer0 == null ? this.r() : j.f2(((int)integer0));
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z a(Long long0) {
        return long0 == null ? this.r() : o.f2(((long)long0));
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z b(BigDecimal bigDecimal0) {
        return bigDecimal0 == null ? this.r() : g.f2(bigDecimal0);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z c(byte[] arr_b, int v, int v1) {
        return this.g(arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z d(Object object0) {
        return new v(object0);
    }

    protected boolean e(long v) {
        return ((long)(((int)v))) == v;
    }

    public d f(byte[] arr_b) {
        return d.c2(arr_b);
    }

    public d g(byte[] arr_b, int v, int v1) {
        return d.f2(arr_b, v, v1);
    }

    // 去混淆评级： 低(20)
    public e h(boolean z) {
        return z ? e.f2() : e.c2();
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z i(Short short0) {
        return short0 == null ? this.r() : w.f2(((short)short0));
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z j(float f) {
        return this.x(f);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z k(int v) {
        return this.z(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z l(byte b) {
        return this.s(b);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z m(double f) {
        return this.w(f);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z n(long v) {
        return this.C(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z o(short v) {
        return this.D(v);
    }

    public int p() [...] // Inlined contents

    public p q() {
        return com.fasterxml.jackson.databind.node.p.c2();
    }

    public s r() {
        return s.c2();
    }

    public t s(byte b) {
        return j.f2(b);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public z u(byte[] arr_b) {
        return this.f(arr_b);
    }

    public t w(double f) {
        return h.f2(f);
    }

    public t x(float f) {
        return i.f2(f);
    }

    @Override  // com.fasterxml.jackson.databind.node.l
    public u y() {
        return new u(this);
    }

    public t z(int v) {
        return j.f2(v);
    }
}

