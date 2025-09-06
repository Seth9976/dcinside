package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.base.d;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class y extends d {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[r.values().length];
            a.a = arr_v;
            try {
                arr_v[r.k.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.m.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.l.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.n.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.o.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.q.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.r.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.s.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.p.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected u X8;
    protected q Y8;
    protected boolean Z8;

    public y(p p0) {
        this(p0, null);
    }

    public y(p p0, u u0) {
        super(0);
        this.X8 = u0;
        this.Y8 = new c(p0, null);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public com.fasterxml.jackson.core.q A2() {
        return this.Y8;
    }

    @Override  // com.fasterxml.jackson.core.n
    public void B4(u u0) {
        this.X8 = u0;
    }

    @Override  // com.fasterxml.jackson.core.n
    public i C2() {
        return n.g;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public n I4() throws IOException {
        r r0 = this.h;
        if(r0 == r.k) {
            this.Y8 = this.Y8.u();
            this.h = r.l;
            return this;
        }
        if(r0 == r.m) {
            this.Y8 = this.Y8.u();
            this.h = r.n;
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        p p0 = this.q5();
        if(p0 != null) {
            return p0 instanceof x ? ((x)p0).f2(a0) : p0.p0();
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    protected void P4() {
        this.f5();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int Q1() throws IOException {
        t t0 = (t)this.r5();
        if(!t0.s0()) {
            this.j5();
        }
        return t0.U0();
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String R2() {
        r r0 = this.h;
        if(r0 == null) {
            return null;
        }
        switch(r0) {
            case 5: {
                return this.Y8.b();
            }
            case 6: {
                return this.q5().E1();
            }
            case 7: 
            case 8: {
                return String.valueOf(this.q5().r1());
            }
            case 9: {
                p p0 = this.q5();
                return p0 == null || !p0.X0() ? this.h.c() : p0.j0();
            }
            default: {
                return this.h.c();
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public boolean T3() {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public char[] Y2() throws IOException {
        return this.R2().toCharArray();
    }

    @Override  // com.fasterxml.jackson.core.n
    public u a1() {
        return this.X8;
    }

    @Override  // com.fasterxml.jackson.core.n
    public l b1() {
        return l.i;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int b3() throws IOException {
        return this.R2().length();
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public void close() throws IOException {
        if(!this.Z8) {
            this.Z8 = true;
            this.Y8 = null;
            this.h = null;
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public long e2() throws IOException {
        t t0 = (t)this.r5();
        if(!t0.t0()) {
            this.m5();
        }
        return t0.q1();
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int e3() throws IOException {
        return 0;
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean f4() {
        if(!this.Z8) {
            p p0 = this.q5();
            return p0 instanceof t ? ((t)p0).c2() : false;
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.core.n
    public BigDecimal i1() throws IOException {
        return this.r5().u0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public b i2() throws IOException {
        p p0 = this.r5();
        return p0 == null ? null : p0.g();
    }

    @Override  // com.fasterxml.jackson.core.n
    public l i3() {
        return l.i;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public boolean isClosed() {
        return this.Z8;
    }

    @Override  // com.fasterxml.jackson.core.n
    public double j1() throws IOException {
        return this.r5().w0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Number j2() throws IOException {
        return this.r5().r1();
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object l1() {
        if(!this.Z8) {
            p p0 = this.q5();
            if(p0 != null) {
                if(p0.n1()) {
                    return ((v)p0).f2();
                }
                if(p0.X0()) {
                    return ((com.fasterxml.jackson.databind.node.d)p0).p0();
                }
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public r m4() throws IOException {
        r r0 = this.Y8.w();
        this.h = r0;
        if(r0 == null) {
            this.Z8 = true;
            return null;
        }
        switch(r0) {
            case 1: {
                this.Y8 = this.Y8.z();
                return this.h;
            }
            case 2: {
                this.Y8 = this.Y8.y();
                return this.h;
            }
            case 3: 
            case 4: {
                this.Y8 = this.Y8.u();
                return this.h;
            }
            default: {
                return this.h;
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public void o4(String s) {
        q q0 = this.h != r.k && this.h != r.m ? this.Y8 : this.Y8.u();
        if(q0 != null) {
            q0.x(s);
        }
    }

    protected p q5() {
        if(!this.Z8) {
            return this.Y8 == null ? null : this.Y8.t();
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.core.n
    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = this.L0(a0);
        if(arr_b != null) {
            outputStream0.write(arr_b, 0, arr_b.length);
            return arr_b.length;
        }
        return 0;
    }

    protected p r5() throws f {
        p p0 = this.q5();
        if(p0 == null || !p0.m1()) {
            throw this.i("Current token (" + (p0 == null ? null : p0.h()) + ") not numeric, cannot use numeric value accessors");
        }
        return p0;
    }

    @Override  // com.fasterxml.jackson.core.n
    public float u1() throws IOException {
        return (float)this.r5().w0();
    }

    @Override  // com.fasterxml.jackson.core.n
    public H version() {
        return com.fasterxml.jackson.databind.cfg.x.a;
    }

    @Override  // com.fasterxml.jackson.core.n
    public BigInteger x0() throws IOException {
        return this.r5().o0();
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String y0() {
        q q0 = this.h != r.k && this.h != r.m ? this.Y8 : this.Y8.u();
        return q0 == null ? null : q0.b();
    }
}

