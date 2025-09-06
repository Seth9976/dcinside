package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.exc.b;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.json.d;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.sym.a;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.i;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public abstract class c extends com.fasterxml.jackson.core.base.c {
    protected static final int Aa = 41;
    protected static final int Ba = 42;
    protected final a C9;
    protected static final int Ca = 43;
    protected int[] D9;
    protected static final int Da = 44;
    protected int E9;
    protected static final int Ea = 45;
    protected int F9;
    protected static final int Fa = 50;
    protected int G9;
    protected static final int Ga = 51;
    protected int H9;
    protected static final int Ha = 52;
    protected int I9;
    protected static final int Ia = 53;
    protected int J9;
    protected static final int Ja = 54;
    protected int K9;
    protected static final int Ka = 55;
    protected int L9;
    protected static final int La = 0;
    protected int M9;
    protected static final int Ma = 1;
    protected int N9;
    protected static final int Na = 2;
    protected boolean O9;
    protected static final int Oa = 3;
    protected int P9;
    protected static final String[] Pa = null;
    protected int Q9;
    protected static final double[] Qa = null;
    protected int R9;
    protected static final int S9 = 0;
    protected static final int T9 = 1;
    protected static final int U9 = 2;
    protected static final int V9 = 3;
    protected static final int W9 = 4;
    protected static final int X9 = 5;
    protected static final int Y9 = 6;
    protected static final int Z9 = 7;
    protected static final int aa = 1;
    protected static final int ba = 2;
    protected static final int ca = 3;
    protected static final int da = 4;
    protected static final int ea = 5;
    protected static final int fa = 7;
    protected static final int ga = 8;
    protected static final int ha = 9;
    protected static final int ia = 10;
    protected static final int ja = 12;
    protected static final int ka = 13;
    protected static final int la = 14;
    protected static final int ma = 15;
    protected static final int na = 16;
    protected static final int oa = 17;
    protected static final int pa = 18;
    protected static final int qa = 19;
    protected static final int ra = 22;
    protected static final int sa = 23;
    protected static final int ta = 24;
    protected static final int ua = 25;
    protected static final int va = 26;
    protected static final int wa = 30;
    protected static final int xa = 0x1F;
    protected static final int ya = 0x20;
    protected static final int za = 40;

    static {
        c.Pa = new String[]{"NaN", "Infinity", "+Infinity", "-Infinity"};
        c.Qa = new double[]{NaN, Infinity, Infinity, -Infinity};
    }

    public c(g g0, int v, a a0) {
        super(g0, v);
        this.D9 = new int[8];
        this.O9 = false;
        this.Q9 = 0;
        this.R9 = 1;
        this.C9 = a0;
        this.h = null;
        this.K9 = 0;
        this.L9 = 1;
    }

    protected void A6(int v) throws m {
        this.T4("Invalid UTF-8 start byte 0x" + Integer.toHexString(v));
    }

    @Override  // com.fasterxml.jackson.core.n
    public void B4(u u0) {
        throw new UnsupportedOperationException("Can not use ObjectMapper with non-blocking parser");
    }

    protected void B6(int v) throws m {
        this.T4("Invalid UTF-8 middle byte 0x" + Integer.toHexString(v));
    }

    @Override  // com.fasterxml.jackson.core.n
    public i C2() {
        return com.fasterxml.jackson.core.base.c.B9;
    }

    protected void C6(int v, int v1) throws m {
        this.a9 = v1;
        this.B6(v);
    }

    protected final r D6() throws IOException {
        this.Z5(-1, -1);
        this.K9 = 5;
        this.L9 = 6;
        this.h = r.m;
        return r.m;
    }

    protected final r E6() throws IOException {
        this.a6(-1, -1);
        this.K9 = 2;
        this.L9 = 3;
        this.h = r.k;
        return r.k;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String F3() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(null);
    }

    protected final void F6() {
        this.g9 = Math.max(this.d9, this.R9);
        this.h9 = this.a9 - this.e9;
        this.f9 = this.c9 + ((long)(this.a9 - this.Q9));
    }

    protected final r G6(r r0) throws IOException {
        this.K9 = this.L9;
        this.h = r0;
        return r0;
    }

    protected final r H6(int v, String s) throws IOException {
        this.k9.M(s);
        this.y9 = s.length();
        this.p9 = 1;
        this.q9 = v;
        this.K9 = this.L9;
        this.h = r.r;
        return r.r;
    }

    protected final r I6(int v) throws IOException {
        String s = c.Pa[v];
        this.k9.M(s);
        if(!this.a4(com.fasterxml.jackson.core.n.a.n)) {
            this.U4("Non-standard token \'%s\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", s);
        }
        this.y9 = 0;
        this.p9 = 8;
        this.t9 = c.Qa[v];
        this.K9 = this.L9;
        this.h = r.s;
        return r.s;
    }

    protected a J6() {
        return this.C9;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        r r0 = this.h;
        if(r0 != r.q) {
            this.U4("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", r0);
        }
        if(this.o9 == null) {
            com.fasterxml.jackson.core.util.c c0 = this.C5();
            this.N4(this.R2(), c0, a0);
            this.o9 = new byte[0];
        }
        return this.o9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object N1() {
        return null;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String N3(String s) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(s);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void N5() throws IOException {
        super.N5();
        this.C9.N();
    }

    @Override  // com.fasterxml.jackson.core.n
    public int P2(Writer writer0) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            return this.k9.r(writer0);
        }
        if(r0 == r.o) {
            String s = this.i9.b();
            writer0.write(s);
            return s.length();
        }
        if(r0 != null) {
            if(r0.f()) {
                return this.k9.r(writer0);
            }
            if(r0 == r.j) {
                this.T4("Current token not available: can not call this method");
            }
            char[] arr_c = r0.b();
            writer0.write(arr_c);
            return arr_c.length;
        }
        return 0;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String R2() throws IOException {
        return this.h == r.q ? this.k9.q() : this.w6(this.h);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public boolean T3() {
        r r0 = this.h;
        if(r0 == r.q) {
            return this.k9.F();
        }
        return r0 == r.o ? this.m9 : false;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public char[] Y2() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 5: {
                    if(!this.m9) {
                        int v = this.i9.b().length();
                        char[] arr_c = this.l9;
                        if(arr_c == null) {
                            this.l9 = this.X8.j(v);
                        }
                        else if(arr_c.length < v) {
                            this.l9 = new char[v];
                        }
                        this.m9 = true;
                    }
                    return this.l9;
                }
                case 6: 
                case 7: 
                case 8: {
                    return this.k9.D();
                }
                default: {
                    return this.h.b();
                }
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.core.n
    public u a1() {
        return null;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public l b1() {
        return new l(this.s5(), this.c9 + ((long)(this.a9 - this.Q9)), -1L, Math.max(this.d9, this.R9), this.a9 - this.e9 + 1);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int b3() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 5: {
                    return this.i9.b().length();
                }
                case 6: 
                case 7: 
                case 8: {
                    return this.k9.Q();
                }
                default: {
                    return this.h.b().length;
                }
            }
        }
        return 0;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int e3() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 6: 
                case 7: 
                case 8: {
                    return this.k9.E();
                }
                default: {
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public l i3() {
        return new l(this.s5(), this.f9, -1L, this.g9, this.h9);
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object l1() throws IOException {
        return this.h == r.p ? this.o9 : null;
    }

    protected final String o6(int[] arr_v, int v, int v1) throws m, b {
        int v10;
        int v9;
        int v3;
        int v2 = (v << 2) - 4 + v1;
        this.Y8.q(v2);
        if(v1 < 4) {
            v3 = arr_v[v - 1];
            arr_v[v - 1] = v3 << (4 - v1 << 3);
        }
        else {
            v3 = 0;
        }
        char[] arr_c = this.k9.s();
        int v4 = 0;
        int v5 = 0;
        while(v4 < v2) {
            int v6 = arr_v[v4 >> 2] >> ((~v4 & 3) << 3);
            int v7 = v6 & 0xFF;
            int v8 = v4 + 1;
            if(v7 > 0x7F) {
                if((v6 & 0xE0) == 0xC0) {
                    v9 = v6 & 0x1F;
                }
                else if((v6 & 0xF0) == 0xE0) {
                    v9 = v6 & 15;
                    v10 = 2;
                    goto label_29;
                }
                else if((v6 & 0xF8) == 0xF0) {
                    v9 = v6 & 7;
                    v10 = 3;
                    goto label_29;
                }
                else {
                    this.A6(v7);
                    v9 = 1;
                }
                v10 = 1;
            label_29:
                if(v8 + v10 > v2) {
                    this.Z4(" in field name", r.o);
                }
                int v11 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                v8 = v4 + 2;
                if((v11 & 0xC0) != 0x80) {
                    this.B6(v11);
                }
                int v12 = v9 << 6 | v11 & 0x3F;
                if(v10 > 1) {
                    int v13 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                    v8 = v4 + 3;
                    if((v13 & 0xC0) != 0x80) {
                        this.B6(v13);
                    }
                    v12 = v12 << 6 | v13 & 0x3F;
                    if(v10 > 2) {
                        int v14 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                        v8 = v4 + 4;
                        if((v14 & 0xC0) != 0x80) {
                            this.B6(v14 & 0xFF);
                        }
                        v12 = v12 << 6 | v14 & 0x3F;
                    }
                }
                v7 = v12;
                if(v10 > 2) {
                    if(v5 >= arr_c.length) {
                        arr_c = this.k9.v();
                    }
                    arr_c[v5] = (char)((v7 - 0x10000 >> 10) + 0xD800);
                    v7 = v7 - 0x10000 & 0x3FF | 0xDC00;
                    ++v5;
                }
            }
            v4 = v8;
            if(v5 >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v5] = (char)v7;
            ++v5;
        }
        String s = new String(arr_c, 0, v5);
        if(!this.C9.F()) {
            return s;
        }
        if(v1 < 4) {
            arr_v[v - 1] = v3;
        }
        return this.C9.s(s, arr_v, v);
    }

    protected final r p6() throws IOException {
        int v;
        if(!this.i9.l()) {
            this.O5(93, '}');
        }
        d d0 = this.i9.B();
        this.i9 = d0;
        if(d0.m()) {
            v = 3;
        }
        else {
            v = d0.l() ? 6 : 1;
        }
        this.K9 = v;
        this.L9 = v;
        this.h = r.n;
        return r.n;
    }

    protected final r q6() throws IOException {
        int v;
        if(!this.i9.m()) {
            this.O5(0x7D, ']');
        }
        d d0 = this.i9.B();
        this.i9 = d0;
        if(d0.m()) {
            v = 3;
        }
        else {
            v = d0.l() ? 6 : 1;
        }
        this.K9 = v;
        this.L9 = v;
        this.h = r.l;
        return r.l;
    }

    @Override  // com.fasterxml.jackson.core.n
    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = this.L0(a0);
        outputStream0.write(arr_b);
        return arr_b.length;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void r5() throws IOException {
        this.Q9 = 0;
        this.b9 = 0;
    }

    protected final r r6() throws IOException {
        this.K9 = 7;
        if(!this.i9.n()) {
            this.P4();
        }
        this.close();
        this.h = null;
        return null;
    }

    protected final r s6(String s) throws IOException {
        this.K9 = 4;
        this.i9.D(s);
        this.h = r.o;
        return r.o;
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean t() {
        return true;
    }

    protected final String t6(int v, int v1) throws m, b {
        int v2 = c.y6(v, v1);
        String s = this.C9.A(v2);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.D9;
        arr_v[0] = v2;
        return this.o6(arr_v, 1, v1);
    }

    protected final String u6(int v, int v1, int v2) throws m, b {
        int v3 = c.y6(v1, v2);
        String s = this.C9.B(v, v3);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.D9;
        arr_v[0] = v;
        arr_v[1] = v3;
        return this.o6(arr_v, 2, v2);
    }

    protected final String v6(int v, int v1, int v2, int v3) throws m, b {
        int v4 = c.y6(v2, v3);
        String s = this.C9.C(v, v1, v4);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.D9;
        arr_v[0] = v;
        arr_v[1] = v1;
        arr_v[2] = c.y6(v4, v3);
        return this.o6(arr_v, 3, v3);
    }

    protected final String w6(r r0) throws IOException {
        if(r0 == null) {
            return null;
        }
        switch(r0.d()) {
            case -1: {
                return null;
            }
            case 5: {
                return this.i9.b();
            }
            case 6: 
            case 7: 
            case 8: {
                return this.k9.q();
            }
            default: {
                return r0.c();
            }
        }
    }

    protected final String x6(int v) {
        return c.Pa[v];
    }

    @Override  // com.fasterxml.jackson.core.n
    public abstract int y4(OutputStream arg1) throws IOException;

    protected static final int y6(int v, int v1) {
        return v1 == 4 ? v : v | -1 << (v1 << 3);
    }

    protected void z6(int v) throws m {
        if(v < 0x20) {
            this.g5(v);
        }
        this.A6(v);
    }
}

