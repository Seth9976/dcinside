package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.util.l;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class b extends l {
    protected d i;
    protected boolean j;
    protected a k;
    protected r l;
    protected r m;
    protected e n;
    protected e o;
    protected d p;
    protected int q;

    public b(n n0, d d0, a d$a0, boolean z) {
        super(n0);
        this.i = d0;
        this.p = d0;
        this.n = e.A(d0);
        this.k = d$a0;
        this.j = z;
    }

    @Deprecated
    public b(n n0, d d0, boolean z, boolean z1) {
        this(n0, d0, (z ? a.b : a.a), z1);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public q A2() {
        return this.L4();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public int B3(int v) throws IOException {
        return this.h.B3(v);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public long C3() throws IOException {
        return this.h.C3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public long E3(long v) throws IOException {
        return this.h.E3(v);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public String F3() throws IOException {
        return this.l == r.o ? this.T() : this.h.F3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public n I4() throws IOException {
        if(this.l != r.k && this.l != r.m) {
            return this;
        }
        int v = 1;
        while(true) {
            while(true) {
            label_3:
                r r0 = this.m4();
                if(r0 == null) {
                    return this;
                }
                if(r0.i()) {
                    ++v;
                }
                else if(r0.h()) {
                    break;
                }
            }
            --v;
            if(v != 0) {
                goto label_3;
            }
            break;
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public void L() {
        r r0 = this.l;
        if(r0 != null) {
            this.m = r0;
            this.l = null;
        }
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        return this.h.L0(a0);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public short L2() throws IOException {
        return this.h.L2();
    }

    protected q L4() {
        q q0 = this.o;
        return q0 != null ? q0 : this.n;
    }

    private r M4(e e0) throws IOException {
        this.o = e0;
        r r0 = e0.G();
        if(r0 != null) {
            return r0;
        }
        while(e0 != this.n) {
            e0 = this.o.C(e0);
            this.o = e0;
            if(e0 == null) {
                throw this.i("Unexpected problem: chain of filtered context broken");
            }
            r r1 = e0.G();
            if(r1 == null) {
                continue;
            }
            return r1;
        }
        throw this.i("Internal error: failed to locate expected buffered tokens");
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public String N3(String s) throws IOException {
        return this.l == r.o ? this.T() : this.h.N3(s);
    }

    protected final r N4() throws IOException {
        r r3;
        e e3;
        r r2;
        e e1;
        r r1;
        d d0;
        r r0;
        while(true) {
            while(true) {
            alab1:
                while(true) {
                    while(true) {
                        while(true) {
                            while(true) {
                                while(true) {
                                    while(true) {
                                        while(true) {
                                            do {
                                            alab2:
                                                while(true) {
                                                label_0:
                                                    r0 = this.h.m4();
                                                    if(r0 == null) {
                                                        this.l = null;
                                                        return null;
                                                    }
                                                    switch(r0.d()) {
                                                        case 1: {
                                                            break alab1;
                                                        }
                                                        case 2: {
                                                            goto label_86;
                                                        }
                                                        case 3: {
                                                            goto label_55;
                                                        }
                                                        case 4: {
                                                            goto label_45;
                                                        }
                                                        case 5: {
                                                            goto label_15;
                                                        }
                                                        default: {
                                                            d0 = this.p;
                                                            d d1 = d.a;
                                                            if(d0 == d1) {
                                                                this.l = r0;
                                                                return r0;
                                                            }
                                                            if(d0 == null) {
                                                                break;
                                                            }
                                                            break alab2;
                                                        }
                                                    }
                                                }
                                                d d2 = this.n.v(d0);
                                            }
                                            while(d2 != d1 && (d2 == null || !d2.x(this.h)) || !this.P4());
                                            this.l = r0;
                                            return r0;
                                        label_15:
                                            String s = this.h.y0();
                                            d d3 = this.n.I(s);
                                            d d4 = d.a;
                                            if(d3 == d4) {
                                                this.p = d3;
                                                this.l = r0;
                                                return r0;
                                            }
                                            if(d3 == null) {
                                                this.h.m4();
                                                this.h.I4();
                                                goto label_0;
                                            }
                                            d d5 = d3.s(s);
                                            if(d5 == null) {
                                                this.h.m4();
                                                this.h.I4();
                                                goto label_0;
                                            }
                                            this.p = d5;
                                            if(d5 != d4) {
                                                goto label_40;
                                            }
                                            if(!this.P4()) {
                                                this.h.m4();
                                                this.h.I4();
                                                goto label_0;
                                            }
                                            if(this.k != a.b) {
                                                goto label_0;
                                            }
                                            break;
                                        }
                                        this.l = r0;
                                        return r0;
                                    label_40:
                                        if(this.k == a.a) {
                                            goto label_0;
                                        }
                                        break;
                                    }
                                    r1 = this.O4(this.n);
                                    if(r1 == null) {
                                        goto label_0;
                                    }
                                    break;
                                }
                                this.l = r1;
                                return r1;
                            label_45:
                                boolean z = this.n.F();
                                d d6 = this.n.D();
                                if(d6 != null && d6 != d.a && d6.j(this.n.i())) {
                                    return this.M4(this.n);
                                }
                                e e0 = this.n.E();
                                this.n = e0;
                                this.p = e0.D();
                                if(!z) {
                                    goto label_0;
                                }
                                break;
                            }
                            this.l = r0;
                            return r0;
                        label_55:
                            d d7 = this.p;
                            d d8 = d.a;
                            if(d7 == d8) {
                                this.n = this.n.y(d7, true);
                                this.l = r0;
                                return r0;
                            }
                            if(d7 == null) {
                                this.h.I4();
                                goto label_0;
                            }
                            d d9 = this.n.v(d7);
                            if(d9 == null) {
                                this.h.I4();
                                goto label_0;
                            }
                            if(d9 != d8) {
                                d9 = d9.d();
                            }
                            this.p = d9;
                            if(d9 == d8) {
                                this.n = this.n.y(d9, true);
                                this.l = r0;
                                return r0;
                            }
                            if(d9 != null && this.k == a.c) {
                                this.n = this.n.y(d9, true);
                                this.l = r0;
                                return r0;
                            }
                            e1 = this.n.y(d9, false);
                            this.n = e1;
                            if(this.k != a.b) {
                                goto label_0;
                            }
                            break;
                        }
                        r2 = this.O4(e1);
                        if(r2 == null) {
                            goto label_0;
                        }
                        break;
                    }
                    this.l = r2;
                    return r2;
                label_86:
                    boolean z1 = this.n.F();
                    d d10 = this.n.D();
                    if(d10 != null && d10 != d.a && d10.j(this.n.j())) {
                        return this.M4(this.n);
                    }
                    e e2 = this.n.E();
                    this.n = e2;
                    this.p = e2.D();
                    if(z1) {
                        this.l = r0;
                        return r0;
                    }
                }
                d d11 = this.p;
                d d12 = d.a;
                if(d11 == d12) {
                    this.n = this.n.z(d11, true);
                    this.l = r0;
                    return r0;
                }
                if(d11 == null) {
                    this.h.I4();
                    goto label_0;
                }
                d d13 = this.n.v(d11);
                if(d13 == null) {
                    this.h.I4();
                    goto label_0;
                }
                if(d13 != d12) {
                    d13 = d13.e();
                }
                this.p = d13;
                if(d13 == d12) {
                    this.n = this.n.z(d13, true);
                    this.l = r0;
                    return r0;
                }
                if(d13 != null && this.k == a.c) {
                    this.n = this.n.z(d13, true);
                    this.l = r0;
                    return r0;
                }
                e3 = this.n.z(d13, false);
                this.n = e3;
                if(this.k != a.b) {
                    goto label_0;
                }
                break;
            }
            r3 = this.O4(e3);
            if(r3 == null) {
                goto label_0;
            }
            break;
        }
        this.l = r3;
        return r3;
    }

    // This method was un-flattened
    protected final r O4(e e0) throws IOException {
        e e4;
        e e3;
        while(true) {
            r r0 = this.h.m4();
            if(r0 == null) {
                return null;
            }
            String s = null;
            int v = r0.d();
            if(v != 1) {
                switch(v) {
                    case 2: {
                        d d3 = this.n.D();
                        if(d3 != null && d3 != d.a && d3.k(this.n.j())) {
                            e e1 = this.n;
                            e e2 = e1.g;
                            if(e2 != null) {
                                s = e2.i;
                            }
                            e1.i = s;
                            e1.l = false;
                            return this.M4(e0);
                        }
                        boolean z = this.n == e0;
                        if(z && this.n.F()) {
                            e3 = this.n.E();
                            this.n = e3;
                            this.p = e3.D();
                            return r0;
                        }
                        e3 = this.n.E();
                        this.n = e3;
                        this.p = e3.D();
                        if(!z) {
                            continue;
                        }
                        return null;
                    }
                    case 3: {
                        d d4 = this.n.v(this.p);
                        if(d4 == null) {
                            this.h.I4();
                        }
                        else {
                            d d5 = d.a;
                            if(d4 != d5) {
                                d4 = d4.d();
                            }
                            this.p = d4;
                            if(d4 == d5) {
                                this.n = this.n.y(d4, true);
                                return this.M4(e0);
                            }
                            if(d4 != null && this.k == a.c) {
                                this.n = this.n.y(d4, true);
                                return this.M4(e0);
                            }
                            this.n = this.n.y(d4, false);
                        }
                        continue;
                    }
                    case 4: {
                        d d6 = this.n.D();
                        if(d6 != null && d6 != d.a && d6.j(this.n.i())) {
                            return this.M4(e0);
                        }
                        boolean z1 = this.n == e0;
                        if(z1 && this.n.F()) {
                            e4 = this.n.E();
                            this.n = e4;
                            this.p = e4.D();
                            return r0;
                        }
                        e4 = this.n.E();
                        this.n = e4;
                        this.p = e4.D();
                        if(!z1) {
                            continue;
                        }
                        return null;
                    }
                    case 5: {
                        String s1 = this.h.y0();
                        d d7 = this.n.I(s1);
                        d d8 = d.a;
                        if(d7 == d8) {
                            this.p = d7;
                            return this.M4(e0);
                        }
                        if(d7 == null) {
                            this.h.m4();
                            this.h.I4();
                        }
                        else {
                            d d9 = d7.s(s1);
                            if(d9 == null) {
                                this.h.m4();
                                this.h.I4();
                            }
                            else {
                                this.p = d9;
                                if(d9 != d8) {
                                    continue;
                                }
                                if(this.P4()) {
                                    return this.M4(e0);
                                }
                                this.p = this.n.I(s1);
                            }
                        }
                        continue;
                    }
                    default: {
                        d d0 = this.p;
                        d d1 = d.a;
                        if(d0 == d1) {
                            return this.M4(e0);
                        }
                        if(d0 == null) {
                            continue;
                        }
                        d d2 = this.n.v(d0);
                        if(d2 != d1 && (d2 == null || !d2.x(this.h)) || !this.P4()) {
                            continue;
                        }
                        return this.M4(e0);
                    }
                }
            }
            d d10 = this.p;
            d d11 = d.a;
            if(d10 == d11) {
                this.n = this.n.z(d10, true);
                return r0;
            }
            if(d10 == null) {
                this.h.I4();
            }
            else {
                d d12 = this.n.v(d10);
                if(d12 == null) {
                    this.h.I4();
                }
                else {
                    if(d12 != d11) {
                        d12 = d12.e();
                    }
                    this.p = d12;
                    if(d12 == d11) {
                        this.n = this.n.z(d12, true);
                        return this.M4(e0);
                    }
                    if(d12 != null && this.k == a.c) {
                        this.n = this.n.y(d12, true);
                        return this.M4(e0);
                    }
                    this.n = this.n.z(d12, false);
                }
            }
        }
    }

    private final boolean P4() throws IOException {
        int v = this.q;
        if(v != 0 && !this.j) {
            return false;
        }
        this.q = v + 1;
        return true;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public int Q1() throws IOException {
        return this.h.Q1();
    }

    public d Q4() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public String R2() throws IOException {
        return this.l == r.o ? this.T() : this.h.R2();
    }

    public int R4() {
        return this.q;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean S3() {
        return this.l != null;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public String T() throws IOException {
        q q0 = this.L4();
        if(this.l != r.k && this.l != r.m) {
            return q0.b();
        }
        q q1 = q0.f();
        return q1 == null ? null : q1.b();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean T0() throws IOException {
        return this.h.T0();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean T3() {
        return this.l == r.o ? false : this.h.T3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public r Y() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public byte Y0() throws IOException {
        return this.h.Y0();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public char[] Y2() throws IOException {
        return this.l == r.o ? this.T().toCharArray() : this.h.Y2();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public final boolean Y3(r r0) {
        return this.l == r0;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean Z3(int v) {
        return this.l == null ? v == 0 : this.l.d() == v;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public com.fasterxml.jackson.core.l b1() {
        return this.h.b1();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public int b3() throws IOException {
        return this.l == r.o ? this.T().length() : this.h.b3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public r c1() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public final int d0() {
        return this.l == null ? 0 : this.l.d();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    @Deprecated
    public final int d1() {
        return this.d0();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public r d2() {
        return this.m;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean d4() {
        return this.l == r.m;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public long e2() throws IOException {
        return this.h.e2();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public int e3() throws IOException {
        return this.l == r.o ? 0 : this.h.e3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean e4() {
        return this.l == r.k;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public BigDecimal i1() throws IOException {
        return this.h.i1();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public com.fasterxml.jackson.core.n.b i2() throws IOException {
        return this.h.i2();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public com.fasterxml.jackson.core.l i3() {
        return this.h.i3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public double j1() throws IOException {
        return this.h.j1();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public Number j2() throws IOException {
        return this.h.j2();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public Object l1() throws IOException {
        return this.h.l1();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public r m4() throws IOException {
        if(!this.j && (this.l != null && this.o == null && this.l.g() && !this.n.F() && this.k == a.a && this.p == d.a)) {
            this.l = null;
            return null;
        }
        e e0 = this.o;
        if(e0 != null) {
            while(true) {
                r r0 = e0.G();
                if(r0 != null) {
                    this.l = r0;
                    return r0;
                }
                e e1 = this.n;
                if(e0 == e1) {
                    this.o = null;
                    if(e0.l()) {
                        r r1 = this.h.c1();
                        this.l = r1;
                        if(r1 == r.n) {
                            e e2 = this.n.E();
                            this.n = e2;
                            this.p = e2.D();
                        }
                        return r1;
                    }
                    r r2 = this.h.Y();
                    if(r2 == r.l) {
                        e e3 = this.n.E();
                        this.n = e3;
                        this.p = e3.D();
                    }
                    if(r2 == r.o) {
                        break;
                    }
                    this.l = r2;
                    return r2;
                }
                e0 = e1.C(e0);
                this.o = e0;
                if(e0 == null) {
                    throw this.i("Unexpected problem: chain of filtered context broken");
                }
            }
        }
        r r3 = this.h.m4();
        if(r3 == null) {
            this.l = null;
            return null;
        }
        int v = r3.d();
        switch(v) {
            case 1: {
                d d6 = this.p;
                d d7 = d.a;
                if(d6 == d7) {
                    this.n = this.n.z(d6, true);
                    this.l = r3;
                    return r3;
                }
                if(d6 == null) {
                    this.h.I4();
                    return this.N4();
                }
                d d8 = this.n.v(d6);
                if(d8 == null) {
                    this.h.I4();
                    return this.N4();
                }
                if(d8 != d7) {
                    d8 = d8.e();
                }
                this.p = d8;
                if(d8 == d7) {
                    this.n = this.n.z(d8, true);
                    this.l = r3;
                    return r3;
                }
                if(d8 != null && this.k == a.c) {
                    this.n = this.n.z(d8, true);
                    this.l = r3;
                    return r3;
                }
                e e4 = this.n.z(d8, false);
                this.n = e4;
                if(this.k == a.b) {
                    r r5 = this.O4(e4);
                    if(r5 != null) {
                        this.l = r5;
                        return r5;
                    }
                }
                break;
            }
            case 3: {
                d d9 = this.p;
                d d10 = d.a;
                if(d9 == d10) {
                    this.n = this.n.y(d9, true);
                    this.l = r3;
                    return r3;
                }
                if(d9 == null) {
                    this.h.I4();
                    return this.N4();
                }
                d d11 = this.n.v(d9);
                if(d11 == null) {
                    this.h.I4();
                    return this.N4();
                }
                if(d11 != d10) {
                    d11 = d11.d();
                }
                this.p = d11;
                if(d11 == d10) {
                    this.n = this.n.y(d11, true);
                    this.l = r3;
                    return r3;
                }
                if(d11 != null && this.k == a.c) {
                    this.n = this.n.y(d11, true);
                    this.l = r3;
                    return r3;
                }
                e e6 = this.n.y(d11, false);
                this.n = e6;
                if(this.k == a.b) {
                    r r6 = this.O4(e6);
                    if(r6 != null) {
                        this.l = r6;
                        return r6;
                    }
                }
                break;
            }
            case 2: 
            case 4: {
                boolean z = this.n.F();
                e e5 = this.n.E();
                this.n = e5;
                this.p = e5.D();
                if(z) {
                    this.l = r3;
                    return r3;
                }
                break;
            }
            default: {
                if(v == 5) {
                    String s = this.h.y0();
                    d d3 = this.n.I(s);
                    d d4 = d.a;
                    if(d3 == d4) {
                        this.p = d3;
                        this.l = r3;
                        return r3;
                    }
                    if(d3 == null) {
                        this.h.m4();
                        this.h.I4();
                        return this.N4();
                    }
                    d d5 = d3.s(s);
                    if(d5 == null) {
                        this.h.m4();
                        this.h.I4();
                        return this.N4();
                    }
                    this.p = d5;
                    if(d5 == d4) {
                        if(!this.P4()) {
                            this.h.m4();
                            this.h.I4();
                        }
                        else if(this.k == a.b) {
                            this.l = r3;
                            return r3;
                        }
                    }
                    if(this.k != a.a) {
                        r r4 = this.O4(this.n);
                        if(r4 != null) {
                            this.l = r4;
                            return r4;
                        }
                    }
                }
                else {
                    d d0 = this.p;
                    d d1 = d.a;
                    if(d0 == d1) {
                        this.l = r3;
                        return r3;
                    }
                    if(d0 != null) {
                        d d2 = this.n.v(d0);
                        if((d2 == d1 || d2 != null && d2.x(this.h)) && this.P4()) {
                            this.l = r3;
                            return r3;
                        }
                    }
                }
            }
        }
        return this.N4();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public r n4() throws IOException {
        r r0 = this.m4();
        return r0 == r.o ? this.m4() : r0;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public void o4(String s) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean p3() throws IOException {
        return this.h.p3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public boolean r3(boolean z) throws IOException {
        return this.h.r3(z);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        return this.h.r4(a0, outputStream0);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public double s3() throws IOException {
        return this.h.s3();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public float u1() throws IOException {
        return this.h.u1();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public double v3(double f) throws IOException {
        return this.h.v3(f);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public BigInteger x0() throws IOException {
        return this.h.x0();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public String y0() throws IOException {
        q q0 = this.L4();
        if(this.l != r.k && this.l != r.m) {
            return q0.b();
        }
        q q1 = q0.f();
        return q1 == null ? null : q1.b();
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public int y3() throws IOException {
        return this.h.y3();
    }
}

