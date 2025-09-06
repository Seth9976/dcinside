package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.util.k;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class a extends k {
    protected d g;
    protected boolean h;
    protected com.fasterxml.jackson.core.filter.d.a i;
    protected e j;
    protected d k;
    protected int l;

    public a(com.fasterxml.jackson.core.k k0, d d0, com.fasterxml.jackson.core.filter.d.a d$a0, boolean z) {
        super(k0, false);
        this.g = d0;
        this.k = d0;
        this.j = e.A(d0);
        this.i = d$a0;
        this.h = z;
    }

    @Deprecated
    public a(com.fasterxml.jackson.core.k k0, d d0, boolean z, boolean z1) {
        this(k0, d0, (z ? com.fasterxml.jackson.core.filter.d.a.b : com.fasterxml.jackson.core.filter.d.a.a), z1);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void A4(int v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.y(d0, true);
            this.e.A4(v);
            return;
        }
        d d2 = this.j.v(d0);
        this.k = d2;
        if(d2 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        if(d2 != d1) {
            this.k = d2.d();
        }
        d d3 = this.k;
        if(d3 == d1) {
            this.S4();
            this.j = this.j.y(this.k, true);
            this.e.A4(v);
            return;
        }
        if(d3 != null && this.i == com.fasterxml.jackson.core.filter.d.a.c) {
            this.T4(false);
            this.j = this.j.y(this.k, true);
            this.e.A4(v);
            return;
        }
        this.j = this.j.y(d3, false);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void B4(Object object0) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.y(d0, true);
            this.e.B4(object0);
            return;
        }
        d d2 = this.j.v(d0);
        this.k = d2;
        if(d2 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        if(d2 != d1) {
            this.k = d2.d();
        }
        d d3 = this.k;
        if(d3 == d1) {
            this.S4();
            this.j = this.j.y(this.k, true);
            this.e.B4(object0);
            return;
        }
        if(d3 != null && this.i == com.fasterxml.jackson.core.filter.d.a.c) {
            this.T4(false);
            this.j = this.j.y(this.k, true);
            this.e.B4(object0);
            return;
        }
        this.j = this.j.y(d3, false);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.core.util.k
    public int C2(com.fasterxml.jackson.core.a a0, InputStream inputStream0, int v) throws IOException {
        return this.R4() ? this.e.C2(a0, inputStream0, v) : -1;
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void C3(double f) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.m(f)) {
                return;
            }
            this.S4();
        }
        this.e.C3(f);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void C4(Object object0, int v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.y(d0, true);
            this.e.C4(object0, v);
            return;
        }
        d d2 = this.j.v(d0);
        this.k = d2;
        if(d2 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        if(d2 != d1) {
            this.k = d2.d();
        }
        d d3 = this.k;
        if(d3 == d1) {
            this.S4();
            this.j = this.j.y(this.k, true);
            this.e.C4(object0, v);
            return;
        }
        if(d3 != null && this.i == com.fasterxml.jackson.core.filter.d.a.c) {
            this.T4(false);
            this.j = this.j.y(this.k, true);
            this.e.C4(object0, v);
            return;
        }
        this.j = this.j.y(d3, false);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void D4() throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.z(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.z(d0, true);
            this.e.D4();
            return;
        }
        d d2 = this.j.v(d0);
        if(d2 == null) {
            this.j = this.j.z(null, false);
            return;
        }
        if(d2 != d1) {
            d2 = d2.e();
        }
        if(d2 == d1) {
            this.S4();
            this.j = this.j.z(d2, true);
            this.e.D4();
            return;
        }
        if(d2 != null && this.i == com.fasterxml.jackson.core.filter.d.a.c) {
            this.T4(false);
            this.j = this.j.z(d2, true);
            this.e.D4();
            return;
        }
        this.j = this.j.z(d2, false);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void E3(float f) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.n(f)) {
                return;
            }
            this.S4();
        }
        this.e.E3(f);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void E4(Object object0) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.z(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.z(d0, true);
            this.e.E4(object0);
            return;
        }
        d d2 = this.j.v(d0);
        if(d2 == null) {
            this.j = this.j.z(null, false);
            return;
        }
        if(d2 != d1) {
            d2 = d2.e();
        }
        if(d2 == d1) {
            this.S4();
            this.j = this.j.z(d2, true);
            this.e.E4(object0);
            return;
        }
        if(d2 != null && this.i == com.fasterxml.jackson.core.filter.d.a.c) {
            this.T4(false);
            this.j = this.j.z(d2, true);
            this.e.E4(object0);
            return;
        }
        this.j = this.j.z(d2, false);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void F3(int v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.o(v)) {
                return;
            }
            this.S4();
        }
        this.e.F3(v);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void F4(Object object0, int v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.z(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.z(d0, true);
            this.e.F4(object0, v);
            return;
        }
        d d2 = this.j.v(d0);
        if(d2 == null) {
            this.j = this.j.z(null, false);
            return;
        }
        if(d2 != d1) {
            d2 = d2.e();
        }
        if(d2 == d1) {
            this.S4();
            this.j = this.j.z(d2, true);
            this.e.F4(object0, v);
            return;
        }
        this.j = this.j.z(d2, false);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void G4(w w0) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.w(w0.getValue())) {
                return;
            }
            this.S4();
        }
        this.e.G4(w0);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void H4(Reader reader0, int v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.v(reader0, v)) {
                return;
            }
            this.S4();
        }
        this.e.H4(reader0, v);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void I4(char[] arr_c, int v, int v1) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            String s = new String(arr_c, v, v1);
            d d2 = this.j.v(this.k);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.w(s)) {
                return;
            }
            this.S4();
        }
        this.e.I4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void L2(com.fasterxml.jackson.core.a a0, byte[] arr_b, int v, int v1) throws IOException {
        if(this.R4()) {
            this.e.L2(a0, arr_b, v, v1);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void L4(Object object0) throws IOException {
        if(this.k != null) {
            this.e.L4(object0);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void N3(long v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.p(v)) {
                return;
            }
            this.S4();
        }
        this.e.N3(v);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void O4(byte[] arr_b, int v, int v1) throws IOException {
        if(this.V4()) {
            this.e.O4(arr_b, v, v1);
        }
    }

    protected boolean R4() throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return false;
        }
        if(d0 == d.a) {
            return true;
        }
        if(d0.f()) {
            this.S4();
            return true;
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void S3(String s) throws IOException, UnsupportedOperationException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.t()) {
                return;
            }
            this.S4();
        }
        this.e.S3(s);
    }

    protected void S4() throws IOException {
        this.T4(true);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public q T0() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void T3(BigDecimal bigDecimal0) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.q(bigDecimal0)) {
                return;
            }
            this.S4();
        }
        this.e.T3(bigDecimal0);
    }

    protected void T4(boolean z) throws IOException {
        if(z) {
            ++this.l;
        }
        com.fasterxml.jackson.core.filter.d.a d$a0 = this.i;
        if(d$a0 == com.fasterxml.jackson.core.filter.d.a.b) {
            this.j.K(this.e);
        }
        else if(d$a0 == com.fasterxml.jackson.core.filter.d.a.c) {
            this.j.B(this.e);
        }
        if(z && !this.h) {
            this.j.J();
        }
    }

    protected void U4() throws IOException {
        ++this.l;
        com.fasterxml.jackson.core.filter.d.a d$a0 = this.i;
        if(d$a0 == com.fasterxml.jackson.core.filter.d.a.b) {
            this.j.K(this.e);
        }
        else if(d$a0 == com.fasterxml.jackson.core.filter.d.a.c) {
            this.j.B(this.e);
        }
        if(!this.h) {
            this.j.J();
        }
    }

    protected boolean V4() throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return false;
        }
        if(d0 == d.a) {
            return true;
        }
        if(d0.t()) {
            this.S4();
            return true;
        }
        return false;
    }

    public d W4() {
        return this.g;
    }

    public q X4() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void Y3(BigInteger bigInteger0) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.r(bigInteger0)) {
                return;
            }
            this.S4();
        }
        this.e.Y3(bigInteger0);
    }

    public int Y4() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void Z3(short v) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.o(((int)v))) {
                return;
            }
            this.S4();
        }
        this.e.Z3(v);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void a4(char[] arr_c, int v, int v1) throws IOException, UnsupportedOperationException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.t()) {
                return;
            }
            this.S4();
        }
        this.e.a4(arr_c, v, v1);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void b3(boolean z) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.g(z)) {
                return;
            }
            this.S4();
        }
        this.e.b3(z);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void d(String s) throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.w(s)) {
                return;
            }
            this.S4();
        }
        this.e.d(s);
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void k4(Object object0) throws IOException {
        if(this.k != null) {
            this.e.k4(object0);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void l4(Object object0) throws IOException {
        if(this.k != null) {
            this.e.l4(object0);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void m4(String s) throws IOException {
        if(this.k != null) {
            this.e.m4(s);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void n3() throws IOException {
        e e0 = this.j.w(this.e);
        this.j = e0;
        if(e0 != null) {
            this.k = e0.D();
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void p3() throws IOException {
        e e0 = this.j.x(this.e);
        this.j = e0;
        if(e0 != null) {
            this.k = e0.D();
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void p4(char c) throws IOException {
        if(this.V4()) {
            this.e.p4(c);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void q4(w w0) throws IOException {
        if(this.V4()) {
            this.e.q4(w0);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void r3(long v) throws IOException {
        this.v3(Long.toString(v));
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void r4(String s) throws IOException {
        if(this.V4()) {
            this.e.r4(s);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void s3(w w0) throws IOException {
        d d0 = this.j.I(w0.getValue());
        if(d0 == null) {
            this.k = null;
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.k = d0;
            this.e.s3(w0);
            return;
        }
        d d2 = d0.s(w0.getValue());
        this.k = d2;
        if(d2 == d1) {
            this.U4();
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void s4(String s, int v, int v1) throws IOException {
        if(this.V4()) {
            this.e.s4(s, v, v1);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void t4(char[] arr_c, int v, int v1) throws IOException {
        if(this.V4()) {
            this.e.t4(arr_c, v, v1);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void u4(byte[] arr_b, int v, int v1) throws IOException {
        if(this.V4()) {
            this.e.u4(arr_b, v, v1);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void v3(String s) throws IOException {
        d d0 = this.j.I(s);
        if(d0 == null) {
            this.k = null;
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.k = d0;
            this.e.v3(s);
            return;
        }
        d d2 = d0.s(s);
        this.k = d2;
        if(d2 == d1) {
            this.U4();
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void w4(String s) throws IOException {
        if(this.V4()) {
            this.e.w4(s);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void x4(String s, int v, int v1) throws IOException {
        if(this.V4()) {
            this.e.x4(s, v, v1);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void y3() throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            return;
        }
        d d1 = d.a;
        if(d0 != d1) {
            d d2 = this.j.v(d0);
            if(d2 == null) {
                return;
            }
            if(d2 != d1 && !d2.l()) {
                return;
            }
            this.S4();
        }
        this.e.y3();
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void y4(char[] arr_c, int v, int v1) throws IOException {
        if(this.V4()) {
            this.e.y4(arr_c, v, v1);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.k
    public void z4() throws IOException {
        d d0 = this.k;
        if(d0 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        d d1 = d.a;
        if(d0 == d1) {
            this.j = this.j.y(d0, true);
            this.e.z4();
            return;
        }
        d d2 = this.j.v(d0);
        this.k = d2;
        if(d2 == null) {
            this.j = this.j.y(null, false);
            return;
        }
        if(d2 != d1) {
            this.k = d2.d();
        }
        d d3 = this.k;
        if(d3 == d1) {
            this.S4();
            this.j = this.j.y(this.k, true);
            this.e.z4();
            return;
        }
        if(d3 != null && this.i == com.fasterxml.jackson.core.filter.d.a.c) {
            this.T4(false);
            this.j = this.j.y(this.k, true);
            this.e.z4();
            return;
        }
        this.j = this.j.y(d3, false);
    }
}

