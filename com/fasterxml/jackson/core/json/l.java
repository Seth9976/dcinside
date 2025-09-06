package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.base.c;
import com.fasterxml.jackson.core.base.d;
import com.fasterxml.jackson.core.exc.b;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.sym.a;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class l extends c {
    protected u C9;
    protected final a D9;
    protected int[] E9;
    protected boolean F9;
    private int G9;
    protected int H9;
    protected int I9;
    protected int J9;
    protected InputStream K9;
    protected byte[] L9;
    protected boolean M9;
    static final byte N9 = 10;
    private static final int O9;
    private static final int P9;
    private static final int Q9;
    private static final int R9;
    private static final int S9;
    private static final int T9;
    private static final int U9;
    private static final int V9;
    private static final int[] W9;
    protected static final int[] X9;

    static {
        l.O9 = com.fasterxml.jackson.core.n.a.p.d();
        l.P9 = com.fasterxml.jackson.core.n.a.j.d();
        l.Q9 = com.fasterxml.jackson.core.n.a.n.d();
        l.R9 = com.fasterxml.jackson.core.n.a.o.d();
        l.S9 = com.fasterxml.jackson.core.n.a.g.d();
        l.T9 = com.fasterxml.jackson.core.n.a.f.d();
        l.U9 = com.fasterxml.jackson.core.n.a.d.d();
        l.V9 = com.fasterxml.jackson.core.n.a.e.d();
        l.W9 = com.fasterxml.jackson.core.io.c.l();
        l.X9 = com.fasterxml.jackson.core.io.c.j();
    }

    public l(g g0, int v, InputStream inputStream0, u u0, a a0, byte[] arr_b, int v1, int v2, int v3, boolean z) {
        super(g0, v);
        this.E9 = new int[16];
        this.K9 = inputStream0;
        this.C9 = u0;
        this.D9 = a0;
        this.L9 = arr_b;
        this.a9 = v1;
        this.b9 = v2;
        this.e9 = v1 - v3;
        this.c9 = (long)(v3 - v1);
        this.M9 = z;
    }

    @Deprecated
    public l(g g0, int v, InputStream inputStream0, u u0, a a0, byte[] arr_b, int v1, int v2, boolean z) {
        this(g0, v, inputStream0, u0, a0, arr_b, v1, v2, 0, z);
    }

    protected final String A6(r r0) throws IOException {
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

    private final int A7() throws IOException {
        if(this.a9 >= this.b9 && !this.I6()) {
            return 0x30;
        }
        int v = this.L9[this.a9] & 0xFF;
        if(v >= 0x30 && v <= 57) {
            if((this.a & l.P9) == 0) {
                this.i5("Leading zeroes not allowed");
            }
            ++this.a9;
            if(v == 0x30) {
                while(this.a9 < this.b9 || this.I6()) {
                    int v1 = this.a9;
                    v = this.L9[v1] & 0xFF;
                    if(v >= 0x30 && v <= 57) {
                        this.a9 = v1 + 1;
                        if(v == 0x30) {
                            continue;
                        }
                        return v;
                    }
                    return 0x30;
                }
            }
            return v;
        }
        return 0x30;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int B3(int v) throws IOException {
        if(this.h != r.r && this.h != r.s) {
            return super.B3(v);
        }
        int v1 = this.p9;
        if((v1 & 1) == 0) {
            if(v1 == 0) {
                return this.J5();
            }
            if((v1 & 1) == 0) {
                this.X5();
            }
        }
        return this.q9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public void B4(u u0) {
        this.C9 = u0;
    }

    protected r B6() throws IOException {
        char[] arr_c = this.k9.s();
        int[] arr_v = l.W9;
        byte[] arr_b = this.L9;
        int v = 0;
    alab1:
        while(true) {
            if(this.a9 >= this.b9) {
                this.J6();
            }
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            int v1 = this.b9;
            int v2 = this.a9 + (arr_c.length - v);
            if(v2 < v1) {
                v1 = v2;
            }
            int v3;
            while((v3 = this.a9) < v1) {
                this.a9 = v3 + 1;
                int v4 = arr_b[v3] & 0xFF;
                if(v4 == 39) {
                    break alab1;
                }
                int v5 = arr_v[v4];
                if(v5 != 0 && v4 != 34) {
                    switch(v5) {
                        case 1: {
                            v4 = this.x5();
                            break;
                        }
                        case 2: {
                            v4 = this.u6(v4);
                            break;
                        }
                        case 3: {
                            v4 = this.b9 - (v3 + 1) >= 2 ? this.w6(v4) : this.v6(v4);
                            break;
                        }
                        case 4: {
                            int v6 = this.x6(v4);
                            arr_c[v] = (char)(v6 >> 10 | 0xD800);
                            if(v + 1 >= arr_c.length) {
                                arr_c = this.k9.y();
                                v = 0;
                            }
                            else {
                                ++v;
                            }
                            v4 = 0xDC00 | v6 & 0x3FF;
                            break;
                        }
                        default: {
                            if(v4 < 0x20) {
                                this.Q5(v4, "string value");
                            }
                            this.b7(v4);
                        }
                    }
                    if(v >= arr_c.length) {
                        arr_c = this.k9.y();
                        v = 0;
                    }
                    arr_c[v] = (char)v4;
                    ++v;
                    break;
                }
                arr_c[v] = (char)v4;
                ++v;
            }
        }
        this.k9.P(v);
        return r.q;
    }

    private final void B7(int v) throws IOException {
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

    @Override  // com.fasterxml.jackson.core.n
    public i C2() {
        return c.B9;
    }

    protected r C6(int v, boolean z) throws IOException {
        return this.D6(v, z, false);
    }

    private final String C7(int[] arr_v, int v, int v1) throws m, b {
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
                    this.c7(v7);
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
                    this.d7(v11);
                }
                int v12 = v9 << 6 | v11 & 0x3F;
                if(v10 > 1) {
                    int v13 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                    v8 = v4 + 3;
                    if((v13 & 0xC0) != 0x80) {
                        this.d7(v13);
                    }
                    v12 = v12 << 6 | v13 & 0x3F;
                    if(v10 > 2) {
                        int v14 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                        v8 = v4 + 4;
                        if((v14 & 0xC0) != 0x80) {
                            this.d7(v14 & 0xFF);
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
        if(v1 < 4) {
            arr_v[v - 1] = v3;
        }
        return this.D9.s(s, arr_v, v);
    }

    protected r D6(int v, boolean z, boolean z1) throws IOException {
        String s;
        while(v == 73) {
            if(this.a9 >= this.b9 && !this.I6()) {
                this.b5(r.s);
            }
            int v1 = this.a9;
            this.a9 = v1 + 1;
            v = this.L9[v1];
            if(v != 78) {
                if(v != 110) {
                    break;
                }
                s = z ? "-Infinity" : "+Infinity";
            }
            else if(z) {
                s = "-INF";
            }
            else {
                s = "+INF";
            }
            this.M6(s, 3);
            if((this.a & l.Q9) != 0) {
                return z ? this.l6(s, -Infinity) : this.l6(s, Infinity);
            }
            this.U4("Non-standard token \'%s\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", s);
        }
        if(!this.a4(e.k.f()) && z1 && !z) {
            this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        this.e5(v, (z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value"));
        return null;
    }

    private final String D7(int v, int v1) throws m, b {
        int v2 = l.R6(v, v1);
        String s = this.D9.A(v2);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.E9;
        arr_v[0] = v2;
        return this.C7(arr_v, 1, v1);
    }

    protected String E6(int v) throws IOException {
        if(v == 39 && (this.a & l.S9) != 0) {
            return this.S6();
        }
        if((this.a & l.T9) == 0) {
            this.d5(((int)(((char)this.t6(v)))), "was expecting double-quote to start field name");
        }
        int[] arr_v = com.fasterxml.jackson.core.io.c.m();
        if(arr_v[v] != 0) {
            this.d5(v, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] arr_v1 = this.E9;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(v3 < 4) {
                ++v3;
                v2 = v | v2 << 8;
            }
            else {
                if(v1 >= arr_v1.length) {
                    arr_v1 = this.G5(arr_v1, arr_v1.length);
                    this.E9 = arr_v1;
                }
                arr_v1[v1] = v2;
                v2 = v;
                ++v1;
                v3 = 1;
            }
            if(this.a9 >= this.b9 && !this.I6()) {
                this.Z4(" in field name", r.o);
            }
            int v4 = this.a9;
            v = this.L9[v4] & 0xFF;
            if(arr_v[v] != 0) {
                break;
            }
            this.a9 = v4 + 1;
        }
        if(v3 > 0) {
            if(v1 >= arr_v1.length) {
                arr_v1 = this.G5(arr_v1, arr_v1.length);
                this.E9 = arr_v1;
            }
            arr_v1[v1] = v2;
            ++v1;
        }
        String s = this.D9.D(arr_v1, v1);
        return s == null ? this.C7(arr_v1, v1, v3) : s;
    }

    private final String E7(int v, int v1, int v2) throws m, b {
        int v3 = l.R6(v1, v2);
        String s = this.D9.B(v, v3);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.E9;
        arr_v[0] = v;
        arr_v[1] = v3;
        return this.C7(arr_v, 2, v2);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String F3() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                return this.y6();
            }
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(null);
    }

    protected r F6(int v) throws IOException {
        switch(v) {
            case 39: {
            label_25:
                if((this.a & l.S9) != 0) {
                    return this.B6();
                }
                break;
            }
            case 43: {
                if(this.a9 >= this.b9 && !this.I6()) {
                    this.b5(r.r);
                }
                int v1 = this.a9;
                this.a9 = v1 + 1;
                return this.D6(this.L9[v1] & 0xFF, false, true);
            }
            case 44: {
            label_8:
                if(!this.i9.n() && (this.a & l.R9) != 0) {
                    --this.a9;
                    return r.v;
                }
                this.d5(v, "expected a value");
                goto label_25;
            }
            case 73: {
                this.M6("Infinity", 1);
                if((this.a & l.Q9) != 0) {
                    return this.l6("Infinity", Infinity);
                }
                this.T4("Non-standard token \'Infinity\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break;
            }
            case 78: {
                this.M6("NaN", 1);
                if((this.a & l.Q9) != 0) {
                    return this.l6("NaN", NaN);
                }
                this.T4("Non-standard token \'NaN\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break;
            }
            case 93: {
                if(this.i9.l()) {
                    goto label_8;
                }
                break;
            }
            case 0x7D: {
                this.d5(0x7D, "expected a value");
                goto label_25;
            }
        }
        if(Character.isJavaIdentifierStart(v)) {
            this.h7("" + ((char)v), this.R5());
        }
        this.d5(v, "expected a valid value " + this.S5());
        return null;
    }

    private final String F7(int v, int v1, int v2, int v3) throws m, b {
        int v4 = l.R6(v2, v3);
        String s = this.D9.C(v, v1, v4);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.E9;
        arr_v[0] = v;
        arr_v[1] = v1;
        arr_v[2] = l.R6(v4, v3);
        return this.C7(arr_v, 3, v3);
    }

    private final boolean G6(int v, w w0) throws IOException {
        r r0;
        String s = this.W6(v);
        this.i9.D(s);
        boolean z = s.equals(w0.getValue());
        this.h = r.o;
        int v1 = this.k7();
        this.y7();
        switch(v1) {
            case 34: {
                this.F9 = true;
                this.j9 = r.q;
                return z;
            }
            case 43: {
                r0 = this.a4(e.k.f()) ? this.Y6(false) : this.F6(43);
                break;
            }
            case 45: {
                r0 = this.Y6(true);
                break;
            }
            case 46: {
                r0 = this.V6(false, false);
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
                r0 = this.Z6(v1);
                break;
            }
            case 91: {
                r0 = r.m;
                break;
            }
            case 102: {
                this.K6();
                r0 = r.u;
                break;
            }
            case 110: {
                this.L6();
                r0 = r.v;
                break;
            }
            case 0x74: {
                this.O6();
                r0 = r.t;
                break;
            }
            case 0x7B: {
                r0 = r.k;
                break;
            }
            default: {
                r0 = this.F6(v1);
                break;
            }
        }
        this.j9 = r0;
        return z;
    }

    private final String G7(int[] arr_v, int v, int v1, int v2) throws m, b {
        if(v >= arr_v.length) {
            arr_v = this.G5(arr_v, arr_v.length);
            this.E9 = arr_v;
        }
        arr_v[v] = l.R6(v1, v2);
        String s = this.D9.D(arr_v, v + 1);
        return s == null ? this.C7(arr_v, v + 1, v2) : s;
    }

    private final void H6(int v) throws IOException {
        this.h = r.o;
        this.y7();
        switch(v) {
            case 34: {
                this.F9 = true;
                this.j9 = r.q;
                return;
            }
            case 43: {
                if(this.a4(e.k.f())) {
                    this.j9 = this.Y6(false);
                    return;
                }
                this.j9 = this.F6(43);
                return;
            }
            case 45: {
                this.j9 = this.Y6(true);
                return;
            }
            case 46: {
                this.j9 = this.V6(false, false);
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
                this.j9 = this.Z6(v);
                return;
            }
            case 91: {
                this.j9 = r.m;
                return;
            }
            case 102: {
                this.K6();
                this.j9 = r.u;
                return;
            }
            case 110: {
                this.L6();
                this.j9 = r.v;
                return;
            }
            case 0x74: {
                this.O6();
                this.j9 = r.t;
                return;
            }
            case 0x7B: {
                this.j9 = r.k;
                return;
            }
            default: {
                this.j9 = this.F6(v);
            }
        }
    }

    private int H7() throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v = this.a9;
        this.a9 = v + 1;
        return this.L9[v] & 0xFF;
    }

    protected final boolean I6() throws IOException {
        if(this.K9 != null) {
            int v = this.L9.length;
            if(v == 0) {
                return false;
            }
            int v1 = this.b9;
            this.c9 += (long)v1;
            this.e9 -= v1;
            this.J4().n(this.c9);
            int v2 = this.K9.read(this.L9, 0, v);
            if(v2 > 0) {
                this.H9 -= v1;
                this.a9 = 0;
                this.b9 = v2;
                return true;
            }
            this.b9 = 0;
            this.a9 = 0;
            this.r5();
            if(v2 == 0) {
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.L9.length + " bytes");
            }
        }
        return false;
    }

    protected final String I7(int[] arr_v, int v, int v1, int v2, int v3) throws IOException {
        int[] arr_v1 = l.X9;
    alab1:
        while(true) {
            if(arr_v1[v2] != 0) {
                switch(v2) {
                    case 34: {
                        break alab1;
                    }
                    case 92: {
                        v2 = this.x5();
                    label_6:
                        int v4 = 0;
                        if(v2 > 0x7F) {
                            if(v3 >= 4) {
                                if(v >= arr_v.length) {
                                    arr_v = this.G5(arr_v, arr_v.length);
                                    this.E9 = arr_v;
                                }
                                arr_v[v] = v1;
                                ++v;
                                v1 = 0;
                                v3 = 0;
                            }
                            if(v2 < 0x800) {
                                v1 = v1 << 8 | (v2 >> 6 | 0xC0);
                                ++v3;
                            }
                            else {
                                int v5 = v1 << 8 | (v2 >> 12 | 0xE0);
                                int v6 = v3 + 1;
                                if(v6 >= 4) {
                                    if(v >= arr_v.length) {
                                        arr_v = this.G5(arr_v, arr_v.length);
                                        this.E9 = arr_v;
                                    }
                                    arr_v[v] = v5;
                                    ++v;
                                    v6 = 0;
                                }
                                else {
                                    v4 = v5;
                                }
                                v1 = v4 << 8 | (v2 >> 6 & 0x3F | 0x80);
                                v3 = v6 + 1;
                            }
                            v2 = v2 & 0x3F | 0x80;
                        }
                        break;
                    }
                    default: {
                        this.Q5(v2, "name");
                        goto label_6;
                    }
                }
            }
            if(v3 < 4) {
                ++v3;
                v1 = v1 << 8 | v2;
            }
            else {
                if(v >= arr_v.length) {
                    arr_v = this.G5(arr_v, arr_v.length);
                    this.E9 = arr_v;
                }
                arr_v[v] = v1;
                v1 = v2;
                ++v;
                v3 = 1;
            }
            if(this.a9 >= this.b9 && !this.I6()) {
                this.Z4(" in field name", r.o);
            }
            int v7 = this.a9;
            this.a9 = v7 + 1;
            v2 = this.L9[v7] & 0xFF;
        }
        if(v3 > 0) {
            if(v >= arr_v.length) {
                arr_v = this.G5(arr_v, arr_v.length);
                this.E9 = arr_v;
            }
            arr_v[v] = l.R6(v1, v3);
            ++v;
        }
        String s = this.D9.D(arr_v, v);
        return s == null ? this.C7(arr_v, v, v3) : s;
    }

    protected void J6() throws IOException {
        if(!this.I6()) {
            this.X4();
        }
    }

    protected final String J7(int v, int v1, int v2) throws IOException {
        int[] arr_v = this.E9;
        arr_v[0] = this.G9;
        arr_v[1] = v1;
        arr_v[2] = v2;
        byte[] arr_b = this.L9;
        int[] arr_v1 = l.X9;
        int v3 = v;
        int v4;
        for(v4 = 3; true; ++v4) {
            int v5 = this.a9;
            if(v5 + 4 > this.b9) {
                break;
            }
            this.a9 = v5 + 1;
            int v6 = arr_b[v5] & 0xFF;
            if(arr_v1[v6] != 0) {
                return v6 == 34 ? this.G7(this.E9, v4, v3, 1) : this.I7(this.E9, v4, v3, v6, 1);
            }
            int v7 = v3 << 8 | v6;
            this.a9 = v5 + 2;
            int v8 = arr_b[v5 + 1] & 0xFF;
            if(arr_v1[v8] != 0) {
                return v8 == 34 ? this.G7(this.E9, v4, v7, 2) : this.I7(this.E9, v4, v7, v8, 2);
            }
            int v9 = v7 << 8 | v8;
            this.a9 = v5 + 3;
            int v10 = arr_b[v5 + 2] & 0xFF;
            if(arr_v1[v10] != 0) {
                return v10 == 34 ? this.G7(this.E9, v4, v9, 3) : this.I7(this.E9, v4, v9, v10, 3);
            }
            int v11 = v9 << 8 | v10;
            this.a9 = v5 + 4;
            int v12 = arr_b[v5 + 3] & 0xFF;
            if(arr_v1[v12] != 0) {
                return v12 == 34 ? this.G7(this.E9, v4, v11, 4) : this.I7(this.E9, v4, v11, v12, 4);
            }
            int[] arr_v2 = this.E9;
            if(v4 >= arr_v2.length) {
                this.E9 = this.G5(arr_v2, v4);
            }
            this.E9[v4] = v11;
            v3 = v12;
        }
        return this.I7(this.E9, v4, 0, v3, 0);
    }

    protected final void K6() throws IOException {
        int v = this.a9;
        if(v + 4 < this.b9) {
            byte[] arr_b = this.L9;
            if(arr_b[v] == 97 && arr_b[v + 1] == 108 && arr_b[v + 2] == 0x73 && arr_b[v + 3] == 101) {
                int v1 = arr_b[v + 4] & 0xFF;
                if(v1 < 0x30 || (v1 == 93 || v1 == 0x7D)) {
                    this.a9 = v + 4;
                    return;
                }
            }
        }
        this.N6("false", 1);
    }

    protected final String K7(int v) throws IOException {
        byte[] arr_b = this.L9;
        int[] arr_v = l.X9;
        int v1 = this.a9;
        this.a9 = v1 + 1;
        int v2 = arr_b[v1] & 0xFF;
        if(arr_v[v2] != 0) {
            return v2 == 34 ? this.E7(this.G9, v, 1) : this.N7(this.G9, v, v2, 1);
        }
        int v3 = v << 8 | v2;
        this.a9 = v1 + 2;
        int v4 = arr_b[v1 + 1] & 0xFF;
        if(arr_v[v4] != 0) {
            return v4 == 34 ? this.E7(this.G9, v3, 2) : this.N7(this.G9, v3, v4, 2);
        }
        int v5 = v3 << 8 | v4;
        this.a9 = v1 + 3;
        int v6 = arr_b[v1 + 2] & 0xFF;
        if(arr_v[v6] != 0) {
            return v6 == 34 ? this.E7(this.G9, v5, 3) : this.N7(this.G9, v5, v6, 3);
        }
        int v7 = v5 << 8 | v6;
        this.a9 = v1 + 4;
        int v8 = arr_b[v1 + 3] & 0xFF;
        if(arr_v[v8] != 0) {
            return v8 == 34 ? this.E7(this.G9, v7, 4) : this.N7(this.G9, v7, v8, 4);
        }
        return this.L7(v8, v7);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        if(this.h != r.q && (this.h != r.p || this.o9 == null)) {
            this.T4("Current token (" + this.h + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if(this.F9) {
            try {
                this.o9 = this.s6(a0);
                this.F9 = false;
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

    protected final void L6() throws IOException {
        int v = this.a9;
        if(v + 3 < this.b9) {
            byte[] arr_b = this.L9;
            if(arr_b[v] == 0x75 && arr_b[v + 1] == 108 && arr_b[v + 2] == 108) {
                int v1 = arr_b[v + 3] & 0xFF;
                if(v1 < 0x30 || (v1 == 93 || v1 == 0x7D)) {
                    this.a9 = v + 3;
                    return;
                }
            }
        }
        this.N6("null", 1);
    }

    protected final String L7(int v, int v1) throws IOException {
        byte[] arr_b = this.L9;
        int[] arr_v = l.X9;
        int v2 = this.a9;
        this.a9 = v2 + 1;
        int v3 = arr_b[v2] & 0xFF;
        if(arr_v[v3] != 0) {
            return v3 == 34 ? this.F7(this.G9, v1, v, 1) : this.O7(this.G9, v1, v, v3, 1);
        }
        int v4 = v << 8 | v3;
        this.a9 = v2 + 2;
        int v5 = arr_b[v2 + 1] & 0xFF;
        if(arr_v[v5] != 0) {
            return v5 == 34 ? this.F7(this.G9, v1, v4, 2) : this.O7(this.G9, v1, v4, v5, 2);
        }
        int v6 = v4 << 8 | v5;
        this.a9 = v2 + 3;
        int v7 = arr_b[v2 + 2] & 0xFF;
        if(arr_v[v7] != 0) {
            return v7 == 34 ? this.F7(this.G9, v1, v6, 3) : this.O7(this.G9, v1, v6, v7, 3);
        }
        int v8 = v6 << 8 | v7;
        this.a9 = v2 + 4;
        int v9 = arr_b[v2 + 3] & 0xFF;
        if(arr_v[v9] != 0) {
            return v9 == 34 ? this.F7(this.G9, v1, v8, 4) : this.O7(this.G9, v1, v8, v9, 4);
        }
        return this.J7(v9, v1, v8);
    }

    protected final void M6(String s, int v) throws IOException {
        int v2;
        int v1 = s.length();
        if(this.a9 + v1 >= this.b9) {
            this.N6(s, v);
            return;
        }
        do {
            if(this.L9[this.a9] != s.charAt(v)) {
                this.f7(s.substring(0, v));
            }
            v2 = this.a9 + 1;
            this.a9 = v2;
            ++v;
        }
        while(v < v1);
        int v3 = this.L9[v2] & 0xFF;
        if(v3 >= 0x30 && (v3 != 93 && v3 != 0x7D)) {
            this.o6(s, v, v3);
        }
    }

    private final String M7(int v, int v1, int v2) throws IOException {
        return this.I7(this.E9, 0, v, v1, v2);
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object N1() {
        return this.K9;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String N3(String s) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                return this.y6();
            }
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(s);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void N5() throws IOException {
        super.N5();
        this.D9.N();
        if(this.M9) {
            byte[] arr_b = this.L9;
            if(arr_b != null) {
                byte[] arr_b1 = d.H;
                if(arr_b != arr_b1) {
                    this.L9 = arr_b1;
                    this.X8.e0(arr_b);
                }
            }
        }
    }

    private final void N6(String s, int v) throws IOException {
        int v1 = s.length();
        do {
            if(this.a9 >= this.b9 && !this.I6() || this.L9[this.a9] != s.charAt(v)) {
                this.f7(s.substring(0, v));
            }
            int v2 = this.a9 + 1;
            this.a9 = v2;
            ++v;
        }
        while(v < v1);
        if(v2 >= this.b9 && !this.I6()) {
            return;
        }
        int v3 = this.L9[this.a9] & 0xFF;
        if(v3 >= 0x30 && (v3 != 93 && v3 != 0x7D)) {
            this.o6(s, v, v3);
        }
    }

    private final String N7(int v, int v1, int v2, int v3) throws IOException {
        int[] arr_v = this.E9;
        arr_v[0] = v;
        return this.I7(arr_v, 1, v1, v2, v3);
    }

    protected final void O6() throws IOException {
        int v = this.a9;
        if(v + 3 < this.b9) {
            byte[] arr_b = this.L9;
            if(arr_b[v] == 0x72 && arr_b[v + 1] == 0x75 && arr_b[v + 2] == 101) {
                int v1 = arr_b[v + 3] & 0xFF;
                if(v1 < 0x30 || (v1 == 93 || v1 == 0x7D)) {
                    this.a9 = v + 3;
                    return;
                }
            }
        }
        this.N6("true", 1);
    }

    private final String O7(int v, int v1, int v2, int v3, int v4) throws IOException {
        int[] arr_v = this.E9;
        arr_v[0] = v;
        arr_v[1] = v1;
        return this.I7(arr_v, 2, v2, v3, v4);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int P2(Writer writer0) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
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

    private final r P6() throws IOException {
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

    protected String P7() throws IOException {
        if(this.a9 >= this.b9 && !this.I6()) {
            this.Z4(": was expecting closing \'\"\' for name", r.o);
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v] & 0xFF;
        return v1 == 34 ? "" : this.I7(this.E9, 0, 0, v1, 0);
    }

    private final r Q6(int v) throws IOException {
        switch(v) {
            case 34: {
                this.F9 = true;
                this.h = r.q;
                return r.q;
            }
            case 43: {
                if(!this.a4(e.k.f())) {
                    r r1 = this.F6(43);
                    this.h = r1;
                    return r1;
                }
                r r2 = this.Y6(false);
                this.h = r2;
                return r2;
            }
            case 45: {
                r r3 = this.Y6(true);
                this.h = r3;
                return r3;
            }
            case 46: {
                r r4 = this.V6(false, false);
                this.h = r4;
                return r4;
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
                r r5 = this.Z6(v);
                this.h = r5;
                return r5;
            }
            case 91: {
                this.Z5(this.g9, this.h9);
                this.h = r.m;
                return r.m;
            }
            case 102: {
                this.K6();
                this.h = r.u;
                return r.u;
            }
            case 110: {
                this.L6();
                this.h = r.v;
                return r.v;
            }
            case 0x74: {
                this.O6();
                this.h = r.t;
                return r.t;
            }
            case 0x7B: {
                this.a6(this.g9, this.h9);
                this.h = r.k;
                return r.k;
            }
            default: {
                r r0 = this.F6(v);
                this.h = r0;
                return r0;
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String R2() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                return this.y6();
            }
            return this.k9.q();
        }
        return this.A6(r0);
    }

    private static final int R6(int v, int v1) {
        return v1 == 4 ? v : v | -1 << (v1 << 3);
    }

    protected String S6() throws IOException {
        if(this.a9 >= this.b9 && !this.I6()) {
            this.Z4(": was expecting closing \'\'\' for field name", r.o);
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v] & 0xFF;
        if(v1 == 39) {
            return "";
        }
        int[] arr_v = this.E9;
        int[] arr_v1 = l.X9;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v1 != 39) {
            if(arr_v1[v1] != 0 && v1 != 34) {
                if(v1 == 92) {
                    v1 = this.x5();
                }
                else {
                    this.Q5(v1, "name");
                }
                if(v1 > 0x7F) {
                    if(v2 >= 4) {
                        if(v3 >= arr_v.length) {
                            arr_v = this.G5(arr_v, arr_v.length);
                            this.E9 = arr_v;
                        }
                        arr_v[v3] = v4;
                        ++v3;
                        v2 = 0;
                        v4 = 0;
                    }
                    if(v1 < 0x800) {
                        v4 = v4 << 8 | (v1 >> 6 | 0xC0);
                        ++v2;
                    }
                    else {
                        int v5 = v4 << 8 | (v1 >> 12 | 0xE0);
                        int v6 = v2 + 1;
                        if(v6 >= 4) {
                            if(v3 >= arr_v.length) {
                                arr_v = this.G5(arr_v, arr_v.length);
                                this.E9 = arr_v;
                            }
                            arr_v[v3] = v5;
                            ++v3;
                            v6 = 0;
                            v5 = 0;
                        }
                        v4 = v5 << 8 | (v1 >> 6 & 0x3F | 0x80);
                        v2 = v6 + 1;
                    }
                    v1 = v1 & 0x3F | 0x80;
                }
            }
            if(v2 < 4) {
                ++v2;
                v4 = v1 | v4 << 8;
            }
            else {
                if(v3 >= arr_v.length) {
                    arr_v = this.G5(arr_v, arr_v.length);
                    this.E9 = arr_v;
                }
                arr_v[v3] = v4;
                v4 = v1;
                ++v3;
                v2 = 1;
            }
            if(this.a9 >= this.b9 && !this.I6()) {
                this.Z4(" in field name", r.o);
            }
            int v7 = this.a9;
            this.a9 = v7 + 1;
            v1 = this.L9[v7] & 0xFF;
        }
        if(v2 > 0) {
            if(v3 >= arr_v.length) {
                arr_v = this.G5(arr_v, arr_v.length);
                this.E9 = arr_v;
            }
            arr_v[v3] = l.R6(v4, v2);
            ++v3;
        }
        String s = this.D9.D(arr_v, v3);
        return s == null ? this.C7(arr_v, v3, v2) : s;
    }

    private final r T6(char[] arr_c, int v, int v1, boolean z, int v2) throws IOException {
        boolean z1;
        int v4;
        int v3 = 0;
        if(v1 == 46) {
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            arr_c[v] = '.';
            ++v;
            v4 = 0;
            while(true) {
                if(this.a9 >= this.b9 && !this.I6()) {
                    z1 = true;
                    break;
                }
                z1 = false;
                int v5 = this.a9;
                this.a9 = v5 + 1;
                v1 = this.L9[v5] & 0xFF;
                if(v1 < 0x30 || v1 > 57) {
                    break;
                }
                ++v4;
                if(v >= arr_c.length) {
                    arr_c = this.k9.y();
                    v = 0;
                }
                arr_c[v] = (char)v1;
                ++v;
            }
            if(v4 == 0 && !this.a4(e.m.f())) {
                this.e5(v1, "Decimal point not followed by a digit");
            }
        }
        else {
            v4 = 0;
            z1 = false;
        }
        if(v1 == 69 || v1 == 101) {
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            int v6 = v + 1;
            arr_c[v] = (char)v1;
            if(this.a9 >= this.b9) {
                this.J6();
            }
            int v7 = this.a9;
            this.a9 = v7 + 1;
            int v8 = this.L9[v7] & 0xFF;
            if(v8 == 43 || v8 == 45) {
                if(v6 >= arr_c.length) {
                    arr_c = this.k9.y();
                    v6 = 0;
                }
                arr_c[v6] = (char)v8;
                if(this.a9 >= this.b9) {
                    this.J6();
                }
                int v9 = this.a9;
                this.a9 = v9 + 1;
                v8 = this.L9[v9] & 0xFF;
                ++v6;
            }
            v1 = v8;
            int v10 = 0;
            while(true) {
                if(v1 < 0x30 || v1 > 57) {
                    v3 = v10;
                    v = v6;
                    break;
                }
                ++v10;
                if(v6 >= arr_c.length) {
                    arr_c = this.k9.y();
                    v6 = 0;
                }
                arr_c[v6] = (char)v1;
                if(this.a9 >= this.b9 && !this.I6()) {
                    v3 = v10;
                    v = v6 + 1;
                    z1 = true;
                    break;
                }
                int v11 = this.a9;
                this.a9 = v11 + 1;
                v1 = this.L9[v11] & 0xFF;
                ++v6;
            }
            if(v3 == 0) {
                this.e5(v1, "Exponent indicator not followed by a digit");
            }
        }
        if(!z1) {
            --this.a9;
            if(this.i9.n()) {
                this.B7(v1);
            }
        }
        this.k9.P(v);
        return this.m6(z, v2, v4, v3);
    }

    @Deprecated
    protected final r U6() throws IOException {
        return this.V6(false, false);
    }

    protected final r V6(boolean z, boolean z1) throws IOException {
        if(!this.a4(e.l.f())) {
            return this.F6(46);
        }
        char[] arr_c = this.k9.s();
        if(z) {
            arr_c[0] = '-';
            return this.T6(arr_c, 1, 46, true, 0);
        }
        return this.T6(arr_c, 0, 46, false, 0);
    }

    protected final String W6(int v) throws IOException {
        if(v != 34) {
            return this.E6(v);
        }
        int v1 = this.a9;
        if(v1 + 13 > this.b9) {
            return this.P7();
        }
        byte[] arr_b = this.L9;
        int[] arr_v = l.X9;
        this.a9 = v1 + 1;
        int v2 = arr_b[v1] & 0xFF;
        if(arr_v[v2] == 0) {
            this.a9 = v1 + 2;
            int v3 = arr_b[v1 + 1] & 0xFF;
            if(arr_v[v3] == 0) {
                int v4 = v3 | v2 << 8;
                this.a9 = v1 + 3;
                int v5 = arr_b[v1 + 2] & 0xFF;
                if(arr_v[v5] == 0) {
                    int v6 = v4 << 8 | v5;
                    this.a9 = v1 + 4;
                    int v7 = arr_b[v1 + 3] & 0xFF;
                    if(arr_v[v7] == 0) {
                        int v8 = v6 << 8 | v7;
                        this.a9 = v1 + 5;
                        int v9 = arr_b[v1 + 4] & 0xFF;
                        if(arr_v[v9] == 0) {
                            this.G9 = v8;
                            return this.K7(v9);
                        }
                        return v9 == 34 ? this.D7(v8, 4) : this.M7(v8, v9, 4);
                    }
                    return v7 == 34 ? this.D7(v6, 3) : this.M7(v6, v7, 3);
                }
                return v5 == 34 ? this.D7(v4, 2) : this.M7(v4, v5, 2);
            }
            return v3 == 34 ? this.D7(v2, 1) : this.M7(v2, v3, 1);
        }
        return v2 == 34 ? "" : this.M7(0, v2, 0);
    }

    private final r X6(char[] arr_c, int v, boolean z, int v1) throws IOException {
        int v3;
        int v2;
        while(true) {
            if(this.a9 >= this.b9 && !this.I6()) {
                this.k9.P(v);
                return this.n6(z, v1);
            }
            v2 = this.a9;
            this.a9 = v2 + 1;
            v3 = this.L9[v2] & 0xFF;
            if(v3 > 57 || v3 < 0x30) {
                break;
            }
            if(v >= arr_c.length) {
                v = 0;
                arr_c = this.k9.y();
            }
            arr_c[v] = (char)v3;
            ++v1;
            ++v;
        }
        if(v3 != 46 && v3 != 69 && v3 != 101) {
            this.a9 = v2;
            this.k9.P(v);
            if(this.i9.n()) {
                this.B7(this.L9[this.a9] & 0xFF);
            }
            return this.n6(z, v1);
        }
        return this.T6(arr_c, v, v3, z, v1);
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
                case 6: {
                    if(this.F9) {
                        this.F9 = false;
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

    private final r Y6(boolean z) throws IOException {
        int v8;
        int v7;
        int v6;
        char[] arr_c = this.k9.s();
        int v = 1;
        int v1 = 0;
        if(z) {
            arr_c[0] = '-';
            v1 = 1;
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v2 = this.a9;
        this.a9 = v2 + 1;
        int v3 = this.L9[v2] & 0xFF;
        if(v3 <= 0x30) {
            switch(v3) {
                case 46: {
                    return this.V6(z, true);
                }
                case 0x30: {
                    v3 = this.A7();
                    break;
                }
                default: {
                    return this.D6(v3, z, true);
                }
            }
        }
        else if(v3 > 57) {
            return this.D6(v3, z, true);
        }
        int v4 = v1 + 1;
        arr_c[v1] = (char)v3;
        int v5 = Math.min(this.b9, this.a9 + arr_c.length - v4);
        while(true) {
            v6 = v4;
            v7 = this.a9;
            if(v7 >= v5) {
                return this.X6(arr_c, v6, z, v);
            }
            this.a9 = v7 + 1;
            v8 = this.L9[v7] & 0xFF;
            if(v8 < 0x30 || v8 > 57) {
                break;
            }
            ++v;
            v4 = v6 + 1;
            arr_c[v6] = (char)v8;
        }
        if(v8 != 46 && v8 != 69 && v8 != 101) {
            this.a9 = v7;
            this.k9.P(v6);
            if(this.i9.n()) {
                this.B7(v8);
            }
            return this.n6(z, v);
        }
        return this.T6(arr_c, v6, v8, z, v);
    }

    protected r Z6(int v) throws IOException {
        int v5;
        int v4;
        char[] arr_c = this.k9.s();
        if(v == 0x30) {
            v = this.A7();
        }
        arr_c[0] = (char)v;
        int v1 = Math.min(this.b9, this.a9 + arr_c.length - 1);
        int v2 = 1;
        int v3 = 1;
        while(true) {
            v4 = this.a9;
            if(v4 >= v1) {
                return this.X6(arr_c, v2, false, v3);
            }
            this.a9 = v4 + 1;
            v5 = this.L9[v4] & 0xFF;
            if(v5 < 0x30 || v5 > 57) {
                break;
            }
            ++v3;
            arr_c[v2] = (char)v5;
            ++v2;
        }
        if(v5 != 46 && v5 != 69 && v5 != 101) {
            this.a9 = v4;
            this.k9.P(v2);
            if(this.i9.n()) {
                this.B7(v5);
            }
            return this.n6(false, v3);
        }
        return this.T6(arr_c, v2, v5, false, v3);
    }

    @Override  // com.fasterxml.jackson.core.n
    public u a1() {
        return this.C9;
    }

    protected int a7(com.fasterxml.jackson.core.a a0, OutputStream outputStream0, byte[] arr_b) throws IOException {
        int v = arr_b.length - 3;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            if(this.a9 >= this.b9) {
                this.J6();
            }
            int v3 = this.a9;
            this.a9 = v3 + 1;
            int v4 = this.L9[v3] & 0xFF;
            if(v4 > 0x20) {
                int v5 = a0.i(v4);
                if(v5 < 0) {
                    if(v4 == 34) {
                        goto label_71;
                    }
                    v5 = this.w5(a0, v4, 0);
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
                        this.J6();
                    }
                    int v6 = this.a9;
                    this.a9 = v6 + 1;
                    int v7 = this.L9[v6] & 0xFF;
                    int v8 = a0.i(v7);
                    if(v8 < 0) {
                        v8 = this.w5(a0, v7, 1);
                    }
                    int v9 = v5 << 6 | v8;
                    if(this.a9 >= this.b9) {
                        this.J6();
                    }
                    int v10 = this.a9;
                    this.a9 = v10 + 1;
                    int v11 = this.L9[v10] & 0xFF;
                    int v12 = a0.i(v11);
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
                            v12 = this.w5(a0, v11, 2);
                        }
                        if(v12 == -2) {
                            if(this.a9 >= this.b9) {
                                this.J6();
                            }
                            int v13 = this.a9;
                            this.a9 = v13 + 1;
                            int v14 = this.L9[v13] & 0xFF;
                            if(!a0.G(v14) && this.w5(a0, v14, 3) != -2) {
                                throw this.j6(a0, v14, 3, "expected padding character \'" + a0.y() + "\'");
                            }
                            arr_b[v1] = (byte)(v9 >> 4);
                            ++v1;
                            continue;
                        }
                    }
                    int v15 = v9 << 6 | v12;
                    if(this.a9 >= this.b9) {
                        this.J6();
                    }
                    int v16 = this.a9;
                    this.a9 = v16 + 1;
                    int v17 = this.L9[v16] & 0xFF;
                    int v18 = a0.i(v17);
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
                            this.F9 = false;
                            if(v1 > 0) {
                                v2 += v1;
                                outputStream0.write(arr_b, 0, v1);
                            }
                            return v2;
                        label_76:
                            v18 = this.w5(a0, v17, 3);
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

    @Override  // com.fasterxml.jackson.core.base.c
    public com.fasterxml.jackson.core.l b1() {
        return new com.fasterxml.jackson.core.l(this.s5(), this.c9 + ((long)this.a9), -1L, this.d9, this.a9 - this.e9 + 1);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int b3() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 5: {
                    return this.i9.b().length();
                }
                case 6: {
                    if(this.F9) {
                        this.F9 = false;
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

    protected void b7(int v) throws m {
        if(v < 0x20) {
            this.g5(v);
        }
        this.c7(v);
    }

    protected void c7(int v) throws m {
        this.T4("Invalid UTF-8 start byte 0x" + Integer.toHexString(v));
    }

    protected void d7(int v) throws m {
        this.T4("Invalid UTF-8 middle byte 0x" + Integer.toHexString(v));
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int e3() throws IOException {
        r r0 = this.h;
        if(r0 != null) {
            switch(r0.d()) {
                case 6: {
                    if(this.F9) {
                        this.F9 = false;
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

    protected void e7(int v, int v1) throws m {
        this.a9 = v1;
        this.d7(v);
    }

    protected void f7(String s) throws IOException {
        this.h7(s, this.R5());
    }

    @Override  // com.fasterxml.jackson.core.n
    public Boolean g4() throws IOException {
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
        if(r1 == r.t) {
            return true;
        }
        return r1 == r.u ? false : null;
    }

    protected void g7(String s, int v) throws IOException {
        this.a9 = v;
        this.h7(s, this.R5());
    }

    @Override  // com.fasterxml.jackson.core.n
    public String h4() throws IOException {
        r r1;
        this.p9 = 0;
        r r0 = r.o;
        if(this.h == r0) {
            this.P6();
            return null;
        }
        if(this.F9) {
            this.p7();
        }
        int v = this.v7();
        if(v < 0) {
            this.close();
            this.h = null;
            return null;
        }
        this.o9 = null;
        if(v == 93) {
            this.p6();
            this.h = r.n;
            return null;
        }
        if(v == 0x7D) {
            this.q6();
            this.h = r.l;
            return null;
        }
        if(this.i9.z()) {
            if(v != 44) {
                this.d5(v, "was expecting comma to separate root entries");
            }
            v = this.t7();
            if((this.a & l.O9) != 0 && (v == 93 || v == 0x7D)) {
                this.r6(v);
                return null;
            }
        }
        if(!this.i9.m()) {
            this.y7();
            this.Q6(v);
            return null;
        }
        this.z7();
        String s = this.W6(v);
        this.i9.D(s);
        this.h = r0;
        int v1 = this.k7();
        this.y7();
        switch(v1) {
            case 34: {
                this.F9 = true;
                this.j9 = r.q;
                return s;
            }
            case 43: {
                r1 = this.a4(e.k.f()) ? this.Y6(false) : this.F6(43);
                break;
            }
            case 45: {
                r1 = this.Y6(true);
                break;
            }
            case 46: {
                r1 = this.V6(false, false);
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
                r1 = this.Z6(v1);
                break;
            }
            case 91: {
                r1 = r.m;
                break;
            }
            case 102: {
                this.K6();
                r1 = r.u;
                break;
            }
            case 110: {
                this.L6();
                r1 = r.v;
                break;
            }
            case 0x74: {
                this.O6();
                r1 = r.t;
                break;
            }
            case 0x7B: {
                r1 = r.k;
                break;
            }
            default: {
                r1 = this.F6(v1);
                break;
            }
        }
        this.j9 = r1;
        return s;
    }

    protected void h7(String s, String s1) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        while(this.a9 < this.b9 || this.I6()) {
            int v = this.a9;
            this.a9 = v + 1;
            int v1 = (char)this.t6(((int)this.L9[v]));
            if(!Character.isJavaIdentifierPart(((char)v1))) {
                break;
            }
            stringBuilder0.append(((char)v1));
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

    @Override  // com.fasterxml.jackson.core.base.c
    public com.fasterxml.jackson.core.l i3() {
        return this.h == r.o ? new com.fasterxml.jackson.core.l(this.s5(), this.c9 + ((long)(this.H9 - 1)), -1L, this.I9, this.J9) : new com.fasterxml.jackson.core.l(this.s5(), this.f9 - 1L, -1L, this.g9, this.h9);
    }

    @Override  // com.fasterxml.jackson.core.n
    public boolean i4(w w0) throws IOException {
        int v = 0;
        this.p9 = 0;
        if(this.h == r.o) {
            this.P6();
            return false;
        }
        if(this.F9) {
            this.p7();
        }
        int v1 = this.v7();
        if(v1 < 0) {
            this.close();
            this.h = null;
            return false;
        }
        this.o9 = null;
        if(v1 == 93) {
            this.p6();
            this.h = r.n;
            return false;
        }
        if(v1 == 0x7D) {
            this.q6();
            this.h = r.l;
            return false;
        }
        if(this.i9.z()) {
            if(v1 != 44) {
                this.d5(v1, "was expecting comma to separate root entries");
            }
            v1 = this.t7();
            if((this.a & l.O9) != 0 && (v1 == 93 || v1 == 0x7D)) {
                this.r6(v1);
                return false;
            }
        }
        if(!this.i9.m()) {
            this.y7();
            this.Q6(v1);
            return false;
        }
        this.z7();
        if(v1 == 34) {
            byte[] arr_b = w0.d();
            int v2 = this.a9;
            if(v2 + arr_b.length + 4 < this.b9) {
                int v3 = arr_b.length + v2;
                if(this.L9[v3] == 34) {
                    while(true) {
                        if(v2 == v3) {
                            this.i9.D(w0.getValue());
                            this.H6(this.m7(v2 + 1));
                            return true;
                        }
                        if(arr_b[v] != this.L9[v2]) {
                            break;
                        }
                        ++v;
                        ++v2;
                    }
                }
            }
        }
        return this.G6(v1, w0);
    }

    private final void i7() throws IOException {
        int[] arr_v = com.fasterxml.jackson.core.io.c.i();
    label_1:
        while(this.a9 < this.b9 || this.I6()) {
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.L9[v] & 0xFF;
            switch(arr_v[v2]) {
                case 0: {
                    continue;
                }
                case 2: {
                    this.q7();
                    break;
                }
                case 3: {
                    this.r7();
                    break;
                }
                case 4: {
                    this.s7(v2);
                    break;
                }
                case 10: {
                    ++this.d9;
                    this.e9 = v1;
                    break;
                }
                case 13: {
                    this.j7();
                    break;
                }
                case 42: {
                    if(v1 >= this.b9 && !this.I6()) {
                        break label_1;
                    }
                    int v3 = this.a9;
                    if(this.L9[v3] != 0x2F) {
                        continue;
                    }
                    this.a9 = v3 + 1;
                    return;
                }
                default: {
                    this.b7(v2);
                }
            }
        }
        this.Z4(" in a comment", null);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int j4(int v) throws IOException {
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

    protected final void j7() throws IOException {
        if(this.a9 < this.b9 || this.I6()) {
            int v = this.a9;
            if(this.L9[v] == 10) {
                this.a9 = v + 1;
            }
        }
        ++this.d9;
        this.e9 = this.a9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public long k4(long v) throws IOException {
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

    private final int k7() throws IOException {
        int v = this.a9;
        if(v + 4 >= this.b9) {
            return this.l7(false);
        }
        byte[] arr_b = this.L9;
        int v1 = arr_b[v];
        if(v1 == 58) {
            this.a9 = v + 1;
            int v2 = arr_b[v + 1];
            if(v2 > 0x20) {
                if(v2 != 35 && v2 != 0x2F) {
                    this.a9 = v + 2;
                    return v2;
                }
                return this.l7(true);
            }
            if(v2 == 9 || v2 == 0x20) {
                this.a9 = v + 2;
                int v3 = arr_b[v + 2];
                if(v3 > 0x20 && (v3 != 35 && v3 != 0x2F)) {
                    this.a9 = v + 3;
                    return v3;
                }
                return this.l7(true);
            }
            return this.l7(true);
        }
        if(v1 == 9 || v1 == 0x20) {
            this.a9 = v + 1;
            v1 = arr_b[v + 1];
        }
        if(v1 == 58) {
            int v4 = this.a9;
            this.a9 = v4 + 1;
            int v5 = arr_b[v4 + 1];
            if(v5 > 0x20) {
                if(v5 != 35 && v5 != 0x2F) {
                    this.a9 = v4 + 2;
                    return v5;
                }
                return this.l7(true);
            }
            if(v5 == 9 || v5 == 0x20) {
                this.a9 = v4 + 2;
                int v6 = arr_b[v4 + 2];
                if(v6 > 0x20 && (v6 != 35 && v6 != 0x2F)) {
                    this.a9 = v4 + 3;
                    return v6;
                }
                return this.l7(true);
            }
            return this.l7(true);
        }
        return this.l7(false);
    }

    @Override  // com.fasterxml.jackson.core.n
    public String l4() throws IOException {
        if(this.h == r.o) {
            this.m9 = false;
            r r0 = this.j9;
            this.j9 = null;
            this.h = r0;
            if(r0 == r.q) {
                if(this.F9) {
                    this.F9 = false;
                    return this.y6();
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

    private final int l7(boolean z) throws IOException {
        while(true) {
            if(this.a9 >= this.b9 && !this.I6()) {
                this.Z4(" within/between root entries", null);
                return -1;
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.L9[v] & 0xFF;
            if(v2 > 0x20) {
                switch(v2) {
                    case 35: {
                        if(this.x7()) {
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
                        this.n7();
                        break;
                    }
                    default: {
                        goto label_11;
                    }
                }
            }
            else {
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
                this.j7();
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public r m4() throws IOException {
        r r1;
        r r0 = r.o;
        if(this.h == r0) {
            return this.P6();
        }
        this.p9 = 0;
        if(this.F9) {
            this.p7();
        }
        int v = this.v7();
        if(v < 0) {
            this.close();
            this.h = null;
            return null;
        }
        this.o9 = null;
        if(v == 93) {
            this.p6();
            this.h = r.n;
            return r.n;
        }
        if(v == 0x7D) {
            this.q6();
            this.h = r.l;
            return r.l;
        }
        if(this.i9.z()) {
            if(v != 44) {
                this.d5(v, "was expecting comma to separate root entries");
            }
            v = this.t7();
            if((this.a & l.O9) != 0 && (v == 93 || v == 0x7D)) {
                return this.r6(v);
            }
        }
        if(!this.i9.m()) {
            this.y7();
            return this.Q6(v);
        }
        this.z7();
        String s = this.W6(v);
        this.i9.D(s);
        this.h = r0;
        int v1 = this.k7();
        this.y7();
        switch(v1) {
            case 34: {
                this.F9 = true;
                this.j9 = r.q;
                return this.h;
            }
            case 43: {
                r1 = this.a4(e.k.f()) ? this.Y6(false) : this.F6(43);
                break;
            }
            case 45: {
                r1 = this.Y6(true);
                break;
            }
            case 46: {
                r1 = this.V6(false, false);
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
                r1 = this.Z6(v1);
                break;
            }
            case 91: {
                r1 = r.m;
                break;
            }
            case 102: {
                this.K6();
                r1 = r.u;
                break;
            }
            case 110: {
                this.L6();
                r1 = r.v;
                break;
            }
            case 0x74: {
                this.O6();
                r1 = r.t;
                break;
            }
            case 0x7B: {
                r1 = r.k;
                break;
            }
            default: {
                r1 = this.F6(v1);
                break;
            }
        }
        this.j9 = r1;
        return this.h;
    }

    private final int m7(int v) throws IOException {
        byte[] arr_b = this.L9;
        int v1 = v + 1;
        int v2 = arr_b[v];
        if(v2 == 58) {
            int v3 = v + 2;
            int v4 = arr_b[v1];
            if(v4 > 0x20) {
                if(v4 != 35 && v4 != 0x2F) {
                    this.a9 = v3;
                    return v4;
                }
            }
            else if(v4 == 9 || v4 == 0x20) {
                int v5 = arr_b[v3];
                if(v5 > 0x20 && (v5 != 35 && v5 != 0x2F)) {
                    this.a9 = v + 3;
                    return v5;
                }
                v3 = v + 3;
            }
            this.a9 = v3 - 1;
            return this.l7(true);
        }
        if(v2 == 9 || v2 == 0x20) {
            v2 = arr_b[v1];
            v1 = v + 2;
        }
        if(v2 == 58) {
            int v6 = v1 + 1;
            int v7 = arr_b[v1];
            if(v7 > 0x20) {
                if(v7 != 35 && v7 != 0x2F) {
                    this.a9 = v6;
                    return v7;
                }
            }
            else if(v7 == 9 || v7 == 0x20) {
                int v8 = arr_b[v6];
                if(v8 > 0x20 && (v8 != 35 && v8 != 0x2F)) {
                    this.a9 = v1 + 2;
                    return v8;
                }
                v6 = v1 + 2;
            }
            this.a9 = v6 - 1;
            return this.l7(true);
        }
        this.a9 = v1 - 1;
        return this.l7(false);
    }

    private final void n7() throws IOException {
        if((this.a & l.U9) == 0) {
            this.d5(0x2F, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)");
        }
        if(this.a9 >= this.b9 && !this.I6()) {
            this.Z4(" in a comment", null);
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v] & 0xFF;
        if(v1 == 0x2F) {
            this.o7();
            return;
        }
        if(v1 == 42) {
            this.i7();
            return;
        }
        this.d5(v1, "was expecting either \'*\' or \'/\' for a comment");
    }

    private final void o6(String s, int v, int v1) throws IOException {
        if(Character.isJavaIdentifierPart(((char)this.t6(v1)))) {
            this.f7(s.substring(0, v));
        }
    }

    private final void o7() throws IOException {
        int[] arr_v = com.fasterxml.jackson.core.io.c.i();
        while(true) {
            if(this.a9 >= this.b9 && !this.I6()) {
                return;
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.L9[v] & 0xFF;
            int v3 = arr_v[v2];
            switch(v3) {
                case 2: {
                    this.q7();
                    continue;
                }
                case 3: {
                    this.r7();
                    continue;
                }
                case 4: {
                    break;
                }
                case 10: {
                    ++this.d9;
                    this.e9 = v1;
                    return;
                }
                case 13: {
                    this.j7();
                    return;
                label_15:
                    if(v3 >= 0) {
                        continue;
                    }
                    this.b7(v2);
                    continue;
                }
                case 0: 
                case 42: {
                    continue;
                }
                default: {
                    goto label_15;
                }
            }
            this.s7(v2);
        }
    }

    private final void p6() throws m {
        this.y7();
        if(!this.i9.l()) {
            this.O5(93, '}');
        }
        this.i9 = this.i9.u();
    }

    protected void p7() throws IOException {
        int v2;
        this.F9 = false;
        int[] arr_v = l.W9;
        byte[] arr_b = this.L9;
    alab1:
        while(true) {
            int v = this.a9;
            int v1 = this.b9;
            if(v >= v1) {
                this.J6();
                v = this.a9;
                v1 = this.b9;
            }
            while(true) {
                if(v >= v1) {
                    this.a9 = v;
                    continue alab1;
                }
                v2 = arr_b[v] & 0xFF;
                int v3 = arr_v[v2];
                if(v3 != 0) {
                    break;
                }
                ++v;
            }
            this.a9 = v + 1;
            if(v2 == 34) {
                break;
            }
            switch(v3) {
                case 1: {
                    this.x5();
                    break;
                }
                case 2: {
                    this.q7();
                    break;
                }
                case 3: {
                    this.r7();
                    break;
                }
                case 4: {
                    this.s7(v2);
                    break;
                }
                default: {
                    if(v2 < 0x20) {
                        this.Q5(v2, "string value");
                    }
                    else {
                        this.b7(v2);
                    }
                    break;
                }
            }
        }
    }

    private final void q6() throws m {
        this.y7();
        if(!this.i9.m()) {
            this.O5(0x7D, ']');
        }
        this.i9 = this.i9.u();
    }

    private final void q7() throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v];
        if((v1 & 0xC0) != 0x80) {
            this.e7(v1 & 0xFF, v + 1);
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        if(this.F9 && this.h == r.q) {
            byte[] arr_b = this.X8.e();
            try {
                return this.a7(a0, outputStream0, arr_b);
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
        if(this.K9 != null) {
            if(this.X8.R() || this.a4(com.fasterxml.jackson.core.n.a.c)) {
                this.K9.close();
            }
            this.K9 = null;
        }
    }

    private final r r6(int v) throws m {
        if(v == 0x7D) {
            this.q6();
            this.h = r.l;
            return r.l;
        }
        this.p6();
        this.h = r.n;
        return r.n;
    }

    private final void r7() throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v];
        if((v1 & 0xC0) != 0x80) {
            this.e7(v1 & 0xFF, v + 1);
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v2 = this.a9;
        this.a9 = v2 + 1;
        int v3 = this.L9[v2];
        if((v3 & 0xC0) != 0x80) {
            this.e7(v3 & 0xFF, v2 + 1);
        }
    }

    protected final byte[] s6(com.fasterxml.jackson.core.a a0) throws IOException {
        com.fasterxml.jackson.core.util.c c0 = this.C5();
        while(true) {
            if(this.a9 >= this.b9) {
                this.J6();
            }
            int v = this.a9;
            this.a9 = v + 1;
            int v1 = this.L9[v] & 0xFF;
            if(v1 > 0x20) {
                int v2 = a0.i(v1);
                if(v2 < 0) {
                    if(v1 == 34) {
                        return new byte[0];
                    }
                    v2 = this.w5(a0, v1, 0);
                    if(v2 >= 0) {
                        goto label_13;
                    }
                }
                else {
                label_13:
                    if(this.a9 >= this.b9) {
                        this.J6();
                    }
                    int v3 = this.a9;
                    this.a9 = v3 + 1;
                    int v4 = this.L9[v3] & 0xFF;
                    int v5 = a0.i(v4);
                    if(v5 < 0) {
                        v5 = this.w5(a0, v4, 1);
                    }
                    int v6 = v2 << 6 | v5;
                    if(this.a9 >= this.b9) {
                        this.J6();
                    }
                    int v7 = this.a9;
                    this.a9 = v7 + 1;
                    int v8 = this.L9[v7] & 0xFF;
                    int v9 = a0.i(v8);
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
                            v9 = this.w5(a0, v8, 2);
                        }
                        if(v9 == -2) {
                            if(this.a9 >= this.b9) {
                                this.J6();
                            }
                            int v10 = this.a9;
                            this.a9 = v10 + 1;
                            int v11 = this.L9[v10] & 0xFF;
                            if(!a0.G(v11) && this.w5(a0, v11, 3) != -2) {
                                throw this.j6(a0, v11, 3, "expected padding character \'" + a0.y() + "\'");
                            }
                            c0.b(v6 >> 4);
                            continue;
                        }
                    }
                    int v12 = v6 << 6 | v9;
                    if(this.a9 >= this.b9) {
                        this.J6();
                    }
                    int v13 = this.a9;
                    this.a9 = v13 + 1;
                    int v14 = this.L9[v13] & 0xFF;
                    int v15 = a0.i(v14);
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
                            v15 = this.w5(a0, v14, 3);
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

    private final void s7(int v) throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v1 = this.a9;
        this.a9 = v1 + 1;
        int v2 = this.L9[v1];
        if((v2 & 0xC0) != 0x80) {
            this.e7(v2 & 0xFF, v1 + 1);
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v3 = this.a9;
        this.a9 = v3 + 1;
        int v4 = this.L9[v3];
        if((v4 & 0xC0) != 0x80) {
            this.e7(v4 & 0xFF, v3 + 1);
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v5 = this.a9;
        this.a9 = v5 + 1;
        int v6 = this.L9[v5];
        if((v6 & 0xC0) != 0x80) {
            this.e7(v6 & 0xFF, v5 + 1);
        }
    }

    protected int t6(int v) throws IOException {
        int v2;
        int v1 = v & 0xFF;
        if(v1 > 0x7F) {
            if((v & 0xE0) == 0xC0) {
                v1 = v & 0x1F;
                v2 = 1;
            }
            else if((v & 0xF0) == 0xE0) {
                v1 = v & 15;
                v2 = 2;
            }
            else if((v & 0xF8) == 0xF0) {
                v1 = v & 7;
                v2 = 3;
            }
            else {
                this.c7(v & 0xFF);
                v2 = 1;
            }
            int v3 = this.H7();
            if((v3 & 0xC0) != 0x80) {
                this.d7(v3 & 0xFF);
            }
            v1 = v1 << 6 | v3 & 0x3F;
            if(v2 > 1) {
                int v4 = this.H7();
                if((v4 & 0xC0) != 0x80) {
                    this.d7(v4 & 0xFF);
                }
                v1 = v1 << 6 | v4 & 0x3F;
                if(v2 > 2) {
                    int v5 = this.H7();
                    if((v5 & 0xC0) != 0x80) {
                        this.d7(v5 & 0xFF);
                    }
                    return v1 << 6 | v5 & 0x3F;
                }
            }
        }
        return v1;
    }

    private final int t7() throws IOException {
        int v;
        while((v = this.a9) < this.b9) {
            this.a9 = v + 1;
            int v1 = this.L9[v] & 0xFF;
            if(v1 > 0x20) {
                if(v1 != 35 && v1 != 0x2F) {
                    return v1;
                }
                this.a9 = v;
                return this.u7();
            }
            switch(v1) {
                case 10: {
                    ++this.d9;
                    this.e9 = v + 1;
                    break;
                }
                case 13: {
                    this.j7();
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
        }
        return this.u7();
    }

    @Override  // com.fasterxml.jackson.core.n
    public void u0() throws IOException {
        if(this.F9) {
            this.F9 = false;
            this.z5();
        }
    }

    private final int u6(int v) throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v1 = this.a9;
        this.a9 = v1 + 1;
        int v2 = this.L9[v1];
        if((v2 & 0xC0) != 0x80) {
            this.e7(v2 & 0xFF, v1 + 1);
        }
        return (v & 0x1F) << 6 | v2 & 0x3F;
    }

    private final int u7() throws IOException {
        while(true) {
            if(this.a9 >= this.b9 && !this.I6()) {
                throw this.i("Unexpected end-of-input within/between root entries");
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.L9[v] & 0xFF;
            if(v2 > 0x20) {
                switch(v2) {
                    case 35: {
                        if(this.x7()) {
                            continue;
                        }
                        return 35;
                    }
                    case 0x2F: {
                        this.n7();
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
            this.j7();
        }
    }

    private final int v6(int v) throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v1 = this.a9;
        this.a9 = v1 + 1;
        int v2 = this.L9[v1];
        if((v2 & 0xC0) != 0x80) {
            this.e7(v2 & 0xFF, v1 + 1);
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v3 = this.a9;
        this.a9 = v3 + 1;
        int v4 = this.L9[v3];
        if((v4 & 0xC0) != 0x80) {
            this.e7(v4 & 0xFF, v3 + 1);
        }
        return ((v & 15) << 6 | v2 & 0x3F) << 6 | v4 & 0x3F;
    }

    private final int v7() throws IOException {
        if(this.a9 >= this.b9 && !this.I6()) {
            return this.y5();
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v] & 0xFF;
        if(v1 > 0x20) {
            if(v1 != 35 && v1 != 0x2F) {
                return v1;
            }
            this.a9 = v;
            return this.w7();
        }
        switch(v1) {
            case 10: {
                ++this.d9;
                this.e9 = v + 1;
                break;
            }
            case 13: {
                this.j7();
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
            int v3 = this.L9[v2] & 0xFF;
            if(v3 > 0x20) {
                if(v3 != 35 && v3 != 0x2F) {
                    return v3;
                }
                this.a9 = v2;
                return this.w7();
            }
            switch(v3) {
                case 10: {
                    ++this.d9;
                    this.e9 = v2 + 1;
                    break;
                }
                case 13: {
                    this.j7();
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
        return this.w7();
    }

    private final int w6(int v) throws IOException {
        int v1 = this.a9;
        this.a9 = v1 + 1;
        int v2 = this.L9[v1];
        if((v2 & 0xC0) != 0x80) {
            this.e7(v2 & 0xFF, v1 + 1);
        }
        int v3 = this.a9;
        this.a9 = v3 + 1;
        int v4 = this.L9[v3];
        if((v4 & 0xC0) != 0x80) {
            this.e7(v4 & 0xFF, v3 + 1);
        }
        return ((v & 15) << 6 | v2 & 0x3F) << 6 | v4 & 0x3F;
    }

    private final int w7() throws IOException {
        while(true) {
            if(this.a9 >= this.b9 && !this.I6()) {
                return this.y5();
            }
            int v = this.a9;
            int v1 = v + 1;
            this.a9 = v1;
            int v2 = this.L9[v] & 0xFF;
            if(v2 > 0x20) {
                switch(v2) {
                    case 35: {
                        if(this.x7()) {
                            continue;
                        }
                        return 35;
                    }
                    case 0x2F: {
                        this.n7();
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
            this.j7();
        }
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected char x5() throws IOException {
        if(this.a9 >= this.b9 && !this.I6()) {
            this.Z4(" in character escape sequence", r.q);
        }
        int v = this.a9;
        this.a9 = v + 1;
        int v1 = this.L9[v];
        switch(v1) {
            case 34: 
            case 0x2F: 
            case 92: {
                return (char)v1;
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
                int v2 = 0;
                for(int v3 = 0; v3 < 4; ++v3) {
                    if(this.a9 >= this.b9 && !this.I6()) {
                        this.Z4(" in character escape sequence", r.q);
                    }
                    int v4 = this.a9;
                    this.a9 = v4 + 1;
                    int v5 = this.L9[v4];
                    int v6 = com.fasterxml.jackson.core.io.c.b(v5);
                    if(v6 < 0) {
                        this.d5(v5 & 0xFF, "expected a hex-digit for character escape sequence");
                    }
                    v2 = v2 << 4 | v6;
                }
                return (char)v2;
            }
            default: {
                return this.I5(((char)this.t6(v1)));
            }
        }
    }

    private final int x6(int v) throws IOException {
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v1 = this.a9;
        this.a9 = v1 + 1;
        int v2 = this.L9[v1];
        if((v2 & 0xC0) != 0x80) {
            this.e7(v2 & 0xFF, v1 + 1);
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v3 = this.a9;
        this.a9 = v3 + 1;
        int v4 = this.L9[v3];
        if((v4 & 0xC0) != 0x80) {
            this.e7(v4 & 0xFF, v3 + 1);
        }
        if(this.a9 >= this.b9) {
            this.J6();
        }
        int v5 = this.a9;
        this.a9 = v5 + 1;
        int v6 = this.L9[v5];
        if((v6 & 0xC0) != 0x80) {
            this.e7(v6 & 0xFF, v5 + 1);
        }
        return ((((v & 7) << 6 | v2 & 0x3F) << 6 | v4 & 0x3F) << 6 | v6 & 0x3F) - 0x10000;
    }

    private final boolean x7() throws IOException {
        if((this.a & l.V9) == 0) {
            return false;
        }
        this.o7();
        return true;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int y3() throws IOException {
        if(this.h != r.r && this.h != r.s) {
            return super.B3(0);
        }
        int v = this.p9;
        if((v & 1) == 0) {
            if(v == 0) {
                return this.J5();
            }
            if((v & 1) == 0) {
                this.X5();
            }
        }
        return this.q9;
    }

    @Override  // com.fasterxml.jackson.core.n
    public int y4(OutputStream outputStream0) throws IOException {
        int v = this.a9;
        int v1 = this.b9 - v;
        if(v1 < 1) {
            return 0;
        }
        this.a9 = v + v1;
        outputStream0.write(this.L9, v, v1);
        return v1;
    }

    protected String y6() throws IOException {
        int v = this.a9;
        if(v >= this.b9) {
            this.J6();
            v = this.a9;
        }
        char[] arr_c = this.k9.s();
        int[] arr_v = l.W9;
        int v1 = Math.min(this.b9, arr_c.length + v);
        byte[] arr_b = this.L9;
        int v2;
        for(v2 = 0; v < v1; ++v2) {
            int v3 = arr_b[v] & 0xFF;
            if(arr_v[v3] != 0) {
                if(v3 != 34) {
                    break;
                }
                this.a9 = v + 1;
                return this.k9.O(v2);
            }
            ++v;
            arr_c[v2] = (char)v3;
        }
        this.a9 = v;
        this.z6(arr_c, v2);
        return this.k9.q();
    }

    private final void y7() {
        this.g9 = this.d9;
        this.f9 = this.c9 + ((long)this.a9);
        this.h9 = this.a9 - this.e9;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void z5() throws IOException {
        int v = this.a9;
        if(v >= this.b9) {
            this.J6();
            v = this.a9;
        }
        char[] arr_c = this.k9.s();
        int[] arr_v = l.W9;
        int v1 = Math.min(this.b9, arr_c.length + v);
        byte[] arr_b = this.L9;
        int v2;
        for(v2 = 0; v < v1; ++v2) {
            int v3 = arr_b[v] & 0xFF;
            if(arr_v[v3] != 0) {
                if(v3 != 34) {
                    break;
                }
                this.a9 = v + 1;
                this.k9.P(v2);
                return;
            }
            ++v;
            arr_c[v2] = (char)v3;
        }
        this.a9 = v;
        this.z6(arr_c, v2);
    }

    private final void z6(char[] arr_c, int v) throws IOException {
        int v4;
        int[] arr_v = l.W9;
        byte[] arr_b = this.L9;
    alab1:
        while(true) {
            int v1 = this.a9;
            if(v1 >= this.b9) {
                this.J6();
                v1 = this.a9;
            }
            int v2 = 0;
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            int v3 = Math.min(this.b9, arr_c.length - v + v1);
            while(true) {
                if(v1 >= v3) {
                    this.a9 = v1;
                    continue alab1;
                }
                v4 = arr_b[v1] & 0xFF;
                int v5 = arr_v[v4];
                if(v5 != 0) {
                    break;
                }
                arr_c[v] = (char)v4;
                ++v1;
                ++v;
            }
            this.a9 = v1 + 1;
            if(v4 == 34) {
                break;
            }
            switch(v5) {
                case 1: {
                    v4 = this.x5();
                    break;
                }
                case 2: {
                    v4 = this.u6(v4);
                    break;
                }
                case 3: {
                    v4 = this.b9 - (v1 + 1) >= 2 ? this.w6(v4) : this.v6(v4);
                    break;
                }
                case 4: {
                    int v6 = this.x6(v4);
                    arr_c[v] = (char)(v6 >> 10 | 0xD800);
                    if(v + 1 >= arr_c.length) {
                        arr_c = this.k9.y();
                        v = 0;
                    }
                    else {
                        ++v;
                    }
                    v4 = v6 & 0x3FF | 0xDC00;
                    break;
                }
                default: {
                    if(v4 < 0x20) {
                        this.Q5(v4, "string value");
                    }
                    else {
                        this.b7(v4);
                    }
                }
            }
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
            }
            else {
                v2 = v;
            }
            v = v2 + 1;
            arr_c[v2] = (char)v4;
        }
        this.k9.P(v);
    }

    private final void z7() {
        this.I9 = this.d9;
        this.H9 = this.a9;
        this.J9 = this.a9 - this.e9;
    }
}

