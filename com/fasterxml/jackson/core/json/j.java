package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.base.c;
import com.fasterxml.jackson.core.exc.b;
import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.sym.a;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.util.i;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class j extends c {
    protected u C9;
    protected final a D9;
    protected int[] E9;
    protected boolean F9;
    private int G9;
    protected DataInput H9;
    protected int I9;
    private static final int J9;
    private static final int K9;
    private static final int L9;
    private static final int M9;
    private static final int N9;
    private static final int O9;
    private static final int P9;
    private static final int Q9;
    private static final int[] R9;
    protected static final int[] S9;

    static {
        j.J9 = com.fasterxml.jackson.core.n.a.p.d();
        j.K9 = com.fasterxml.jackson.core.n.a.j.d();
        j.L9 = com.fasterxml.jackson.core.n.a.n.d();
        j.M9 = com.fasterxml.jackson.core.n.a.o.d();
        j.N9 = com.fasterxml.jackson.core.n.a.g.d();
        j.O9 = com.fasterxml.jackson.core.n.a.f.d();
        j.P9 = com.fasterxml.jackson.core.n.a.d.d();
        j.Q9 = com.fasterxml.jackson.core.n.a.e.d();
        j.R9 = com.fasterxml.jackson.core.io.c.l();
        j.S9 = com.fasterxml.jackson.core.io.c.j();
    }

    public j(g g0, int v, DataInput dataInput0, u u0, a a0, int v1) {
        super(g0, v);
        this.E9 = new int[16];
        this.C9 = u0;
        this.D9 = a0;
        this.H9 = dataInput0;
        this.I9 = v1;
    }

    protected r A6(int v, boolean z, boolean z1) throws IOException {
        String s;
        while(v == 73) {
            v = this.H9.readUnsignedByte();
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
            this.E6(s, 3);
            if((this.a & j.L9) != 0) {
                return z ? this.l6(s, -Infinity) : this.l6(s, Infinity);
            }
            this.T4("Non-standard token \'" + s + "\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if(!this.a4(e.k.f()) && z1 && !z) {
            this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        this.e5(v, (z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value"));
        return null;
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

    private final int B6() throws IOException {
        int v = this.H9.readUnsignedByte();
        if(v >= 0x30 && v <= 57) {
            if((this.a & j.K9) == 0) {
                this.i5("Leading zeroes not allowed");
            }
            while(v == 0x30) {
                v = this.H9.readUnsignedByte();
            }
        }
        return v;
    }

    @Override  // com.fasterxml.jackson.core.n
    public i C2() {
        return c.B9;
    }

    protected String C6(int v) throws IOException {
        if(v == 39 && (this.a & j.N9) != 0) {
            return this.H6();
        }
        if((this.a & j.O9) == 0) {
            this.d5(((int)(((char)this.r6(v)))), "was expecting double-quote to start field name");
        }
        int[] arr_v = com.fasterxml.jackson.core.io.c.m();
        if(arr_v[v] != 0) {
            this.d5(v, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] arr_v1 = this.E9;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        do {
            if(v3 < 4) {
                ++v3;
                v2 = v | v2 << 8;
            }
            else {
                if(v1 >= arr_v1.length) {
                    arr_v1 = c.f6(arr_v1, arr_v1.length);
                    this.E9 = arr_v1;
                }
                arr_v1[v1] = v2;
                v2 = v;
                ++v1;
                v3 = 1;
            }
            v = this.H9.readUnsignedByte();
        }
        while(arr_v[v] == 0);
        this.I9 = v;
        if(v3 > 0) {
            if(v1 >= arr_v1.length) {
                arr_v1 = c.f6(arr_v1, arr_v1.length);
                this.E9 = arr_v1;
            }
            arr_v1[v1] = v2;
            ++v1;
        }
        String s = this.D9.D(arr_v1, v1);
        return s == null ? this.n7(arr_v1, v1, v3) : s;
    }

    protected r D6(int v) throws IOException {
        switch(v) {
            case 39: {
            label_21:
                if((this.a & j.N9) != 0) {
                    return this.y6();
                }
                break;
            }
            case 43: {
                return this.A6(this.H9.readUnsignedByte(), false, true);
            }
            case 44: {
            label_4:
                if(!this.i9.n() && (this.a & j.M9) != 0) {
                    this.I9 = v;
                    return r.v;
                }
                this.d5(v, "expected a value");
                goto label_21;
            }
            case 73: {
                this.E6("Infinity", 1);
                if((this.a & j.L9) != 0) {
                    return this.l6("Infinity", Infinity);
                }
                this.T4("Non-standard token \'Infinity\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break;
            }
            case 78: {
                this.E6("NaN", 1);
                if((this.a & j.L9) != 0) {
                    return this.l6("NaN", NaN);
                }
                this.T4("Non-standard token \'NaN\': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                break;
            }
            case 93: {
                if(this.i9.l()) {
                    goto label_4;
                }
                break;
            }
            case 0x7D: {
                this.d5(0x7D, "expected a value");
                goto label_21;
            }
        }
        if(Character.isJavaIdentifierStart(v)) {
            this.Y6(v, "" + ((char)v), this.R5());
        }
        this.d5(v, "expected a valid value " + this.S5());
        return null;
    }

    protected final void E6(String s, int v) throws IOException {
        int v1 = s.length();
        do {
            int v2 = this.H9.readUnsignedByte();
            if(v2 != s.charAt(v)) {
                this.X6(v2, s.substring(0, v));
            }
            ++v;
        }
        while(v < v1);
        int v3 = this.H9.readUnsignedByte();
        if(v3 >= 0x30 && (v3 != 93 && v3 != 0x7D)) {
            this.o6(s, v, v3);
        }
        this.I9 = v3;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String F3() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                return this.v6();
            }
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(null);
    }

    private final r F6() throws IOException {
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

    private final r G6(int v) throws IOException {
        switch(v) {
            case 34: {
                this.F9 = true;
                this.h = r.q;
                return r.q;
            }
            case 43: {
                if(this.a4(e.k.f())) {
                    r r1 = this.Q6();
                    this.h = r1;
                    return r1;
                }
                r r2 = this.D6(43);
                this.h = r2;
                return r2;
            }
            case 45: {
                r r3 = this.P6();
                this.h = r3;
                return r3;
            }
            case 46: {
                r r4 = this.K6(false, false);
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
                r r5 = this.S6(v);
                this.h = r5;
                return r5;
            }
            case 91: {
                this.Z5(this.g9, this.h9);
                this.h = r.m;
                return r.m;
            }
            case 102: {
                this.E6("false", 1);
                this.h = r.u;
                return r.u;
            }
            case 110: {
                this.E6("null", 1);
                this.h = r.v;
                return r.v;
            }
            case 0x74: {
                this.E6("true", 1);
                this.h = r.t;
                return r.t;
            }
            case 0x7B: {
                this.a6(this.g9, this.h9);
                this.h = r.k;
                return r.k;
            }
            default: {
                r r0 = this.D6(v);
                this.h = r0;
                return r0;
            }
        }
    }

    protected String H6() throws IOException {
        int v = this.H9.readUnsignedByte();
        if(v == 39) {
            return "";
        }
        int[] arr_v = this.E9;
        int[] arr_v1 = j.S9;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v != 39) {
            if(v != 34 && arr_v1[v] != 0) {
                if(v == 92) {
                    v = this.x5();
                }
                else {
                    this.Q5(v, "name");
                }
                if(v > 0x7F) {
                    if(v1 >= 4) {
                        if(v2 >= arr_v.length) {
                            arr_v = c.f6(arr_v, arr_v.length);
                            this.E9 = arr_v;
                        }
                        arr_v[v2] = v3;
                        ++v2;
                        v1 = 0;
                        v3 = 0;
                    }
                    if(v < 0x800) {
                        v3 = v3 << 8 | (v >> 6 | 0xC0);
                        ++v1;
                    }
                    else {
                        int v4 = v3 << 8 | (v >> 12 | 0xE0);
                        int v5 = v1 + 1;
                        if(v5 >= 4) {
                            if(v2 >= arr_v.length) {
                                arr_v = c.f6(arr_v, arr_v.length);
                                this.E9 = arr_v;
                            }
                            arr_v[v2] = v4;
                            ++v2;
                            v5 = 0;
                            v4 = 0;
                        }
                        v3 = v4 << 8 | (v >> 6 & 0x3F | 0x80);
                        v1 = v5 + 1;
                    }
                    v = v & 0x3F | 0x80;
                }
            }
            if(v1 < 4) {
                ++v1;
                v3 = v | v3 << 8;
            }
            else {
                if(v2 >= arr_v.length) {
                    arr_v = c.f6(arr_v, arr_v.length);
                    this.E9 = arr_v;
                }
                arr_v[v2] = v3;
                v3 = v;
                ++v2;
                v1 = 1;
            }
            v = this.H9.readUnsignedByte();
        }
        if(v1 > 0) {
            if(v2 >= arr_v.length) {
                arr_v = c.f6(arr_v, arr_v.length);
                this.E9 = arr_v;
            }
            arr_v[v2] = j.s7(v3, v1);
            ++v2;
        }
        String s = this.D9.D(arr_v, v2);
        return s == null ? this.n7(arr_v, v2, v1) : s;
    }

    private final r I6(char[] arr_c, int v, int v1, boolean z, int v2) throws IOException {
        int v9;
        int v6;
        int v5;
        int v3 = 0;
        if(v1 == 46) {
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            arr_c[v] = '.';
            ++v;
            int v4 = 0;
            while(true) {
                v5 = this.H9.readUnsignedByte();
                if(v5 < 0x30 || v5 > 57) {
                    break;
                }
                ++v4;
                if(v >= arr_c.length) {
                    arr_c = this.k9.y();
                    v = 0;
                }
                arr_c[v] = (char)v5;
                ++v;
            }
            if(v4 == 0 && !this.a4(e.m.f())) {
                this.e5(v5, "Decimal point not followed by a digit");
            }
            v6 = v4;
            v1 = v5;
        }
        else {
            v6 = 0;
        }
        if(v1 == 69 || v1 == 101) {
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            int v7 = v + 1;
            arr_c[v] = (char)v1;
            int v8 = this.H9.readUnsignedByte();
            if(v8 == 43 || v8 == 45) {
                if(v7 >= arr_c.length) {
                    arr_c = this.k9.y();
                    v7 = 0;
                }
                arr_c[v7] = (char)v8;
                v9 = 0;
                v1 = this.H9.readUnsignedByte();
                v = v7 + 1;
            }
            else {
                v1 = v8;
                v = v7;
                v9 = 0;
            }
            while(v1 <= 57 && v1 >= 0x30) {
                ++v9;
                if(v >= arr_c.length) {
                    arr_c = this.k9.y();
                    v = 0;
                }
                arr_c[v] = (char)v1;
                v1 = this.H9.readUnsignedByte();
                ++v;
            }
            if(v9 == 0) {
                this.e5(v1, "Exponent indicator not followed by a digit");
            }
            v3 = v9;
        }
        this.I9 = v1;
        if(this.i9.n()) {
            this.m7();
        }
        this.k9.P(v);
        return this.m6(z, v2, v6, v3);
    }

    @Deprecated
    protected final r J6() throws IOException {
        return this.K6(false, false);
    }

    protected final r K6(boolean z, boolean z1) throws IOException {
        if(!this.a4(e.l.f())) {
            return this.D6(46);
        }
        char[] arr_c = this.k9.s();
        if(z) {
            arr_c[0] = '-';
            return this.I6(arr_c, 1, 46, true, 0);
        }
        return this.I6(arr_c, 0, 46, false, 0);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public byte[] L0(com.fasterxml.jackson.core.a a0) throws IOException {
        if(this.h != r.q && (this.h != r.p || this.o9 == null)) {
            this.T4("Current token (" + this.h + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if(this.F9) {
            try {
                this.o9 = this.q6(a0);
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

    private final String L6(int v, int v1, int v2) throws IOException {
        int[] arr_v = this.E9;
        arr_v[0] = this.G9;
        arr_v[1] = v1;
        arr_v[2] = v2;
        int[] arr_v1 = j.S9;
        int v3 = v;
        int v4 = 3;
        while(true) {
            int v5 = this.H9.readUnsignedByte();
            if(arr_v1[v5] != 0) {
                return v5 == 34 ? this.r7(this.E9, v4, v3, 1) : this.t7(this.E9, v4, v3, v5, 1);
            }
            int v6 = v3 << 8 | v5;
            int v7 = this.H9.readUnsignedByte();
            if(arr_v1[v7] != 0) {
                return v7 == 34 ? this.r7(this.E9, v4, v6, 2) : this.t7(this.E9, v4, v6, v7, 2);
            }
            int v8 = v6 << 8 | v7;
            int v9 = this.H9.readUnsignedByte();
            if(arr_v1[v9] != 0) {
                return v9 == 34 ? this.r7(this.E9, v4, v8, 3) : this.t7(this.E9, v4, v8, v9, 3);
            }
            int v10 = v8 << 8 | v9;
            int v11 = this.H9.readUnsignedByte();
            if(arr_v1[v11] != 0) {
                return v11 == 34 ? this.r7(this.E9, v4, v10, 4) : this.t7(this.E9, v4, v10, v11, 4);
            }
            int[] arr_v2 = this.E9;
            if(v4 >= arr_v2.length) {
                this.E9 = c.f6(arr_v2, v4);
            }
            this.E9[v4] = v10;
            ++v4;
            v3 = v11;
        }
    }

    private final String M6(int v) throws IOException {
        int[] arr_v = j.S9;
        int v1 = this.H9.readUnsignedByte();
        if(arr_v[v1] != 0) {
            return v1 == 34 ? this.p7(this.G9, v, 1) : this.v7(this.G9, v, v1, 1);
        }
        int v2 = v << 8 | v1;
        int v3 = this.H9.readUnsignedByte();
        if(arr_v[v3] != 0) {
            return v3 == 34 ? this.p7(this.G9, v2, 2) : this.v7(this.G9, v2, v3, 2);
        }
        int v4 = v2 << 8 | v3;
        int v5 = this.H9.readUnsignedByte();
        if(arr_v[v5] != 0) {
            return v5 == 34 ? this.p7(this.G9, v4, 3) : this.v7(this.G9, v4, v5, 3);
        }
        int v6 = v4 << 8 | v5;
        int v7 = this.H9.readUnsignedByte();
        if(arr_v[v7] != 0) {
            return v7 == 34 ? this.p7(this.G9, v6, 4) : this.v7(this.G9, v6, v7, 4);
        }
        return this.N6(v7, v6);
    }

    @Override  // com.fasterxml.jackson.core.n
    public Object N1() {
        return this.H9;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String N3(String s) throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                return this.v6();
            }
            return this.k9.q();
        }
        return r0 == r.o ? this.y0() : super.N3(s);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void N5() throws IOException {
        super.N5();
        this.D9.N();
    }

    private final String N6(int v, int v1) throws IOException {
        int[] arr_v = j.S9;
        int v2 = this.H9.readUnsignedByte();
        if(arr_v[v2] != 0) {
            return v2 == 34 ? this.q7(this.G9, v1, v, 1) : this.w7(this.G9, v1, v, v2, 1);
        }
        int v3 = v << 8 | v2;
        int v4 = this.H9.readUnsignedByte();
        if(arr_v[v4] != 0) {
            return v4 == 34 ? this.q7(this.G9, v1, v3, 2) : this.w7(this.G9, v1, v3, v4, 2);
        }
        int v5 = v3 << 8 | v4;
        int v6 = this.H9.readUnsignedByte();
        if(arr_v[v6] != 0) {
            return v6 == 34 ? this.q7(this.G9, v1, v5, 3) : this.w7(this.G9, v1, v5, v6, 3);
        }
        int v7 = v5 << 8 | v6;
        int v8 = this.H9.readUnsignedByte();
        if(arr_v[v8] != 0) {
            return v8 == 34 ? this.q7(this.G9, v1, v7, 4) : this.w7(this.G9, v1, v7, v8, 4);
        }
        return this.L6(v8, v1, v7);
    }

    protected final String O6(int v) throws IOException {
        if(v != 34) {
            return this.C6(v);
        }
        int[] arr_v = j.S9;
        int v1 = this.H9.readUnsignedByte();
        if(arr_v[v1] == 0) {
            int v2 = this.H9.readUnsignedByte();
            if(arr_v[v2] == 0) {
                int v3 = v1 << 8 | v2;
                int v4 = this.H9.readUnsignedByte();
                if(arr_v[v4] == 0) {
                    int v5 = v3 << 8 | v4;
                    int v6 = this.H9.readUnsignedByte();
                    if(arr_v[v6] == 0) {
                        int v7 = v5 << 8 | v6;
                        int v8 = this.H9.readUnsignedByte();
                        if(arr_v[v8] == 0) {
                            this.G9 = v7;
                            return this.M6(v8);
                        }
                        return v8 == 34 ? this.o7(v7, 4) : this.u7(v7, v8, 4);
                    }
                    return v6 == 34 ? this.o7(v5, 3) : this.u7(v5, v6, 3);
                }
                return v4 == 34 ? this.o7(v3, 2) : this.u7(v3, v4, 2);
            }
            return v2 == 34 ? this.o7(v1, 1) : this.u7(v1, v2, 1);
        }
        return v1 == 34 ? "" : this.u7(0, v1, 0);
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

    protected final r P6() throws IOException {
        return this.R6(true);
    }

    protected final r Q6() throws IOException {
        return this.R6(false);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public String R2() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                return this.v6();
            }
            return this.k9.q();
        }
        return this.x6(r0);
    }

    private final r R6(boolean z) throws IOException {
        int v2;
        int v;
        char[] arr_c = this.k9.s();
        if(z) {
            arr_c[0] = '-';
            v = 1;
        }
        else {
            v = 0;
        }
        int v1 = this.H9.readUnsignedByte();
        arr_c[v] = (char)v1;
        if(v1 <= 0x30) {
            if(v1 == 0x30) {
                v2 = this.B6();
                goto label_16;
            }
            return v1 == 46 ? this.K6(z, true) : this.A6(v1, z, true);
        }
        else {
            if(v1 > 57) {
                return this.A6(v1, z, true);
            }
            v2 = this.H9.readUnsignedByte();
        }
    label_16:
        char[] arr_c1 = arr_c;
        int v3 = v2;
        int v4 = v + 1;
        int v5 = 1;
        while(v3 <= 57 && v3 >= 0x30) {
            ++v5;
            if(v4 >= arr_c1.length) {
                arr_c1 = this.k9.y();
                v4 = 0;
            }
            arr_c1[v4] = (char)v3;
            v3 = this.H9.readUnsignedByte();
            ++v4;
        }
        if(v3 != 46 && v3 != 69 && v3 != 101) {
            this.k9.P(v4);
            this.I9 = v3;
            if(this.i9.n()) {
                this.m7();
            }
            return this.n6(z, v5);
        }
        return this.I6(arr_c1, v4, v3, z, v5);
    }

    protected r S6(int v) throws IOException {
        int v2;
        char[] arr_c = this.k9.s();
        int v1 = 1;
        if(v == 0x30) {
            v2 = this.B6();
            if(v2 > 57 || v2 < 0x30) {
                if(v2 != 88 && v2 != 120) {
                    arr_c[0] = '0';
                    goto label_13;
                }
                return this.z6(v2, false);
            }
            else {
                v1 = 0;
            }
        }
        else {
            arr_c[0] = (char)v;
            v2 = this.H9.readUnsignedByte();
        }
    label_13:
        int v3 = v2;
        char[] arr_c1 = arr_c;
        int v4 = v1;
        int v5 = v4;
        while(v3 <= 57 && v3 >= 0x30) {
            ++v5;
            if(v4 >= arr_c1.length) {
                arr_c1 = this.k9.y();
                v4 = 0;
            }
            arr_c1[v4] = (char)v3;
            v3 = this.H9.readUnsignedByte();
            ++v4;
        }
        if(v3 != 46 && v3 != 69 && v3 != 101) {
            this.k9.P(v4);
            this.I9 = v3;
            if(this.i9.n()) {
                this.m7();
            }
            return this.n6(false, v5);
        }
        return this.I6(arr_c1, v4, v3, false, v5);
    }

    protected int T6(com.fasterxml.jackson.core.a a0, OutputStream outputStream0, byte[] arr_b) throws IOException {
        int v = arr_b.length - 3;
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = this.H9.readUnsignedByte();
            if(v3 > 0x20) {
                int v4 = a0.i(v3);
                if(v4 < 0) {
                    if(v3 == 34) {
                        goto label_49;
                    }
                    v4 = this.w5(a0, v3, 0);
                    if(v4 >= 0) {
                        goto label_10;
                    }
                }
                else {
                label_10:
                    if(v1 > v) {
                        v2 += v1;
                        outputStream0.write(arr_b, 0, v1);
                        v1 = 0;
                    }
                    int v5 = this.H9.readUnsignedByte();
                    int v6 = a0.i(v5);
                    if(v6 < 0) {
                        v6 = this.w5(a0, v5, 1);
                    }
                    int v7 = v4 << 6 | v6;
                    int v8 = this.H9.readUnsignedByte();
                    int v9 = a0.i(v8);
                    if(v9 < 0) {
                        if(v9 != -2) {
                            if(v8 == 34) {
                                arr_b[v1] = (byte)(v7 >> 4);
                                if(a0.C()) {
                                    this.H5(a0);
                                }
                                ++v1;
                                goto label_49;
                            }
                            v9 = this.w5(a0, v8, 2);
                        }
                        if(v9 == -2) {
                            int v10 = this.H9.readUnsignedByte();
                            if(!a0.G(v10) && (v10 != 92 || this.w5(a0, 92, 3) != -2)) {
                                throw this.j6(a0, v10, 3, "expected padding character \'" + a0.y() + "\'");
                            }
                            arr_b[v1] = (byte)(v7 >> 4);
                            ++v1;
                            continue;
                        }
                    }
                    int v11 = v7 << 6 | v9;
                    int v12 = this.H9.readUnsignedByte();
                    int v13 = a0.i(v12);
                    if(v13 < 0) {
                        if(v13 != -2) {
                            if(v12 == 34) {
                                int v14 = v1 + 1;
                                arr_b[v1] = (byte)(v11 >> 10);
                                v1 += 2;
                                arr_b[v14] = (byte)(v11 >> 2);
                                if(a0.C()) {
                                    this.H5(a0);
                                }
                            }
                            else {
                                goto label_54;
                            }
                        label_49:
                            this.F9 = false;
                            if(v1 > 0) {
                                v2 += v1;
                                outputStream0.write(arr_b, 0, v1);
                            }
                            return v2;
                        label_54:
                            v13 = this.w5(a0, v12, 3);
                        }
                        if(v13 == -2) {
                            int v15 = v1 + 1;
                            arr_b[v1] = (byte)(v11 >> 10);
                            v1 += 2;
                            arr_b[v15] = (byte)(v11 >> 2);
                            continue;
                        }
                    }
                    int v16 = v11 << 6 | v13;
                    arr_b[v1] = (byte)(v16 >> 16);
                    int v17 = v1 + 2;
                    arr_b[v1 + 1] = (byte)(v16 >> 8);
                    v1 += 3;
                    arr_b[v17] = (byte)v16;
                }
            }
        }
    }

    protected void U6(int v) throws m {
        if(v < 0x20) {
            this.g5(v);
        }
        this.V6(v);
    }

    protected void V6(int v) throws m {
        this.T4("Invalid UTF-8 start byte 0x" + Integer.toHexString(v));
    }

    private void W6(int v) throws m {
        this.T4("Invalid UTF-8 middle byte 0x" + Integer.toHexString(v));
    }

    protected void X6(int v, String s) throws IOException {
        this.Y6(v, s, this.R5());
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

    protected void Y6(int v, String s, String s1) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        while(true) {
            int v1 = (char)this.r6(v);
            if(!Character.isJavaIdentifierPart(((char)v1))) {
                break;
            }
            stringBuilder0.append(((char)v1));
            v = this.H9.readUnsignedByte();
        }
        this.T4("Unrecognized token \'" + stringBuilder0.toString() + "\': was expecting " + s1);
    }

    private final void Z6() throws IOException {
        int[] arr_v = com.fasterxml.jackson.core.io.c.i();
        int v = this.H9.readUnsignedByte();
        while(true) {
            switch(arr_v[v]) {
                case 0: {
                    v = this.H9.readUnsignedByte();
                    continue;
                }
                case 2: {
                    this.f7();
                    v = this.H9.readUnsignedByte();
                    continue;
                }
                case 3: {
                    this.g7();
                    v = this.H9.readUnsignedByte();
                    continue;
                }
                case 4: {
                    this.h7();
                    v = this.H9.readUnsignedByte();
                    continue;
                }
                case 10: 
                case 13: {
                    ++this.d9;
                    v = this.H9.readUnsignedByte();
                    continue;
                }
                case 42: {
                    break;
                }
                default: {
                    this.U6(v);
                    v = this.H9.readUnsignedByte();
                    continue;
                }
            }
            v = this.H9.readUnsignedByte();
            if(v == 0x2F) {
                break;
            }
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public u a1() {
        return this.C9;
    }

    private final int a7() throws IOException {
        int v = this.I9;
        if(v < 0) {
            v = this.H9.readUnsignedByte();
        }
        else {
            this.I9 = -1;
        }
        if(v == 58) {
            int v1 = this.H9.readUnsignedByte();
            if(v1 > 0x20) {
                return v1 == 35 || v1 == 0x2F ? this.b7(v1, true) : v1;
            }
            if(v1 == 9 || v1 == 0x20) {
                v1 = this.H9.readUnsignedByte();
                return v1 <= 0x20 || (v1 == 35 || v1 == 0x2F) ? this.b7(v1, true) : v1;
            }
            return this.b7(v1, true);
        }
        if(v == 9 || v == 0x20) {
            v = this.H9.readUnsignedByte();
        }
        if(v == 58) {
            int v2 = this.H9.readUnsignedByte();
            if(v2 > 0x20) {
                return v2 == 35 || v2 == 0x2F ? this.b7(v2, true) : v2;
            }
            if(v2 == 9 || v2 == 0x20) {
                v2 = this.H9.readUnsignedByte();
                return v2 <= 0x20 || (v2 == 35 || v2 == 0x2F) ? this.b7(v2, true) : v2;
            }
            return this.b7(v2, true);
        }
        return this.b7(v, false);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public l b1() {
        return new l(this.s5(), -1L, -1L, this.d9, -1);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public int b3() throws IOException {
        r r0 = this.h;
        if(r0 == r.q) {
            if(this.F9) {
                this.F9 = false;
                this.z5();
            }
            return this.k9.Q();
        }
        if(r0 == r.o) {
            return this.i9.b().length();
        }
        if(r0 != null) {
            return r0.f() ? this.k9.Q() : this.h.b().length;
        }
        return 0;
    }

    private final int b7(int v, boolean z) throws IOException {
        while(true) {
            if(v > 0x20) {
                switch(v) {
                    case 35: {
                        if(!this.l7()) {
                        label_7:
                            if(!z) {
                                if(v != 58) {
                                    this.d5(v, "was expecting a colon to separate field name and value");
                                }
                                z = true;
                                break;
                            }
                            return v;
                        }
                        break;
                    }
                    case 0x2F: {
                        this.c7();
                        break;
                    }
                    default: {
                        goto label_7;
                    }
                }
            }
            else if(v == 10 || v == 13) {
                ++this.d9;
            }
            v = this.H9.readUnsignedByte();
        }
    }

    private final void c7() throws IOException {
        if((this.a & j.P9) == 0) {
            this.d5(0x2F, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)");
        }
        int v = this.H9.readUnsignedByte();
        if(v == 0x2F) {
            this.d7();
            return;
        }
        if(v == 42) {
            this.Z6();
            return;
        }
        this.d5(v, "was expecting either \'*\' or \'/\' for a comment");
    }

    private final void d7() throws IOException {
        int[] arr_v = com.fasterxml.jackson.core.io.c.i();
    alab1:
        while(true) {
            int v = this.H9.readUnsignedByte();
            int v1 = arr_v[v];
            switch(v1) {
                case 2: {
                    this.f7();
                    break;
                }
                case 3: {
                    this.g7();
                    break;
                }
                case 4: {
                    this.h7();
                    break;
                }
                case 10: 
                case 13: {
                    break alab1;
                }
                case 0: 
                case 42: {
                    break;
                }
                default: {
                    if(v1 >= 0) {
                        break;
                    }
                    this.U6(v);
                }
            }
        }
        ++this.d9;
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

    protected void e7() throws IOException {
        this.F9 = false;
        int[] arr_v = j.R9;
        while(true) {
            int v = this.H9.readUnsignedByte();
            int v1 = arr_v[v];
            if(v1 != 0) {
                if(v == 34) {
                    break;
                }
                switch(v1) {
                    case 1: {
                        this.x5();
                        break;
                    }
                    case 2: {
                        this.f7();
                        break;
                    }
                    case 3: {
                        this.g7();
                        break;
                    }
                    case 4: {
                        this.h7();
                        break;
                    }
                    default: {
                        if(v < 0x20) {
                            this.Q5(v, "string value");
                        }
                        else {
                            this.U6(v);
                        }
                        break;
                    }
                }
            }
        }
    }

    private final void f7() throws IOException {
        int v = this.H9.readUnsignedByte();
        if((v & 0xC0) != 0x80) {
            this.W6(v & 0xFF);
        }
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

    private final void g7() throws IOException {
        int v = this.H9.readUnsignedByte();
        if((v & 0xC0) != 0x80) {
            this.W6(v & 0xFF);
        }
        int v1 = this.H9.readUnsignedByte();
        if((v1 & 0xC0) != 0x80) {
            this.W6(v1 & 0xFF);
        }
    }

    @Override  // com.fasterxml.jackson.core.n
    public String h4() throws IOException {
        r r1;
        this.p9 = 0;
        r r0 = r.o;
        if(this.h == r0) {
            this.F6();
            return null;
        }
        if(this.F9) {
            this.e7();
        }
        int v = this.i7();
        this.o9 = null;
        this.g9 = this.d9;
        if(v != 93 && v != 0x7D) {
            if(this.i9.z()) {
                if(v != 44) {
                    this.d5(v, "was expecting comma to separate root entries");
                }
                v = this.i7();
                if((this.a & j.J9) != 0 && (v == 93 || v == 0x7D)) {
                    this.p6(v);
                    return null;
                }
            }
            if(!this.i9.m()) {
                this.G6(v);
                return null;
            }
            String s = this.O6(v);
            this.i9.D(s);
            this.h = r0;
            int v1 = this.a7();
            switch(v1) {
                case 34: {
                    this.F9 = true;
                    this.j9 = r.q;
                    return s;
                }
                case 43: {
                    r1 = this.a4(e.k.f()) ? this.Q6() : this.D6(43);
                    break;
                }
                case 45: {
                    r1 = this.P6();
                    break;
                }
                case 46: {
                    this.K6(false, false);
                    r1 = this.S6(46);
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
                    this.E6("false", 1);
                    r1 = r.u;
                    break;
                }
                case 110: {
                    this.E6("null", 1);
                    r1 = r.v;
                    break;
                }
                case 0x74: {
                    this.E6("true", 1);
                    r1 = r.t;
                    break;
                }
                case 0x7B: {
                    r1 = r.k;
                    break;
                }
                default: {
                    r1 = this.D6(v1);
                    break;
                }
            }
            this.j9 = r1;
            return s;
        }
        this.p6(v);
        return null;
    }

    private final void h7() throws IOException {
        int v = this.H9.readUnsignedByte();
        if((v & 0xC0) != 0x80) {
            this.W6(v & 0xFF);
        }
        int v1 = this.H9.readUnsignedByte();
        if((v1 & 0xC0) != 0x80) {
            this.W6(v1 & 0xFF);
        }
        int v2 = this.H9.readUnsignedByte();
        if((v2 & 0xC0) != 0x80) {
            this.W6(v2 & 0xFF);
        }
    }

    @Override  // com.fasterxml.jackson.core.base.c
    public l i3() {
        return new l(this.s5(), -1L, -1L, this.g9, -1);
    }

    private final int i7() throws IOException {
        int v = this.I9;
        if(v < 0) {
            v = this.H9.readUnsignedByte();
        }
        else {
            this.I9 = -1;
        }
        while(v <= 0x20) {
            if(v == 10 || v == 13) {
                ++this.d9;
            }
            v = this.H9.readUnsignedByte();
        }
        return v == 35 || v == 0x2F ? this.j7(v) : v;
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

    private final int j7(int v) throws IOException {
        while(true) {
            if(v > 0x20) {
                switch(v) {
                    case 35: {
                        if(!this.l7()) {
                            return 35;
                        }
                        break;
                    }
                    case 0x2F: {
                        this.c7();
                        break;
                    }
                    default: {
                        return v;
                    }
                }
            }
            else if(v == 10 || v == 13) {
                ++this.d9;
            }
            v = this.H9.readUnsignedByte();
        }
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
        int v = this.I9;
        if(v < 0) {
            try {
                v = this.H9.readUnsignedByte();
            }
            catch(EOFException unused_ex) {
                return this.y5();
            }
        }
        else {
            this.I9 = -1;
        }
        while(true) {
            if(v > 0x20) {
                return v == 35 || v == 0x2F ? this.j7(v) : v;
            }
            if(v == 10 || v == 13) {
                ++this.d9;
            }
            try {
                v = this.H9.readUnsignedByte();
                continue;
            }
            catch(EOFException unused_ex) {
            }
            break;
        }
        return this.y5();
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
                    return this.v6();
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

    private final boolean l7() throws IOException {
        if((this.a & j.Q9) == 0) {
            return false;
        }
        this.d7();
        return true;
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public r m4() throws IOException {
        r r1;
        if(this.Z8) {
            return null;
        }
        r r0 = r.o;
        if(this.h == r0) {
            return this.F6();
        }
        this.p9 = 0;
        if(this.F9) {
            this.e7();
        }
        int v = this.k7();
        if(v < 0) {
            this.close();
            this.h = null;
            return null;
        }
        this.o9 = null;
        this.g9 = this.d9;
        if(v != 93 && v != 0x7D) {
            if(this.i9.z()) {
                if(v != 44) {
                    this.d5(v, "was expecting comma to separate root entries");
                }
                v = this.i7();
                if((this.a & j.J9) != 0 && (v == 93 || v == 0x7D)) {
                    this.p6(v);
                    return this.h;
                }
            }
            if(!this.i9.m()) {
                return this.G6(v);
            }
            String s = this.O6(v);
            this.i9.D(s);
            this.h = r0;
            int v1 = this.a7();
            switch(v1) {
                case 34: {
                    this.F9 = true;
                    this.j9 = r.q;
                    return this.h;
                }
                case 43: {
                    r1 = this.a4(e.k.f()) ? this.Q6() : this.D6(43);
                    break;
                }
                case 45: {
                    r1 = this.P6();
                    break;
                }
                case 46: {
                    r1 = this.K6(false, false);
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
                    this.E6("false", 1);
                    r1 = r.u;
                    break;
                }
                case 110: {
                    this.E6("null", 1);
                    r1 = r.v;
                    break;
                }
                case 0x74: {
                    this.E6("true", 1);
                    r1 = r.t;
                    break;
                }
                case 0x7B: {
                    r1 = r.k;
                    break;
                }
                default: {
                    r1 = this.D6(v1);
                    break;
                }
            }
            this.j9 = r1;
            return this.h;
        }
        this.p6(v);
        return this.h;
    }

    private final void m7() throws IOException {
        int v = this.I9;
        if(v <= 0x20) {
            this.I9 = -1;
            if(v == 10 || v == 13) {
                ++this.d9;
            }
            return;
        }
        this.c5(v);
    }

    private final String n7(int[] arr_v, int v, int v1) throws m, b {
        int v10;
        int v9;
        int v3;
        int v2 = (v << 2) - 4 + v1;
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
                    goto label_28;
                }
                else if((v6 & 0xF8) == 0xF0) {
                    v9 = v6 & 7;
                    v10 = 3;
                    goto label_28;
                }
                else {
                    this.V6(v7);
                    v9 = 1;
                }
                v10 = 1;
            label_28:
                if(v8 + v10 > v2) {
                    this.Z4(" in field name", r.o);
                }
                int v11 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                v8 = v4 + 2;
                if((v11 & 0xC0) != 0x80) {
                    this.W6(v11);
                }
                int v12 = v9 << 6 | v11 & 0x3F;
                if(v10 > 1) {
                    int v13 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                    v8 = v4 + 3;
                    if((v13 & 0xC0) != 0x80) {
                        this.W6(v13);
                    }
                    v12 = v12 << 6 | v13 & 0x3F;
                    if(v10 > 2) {
                        int v14 = arr_v[v8 >> 2] >> ((~v8 & 3) << 3);
                        v8 = v4 + 4;
                        if((v14 & 0xC0) != 0x80) {
                            this.W6(v14 & 0xFF);
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
        if(!this.D9.F()) {
            return s;
        }
        if(v1 < 4) {
            arr_v[v - 1] = v3;
        }
        return this.D9.s(s, arr_v, v);
    }

    private final void o6(String s, int v, int v1) throws IOException {
        int v2 = (char)this.r6(v1);
        if(Character.isJavaIdentifierPart(((char)v2))) {
            this.X6(v2, s.substring(0, v));
        }
    }

    private final String o7(int v, int v1) throws m, b {
        int v2 = j.s7(v, v1);
        String s = this.D9.A(v2);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.E9;
        arr_v[0] = v2;
        return this.n7(arr_v, 1, v1);
    }

    private void p6(int v) throws m {
        if(v == 93) {
            if(!this.i9.l()) {
                this.O5(93, '}');
            }
            this.i9 = this.i9.u();
            this.h = r.n;
        }
        if(v == 0x7D) {
            if(!this.i9.m()) {
                this.O5(0x7D, ']');
            }
            this.i9 = this.i9.u();
            this.h = r.l;
        }
    }

    private final String p7(int v, int v1, int v2) throws m, b {
        int v3 = j.s7(v1, v2);
        String s = this.D9.B(v, v3);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.E9;
        arr_v[0] = v;
        arr_v[1] = v3;
        return this.n7(arr_v, 2, v2);
    }

    protected final byte[] q6(com.fasterxml.jackson.core.a a0) throws IOException {
        com.fasterxml.jackson.core.util.c c0 = this.C5();
        while(true) {
            int v = this.H9.readUnsignedByte();
            if(v > 0x20) {
                int v1 = a0.i(v);
                if(v1 < 0) {
                    if(v == 34) {
                        return new byte[0];
                    }
                    v1 = this.w5(a0, v, 0);
                    if(v1 >= 0) {
                        goto label_9;
                    }
                }
                else {
                label_9:
                    int v2 = this.H9.readUnsignedByte();
                    int v3 = a0.i(v2);
                    if(v3 < 0) {
                        v3 = this.w5(a0, v2, 1);
                    }
                    int v4 = v1 << 6 | v3;
                    int v5 = this.H9.readUnsignedByte();
                    int v6 = a0.i(v5);
                    if(v6 < 0) {
                        if(v6 != -2) {
                            if(v5 == 34) {
                                c0.b(v4 >> 4);
                                if(a0.C()) {
                                    this.H5(a0);
                                }
                                return new byte[0];
                            }
                            v6 = this.w5(a0, v5, 2);
                        }
                        if(v6 == -2) {
                            int v7 = this.H9.readUnsignedByte();
                            if(!a0.G(v7) && (v7 != 92 || this.w5(a0, 92, 3) != -2)) {
                                throw this.j6(a0, v7, 3, "expected padding character \'" + a0.y() + "\'");
                            }
                            c0.b(v4 >> 4);
                            continue;
                        }
                    }
                    int v8 = v4 << 6 | v6;
                    int v9 = this.H9.readUnsignedByte();
                    int v10 = a0.i(v9);
                    if(v10 < 0) {
                        if(v10 != -2) {
                            if(v9 == 34) {
                                c0.f(v8 >> 2);
                                if(a0.C()) {
                                    this.H5(a0);
                                }
                                return new byte[0];
                            }
                            v10 = this.w5(a0, v9, 3);
                        }
                        if(v10 == -2) {
                            c0.f(v8 >> 2);
                            continue;
                        }
                    }
                    c0.e(v8 << 6 | v10);
                }
            }
        }
    }

    private final String q7(int v, int v1, int v2, int v3) throws m, b {
        int v4 = j.s7(v2, v3);
        String s = this.D9.C(v, v1, v4);
        if(s != null) {
            return s;
        }
        int[] arr_v = this.E9;
        arr_v[0] = v;
        arr_v[1] = v1;
        arr_v[2] = j.s7(v4, v3);
        return this.n7(arr_v, 3, v3);
    }

    @Override  // com.fasterxml.jackson.core.n
    public int r4(com.fasterxml.jackson.core.a a0, OutputStream outputStream0) throws IOException {
        if(this.F9 && this.h == r.q) {
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
    }

    protected int r6(int v) throws IOException {
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
                this.V6(v & 0xFF);
                v2 = 1;
            }
            int v3 = this.H9.readUnsignedByte();
            if((v3 & 0xC0) != 0x80) {
                this.W6(v3 & 0xFF);
            }
            v1 = v1 << 6 | v3 & 0x3F;
            if(v2 > 1) {
                int v4 = this.H9.readUnsignedByte();
                if((v4 & 0xC0) != 0x80) {
                    this.W6(v4 & 0xFF);
                }
                v1 = v1 << 6 | v4 & 0x3F;
                if(v2 > 2) {
                    int v5 = this.H9.readUnsignedByte();
                    if((v5 & 0xC0) != 0x80) {
                        this.W6(v5 & 0xFF);
                    }
                    return v1 << 6 | v5 & 0x3F;
                }
            }
        }
        return v1;
    }

    private final String r7(int[] arr_v, int v, int v1, int v2) throws m, b {
        if(v >= arr_v.length) {
            arr_v = c.f6(arr_v, arr_v.length);
            this.E9 = arr_v;
        }
        arr_v[v] = j.s7(v1, v2);
        String s = this.D9.D(arr_v, v + 1);
        return s == null ? this.n7(arr_v, v + 1, v2) : s;
    }

    private final int s6(int v) throws IOException {
        int v1 = this.H9.readUnsignedByte();
        if((v1 & 0xC0) != 0x80) {
            this.W6(v1 & 0xFF);
        }
        return (v & 0x1F) << 6 | v1 & 0x3F;
    }

    private static final int s7(int v, int v1) {
        return v1 == 4 ? v : v | -1 << (v1 << 3);
    }

    private final int t6(int v) throws IOException {
        int v1 = this.H9.readUnsignedByte();
        if((v1 & 0xC0) != 0x80) {
            this.W6(v1 & 0xFF);
        }
        int v2 = this.H9.readUnsignedByte();
        if((v2 & 0xC0) != 0x80) {
            this.W6(v2 & 0xFF);
        }
        return ((v & 15) << 6 | v1 & 0x3F) << 6 | v2 & 0x3F;
    }

    protected final String t7(int[] arr_v, int v, int v1, int v2, int v3) throws IOException {
        int[] arr_v1 = j.S9;
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
                                    arr_v = c.f6(arr_v, arr_v.length);
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
                                        arr_v = c.f6(arr_v, arr_v.length);
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
                    arr_v = c.f6(arr_v, arr_v.length);
                    this.E9 = arr_v;
                }
                arr_v[v] = v1;
                v1 = v2;
                ++v;
                v3 = 1;
            }
            v2 = this.H9.readUnsignedByte();
        }
        if(v3 > 0) {
            if(v >= arr_v.length) {
                arr_v = c.f6(arr_v, arr_v.length);
                this.E9 = arr_v;
            }
            arr_v[v] = j.s7(v1, v3);
            ++v;
        }
        String s = this.D9.D(arr_v, v);
        return s == null ? this.n7(arr_v, v, v3) : s;
    }

    @Override  // com.fasterxml.jackson.core.n
    public void u0() throws IOException {
        if(this.F9) {
            this.F9 = false;
            this.z5();
        }
    }

    private final int u6(int v) throws IOException {
        int v1 = this.H9.readUnsignedByte();
        if((v1 & 0xC0) != 0x80) {
            this.W6(v1 & 0xFF);
        }
        int v2 = this.H9.readUnsignedByte();
        if((v2 & 0xC0) != 0x80) {
            this.W6(v2 & 0xFF);
        }
        int v3 = this.H9.readUnsignedByte();
        if((v3 & 0xC0) != 0x80) {
            this.W6(v3 & 0xFF);
        }
        return ((((v & 7) << 6 | v1 & 0x3F) << 6 | v2 & 0x3F) << 6 | v3 & 0x3F) - 0x10000;
    }

    private final String u7(int v, int v1, int v2) throws IOException {
        return this.t7(this.E9, 0, v, v1, v2);
    }

    private String v6() throws IOException {
        char[] arr_c = this.k9.s();
        int[] arr_v = j.R9;
        for(int v = 0; true; ++v) {
            int v1 = this.H9.readUnsignedByte();
            if(arr_v[v1] != 0) {
                if(v1 == 34) {
                    return this.k9.O(v);
                }
                this.w6(arr_c, v, v1);
                return this.k9.q();
            }
            arr_c[v] = (char)v1;
            if(v + 1 >= arr_c.length) {
                this.w6(arr_c, v + 1, this.H9.readUnsignedByte());
                return this.k9.q();
            }
        }
    }

    private final String v7(int v, int v1, int v2, int v3) throws IOException {
        int[] arr_v = this.E9;
        arr_v[0] = v;
        return this.t7(arr_v, 1, v1, v2, v3);
    }

    private final void w6(char[] arr_c, int v, int v1) throws IOException {
        int[] arr_v = j.R9;
        int v2 = arr_c.length;
        while(true) {
            int v3 = arr_v[v1];
            int v4 = 0;
            if(v3 == 0) {
                if(v >= v2) {
                    arr_c = this.k9.y();
                    v2 = arr_c.length;
                    v = 0;
                }
                arr_c[v] = (char)v1;
                v1 = this.H9.readUnsignedByte();
                ++v;
            }
            else {
                if(v1 == 34) {
                    break;
                }
                switch(v3) {
                    case 1: {
                        v1 = this.x5();
                        break;
                    }
                    case 2: {
                        v1 = this.s6(v1);
                        break;
                    }
                    case 3: {
                        v1 = this.t6(v1);
                        break;
                    }
                    case 4: {
                        int v5 = this.u6(v1);
                        if(v >= arr_c.length) {
                            arr_c = this.k9.y();
                            v2 = arr_c.length;
                            v = 0;
                        }
                        arr_c[v] = (char)(v5 >> 10 | 0xD800);
                        v1 = 0xDC00 | v5 & 0x3FF;
                        ++v;
                        break;
                    }
                    default: {
                        if(v1 < 0x20) {
                            this.Q5(v1, "string value");
                        }
                        else {
                            this.U6(v1);
                        }
                    }
                }
                if(v >= arr_c.length) {
                    arr_c = this.k9.y();
                    v2 = arr_c.length;
                }
                else {
                    v4 = v;
                }
                v = v4 + 1;
                arr_c[v4] = (char)v1;
                v1 = this.H9.readUnsignedByte();
            }
        }
        this.k9.P(v);
    }

    private final String w7(int v, int v1, int v2, int v3, int v4) throws IOException {
        int[] arr_v = this.E9;
        arr_v[0] = v;
        arr_v[1] = v1;
        return this.t7(arr_v, 2, v2, v3, v4);
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected char x5() throws IOException {
        int v = this.H9.readUnsignedByte();
        switch(v) {
            case 34: 
            case 0x2F: 
            case 92: {
                return (char)v;
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
                    int v3 = this.H9.readUnsignedByte();
                    int v4 = com.fasterxml.jackson.core.io.c.b(v3);
                    if(v4 < 0) {
                        this.d5(v3, "expected a hex-digit for character escape sequence");
                    }
                    v1 = v1 << 4 | v4;
                }
                return (char)v1;
            }
            default: {
                return this.I5(((char)this.r6(v)));
            }
        }
    }

    protected final String x6(r r0) throws IOException {
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
        return 0;
    }

    protected r y6() throws IOException {
        char[] arr_c = this.k9.s();
        int[] arr_v = j.R9;
        int v = 0;
        while(true) {
            int v1 = arr_c.length;
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v1 = arr_c.length;
                v = 0;
            }
        label_8:
            int v2 = this.H9.readUnsignedByte();
            if(v2 == 39) {
                break;
            }
            int v3 = arr_v[v2];
            if(v3 != 0 && v2 != 34) {
                switch(v3) {
                    case 1: {
                        v2 = this.x5();
                        break;
                    }
                    case 2: {
                        v2 = this.s6(v2);
                        break;
                    }
                    case 3: {
                        v2 = this.t6(v2);
                        break;
                    }
                    case 4: {
                        int v4 = this.u6(v2);
                        arr_c[v] = (char)(v4 >> 10 | 0xD800);
                        if(v + 1 >= arr_c.length) {
                            arr_c = this.k9.y();
                            v = 0;
                        }
                        else {
                            ++v;
                        }
                        v2 = 0xDC00 | v4 & 0x3FF;
                        break;
                    }
                    default: {
                        if(v2 < 0x20) {
                            this.Q5(v2, "string value");
                        }
                        this.U6(v2);
                    }
                }
                if(v >= arr_c.length) {
                    arr_c = this.k9.y();
                    v = 0;
                }
                arr_c[v] = (char)v2;
                ++v;
                continue;
            }
            int v5 = v + 1;
            arr_c[v] = (char)v2;
            v = v5;
            if(v5 >= v1) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_8;
        }
        this.k9.P(v);
        return r.q;
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected void z5() throws IOException {
        char[] arr_c = this.k9.s();
        int[] arr_v = j.R9;
        for(int v = 0; true; ++v) {
            int v1 = this.H9.readUnsignedByte();
            if(arr_v[v1] != 0) {
                if(v1 == 34) {
                    this.k9.P(v);
                    return;
                }
                this.w6(arr_c, v, v1);
                return;
            }
            arr_c[v] = (char)v1;
            if(v + 1 >= arr_c.length) {
                this.w6(arr_c, v + 1, this.H9.readUnsignedByte());
                return;
            }
        }
    }

    protected r z6(int v, boolean z) throws IOException {
        return this.A6(v, z, false);
    }
}

