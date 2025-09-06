package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.B;
import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.k.b;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class k extends com.fasterxml.jackson.core.k {
    protected com.fasterxml.jackson.core.k e;
    protected boolean f;

    public k(com.fasterxml.jackson.core.k k0) {
        this(k0, true);
    }

    public k(com.fasterxml.jackson.core.k k0, boolean z) {
        this.e = k0;
        this.f = z;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void A4(int v) throws IOException {
        this.e.A4(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void B4(Object object0) throws IOException {
        this.e.B4(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public int C2(a a0, InputStream inputStream0, int v) throws IOException {
        return this.e.C2(a0, inputStream0, v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void C3(double f) throws IOException {
        this.e.C3(f);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void C4(Object object0, int v) throws IOException {
        this.e.C4(object0, v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void D4() throws IOException {
        this.e.D4();
    }

    @Override  // com.fasterxml.jackson.core.k
    public int E0() {
        return this.e.E0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void E3(float f) throws IOException {
        this.e.E3(f);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void E4(Object object0) throws IOException {
        this.e.E4(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void F3(int v) throws IOException {
        this.e.F3(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void F4(Object object0, int v) throws IOException {
        this.e.F4(object0, v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void G4(w w0) throws IOException {
        this.e.G4(w0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void H4(Reader reader0, int v) throws IOException {
        this.e.H4(reader0, v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void I4(char[] arr_c, int v, int v1) throws IOException {
        this.e.I4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    @Deprecated
    public com.fasterxml.jackson.core.k J1(int v) {
        this.e.J1(v);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void K4(G g0) throws IOException {
        if(this.f) {
            this.e.K4(g0);
            return;
        }
        if(g0 == null) {
            this.y3();
            return;
        }
        u u0 = this.h0();
        if(u0 == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        }
        u0.g(this, g0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public int L0() {
        return this.e.L0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void L2(a a0, byte[] arr_b, int v, int v1) throws IOException {
        this.e.L2(a0, arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void L4(Object object0) throws IOException {
        this.e.L4(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k N1(int v) {
        this.e.N1(v);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void N3(long v) throws IOException {
        this.e.N3(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void O4(byte[] arr_b, int v, int v1) throws IOException {
        this.e.O4(arr_b, v, v1);
    }

    public com.fasterxml.jackson.core.k P4() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Q(n n0) throws IOException {
        if(this.f) {
            this.e.Q(n0);
            return;
        }
        super.Q(n0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k Q1(v v0) {
        this.e.Q1(v0);
        return this;
    }

    @Deprecated
    public com.fasterxml.jackson.core.k Q4() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void S3(String s) throws IOException, UnsupportedOperationException {
        this.e.S3(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void T(n n0) throws IOException {
        if(this.f) {
            this.e.T(n0);
            return;
        }
        super.T(n0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public q T0() {
        return this.e.T0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void T3(BigDecimal bigDecimal0) throws IOException {
        this.e.T3(bigDecimal0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public Object Y() {
        return this.e.Y();
    }

    @Override  // com.fasterxml.jackson.core.k
    public Object Y0() {
        return this.e.Y0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Y3(BigInteger bigInteger0) throws IOException {
        this.e.Y3(bigInteger0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void Z3(short v) throws IOException {
        this.e.Z3(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public v a1() {
        return this.e.a1();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void a4(char[] arr_c, int v, int v1) throws IOException, UnsupportedOperationException {
        this.e.a4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public e b1() {
        return this.e.b1();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void b3(boolean z) throws IOException {
        this.e.b3(z);
    }

    @Override  // com.fasterxml.jackson.core.k
    public i c1() {
        return this.e.c1();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void close() throws IOException {
        this.e.close();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void d(String s) throws IOException {
        this.e.d(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k d0(b k$b0) {
        this.e.d0(k$b0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean d1(b k$b0) {
        return this.e.d1(k$b0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k d2(w w0) {
        this.e.d2(w0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k e0(b k$b0) {
        this.e.e0(k$b0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void e2(e e0) {
        this.e.e2(e0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public d f0() {
        return this.e.f0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void flush() throws IOException {
        this.e.flush();
    }

    @Override  // com.fasterxml.jackson.core.k
    public B g2() {
        return this.e.g2();
    }

    @Override  // com.fasterxml.jackson.core.k
    public u h0() {
        return this.e.h0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k i1(int v, int v1) {
        this.e.i1(v, v1);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k i2() {
        this.e.i2();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void i3(Object object0) throws IOException {
        this.e.i3(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean isClosed() {
        return this.e.isClosed();
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k j1(int v, int v1) {
        this.e.j1(v, v1);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void j2(double[] arr_f, int v, int v1) throws IOException {
        this.e.j2(arr_f, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void k4(Object object0) throws IOException {
        this.e.k4(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public Object l0() {
        return this.e.l0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k l1(d d0) {
        this.e.l1(d0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void l4(Object object0) throws IOException {
        this.e.l4(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void m4(String s) throws IOException {
        this.e.m4(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void n3() throws IOException {
        this.e.n3();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void n4(Object object0) throws IOException {
        this.writeObject(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void o2(int[] arr_v, int v, int v1) throws IOException {
        this.e.o2(arr_v, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p(Object object0) {
        this.e.p(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p2(long[] arr_v, int v, int v1) throws IOException {
        this.e.p2(arr_v, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p3() throws IOException {
        this.e.p3();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void p4(char c) throws IOException {
        this.e.p4(c);
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean q() {
        return this.e.q();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void q4(w w0) throws IOException {
        this.e.q4(w0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void r3(long v) throws IOException {
        this.e.r3(v);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void r4(String s) throws IOException {
        this.e.r4(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean s(e e0) {
        return this.e.s(e0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void s3(w w0) throws IOException {
        this.e.s3(w0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void s4(String s, int v, int v1) throws IOException {
        this.e.s4(s, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean t() {
        return this.e.t();
    }

    @Override  // com.fasterxml.jackson.core.k
    public com.fasterxml.jackson.core.k t1(u u0) {
        this.e.t1(u0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.k
    public void t2(String[] arr_s, int v, int v1) throws IOException {
        this.e.t2(arr_s, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void t4(char[] arr_c, int v, int v1) throws IOException {
        this.e.t4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public int u0() {
        return this.e.u0();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void u1(Object object0) {
        this.e.u1(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void u4(byte[] arr_b, int v, int v1) throws IOException {
        this.e.u4(arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean v() {
        return this.e.v();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void v3(String s) throws IOException {
        this.e.v3(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public H version() {
        return this.e.version();
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean w() {
        return this.e.w();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void w4(String s) throws IOException {
        this.e.w4(s);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void writeObject(Object object0) throws IOException {
        if(this.f) {
            this.e.writeObject(object0);
            return;
        }
        if(object0 == null) {
            this.y3();
            return;
        }
        u u0 = this.h0();
        if(u0 != null) {
            u0.q(this, object0);
            return;
        }
        this.o(object0);
    }

    @Override  // com.fasterxml.jackson.core.k
    public boolean x() {
        return this.e.x();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void x4(String s, int v, int v1) throws IOException {
        this.e.x4(s, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void y3() throws IOException {
        this.e.y3();
    }

    @Override  // com.fasterxml.jackson.core.k
    public void y4(char[] arr_c, int v, int v1) throws IOException {
        this.e.y4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.k
    public void z4() throws IOException {
        this.e.z4();
    }
}

