package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.base.c;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n.a;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.sym.b;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class i extends c {
    protected Reader C9;
    protected char[] D9;
    protected boolean E9;
    protected u F9;
    protected final b G9;
    protected final int H9;
    protected boolean I9;
    protected long J9;
    protected int K9;
    protected int L9;
    private static final int M9;
    private static final int N9;
    private static final int O9;
    private static final int P9;
    private static final int Q9;
    private static final int R9;
    private static final int S9;
    private static final int T9;
    protected static final int[] U9;

    static {
        i.M9 = a.p.d();
        i.N9 = a.j.d();
        i.O9 = a.n.d();
        i.P9 = a.o.d();
        i.Q9 = a.g.d();
        i.R9 = a.f.d();
        i.S9 = a.d.d();
        i.T9 = a.e.d();
        i.U9 = com.fasterxml.jackson.core.io.c.j();
    }

    public i(g g0, int v, Reader reader0, u u0, b b0) {
        super(g0, v);
        this.C9 = reader0;
        this.D9 = g0.o();
        this.a9 = 0;
        this.b9 = 0;
        this.F9 = u0;
        this.G9 = b0;
        this.H9 = b0.q();
        this.E9 = true;
    }

    public i(g g0, int v, Reader reader0, u u0, b b0, char[] arr_c, int v1, int v2, boolean z) {
        super(g0, v);
        this.C9 = reader0;
        this.F9 = u0;
        this.D9 = arr_c;
        this.a9 = v1;
        this.b9 = v2;
        this.e9 = v1;
        this.c9 = (long)(-v1);
        this.G9 = b0;
        this.H9 = b0.q();
        this.E9 = z;
    }

    private final void A6(int v) throws IOException {
        this.h = r.o;
        this.j7();
        switch(v) {
            case 34: {
                this.I9 = true;
                this.j9 = r.q;
                return;
            }
            case 43: {
                if(this.a4(e.k.f())) {
                    this.j9 = this.R6(false);
                    return;
                }
                this.j9 = this.y6(43);
                return;
            }
            case 45: {
                this.j9 = this.R6(true);
                return;
            }
            case 46: {
                this.j9 = this.N6(false);
                return;
            }
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                this.j9 = this.S6(v);
                return;
            }
            case 91: {
                this.j9 = r.m;
                return;
            }
            case 102: {
                this.F6("false", 1);
                this.j9 = r.u;
                return;
            }
            case 110: {
                this.F6("null", 1);
                this.j9 = r.v;
                return;
            }
            case 0x74: {
                this.F6("true", 1);
                this.j9 = r.t;
                return;
            }
            case 0x7B: {
                this.j9 = r.k;
                return;
            }
            default: {
                this.j9 = this.y6(v);
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public void B4(u u0) {
        this.F9 = u0;
    }

    protected boolean B6() throws IOException {
        if(this.C9 != null) {
            long v = (long)this.b9;
            this.c9 += v;
            this.e9 -= this.b9;
            this.J4().n(this.c9);
            int v1 = this.C9.read(this.D9, 0, this.D9.length);
            if(v1 > 0) {
                this.J9 -= v;
                this.a9 = 0;
                this.b9 = v1;
                return true;
            }
            this.b9 = 0;
            this.a9 = 0;
            this.r5();
            if(v1 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.b9);
            }
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.core.n
    public com.fasterxml.jackson.core.util.i C2() {
        return c.B9;
    }

    protected void C6() throws IOException {
        if(!this.B6()) {
            this.X4();
        }
    }

    private final void D6() throws IOException {
        int v = this.a9;
        if(v + 4 < this.b9) {
            char[] arr_c = this.D9;
            if(arr_c[v] == 97 && arr_c[v + 1] == 108 && arr_c[v + 2] == 0x73 && arr_c[v + 3] == 101) {
                int v1 = arr_c[v + 4];
                if(v1 < 0x30 || (v1 == 93 || v1 == 0x7D)) {
                    this.a9 = v + 4;
                    return;
                }
            }
        }
        this.F6("false", 1);
    }

    private final void E6() throws IOException {
        int v = this.a9;
        if(v + 3 < this.b9) {
            char[] arr_c = this.D9;
            if(arr_c[v] == 0x75 && arr_c[v + 1] == 108 && arr_c[v + 2] == 108) {
                int v1 = arr_c[v + 3];
                if(v1 < 0x30 || (v1 == 93 || v1 == 0x7D)) {
                    this.a9 = v + 3;
                    return;
                }
            }
        }
        this.F6("null", 1);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final String F3() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.I9) {
                this.I9 = false;
                this.z5();
            }
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(null);
    }

    protected final void F6(String s, int v) throws IOException {
        int v2;
        int v1 = s.length();
        if(this.a9 + v1 >= this.b9) {
            this.G6(s, v);
            return;
        }
        do {
            if(this.D9[this.a9] != s.charAt(v)) {
                this.U6(s.substring(0, v));
            }
            v2 = this.a9 + 1;
            this.a9 = v2;
            ++v;
        }
        while(v < v1);
        int v3 = this.D9[v2];
        if(v3 >= 0x30 && (v3 != 93 && v3 != 0x7D)) {
            this.o6(s, v, v3);
        }
    }

    private final void G6(String s, int v) throws IOException {
        int v1 = s.length();
        do {
            if(this.a9 >= this.b9 && !this.B6() || this.D9[this.a9] != s.charAt(v)) {
                this.U6(s.substring(0, v));
            }
            int v2 = this.a9 + 1;
            this.a9 = v2;
            ++v;
        }
        while(v < v1);
        if(v2 >= this.b9 && !this.B6()) {
            return;
        }
        int v3 = this.D9[this.a9];
        if(v3 >= 0x30 && (v3 != 93 && v3 != 0x7D)) {
            this.o6(s, v, v3);
        }
    }

    private final void H6() throws IOException {
        int v = this.a9;
        if(v + 3 < this.b9) {
            char[] arr_c = this.D9;
            if(arr_c[v] == 0x72 && arr_c[v + 1] == 0x75 && arr_c[v + 2] == 101) {
                int v1 = arr_c[v + 3];
                if(v1 < 0x30 || (v1 == 93 || v1 == 0x7D)) {
                    this.a9 = v + 3;
                    return;
                }
            }
        }
        this.F6("true", 1);
    }

    private final r I6() throws IOException {
        this.m9 = false;
        r r0 = this.j9;
        this.j9 = null;
        if(r0 == r.m) {
            this.Z5(this.g9, this.h9);
        }
        else if(r0 == r.k) {
            this.a6(this.g9, this.h9);
        }
        this.h = r0;
        return r0;
    }

    private final r J6(int v) throws IOException {
        switch(v) {
            case 34: {
                this.I9 = true;
                this.h = r.q;
                return r.q;
            }
            case 44: {
                if(!this.i9.n() && (this.a & i.P9) != 0) {
                    --this.a9;
                    this.h = r.v;
                    return r.v;
                }
                break;
            }
            case 45: {
                r r0 = this.R6(true);
                this.h = r0;
                return r0;
            }
            case 46: {
                r r1 = this.N6(false);
                this.h = r1;
                return r1;
            }
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                r r2 = this.S6(v);
                this.h = r2;
                return r2;
            }
            case 91: {
                this.Z5(this.g9, this.h9);
                this.h = r.m;
                return r.m;
            }
            case 102: {
                this.F6("false", 1);
                this.h = r.u;
                return r.u;
            }
            case 110: {
                this.F6("null", 1);
                this.h = r.v;
                return r.v;
            }
            case 0x74: {
                this.F6("true", 1);
                this.h = r.t;
                return r.t;
            }
            case 0x7B: {
                this.a6(this.g9, this.h9);
                this.h = r.k;
                return r.k;
            }
        }
        r r3 = this.y6(v);
        this.h = r3;
        return r3;
    }

    protected String K6() throws IOException {
        int v = this.a9;
        int v1 = this.H9;
        int v2 = this.b9;
        if(v < v2) {
            int[] arr_v = i.U9;
            while(true) {
                char[] arr_c = this.D9;
                int v3 = arr_c[v];
                if(v3 == 39) {
                    int v4 = this.a9;
                    this.a9 = v + 1;
                    return this.G9.p(arr_c, v4, v - v4, v1);
                }
                if(v3 < arr_v.length && arr_v[v3] != 0) {
                    break;
                }
                v1 = v1 * 33 + v3;
                ++v;
                if(v >= v2) {
                    break;
                }
            }
        }
        int v5 = this.a9;
        this.a9 = v;
        return this.P6(v5, v1, 39);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        r r0 = this.h;
        if(r0 == r.p) {
            byte[] arr_b = this.o9;
            if(arr_b != null) {
                return arr_b;
            }
        }
        if(r0 != r.q) {
            this.T4("Current token (" + this.h + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if(this.I9) {
            try {
                this.o9 = this.q6(a0);
                this.I9 = false;
                return this.o9;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw this.i("Failed to decode VALUE_STRING as base64 (" + a0 + "): " + illegalArgumentException0.getMessage());
            }
        }
        if(this.o9 == null) {
            com.fasterxml.jackson.core.util.c c0 = this.C5();
            this.N4(this.R2(), c0, a0);
            this.o9 = new byte[0];
        }
        return this.o9;
    }

    private final r L6(int v, int v1, int v2, boolean z, int v3) throws IOException {
        int v9;
        int v8;
        int v7;
        int v4 = this.b9;
        int v5 = 0;
        if(v == 46) {
            int v6 = 0;
            while(true) {
                if(v2 >= v4) {
                    return this.Q6(z, v1);
                }
                v7 = v2 + 1;
                v8 = this.D9[v2];
                if(v8 < 0x30 || v8 > 57) {
                    break;
                }
                ++v6;
                v2 = v7;
            }
            if(v6 == 0 && !this.a4(e.m.f())) {
                this.e5(v8, "Decimal point not followed by a digit");
            }
            v9 = v6;
            v = v8;
        }
        else {
            v7 = v2;
            v9 = 0;
        }
        if(v == 69 || v == 101) {
            if(v7 >= v4) {
                this.a9 = v1;
                return this.Q6(z, v1);
            }
            char[] arr_c = this.D9;
            int v10 = v7 + 1;
            int v11 = arr_c[v7];
            if(v11 == 43 || v11 == 45) {
                if(v10 >= v4) {
                    this.a9 = v1;
                    return this.Q6(z, v1);
                }
                v7 += 2;
                v = arr_c[v10];
            }
            else {
                v7 = v10;
                v = v11;
            }
            while(v <= 57 && v >= 0x30) {
                ++v5;
                if(v7 >= v4) {
                    this.a9 = v1;
                    return this.Q6(z, v1);
                }
                v = this.D9[v7];
                ++v7;
            }
            if(v5 == 0) {
                this.e5(v, "Exponent indicator not followed by a digit");
            }
        }
        this.a9 = v7 - 1;
        if(this.i9.n()) {
            this.n7(v);
        }
        this.k9.L(this.D9, v1, v7 - 1 - v1);
        return this.m6(z, v3, v9, v5);
    }

    @Deprecated
    protected final r M6() throws IOException {
        return this.N6(false);
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object N1() {
        return this.C9;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final String N3(String s) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.I9) {
                this.I9 = false;
                this.z5();
            }
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(s);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void N5() throws IOException {
        super.N5();
        this.G9.x();
        if(this.E9) {
            char[] arr_c = this.D9;
            if(arr_c != null) {
                this.D9 = null;
                this.X8.f0(arr_c);
            }
        }
    }

    // 去混淆评级： 低(30)
    protected final r N6(boolean z) throws IOException {
        return this.a4(e.l.f()) ? this.L6(46, (z ? this.a9 - 2 : this.a9 - 1), this.a9, z, 0) : this.y6(46);
    }

    protected final String O6() throws IOException {
        int v = this.a9;
        int v1 = this.H9;
        int[] arr_v = i.U9;
        while(v < this.b9) {
            char[] arr_c = this.D9;
            int v2 = arr_c[v];
            if(v2 < arr_v.length && arr_v[v2] != 0) {
                if(v2 != 34) {
                    break;
                }
                int v3 = this.a9;
                this.a9 = v + 1;
                return this.G9.p(arr_c, v3, v - v3, v1);
            }
            v1 = v1 * 33 + v2;
            ++v;
        }
        int v4 = this.a9;
        this.a9 = v;
        return this.P6(v4, v1, 34);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int P2(Writer writer0) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.I9) {
                this.I9 = false;
                this.z5();
            }
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
            char[] arr_c = r0.b();
            writer0.write(arr_c);
            return arr_c.length;
        }
        return 0;
    }

    private String P6(int v, int v1, int v2) throws IOException {
        this.k9.L(this.D9, v, this.a9 - v);
        char[] arr_c = this.k9.B();
        int v3 = this.k9.C();
        while(true) {
            if(this.a9 >= this.b9 && !this.B6()) {
                this.Z4(" in field name", r.o);
            }
            int v4 = this.a9;
            this.a9 = v4 + 1;
            char c = this.D9[v4];
            if(c <= 92) {
                if(c == 92) {
                    c = this.x5();
                }
                else if(c <= v2) {
                    if(c == v2) {
                        break;
                    }
                    if(c < 0x20) {
                        this.Q5(((int)c), "name");
                    }
                }
            }
            v1 = v1 * 33 + c;
            arr_c[v3] = c;
            if(v3 + 1 >= arr_c.length) {
                arr_c = this.k9.y();
                v3 = 0;
            }
            else {
                ++v3;
            }
        }
        this.k9.P(v3);
        char[] arr_c1 = this.k9.D();
        int v5 = this.k9.E();
        int v6 = this.k9.Q();
        return this.G9.p(arr_c1, v5, v6, v1);
    }

    private final r Q6(boolean z, int v) throws IOException {
        char c1;
        int v6;
        boolean z1;
        char c;
        int v1;
        if(z) {
            ++v;
        }
        this.a9 = v;
        char[] arr_c = this.k9.s();
        if(z) {
            arr_c[0] = '-';
            v1 = 1;
        }
        else {
            v1 = 0;
        }
        int v2 = this.a9;
        if(v2 < this.b9) {
            this.a9 = v2 + 1;
            c = this.D9[v2];
        }
        else {
            c = this.p7("No digit following minus sign", r.r);
        }
        if(c == 0x30) {
            c = this.m7();
        }
        int v3 = 0;
        while(true) {
            z1 = false;
            if(c < 0x30 || c > 57) {
                break;
            }
            ++v3;
            if(v1 >= arr_c.length) {
                arr_c = this.k9.y();
                v1 = 0;
            }
            arr_c[v1] = c;
            if(this.a9 >= this.b9 && !this.B6()) {
                ++v1;
                c = '\u0000';
                z1 = true;
                break;
            }
            int v4 = this.a9;
            this.a9 = v4 + 1;
            c = this.D9[v4];
            ++v1;
        }
        int v5 = -1;
        if(v3 == 0 && !this.a4(e.l.f())) {
            return this.u6(((int)c), z);
        }
        if(c == 46) {
            if(v1 >= arr_c.length) {
                arr_c = this.k9.y();
                v1 = 0;
            }
            arr_c[v1] = '.';
            ++v1;
            v6 = 0;
            while(true) {
                if(this.a9 >= this.b9 && !this.B6()) {
                    z1 = true;
                    break;
                }
                int v7 = this.a9;
                this.a9 = v7 + 1;
                c = this.D9[v7];
                if(c < 0x30 || c > 57) {
                    break;
                }
                ++v6;
                if(v1 >= arr_c.length) {
                    arr_c = this.k9.y();
                    v1 = 0;
                }
                arr_c[v1] = c;
                ++v1;
            }
            if(v6 == 0 && !this.a4(e.m.f())) {
                this.e5(((int)c), "Decimal point not followed by a digit");
            }
        }
        else {
            v6 = -1;
        }
        if(c == 69 || c == 101) {
            if(v1 >= arr_c.length) {
                arr_c = this.k9.y();
                v1 = 0;
            }
            int v8 = v1 + 1;
            arr_c[v1] = c;
            int v9 = this.a9;
            if(v9 < this.b9) {
                this.a9 = v9 + 1;
                c1 = this.D9[v9];
            }
            else {
                c1 = this.p7("expected a digit for number exponent", r.s);
            }
            if(c1 == 43 || c1 == 45) {
                if(v8 >= arr_c.length) {
                    arr_c = this.k9.y();
                    v8 = 0;
                }
                arr_c[v8] = c1;
                int v10 = this.a9;
                if(v10 < this.b9) {
                    this.a9 = v10 + 1;
                    c1 = this.D9[v10];
                }
                else {
                    c1 = this.p7("expected a digit for number exponent", r.s);
                }
                ++v8;
            }
            c = c1;
            int v11 = 0;
            while(true) {
                if(c > 57 || c < 0x30) {
                    v1 = v8;
                    v5 = v11;
                    break;
                }
                ++v11;
                if(v8 >= arr_c.length) {
                    arr_c = this.k9.y();
                    v8 = 0;
                }
                v1 = v8 + 1;
                arr_c[v8] = c;
                if(this.a9 >= this.b9 && !this.B6()) {
                    v5 = v11;
                    z1 = true;
                    break;
                }
                int v12 = this.a9;
                this.a9 = v12 + 1;
                c = this.D9[v12];
                v8 = v1;
            }
            if(v5 == 0) {
                this.e5(((int)c), "Exponent indicator not followed by a digit");
            }
        }
        if(!z1) {
            --this.a9;
            if(this.i9.n()) {
                this.n7(((int)c));
            }
        }
        this.k9.P(v1);
        return v6 >= 0 || v5 >= 0 ? this.m6(z, v3, v6, v5) : this.n6(z, v3);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final String R2() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.I9) {
                this.I9 = false;
                this.z5();
            }
            return this.k9.q();
        }
        return this.s6(r0);
    }

    private final r R6(boolean z) throws IOException {
        int v6;
        int v = this.a9;
        int v1 = z ? v - 1 : v;
        int v2 = this.b9;
        if(v >= v2) {
            return this.Q6(z, v1);
        }
        int v3 = v + 1;
        int v4 = this.D9[v];
        if(v4 <= 57 && v4 >= 0x30) {
            if(v4 == 0x30) {
                return this.Q6(z, v1);
            }
            int v5 = 1;
            while(true) {
                if(v3 >= v2) {
                    return this.Q6(z, v1);
                }
                v6 = this.D9[v3];
                if(v6 < 0x30 || v6 > 57) {
                    break;
                }
                ++v5;
                ++v3;
            }
            if(v6 != 46 && v6 != 69 && v6 != 101) {
                this.a9 = v3;
                if(this.i9.n()) {
                    this.n7(v6);
                }
                this.k9.L(this.D9, v1, v3 - v1);
                return this.n6(z, v5);
            }
            this.a9 = v3 + 1;
            return this.L6(v6, v1, v3 + 1, z, v5);
        }
        this.a9 = v3;
        return v4 == 46 ? this.N6(z) : this.v6(v4, z, true);
    }

    protected final r S6(int v) throws IOException {
        int v5;
        int v1 = this.a9;
        int v2 = v1 - 1;
        int v3 = this.b9;
        if(v == 0x30) {
            return this.Q6(false, v2);
        }
        int v4 = 1;
        while(true) {
            if(v1 >= v3) {
                this.a9 = v2;
                return this.Q6(false, v2);
            }
            v5 = this.D9[v1];
            if(v5 < 0x30 || v5 > 57) {
                break;
            }
            ++v4;
            ++v1;
        }
        if(v5 != 46 && v5 != 69 && v5 != 101) {
            this.a9 = v1;
            if(this.i9.n()) {
                this.n7(v5);
            }
            this.k9.L(this.D9, v2, v1 - v2);
            return this.n6(false, v4);
        }
        this.a9 = v1 + 1;
        return this.L6(v5, v2, v1 + 1, false, v4);
    }

    protected int T6(com.fasterxml.jackson.core.a a0, OutputStream outputStream0, byte[] arr_b) throws IOException {
        int v = arr_b.length - 3;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            if(this.a9 >= this.b9) {
                this.C6();
            }
            int v3 = this.a9;
            this.a9 = v3 + 1;
            int v4 = this.D9[v3];
            if(v4 > 0x20) {
                int v5 = a0.h(((char)v4));
                if(v5 < 0) {
                    if(v4 == 34) {
                        goto label_71;
                    }
                    v5 = this.v5(a0, ((char)v4), 0);
                    if(v5 >= 0) {
                        goto label_14;
                    }
                }
                else {
                label_14:
                    if(v1 > v) {
                        v2 += v1;
                        outputStream0.write(arr_b, 0, v1);
                        v1 = 0;
                    }
                    if(this.a9 >= this.b9) {
                        this.C6();
                    }
                    int v6 = this.a9;
                    this.a9 = v6 + 1;
                    int v7 = this.D9[v6];
                    int v8 = a0.h(((char)v7));
                    if(v8 < 0) {
                        v8 = this.v5(a0, ((char)v7), 1);
                    }
                    int v9 = v5 << 6 | v8;
                    if(this.a9 >= this.b9) {
                        this.C6();
                    }
                    int v10 = this.a9;
                    this.a9 = v10 + 1;
                    int v11 = this.D9[v10];
                    int v12 = a0.h(((char)v11));
                    if(v12 < 0) {
                        if(v12 != -2) {
                            if(v11 == 34) {
                                arr_b[v1] = (byte)(v9 >> 4);
                                if(a0.C()) {
                                    --this.a9;
                                    this.H5(a0);
                                }
                                ++v1;
                                goto label_71;
                            }
                            v12 = this.v5(a0, ((char)v11), 2);
                        }
                        if(v12 == -2) {
                            if(this.a9 >= this.b9) {
                                this.C6();
                            }
                            int v13 = this.a9;
                            this.a9 = v13 + 1;
                            int v14 = this.D9[v13];
                            if(!a0.F(((char)v14)) && this.v5(a0, ((char)v14), 3) != -2) {
                                throw this.j6(a0, v14, 3, "expected padding character \'" + a0.y() + "\'");
                            }
                            arr_b[v1] = (byte)(v9 >> 4);
                            ++v1;
                            continue;
                        }
                    }
                    int v15 = v9 << 6 | v12;
                    if(this.a9 >= this.b9) {
                        this.C6();
                    }
                    int v16 = this.a9;
                    this.a9 = v16 + 1;
                    int v17 = this.D9[v16];
                    int v18 = a0.h(((char)v17));
                    if(v18 < 0) {
                        if(v18 != -2) {
                            if(v17 == 34) {
                                int v19 = v1 + 1;
                                arr_b[v1] = (byte)(v15 >> 10);
                                v1 += 2;
                                arr_b[v19] = (byte)(v15 >> 2);
                                if(a0.C()) {
                                    --this.a9;
                                    this.H5(a0);
                                }
                            }
                            else {
                                goto label_76;
                            }
                        label_71:
                            this.I9 = false;
                            if(v1 > 0) {
                                v2 += v1;
                                outputStream0.write(arr_b, 0, v1);
                            }
                            return v2;
                        label_76:
                            v18 = this.v5(a0, ((char)v17), 3);
                        }
                        if(v18 == -2) {
                            int v20 = v1 + 1;
                            arr_b[v1] = (byte)(v15 >> 10);
                            v1 += 2;
                            arr_b[v20] = (byte)(v15 >> 2);
                            continue;
                        }
                    }
                    int v21 = v15 << 6 | v18;
                    arr_b[v1] = (byte)(v21 >> 16);
                    int v22 = v1 + 2;
                    arr_b[v1 + 1] = (byte)(v21 >> 8);
                    v1 += 3;
                    arr_b[v22] = (byte)v21;
                }
            }
        }
    }

    protected void U6(String s) throws IOException {
        this.V6(s, this.R5());
    }

    protected void V6(String s, String s1) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        while(this.a9 < this.b9 || this.B6()) {
            int v = this.D9[this.a9];
            if(!Character.isJavaIdentifierPart(((char)v))) {
                break;
            }
            ++this.a9;
            stringBuilder0.append(((char)v));
            if(stringBuilder0.length() >= this.X8.x().c()) {
                stringBuilder0.append("...");
                break;
            }
            if(false) {
                break;
            }
        }
        this.V4("Unrecognized token \'%s\': was expecting %s", stringBuilder0, s1);
    }

    private final int W6() throws IOException {
        while(true) {
            if(this.a9 >= this.b9 && !this.B6()) {
                throw this.i("Unexpected end-of-input within/between root entries");
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.D9[v];
            if(v2 > 0x20) {
                switch(v2) {
                    case 35: {
                        if(this.i7()) {
                            continue;
                        }
                        return 35;
                    }
                    case 0x2F: {
                        this.d7();
                        continue;
                    }
                    default: {
                        return v2;
                    }
                }
            }
            if(v2 < 0x20) {
                switch(v2) {
                    case 9: {
                        continue;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = v1;
                        continue;
                    }
                    case 13: {
                        break;
                    }
                    default: {
                        this.g5(v2);
                        continue;
                    }
                }
                this.Y6();
            }
        }
    }

    private void X6() throws IOException {
        while(this.a9 < this.b9 || this.B6()) {
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.D9[v];
            if(v2 <= 42) {
                if(v2 == 42) {
                    if(v1 >= this.b9 && !this.B6()) {
                        break;
                    }
                    int v3 = this.a9;
                    if(this.D9[v3] != 0x2F) {
                        continue;
                    }
                    this.a9 = v3 + 1;
                    return;
                }
                if(v2 < 0x20) {
                    switch(v2) {
                        case 9: {
                            continue;
                        }
                        case 10: {
                            ++this.d9;
                            this.e9 = v1;
                            break;
                        }
                        case 13: {
                            this.Y6();
                            break;
                        }
                        default: {
                            this.g5(v2);
                        }
                    }
                }
            }
        }
        this.Z4(" in a comment", null);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final char[] Y2() throws IOException {
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
                case 6: {
                    if(this.I9) {
                        this.I9 = false;
                        this.z5();
                    }
                    break;
                }
                case 7: 
                case 8: {
                    break;
                }
                default: {
                    return this.h.b();
                }
            }
            return this.k9.D();
        }
        return null;
    }

    protected final void Y6() throws IOException {
        if(this.a9 < this.b9 || this.B6()) {
            int v = this.a9;
            if(this.D9[v] == 10) {
                this.a9 = v + 1;
            }
        }
        ++this.d9;
        this.e9 = this.a9;
    }

    private final int Z6() throws IOException {
        int v = this.a9;
        if(v + 4 >= this.b9) {
            return this.a7(false);
        }
        char[] arr_c = this.D9;
        int v1 = arr_c[v];
        if(v1 == 58) {
            this.a9 = v + 1;
            int v2 = arr_c[v + 1];
            if(v2 > 0x20) {
                if(v2 != 35 && v2 != 0x2F) {
                    this.a9 = v + 2;
                    return v2;
                }
                return this.a7(true);
            }
            if(v2 == 9 || v2 == 0x20) {
                this.a9 = v + 2;
                int v3 = arr_c[v + 2];
                if(v3 > 0x20 && (v3 != 35 && v3 != 0x2F)) {
                    this.a9 = v + 3;
                    return v3;
                }
                return this.a7(true);
            }
            return this.a7(true);
        }
        if(v1 == 9 || v1 == 0x20) {
            this.a9 = v + 1;
            v1 = arr_c[v + 1];
        }
        if(v1 == 58) {
            int v4 = this.a9;
            this.a9 = v4 + 1;
            int v5 = arr_c[v4 + 1];
            if(v5 > 0x20) {
                if(v5 != 35 && v5 != 0x2F) {
                    this.a9 = v4 + 2;
                    return v5;
                }
                return this.a7(true);
            }
            if(v5 == 9 || v5 == 0x20) {
                this.a9 = v4 + 2;
                int v6 = arr_c[v4 + 2];
                if(v6 > 0x20 && (v6 != 35 && v6 != 0x2F)) {
                    this.a9 = v4 + 3;
                    return v6;
                }
                return this.a7(true);
            }
            return this.a7(true);
        }
        return this.a7(false);
    }

    @Override  // com.fasterxml.jackson.core.n
    public u a1() {
        return this.F9;
    }

    private final int a7(boolean z) throws IOException {
        while(true) {
            if(this.a9 >= this.b9 && !this.B6()) {
                this.Z4(" within/between root entries", null);
                return -1;
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.D9[v];
            if(v2 > 0x20) {
                switch(v2) {
                    case 35: {
                        if(this.i7()) {
                            break;
                        }
                    label_11:
                        if(z) {
                            return v2;
                        }
                        if(v2 != 58) {
                            this.d5(v2, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                        break;
                    }
                    case 0x2F: {
                        this.d7();
                        break;
                    }
                    default: {
                        goto label_11;
                    }
                }
            }
            else if(v2 < 0x20) {
                switch(v2) {
                    case 9: {
                        continue;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = v1;
                        continue;
                    }
                    case 13: {
                        break;
                    }
                    default: {
                        this.g5(v2);
                        continue;
                    }
                }
                this.Y6();
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public l b1() {
        return new l(this.s5(), -1L, ((long)this.a9) + this.c9, this.d9, this.a9 - this.e9 + 1);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final int b3() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 5: {
                    return this.i9.b().length();
                }
                case 6: {
                    if(this.I9) {
                        this.I9 = false;
                        this.z5();
                    }
                    break;
                }
                case 7: 
                case 8: {
                    break;
                }
                default: {
                    return this.h.b().length;
                }
            }
            return this.k9.Q();
        }
        return 0;
    }

    private final int b7(int v) throws IOException {
        char[] arr_c = this.D9;
        int v1 = v + 1;
        int v2 = arr_c[v];
        if(v2 == 58) {
            int v3 = v + 2;
            int v4 = arr_c[v1];
            if(v4 > 0x20) {
                if(v4 != 35 && v4 != 0x2F) {
                    this.a9 = v3;
                    return v4;
                }
            }
            else if(v4 == 9 || v4 == 0x20) {
                int v5 = arr_c[v3];
                if(v5 > 0x20 && (v5 != 35 && v5 != 0x2F)) {
                    this.a9 = v + 3;
                    return v5;
                }
                v3 = v + 3;
            }
            this.a9 = v3 - 1;
            return this.a7(true);
        }
        if(v2 == 9 || v2 == 0x20) {
            v2 = arr_c[v1];
            v1 = v + 2;
        }
        if(v2 == 58) {
            int v6 = v1 + 1;
            int v7 = arr_c[v1];
            if(v7 > 0x20) {
                if(v7 != 35 && v7 != 0x2F) {
                    this.a9 = v6;
                    return v7;
                }
                v1 = v6;
            }
            else if(v7 == 9 || v7 == 0x20) {
                v1 += 2;
                int v8 = arr_c[v6];
                if(v8 > 0x20 && (v8 != 35 && v8 != 0x2F)) {
                    this.a9 = v1;
                    return v8;
                }
            }
            else {
                v1 = v6;
            }
        }
        this.a9 = v1 - 1;
        return this.a7(v2 == 58);
    }

    private final int c7(int v) throws IOException {
        if(v != 44) {
            this.d5(v, "was expecting comma to separate root entries");
        }
        int v1;
        while((v1 = this.a9) < this.b9) {
            this.a9 = v1 + 1;
            int v2 = this.D9[v1];
            if(v2 > 0x20) {
                if(v2 != 35 && v2 != 0x2F) {
                    return v2;
                }
                this.a9 = v1;
                return this.W6();
            }
            if(v2 < 0x20) {
                switch(v2) {
                    case 9: {
                        break;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = v1 + 1;
                        break;
                    }
                    case 13: {
                        this.Y6();
                        break;
                    }
                    default: {
                        this.g5(v2);
                    }
                }
            }
        }
        return this.W6();
    }

    private void d7() throws IOException {
        if((this.a & i.S9) == 0) {
            this.d5(0x2F, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)");
        }
        if(this.a9 >= this.b9 && !this.B6()) {
            this.Z4(" in a comment", null);
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.D9[v];
        if(v1 == 0x2F) {
            this.e7();
            return;
        }
        if(v1 == 42) {
            this.X6();
            return;
        }
        this.d5(v1, "was expecting either \'*\' or \'/\' for a comment");
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final int e3() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 6: {
                    if(this.I9) {
                        this.I9 = false;
                        this.z5();
                    }
                    break;
                }
                case 7: 
                case 8: {
                    break;
                }
                default: {
                    return 0;
                }
            }
            return this.k9.E();
        }
        return 0;
    }

    private void e7() throws IOException {
    label_0:
        while(this.a9 < this.b9 || this.B6()) {
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.D9[v];
            if(v2 < 0x20) {
                switch(v2) {
                    case 9: {
                        continue;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = v1;
                        return;
                    }
                    case 13: {
                        this.Y6();
                        if(true) {
                            break label_0;
                        }
                        continue;
                    }
                    default: {
                        this.g5(v2);
                        continue;
                    }
                }
            }
        }
    }

    protected final void f7() throws IOException {
        this.I9 = false;
        int v = this.a9;
        int v1 = this.b9;
        char[] arr_c = this.D9;
        while(true) {
            if(v >= v1) {
                this.a9 = v;
                if(!this.B6()) {
                    this.Z4(": was expecting closing quote for a string value", r.q);
                }
                v = this.a9;
                v1 = this.b9;
            }
            int v2 = arr_c[v];
            if(v2 <= 92) {
                if(v2 == 92) {
                    this.a9 = v + 1;
                    this.x5();
                    v = this.a9;
                    v1 = this.b9;
                    continue;
                }
                else if(v2 <= 34) {
                    if(v2 == 34) {
                        break;
                    }
                    if(v2 < 0x20) {
                        this.a9 = v + 1;
                        this.Q5(v2, "string value");
                    }
                }
            }
            ++v;
        }
        this.a9 = v + 1;
    }

    @Override  // com.fasterxml.jackson.core.n
    public final Boolean g4() throws IOException {
        if(this.h == r.o) {
            this.m9 = false;
            r r0 = this.j9;
            this.j9 = null;
            this.h = r0;
            if(r0 == r.t) {
                return true;
            }
            if(r0 == r.u) {
                return false;
            }
            if(r0 == r.m) {
                this.Z5(this.g9, this.h9);
                return null;
            }
            if(r0 == r.k) {
                this.a6(this.g9, this.h9);
            }
            return null;
        }
        r r1 = this.m4();
        if(r1 != null) {
            int v = r1.d();
            if(v == 9) {
                return true;
            }
            return v == 10 ? false : null;
        }
        return null;
    }

    private final int g7() throws IOException {
        if(this.a9 >= this.b9 && !this.B6()) {
            return this.y5();
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.D9[v];
        if(v1 > 0x20) {
            if(v1 != 35 && v1 != 0x2F) {
                return v1;
            }
            this.a9 = v;
            return this.h7();
        }
        switch(v1) {
            case 10: {
                ++this.d9;
                this.e9 = v + 1;
                break;
            }
            case 13: {
                this.Y6();
                break;
            }
            case 9: 
            case 0x20: {
                break;
            }
            default: {
                this.g5(v1);
            }
        }
        int v2;
        while((v2 = this.a9) < this.b9) {
            this.a9 = v2 + 1;
            int v3 = this.D9[v2];
            if(v3 > 0x20) {
                if(v3 != 35 && v3 != 0x2F) {
                    return v3;
                }
                this.a9 = v2;
                return this.h7();
            }
            switch(v3) {
                case 10: {
                    ++this.d9;
                    this.e9 = v2 + 1;
                    break;
                }
                case 13: {
                    this.Y6();
                    break;
                }
                case 9: 
                case 0x20: {
                    break;
                }
                default: {
                    this.g5(v3);
                }
            }
        }
        return this.h7();
    }

    @Override  // com.fasterxml.jackson.core.n
    public String h4() throws IOException {
        r r1;
        this.p9 = 0;
        r r0 = r.o;
        if(this.h == r0) {
            this.I6();
            return null;
        }
        if(this.I9) {
            this.f7();
        }
        int v = this.g7();
        if(v < 0) {
            this.close();
            this.h = null;
            return null;
        }
        this.o9 = null;
        if(v != 93 && v != 0x7D) {
            if(this.i9.z()) {
                v = this.c7(v);
                if((this.a & i.M9) != 0 && (v == 93 || v == 0x7D)) {
                    this.p6(v);
                    return null;
                }
            }
            if(!this.i9.m()) {
                this.j7();
                this.J6(v);
                return null;
            }
            this.k7();
            String s = v == 34 ? this.O6() : this.w6(v);
            this.i9.D(s);
            this.h = r0;
            int v1 = this.Z6();
            this.j7();
            switch(v1) {
                case 34: {
                    this.I9 = true;
                    this.j9 = r.q;
                    return s;
                }
                case 43: {
                    r1 = this.a4(e.k.f()) ? this.R6(false) : this.y6(43);
                    break;
                }
                case 45: {
                    r1 = this.R6(true);
                    break;
                }
                case 46: {
                    r1 = this.N6(false);
                    break;
                }
                case 0x30: 
                case 49: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: {
                    r1 = this.S6(v1);
                    break;
                }
                case 91: {
                    r1 = r.m;
                    break;
                }
                case 102: {
                    this.D6();
                    r1 = r.u;
                    break;
                }
                case 110: {
                    this.E6();
                    r1 = r.v;
                    break;
                }
                case 0x74: {
                    this.H6();
                    r1 = r.t;
                    break;
                }
                case 0x7B: {
                    r1 = r.k;
                    break;
                }
                default: {
                    r1 = this.y6(v1);
                    break;
                }
            }
            this.j9 = r1;
            return s;
        }
        this.p6(v);
        return null;
    }

    private int h7() throws IOException {
        while(true) {
            if(this.a9 >= this.b9 && !this.B6()) {
                return this.y5();
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.D9[v];
            if(v2 > 0x20) {
                switch(v2) {
                    case 35: {
                        if(this.i7()) {
                            continue;
                        }
                        return 35;
                    }
                    case 0x2F: {
                        this.d7();
                        continue;
                    }
                    default: {
                        return v2;
                    }
                }
            }
            switch(v2) {
                case 10: {
                    ++this.d9;
                    this.e9 = v1;
                    continue;
                }
                case 13: {
                    break;
                }
                case 9: 
                case 0x20: {
                    continue;
                }
                default: {
                    this.g5(v2);
                    continue;
                }
            }
            this.Y6();
        }
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public l i3() {
        return this.h == r.o ? new l(this.s5(), -1L, this.c9 + (this.J9 - 1L), this.K9, this.L9) : new l(this.s5(), -1L, this.f9 - 1L, this.g9, this.h9);
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean i4(w w0) throws IOException {
        int v = 0;
        this.p9 = 0;
        if(this.h == r.o) {
            this.I6();
            return false;
        }
        if(this.I9) {
            this.f7();
        }
        int v1 = this.g7();
        if(v1 < 0) {
            this.close();
            this.h = null;
            return false;
        }
        this.o9 = null;
        if(v1 != 93 && v1 != 0x7D) {
            if(this.i9.z()) {
                v1 = this.c7(v1);
                if((this.a & i.M9) != 0 && (v1 == 93 || v1 == 0x7D)) {
                    this.p6(v1);
                    return false;
                }
            }
            if(!this.i9.m()) {
                this.j7();
                this.J6(v1);
                return false;
            }
            this.k7();
            if(v1 == 34) {
                char[] arr_c = w0.c();
                int v2 = this.a9;
                if(v2 + arr_c.length + 4 < this.b9) {
                    int v3 = arr_c.length + v2;
                    if(this.D9[v3] == 34) {
                        while(true) {
                            if(v2 == v3) {
                                this.i9.D(w0.getValue());
                                this.A6(this.b7(v2 + 1));
                                return true;
                            }
                            if(arr_c[v] != this.D9[v2]) {
                                break;
                            }
                            ++v;
                            ++v2;
                        }
                    }
                }
            }
            return this.z6(v1, w0.getValue());
        }
        this.p6(v1);
        return false;
    }

    private boolean i7() throws IOException {
        if((this.a & i.T9) == 0) {
            return false;
        }
        this.e7();
        return true;
    }

    @Override  // com.fasterxml.jackson.core.n
    public final int j4(int v) throws IOException {
        if(this.h == r.o) {
            this.m9 = false;
            r r0 = this.j9;
            this.j9 = null;
            this.h = r0;
            if(r0 == r.r) {
                return this.Q1();
            }
            if(r0 == r.m) {
                this.Z5(this.g9, this.h9);
                return v;
            }
            if(r0 == r.k) {
                this.a6(this.g9, this.h9);
            }
            return v;
        }
        return this.m4() == r.r ? this.Q1() : v;
    }

    private final void j7() {
        this.f9 = this.c9 + ((long)this.a9);
        this.g9 = this.d9;
        this.h9 = this.a9 - this.e9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public final long k4(long v) throws IOException {
        if(this.h == r.o) {
            this.m9 = false;
            r r0 = this.j9;
            this.j9 = null;
            this.h = r0;
            if(r0 == r.r) {
                return this.e2();
            }
            if(r0 == r.m) {
                this.Z5(this.g9, this.h9);
                return v;
            }
            if(r0 == r.k) {
                this.a6(this.g9, this.h9);
            }
            return v;
        }
        return this.m4() == r.r ? this.e2() : v;
    }

    private final void k7() {
        this.J9 = (long)this.a9;
        this.K9 = this.d9;
        this.L9 = this.a9 - this.e9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public final String l4() throws IOException {
        if(this.h == r.o) {
            this.m9 = false;
            r r0 = this.j9;
            this.j9 = null;
            this.h = r0;
            if(r0 == r.q) {
                if(this.I9) {
                    this.I9 = false;
                    this.z5();
                }
                return this.k9.q();
            }
            if(r0 == r.m) {
                this.Z5(this.g9, this.h9);
                return null;
            }
            if(r0 == r.k) {
                this.a6(this.g9, this.h9);
            }
            return null;
        }
        return this.m4() == r.q ? this.R2() : null;
    }

    private char l7() throws IOException {
        if(this.a9 >= this.b9 && !this.B6()) {
            return '0';
        }
        char c = this.D9[this.a9];
        if(c >= 0x30 && c <= 57) {
            if((this.a & i.N9) == 0) {
                this.i5("Leading zeroes not allowed");
            }
            ++this.a9;
            if(c == 0x30) {
                while(this.a9 < this.b9 || this.B6()) {
                    int v = this.a9;
                    c = this.D9[v];
                    if(c >= 0x30 && c <= 57) {
                        this.a9 = v + 1;
                        if(c == 0x30) {
                            continue;
                        }
                        return c;
                    }
                    return '0';
                }
            }
            return c;
        }
        return '0';
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public final r m4() throws IOException {
        r r1;
        r r0 = r.o;
        if(this.h == r0) {
            return this.I6();
        }
        this.p9 = 0;
        if(this.I9) {
            this.f7();
        }
        int v = this.g7();
        if(v < 0) {
            this.close();
            this.h = null;
            return null;
        }
        this.o9 = null;
        if(v != 93 && v != 0x7D) {
            if(this.i9.z()) {
                v = this.c7(v);
                if((this.a & i.M9) != 0 && (v == 93 || v == 0x7D)) {
                    this.p6(v);
                    return this.h;
                }
            }
            boolean z = this.i9.m();
            if(z) {
                this.k7();
                String s = v == 34 ? this.O6() : this.w6(v);
                this.i9.D(s);
                this.h = r0;
                v = this.Z6();
            }
            this.j7();
            switch(v) {
                case 34: {
                    this.I9 = true;
                    r1 = r.q;
                    break;
                }
                case 43: {
                    r1 = this.a4(e.k.f()) ? this.R6(false) : this.y6(43);
                    break;
                }
                case 45: {
                    r1 = this.R6(true);
                    break;
                }
                case 46: {
                    r1 = this.N6(false);
                    break;
                }
                case 0x30: 
                case 49: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: {
                    r1 = this.S6(v);
                    break;
                }
                case 91: {
                    if(!z) {
                        this.Z5(this.g9, this.h9);
                    }
                    r1 = r.m;
                    break;
                }
                case 102: {
                    this.D6();
                    r1 = r.u;
                    break;
                }
                case 110: {
                    this.E6();
                    r1 = r.v;
                    break;
                }
                case 0x74: {
                    this.H6();
                    r1 = r.t;
                    break;
                }
                case 0x7B: {
                    if(!z) {
                        this.a6(this.g9, this.h9);
                    }
                    r1 = r.k;
                    break;
                }
                case 0x7D: {
                    this.d5(0x7D, "expected a value");
                    this.H6();
                    r1 = r.t;
                    break;
                }
                default: {
                    r1 = this.y6(v);
                }
            }
            if(z) {
                this.j9 = r1;
                return this.h;
            }
            this.h = r1;
            return r1;
        }
        this.p6(v);
        return this.h;
    }

    private final char m7() throws IOException {
        int v = this.a9;
        if(v < this.b9) {
            int v1 = this.D9[v];
            return v1 >= 0x30 && v1 <= 57 ? this.l7() : '0';
        }
        return this.l7();
    }

    private final void n7(int v) throws IOException {
        int v1 = this.a9;
        this.a9 = v1 + 1;
        switch(v) {
            case 10: {
                ++this.d9;
                this.e9 = v1 + 1;
                break;
            }
            case 13: {
                this.a9 = v1;
                return;
            }
            case 9: 
            case 0x20: {
                break;
            }
            default: {
                this.c5(v);
            }
        }
    }

    private final void o6(String s, int v, int v1) throws IOException {
        if(Character.isJavaIdentifierPart(((char)v1))) {
            this.U6(s.substring(0, v));
        }
    }

    @Deprecated
    protected char o7(String s) throws IOException {
        return this.p7(s, null);
    }

    private void p6(int v) throws m {
        if(v == 93) {
            this.j7();
            if(!this.i9.l()) {
                this.O5(93, '}');
            }
            this.i9 = this.i9.u();
            this.h = r.n;
        }
        if(v == 0x7D) {
            this.j7();
            if(!this.i9.m()) {
                this.O5(0x7D, ']');
            }
            this.i9 = this.i9.u();
            this.h = r.l;
        }
    }

    protected char p7(String s, r r0) throws IOException {
        if(this.a9 >= this.b9 && !this.B6()) {
            this.Z4(s, r0);
        }
        int v = this.a9;
        this.a9 = v + 1;
        return this.D9[v];
    }

    protected byte[] q6(com.fasterxml.jackson.core.a a0) throws IOException {
        com.fasterxml.jackson.core.util.c c0 = this.C5();
        while(true) {
            if(this.a9 >= this.b9) {
                this.C6();
            }
            int v = this.a9;
            this.a9 = v + 1;
            int v1 = this.D9[v];
            if(v1 > 0x20) {
                int v2 = a0.h(((char)v1));
                if(v2 < 0) {
                    if(v1 == 34) {
                        return new byte[0];
                    }
                    v2 = this.v5(a0, ((char)v1), 0);
                    if(v2 >= 0) {
                        goto label_13;
                    }
                }
                else {
                label_13:
                    if(this.a9 >= this.b9) {
                        this.C6();
                    }
                    int v3 = this.a9;
                    this.a9 = v3 + 1;
                    int v4 = this.D9[v3];
                    int v5 = a0.h(((char)v4));
                    if(v5 < 0) {
                        v5 = this.v5(a0, ((char)v4), 1);
                    }
                    int v6 = v2 << 6 | v5;
                    if(this.a9 >= this.b9) {
                        this.C6();
                    }
                    int v7 = this.a9;
                    this.a9 = v7 + 1;
                    int v8 = this.D9[v7];
                    int v9 = a0.h(((char)v8));
                    if(v9 < 0) {
                        if(v9 != -2) {
                            if(v8 == 34) {
                                c0.b(v6 >> 4);
                                if(a0.C()) {
                                    --this.a9;
                                    this.H5(a0);
                                }
                                return new byte[0];
                            }
                            v9 = this.v5(a0, ((char)v8), 2);
                        }
                        if(v9 == -2) {
                            if(this.a9 >= this.b9) {
                                this.C6();
                            }
                            int v10 = this.a9;
                            this.a9 = v10 + 1;
                            int v11 = this.D9[v10];
                            if(!a0.F(((char)v11)) && this.v5(a0, ((char)v11), 3) != -2) {
                                throw this.j6(a0, v11, 3, "expected padding character \'" + a0.y() + "\'");
                            }
                            c0.b(v6 >> 4);
                            continue;
                        }
                    }
                    int v12 = v6 << 6 | v9;
                    if(this.a9 >= this.b9) {
                        this.C6();
                    }
                    int v13 = this.a9;
                    this.a9 = v13 + 1;
                    int v14 = this.D9[v13];
                    int v15 = a0.h(((char)v14));
                    if(v15 < 0) {
                        if(v15 != -2) {
                            if(v14 == 34) {
                                c0.f(v12 >> 2);
                                if(a0.C()) {
                                    --this.a9;
                                    this.H5(a0);
                                }
                                return new byte[0];
                            }
                            v15 = this.v5(a0, ((char)v14), 3);
                        }
                        if(v15 == -2) {
                            c0.f(v12 >> 2);
                            continue;
                        }
                    }
                    c0.e(v12 << 6 | v15);
                }
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        if(this.I9 && this.h == r.q) {
            byte[] arr_b = this.X8.e();
            try {
                return this.T6(a0, outputStream0, arr_b);
            }
            finally {
                this.X8.T(arr_b);
            }
        }
        byte[] arr_b1 = this.L0(a0);
        outputStream0.write(arr_b1);
        return arr_b1.length;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void r5() throws IOException {
        if(this.C9 != null) {
            if(this.X8.R() || this.a4(a.c)) {
                this.C9.close();
            }
            this.C9 = null;
        }
    }

    protected void r6() throws IOException {
        char[] arr_c = this.k9.B();
        int v = this.k9.C();
        int[] arr_v = i.U9;
    alab1:
        while(true) {
            if(this.a9 >= this.b9 && !this.B6()) {
                this.Z4(": was expecting closing quote for a string value", r.q);
            }
            int v1 = this.a9;
            this.a9 = v1 + 1;
            char c = this.D9[v1];
            if(c < arr_v.length && arr_v[c] != 0) {
                switch(c) {
                    case 34: {
                        break alab1;
                    }
                    case 92: {
                        c = this.x5();
                        break;
                    }
                    default: {
                        if(c < 0x20) {
                            this.Q5(((int)c), "string value");
                        }
                    }
                }
            }
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            arr_c[v] = c;
            ++v;
        }
        this.k9.P(v);
    }

    protected final String s6(r r0) throws IOException {
        if(r0 == null) {
            return null;
        }
        switch(r0.d()) {
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

    protected r t6() throws IOException {
        char[] arr_c = this.k9.s();
        int v;
        for(v = this.k9.C(); true; ++v) {
            if(this.a9 >= this.b9 && !this.B6()) {
                this.Z4(": was expecting closing quote for a string value", r.q);
            }
            int v1 = this.a9;
            this.a9 = v1 + 1;
            char c = this.D9[v1];
            if(c <= 92) {
                if(c == 92) {
                    c = this.x5();
                }
                else if(c <= 39) {
                    if(c == 39) {
                        break;
                    }
                    if(c < 0x20) {
                        this.Q5(((int)c), "string value");
                    }
                }
            }
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            arr_c[v] = c;
        }
        this.k9.P(v);
        return r.q;
    }

    @Override  // com.fasterxml.jackson.core.n
    public void u0() throws IOException {
        if(this.I9) {
            this.I9 = false;
            this.z5();
        }
    }

    protected r u6(int v, boolean z) throws IOException {
        return this.v6(v, z, false);
    }

    protected r v6(int v, boolean z, boolean z1) throws IOException {
        if(v == 73) {
            if(this.a9 >= this.b9 && !this.B6()) {
                this.b5(r.r);
            }
            int v1 = this.a9;
            this.a9 = v1 + 1;
            v = this.D9[v1];
            double f = Infinity;
            if(v == 78) {
                this.F6((z ? "-INF" : "+INF"), 3);
                if((this.a & i.O9) != 0) {
                    if(z) {
                        f = -Infinity;
                    }
                    return this.l6((z ? "-INF" : "+INF"), f);
                }
                this.T4("Non-standard token \'" + (z ? "-INF" : "+INF") + "\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            }
            else if(v == 110) {
                this.F6((z ? "-Infinity" : "+Infinity"), 3);
                if((this.a & i.O9) != 0) {
                    if(z) {
                        f = -Infinity;
                    }
                    return this.l6((z ? "-Infinity" : "+Infinity"), f);
                }
                this.T4("Non-standard token \'" + (z ? "-Infinity" : "+Infinity") + "\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            }
        }
        if(!this.a4(e.k.f()) && z1 && !z) {
            this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        this.e5(v, (z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value"));
        return null;
    }

    protected String w6(int v) throws IOException {
        boolean z;
        if(v == 39 && (this.a & i.Q9) != 0) {
            return this.K6();
        }
        if((this.a & i.R9) == 0) {
            this.d5(v, "was expecting double-quote to start field name");
        }
        int[] arr_v = com.fasterxml.jackson.core.io.c.k();
        if(v >= arr_v.length) {
            z = Character.isJavaIdentifierPart(((char)v));
        }
        else if(arr_v[v] == 0) {
            z = true;
        }
        else {
            z = false;
        }
        if(!z) {
            this.d5(v, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int v1 = this.a9;
        int v2 = this.H9;
        int v3 = this.b9;
        if(v1 < v3) {
            while(true) {
                char[] arr_c = this.D9;
                int v4 = arr_c[v1];
                if(v4 < arr_v.length) {
                    if(arr_v[v4] != 0) {
                        int v5 = this.a9 - 1;
                        this.a9 = v1;
                        return this.G9.p(arr_c, v5, v1 - v5, v2);
                    }
                }
                else if(!Character.isJavaIdentifierPart(((char)v4))) {
                    int v6 = this.a9 - 1;
                    this.a9 = v1;
                    return this.G9.p(this.D9, v6, v1 - v6, v2);
                }
                v2 = v2 * 33 + v4;
                ++v1;
                if(v1 >= v3) {
                    break;
                }
            }
        }
        int v7 = this.a9 - 1;
        this.a9 = v1;
        return this.x6(v7, v2, arr_v);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected char x5() throws IOException {
        if(this.a9 >= this.b9 && !this.B6()) {
            this.Z4(" in character escape sequence", r.q);
        }
        int v = this.a9;
        this.a9 = v + 1;
        char c = this.D9[v];
        switch(c) {
            case 34: 
            case 0x2F: 
            case 92: {
                return c;
            }
            case 98: {
                return '\b';
            }
            case 102: {
                return '\f';
            }
            case 110: {
                return '\n';
            }
            case 0x72: {
                return '\r';
            }
            case 0x74: {
                return '\t';
            }
            case 0x75: {
                int v1 = 0;
                for(int v2 = 0; v2 < 4; ++v2) {
                    if(this.a9 >= this.b9 && !this.B6()) {
                        this.Z4(" in character escape sequence", r.q);
                    }
                    int v3 = this.a9;
                    this.a9 = v3 + 1;
                    int v4 = this.D9[v3];
                    int v5 = com.fasterxml.jackson.core.io.c.b(v4);
                    if(v5 < 0) {
                        this.d5(v4, "expected a hex-digit for character escape sequence");
                    }
                    v1 = v1 << 4 | v5;
                }
                return (char)v1;
            }
            default: {
                return this.I5(c);
            }
        }
    }

    private String x6(int v, int v1, int[] arr_v) throws IOException {
        this.k9.L(this.D9, v, this.a9 - v);
        char[] arr_c = this.k9.B();
        int v2 = this.k9.C();
        while(this.a9 < this.b9 || this.B6()) {
            char c = this.D9[this.a9];
            if(c >= arr_v.length) {
                if(Character.isJavaIdentifierPart(c)) {
                    goto label_9;
                }
                break;
            }
            else if(arr_v[c] != 0) {
                break;
            }
        label_9:
            ++this.a9;
            v1 = v1 * 33 + c;
            arr_c[v2] = c;
            if(v2 + 1 >= arr_c.length) {
                arr_c = this.k9.y();
                v2 = 0;
            }
            else {
                ++v2;
            }
        }
        this.k9.P(v2);
        char[] arr_c1 = this.k9.D();
        int v3 = this.k9.E();
        int v4 = this.k9.Q();
        return this.G9.p(arr_c1, v3, v4, v1);
    }

    protected r y6(int v) throws IOException {
        switch(v) {
            case 39: {
                if((this.a & i.Q9) != 0) {
                    return this.t6();
                }
                break;
            }
            case 43: {
                if(this.a9 >= this.b9 && !this.B6()) {
                    this.b5(r.r);
                }
                int v1 = this.a9;
                this.a9 = v1 + 1;
                return this.v6(((int)this.D9[v1]), false, true);
            }
            case 44: {
            label_8:
                if(!this.i9.n() && (this.a & i.P9) != 0) {
                    --this.a9;
                    return r.v;
                }
                break;
            }
            case 73: {
                this.F6("Infinity", 1);
                if((this.a & i.O9) != 0) {
                    return this.l6("Infinity", Infinity);
                }
                this.T4("Non-standard token \'Infinity\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break;
            }
            case 78: {
                this.F6("NaN", 1);
                if((this.a & i.O9) != 0) {
                    return this.l6("NaN", NaN);
                }
                this.T4("Non-standard token \'NaN\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break;
            }
            case 93: {
                if(this.i9.l()) {
                    goto label_8;
                }
            }
        }
        if(Character.isJavaIdentifierStart(v)) {
            this.V6("" + ((char)v), this.R5());
        }
        this.d5(v, "expected a valid value " + this.S5());
        return null;
    }

    @Override  // com.fasterxml.jackson.core.n
    public int z4(Writer writer0) throws IOException {
        int v = this.a9;
        int v1 = this.b9 - v;
        if(v1 < 1) {
            return 0;
        }
        this.a9 = v + v1;
        writer0.write(this.D9, v, v1);
        return v1;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected final void z5() throws IOException {
        int v = this.a9;
        int v1 = this.b9;
        if(v < v1) {
            int[] arr_v = i.U9;
            while(true) {
                char[] arr_c = this.D9;
                int v2 = arr_c[v];
                if(v2 < arr_v.length && arr_v[v2] != 0) {
                    if(v2 != 34) {
                        break;
                    }
                    this.k9.L(arr_c, this.a9, v - this.a9);
                    this.a9 = v + 1;
                    return;
                }
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
        this.k9.J(this.D9, this.a9, v - this.a9);
        this.a9 = v;
        this.r6();
    }

    protected boolean z6(int v, String s) throws IOException {
        r r0;
        String s1 = v == 34 ? this.O6() : this.w6(v);
        this.i9.D(s1);
        this.h = r.o;
        int v1 = this.Z6();
        this.j7();
        switch(v1) {
            case 34: {
                this.I9 = true;
                this.j9 = r.q;
                return s.equals(s1);
            }
            case 43: {
                r0 = this.a4(e.k.f()) ? this.R6(false) : this.y6(43);
                break;
            }
            case 45: {
                r0 = this.R6(true);
                break;
            }
            case 46: {
                r0 = this.N6(false);
                break;
            }
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                r0 = this.S6(v1);
                break;
            }
            case 91: {
                r0 = r.m;
                break;
            }
            case 102: {
                this.D6();
                r0 = r.u;
                break;
            }
            case 110: {
                this.E6();
                r0 = r.v;
                break;
            }
            case 0x74: {
                this.H6();
                r0 = r.t;
                break;
            }
            case 0x7B: {
                r0 = r.k;
                break;
            }
            default: {
                r0 = this.y6(v1);
                break;
            }
        }
        this.j9 = r0;
        return s.equals(s1);
    }
}

