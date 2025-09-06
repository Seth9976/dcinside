package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.async.c;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.y;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class l extends n {
    protected n h;

    public l(n n0) {
        this.h = n0;
    }

    @Override  // com.fasterxml.jackson.core.n
    public q A2() {
        return this.h.A2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean A4() {
        return this.h.A4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int B3(int v) throws IOException {
        return this.h.B3(v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public void B4(u u0) {
        this.h.B4(u0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public i C2() {
        return this.h.C2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public long C3() throws IOException {
        return this.h.C3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public void C4(Object object0) {
        this.h.C4(object0);
    }

    @Override  // com.fasterxml.jackson.core.n
    @Deprecated
    public n D4(int v) {
        this.h.D4(v);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public long E3(long v) throws IOException {
        return this.h.E3(v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public String F3() throws IOException {
        return this.h.F3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public void H4(e e0) {
        this.h.H4(e0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public e I2() {
        return this.h.I2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public n I4() throws IOException {
        this.h.I4();
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public y J4() {
        return this.h.J4();
    }

    public n K4() {
        return this.h;
    }

    @Override  // com.fasterxml.jackson.core.n
    public void L() {
        this.h.L();
    }

    @Override  // com.fasterxml.jackson.core.n
    public byte[] L0(a a0) throws IOException {
        return this.h.L0(a0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public short L2() throws IOException {
        return this.h.L2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object N1() {
        return this.h.N1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public String N3(String s) throws IOException {
        return this.h.N3(s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int P2(Writer writer0) throws IOException, UnsupportedOperationException {
        return this.h.P2(writer0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int Q1() throws IOException {
        return this.h.Q1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.l R() {
        return this.h.b1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public String R2() throws IOException {
        return this.h.R2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean S3() {
        return this.h.S3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public String T() throws IOException {
        return this.h.T();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean T0() throws IOException {
        return this.h.T0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean T3() {
        return this.h.T3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public r Y() {
        return this.h.Y();
    }

    @Override  // com.fasterxml.jackson.core.n
    public byte Y0() throws IOException {
        return this.h.Y0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public char[] Y2() throws IOException {
        return this.h.Y2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean Y3(r r0) {
        return this.h.Y3(r0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean Z3(int v) {
        return this.h.Z3(v);
    }

    @Override  // com.fasterxml.jackson.core.n
    public u a1() {
        return this.h.a1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean a4(com.fasterxml.jackson.core.n.a n$a0) {
        return this.h.a4(n$a0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.l b1() {
        return this.h.b1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int b3() throws IOException {
        return this.h.b3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public r c1() {
        return this.h.c1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean c4() {
        return this.h.c4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public void close() throws IOException {
        this.h.close();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int d0() {
        return this.h.d0();
    }

    @Override  // com.fasterxml.jackson.core.n
    @Deprecated
    public int d1() {
        return this.h.d1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public r d2() {
        return this.h.d2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean d4() {
        return this.h.d4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.l e0() {
        return this.h.i3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public long e2() throws IOException {
        return this.h.e2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int e3() throws IOException {
        return this.h.e3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean e4() {
        return this.h.e4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object f0() {
        return this.h.f0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean f4() throws IOException {
        return this.h.f4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public c g2() {
        return this.h.g2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public n h0(com.fasterxml.jackson.core.n.a n$a0) {
        this.h.h0(n$a0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object h1() {
        return this.h.h1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public BigDecimal i1() throws IOException {
        return this.h.i1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public b i2() throws IOException {
        return this.h.i2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.l i3() {
        return this.h.i3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean isClosed() {
        return this.h.isClosed();
    }

    @Override  // com.fasterxml.jackson.core.n
    public double j1() throws IOException {
        return this.h.j1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Number j2() throws IOException {
        return this.h.j2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public n l0(com.fasterxml.jackson.core.n.a n$a0) {
        this.h.l0(n$a0);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object l1() throws IOException {
        return this.h.l1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public r m4() throws IOException {
        return this.h.m4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object n3() throws IOException {
        return this.h.n3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public r n4() throws IOException {
        return this.h.n4();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object o2() throws IOException {
        return this.h.o2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public void o4(String s) {
        this.h.o4(s);
    }

    @Override  // com.fasterxml.jackson.core.n
    public Number p2() throws IOException {
        return this.h.p2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean p3() throws IOException {
        return this.h.p3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public n p4(int v, int v1) {
        this.h.p4(v, v1);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public n q4(int v, int v1) {
        this.h.q4(v, v1);
        return this;
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean r3(boolean z) throws IOException {
        return this.h.r3(z);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int r4(a a0, OutputStream outputStream0) throws IOException {
        return this.h.r4(a0, outputStream0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public void s(Object object0) {
        this.h.s(object0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public double s3() throws IOException {
        return this.h.s3();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean t() {
        return this.h.t();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int t1() {
        return this.h.t1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object t2() throws IOException {
        return this.h.t2();
    }

    @Override  // com.fasterxml.jackson.core.n
    public void u0() throws IOException {
        this.h.u0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public float u1() throws IOException {
        return this.h.u1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean v() {
        return this.h.v();
    }

    @Override  // com.fasterxml.jackson.core.n
    public double v3(double f) throws IOException {
        return this.h.v3(f);
    }

    @Override  // com.fasterxml.jackson.core.n
    public H version() {
        return this.h.version();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean w() {
        return this.h.w();
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean x(e e0) {
        return this.h.x(e0);
    }

    @Override  // com.fasterxml.jackson.core.n
    public BigInteger x0() throws IOException {
        return this.h.x0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public String y0() throws IOException {
        return this.h.y0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int y3() throws IOException {
        return this.h.y3();
    }
}

