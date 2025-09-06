package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.io.g;
import com.fasterxml.jackson.core.json.e;
import com.fasterxml.jackson.core.n.a;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.util.z;
import java.io.IOException;

public abstract class d extends c {
    protected int Ra;
    private static final int Sa;
    private static final int Ta;
    private static final int Ua;
    private static final int Va;
    private static final int Wa;
    private static final int Xa;
    private static final int Ya;
    private static final int[] Za;
    protected static final int[] ab;

    static {
        d.Sa = a.p.d();
        d.Ta = a.j.d();
        d.Ua = a.o.d();
        d.Va = a.g.d();
        d.Wa = a.f.d();
        d.Xa = a.d.d();
        d.Ya = a.e.d();
        d.Za = com.fasterxml.jackson.core.io.c.l();
        d.ab = com.fasterxml.jackson.core.io.c.j();
    }

    protected d(g g0, int v, com.fasterxml.jackson.core.sym.a a0) {
        super(g0, v, a0);
    }

    private final int A7(int v) throws IOException {
        do {
            switch(v) {
                case 10: {
                    ++this.d9;
                    this.e9 = this.a9;
                    break;
                }
                case 13: {
                    ++this.R9;
                    this.e9 = this.a9;
                    break;
                }
                case 9: 
                case 0x20: {
                    break;
                }
                default: {
                    this.g5(v);
                }
            }
            if(this.a9 >= this.b9) {
                this.h = r.j;
                return 0;
            }
            v = this.Y7();
        }
        while(v <= 0x20);
        return v;
    }

    private final r B7(int v) throws IOException {
        if(this.a9 >= this.b9) {
            this.M9 = v;
            this.h = r.j;
            return r.j;
        }
        int v1 = this.Y7();
        switch(v) {
            case 4: {
                return this.F7(v1);
            }
            case 5: {
                return this.G7(v1);
            }
            case 12: {
                return this.S7(v1);
            }
            case 13: {
                return this.V7(v1);
            }
            case 14: {
                return this.U7(v1);
            }
            case 15: {
                return this.T7(v1);
            }
            default: {
                z.f();
                return null;
            }
        }
    }

    protected r C7() throws IOException {
        int v = this.a9;
        char[] arr_c = this.k9.s();
        int[] arr_v = d.Za;
        int v1 = Math.min(this.b9, arr_c.length + v);
        int v2;
        for(v2 = 0; v < v1; ++v2) {
            int v3 = this.W7(v);
            if((v3 & 0xFF) == 39) {
                this.a9 = v + 1;
                this.k9.P(v2);
                return this.G6(r.q);
            }
            if(arr_v[v3 & 0xFF] != 0) {
                break;
            }
            ++v;
            arr_c[v2] = (char)(v3 & 0xFF);
        }
        this.k9.P(v2);
        this.a9 = v;
        return this.V6();
    }

    private final r D7(int v) throws IOException {
        int v1 = v & 0xFF;
        if(v1 == 0xEF && this.M9 != 1) {
            return this.W6(1);
        }
        while(v1 <= 0x20) {
            switch(v1) {
                case 10: {
                    ++this.d9;
                    this.e9 = this.a9;
                    break;
                }
                case 13: {
                    ++this.R9;
                    this.e9 = this.a9;
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
            if(this.a9 >= this.b9) {
                this.M9 = 3;
                if(this.Z8) {
                    return null;
                }
                return this.O9 ? this.r6() : r.j;
            }
            v1 = this.Y7();
        }
        return this.S7(v1);
    }

    protected r E7() throws IOException {
        int v = this.a9;
        if(v + 4 < this.b9 && this.W7(v) == 97 && this.W7(v + 1) == 108 && this.W7(v + 2) == 0x73 && this.W7(v + 3) == 101) {
            int v1 = this.W7(v + 4);
            if((v1 & 0xFF) < 0x30 || ((v1 & 0xFF) == 93 || (v1 & 0xFF) == 0x7D)) {
                this.a9 = v + 4;
                return this.G6(r.u);
            }
        }
        this.M9 = 18;
        return this.f7("false", 1, r.u);
    }

    private final r F7(int v) throws IOException {
        if(v <= 0x20) {
            v = this.A7(v);
            if(v <= 0) {
                this.M9 = 4;
                return this.h;
            }
        }
        this.F6();
        switch(v) {
            case 34: {
                if(this.a9 + 13 <= this.b9) {
                    String s = this.T6();
                    return s == null ? this.w7(0, 0, 0) : this.s6(s);
                }
                return this.w7(0, 0, 0);
            }
            case 0x7D: {
                return this.q6();
            }
            default: {
                return this.v7(v);
            }
        }
    }

    private final r G7(int v) throws IOException {
        if(v <= 0x20) {
            v = this.A7(v);
            if(v <= 0) {
                this.M9 = 5;
                return this.h;
            }
        }
        switch(v) {
            case 35: {
                return this.e7(5);
            }
            case 44: {
                break;
            }
            case 0x2F: {
                return this.O7(5);
            }
            case 0x7D: {
                return this.q6();
            }
            default: {
                this.d5(v, "was expecting comma to separate root entries");
                break;
            }
        }
        int v1 = this.a9;
        if(v1 >= this.b9) {
            this.M9 = 4;
            this.h = r.j;
            return r.j;
        }
        int v2 = this.W7(v1);
        this.a9 = v1 + 1;
        if(v2 <= 0x20) {
            v2 = this.A7(v2);
            if(v2 <= 0) {
                this.M9 = 4;
                return this.h;
            }
        }
        this.F6();
        switch(v2) {
            case 34: {
                if(this.a9 + 13 <= this.b9) {
                    String s = this.T6();
                    return s == null ? this.w7(0, 0, 0) : this.s6(s);
                }
                return this.w7(0, 0, 0);
            }
            case 0x7D: {
                return (this.a & d.Sa) == 0 ? this.v7(0x7D) : this.q6();
            }
            default: {
                return this.v7(v2);
            }
        }
    }

    protected r H7(char[] arr_c, int v, int v1) throws IOException {
        int v5;
        int v4;
        int v3;
        int v2 = 0;
        if(v1 == 46) {
            if(v >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v] = '.';
            ++v;
            v3 = 0;
            while(true) {
                if(this.a9 >= this.b9) {
                    this.k9.P(v);
                    this.M9 = 30;
                    this.z9 = v3;
                    this.h = r.j;
                    return r.j;
                }
                v4 = this.X7();
                if(v4 < 0x30 || v4 > 57) {
                    break;
                }
                if(v >= arr_c.length) {
                    arr_c = this.k9.v();
                }
                arr_c[v] = (char)v4;
                ++v3;
                ++v;
            }
            v5 = v4 & 0xFF;
            if(v3 == 0 && !this.a4(e.m.f())) {
                this.e5(v5, "Decimal point not followed by a digit");
            }
        }
        else {
            v5 = v1;
            v3 = 0;
        }
        this.z9 = v3;
        if(v5 == 69 || v5 == 101) {
            if(v >= arr_c.length) {
                arr_c = this.k9.v();
            }
            int v6 = v + 1;
            arr_c[v] = (char)v5;
            if(this.a9 >= this.b9) {
                this.k9.P(v6);
                this.M9 = 0x1F;
                this.A9 = 0;
                this.h = r.j;
                return r.j;
            }
            int v7 = this.X7();
            if(v7 == 43 || v7 == 45) {
                if(v6 >= arr_c.length) {
                    arr_c = this.k9.v();
                }
                v += 2;
                arr_c[v6] = (char)v7;
                if(this.a9 >= this.b9) {
                    this.k9.P(v);
                    this.M9 = 0x20;
                    this.A9 = 0;
                    this.h = r.j;
                    return r.j;
                }
                v7 = this.X7();
                goto label_54;
            }
            while(true) {
                v = v6;
            label_54:
                if(v7 < 0x30 || v7 > 57) {
                    break;
                }
                ++v2;
                if(v >= arr_c.length) {
                    arr_c = this.k9.v();
                }
                v6 = v + 1;
                arr_c[v] = (char)v7;
                if(this.a9 >= this.b9) {
                    this.k9.P(v6);
                    this.M9 = 0x20;
                    this.A9 = v2;
                    this.h = r.j;
                    return r.j;
                }
                v7 = this.X7();
            }
            if(v2 == 0) {
                this.e5(v7 & 0xFF, "Exponent indicator not followed by a digit");
            }
        }
        --this.a9;
        this.k9.P(v);
        this.A9 = v2;
        return this.G6(r.s);
    }

    protected r I7() throws IOException {
        this.x9 = false;
        this.y9 = 0;
        return this.H7(this.k9.s(), 0, 46);
    }

    protected r J7() throws IOException {
        this.x9 = true;
        if(this.a9 >= this.b9) {
            this.M9 = 23;
            this.h = r.j;
            return r.j;
        }
        int v = this.Y7();
        if(v <= 0x30) {
            if(v == 0x30) {
                return this.k7();
            }
            this.e5(v, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        else if(v > 57) {
            if(v == 73) {
                return this.h7(3, 2);
            }
            this.e5(v, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] arr_c = this.k9.s();
        arr_c[0] = '-';
        arr_c[1] = (char)v;
        int v2 = this.a9;
        if(v2 >= this.b9) {
            this.M9 = 26;
            this.k9.P(2);
            this.y9 = 1;
            this.h = r.j;
            return r.j;
        }
        int v3 = this.W7(v2);
        for(int v1 = 2; true; ++v1) {
            if(v3 < 0x30) {
                if(v3 != 46) {
                    this.y9 = v1 - 1;
                    this.k9.P(v1);
                    return this.G6(r.r);
                }
                this.y9 = v1 - 1;
                ++this.a9;
                return this.H7(arr_c, v1, 46);
            }
            if(v3 > 57) {
                if(v3 != 69 && v3 != 101) {
                    this.y9 = v1 - 1;
                    this.k9.P(v1);
                    return this.G6(r.r);
                }
                this.y9 = v1 - 1;
                ++this.a9;
                return this.H7(arr_c, v1, v3);
            }
            if(v1 >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v1] = (char)v3;
            int v4 = this.a9 + 1;
            this.a9 = v4;
            if(v4 >= this.b9) {
                this.M9 = 26;
                this.k9.P(v1 + 1);
                this.h = r.j;
                return r.j;
            }
            v3 = this.W7(v4) & 0xFF;
        }
    }

    private final int K6() throws IOException {
        return this.b9 - this.a9 >= 5 ? this.L6() : this.M6(0, -1);
    }

    protected r K7() throws IOException {
        int v = this.a9;
        if(v + 3 < this.b9 && this.W7(v) == 0x75 && this.W7(v + 1) == 108 && this.W7(v + 2) == 108) {
            int v1 = this.W7(v + 3);
            if((v1 & 0xFF) < 0x30 || ((v1 & 0xFF) == 93 || (v1 & 0xFF) == 0x7D)) {
                this.a9 = v + 3;
                return this.G6(r.v);
            }
        }
        this.M9 = 16;
        return this.f7("null", 1, r.v);
    }

    private final int L6() throws IOException {
        int v = this.X7();
        switch(v) {
            case 34: 
            case 0x2F: 
            case 92: {
                return (char)v;
            }
            case 98: {
                return 8;
            }
            case 102: {
                return 12;
            }
            case 110: {
                return 10;
            }
            case 0x72: {
                return 13;
            }
            case 0x74: {
                return 9;
            }
            case 0x75: {
                int v1 = this.X7();
                int v2 = com.fasterxml.jackson.core.io.c.b(v1);
                if(v2 >= 0) {
                    v1 = this.X7();
                    int v3 = com.fasterxml.jackson.core.io.c.b(v1);
                    if(v3 >= 0) {
                        int v4 = this.X7();
                        int v5 = com.fasterxml.jackson.core.io.c.b(v4);
                        if(v5 >= 0) {
                            v4 = this.X7();
                            int v6 = com.fasterxml.jackson.core.io.c.b(v4);
                            if(v6 >= 0) {
                                return ((v2 << 4 | v3) << 4 | v5) << 4 | v6;
                            }
                        }
                        v1 = v4;
                    }
                }
                this.d5(v1 & 0xFF, "expected a hex-digit for character escape sequence");
                return -1;
            }
            default: {
                return this.I5(((char)v));
            }
        }
    }

    protected r L7() throws IOException {
        int v = this.a9;
        if(v >= this.b9) {
            this.M9 = 24;
            this.h = r.j;
            return r.j;
        }
        int v1 = this.W7(v);
        if((v1 & 0xFF) < 0x30) {
            if((v1 & 0xFF) != 46) {
                return this.H6(0, "0");
            }
            this.a9 = v + 1;
            this.y9 = 1;
            char[] arr_c = this.k9.s();
            arr_c[0] = '0';
            return this.H7(arr_c, 1, v1 & 0xFF);
        }
        if((v1 & 0xFF) > 57) {
            switch(v1 & 0xFF) {
                case 69: 
                case 101: {
                    this.a9 = v + 1;
                    this.y9 = 1;
                    char[] arr_c1 = this.k9.s();
                    arr_c1[0] = '0';
                    return this.H7(arr_c1, 1, v1 & 0xFF);
                }
                case 93: 
                case 0x7D: {
                    break;
                }
                default: {
                    this.e5(v1 & 0xFF, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow \'0\'");
                    break;
                }
            }
            return this.H6(0, "0");
        }
        return this.n7();
    }

    private int M6(int v, int v1) throws IOException {
        if(this.a9 >= this.b9) {
            this.I9 = v;
            this.J9 = v1;
            return -1;
        }
        int v2 = this.X7();
        if(v1 == -1) {
            switch(v2) {
                case 34: 
                case 0x2F: 
                case 92: {
                    return v2;
                }
                case 98: {
                    return 8;
                }
                case 102: {
                    return 12;
                }
                case 110: {
                    return 10;
                }
                case 0x72: {
                    return 13;
                }
                case 0x74: {
                    return 9;
                }
                case 0x75: {
                    if(this.a9 >= this.b9) {
                        this.J9 = 0;
                        this.I9 = 0;
                        return -1;
                    }
                    v2 = this.X7();
                    v1 = 0;
                    break;
                }
                default: {
                    return this.I5(((char)v2));
                }
            }
        }
        for(int v3 = v2 & 0xFF; true; v3 = this.Y7()) {
            int v4 = com.fasterxml.jackson.core.io.c.b(v3);
            if(v4 < 0) {
                this.d5(v3 & 0xFF, "expected a hex-digit for character escape sequence");
            }
            v = v << 4 | v4;
            ++v1;
            if(v1 == 4) {
                return v;
            }
            if(this.a9 >= this.b9) {
                this.J9 = v1;
                this.I9 = v;
                return -1;
            }
        }
    }

    protected r M7() throws IOException {
        this.x9 = false;
        if(this.a9 >= this.b9) {
            this.M9 = 22;
            this.h = r.j;
            return r.j;
        }
        int v = this.Y7();
        if(v <= 0x30) {
            if(v == 0x30) {
                if(!this.a4(e.k.f())) {
                    this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return this.m7();
            }
            this.e5(v, "expected digit (0-9) to follow plus sign, for valid numeric value");
        }
        else if(v > 57) {
            if(v == 73) {
                return this.h7(2, 2);
            }
            this.e5(v, "expected digit (0-9) to follow plus sign, for valid numeric value");
        }
        if(!this.a4(e.k.f())) {
            this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] arr_c = this.k9.s();
        arr_c[0] = '+';
        arr_c[1] = (char)v;
        int v2 = this.a9;
        if(v2 >= this.b9) {
            this.M9 = 26;
            this.k9.P(2);
            this.y9 = 1;
            this.h = r.j;
            return r.j;
        }
        int v3 = this.W7(v2);
        for(int v1 = 2; true; ++v1) {
            if(v3 < 0x30) {
                if(v3 != 46) {
                    this.y9 = v1 - 1;
                    this.k9.P(v1);
                    return this.G6(r.r);
                }
                this.y9 = v1 - 1;
                ++this.a9;
                return this.H7(arr_c, v1, 46);
            }
            if(v3 > 57) {
                if(v3 != 69 && v3 != 101) {
                    this.y9 = v1 - 1;
                    this.k9.P(v1);
                    return this.G6(r.r);
                }
                this.y9 = v1 - 1;
                ++this.a9;
                return this.H7(arr_c, v1, v3);
            }
            if(v1 >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v1] = (char)v3;
            int v4 = this.a9 + 1;
            this.a9 = v4;
            if(v4 >= this.b9) {
                this.M9 = 26;
                this.k9.P(v1 + 1);
                this.h = r.j;
                return r.j;
            }
            v3 = this.W7(v4) & 0xFF;
        }
    }

    private final boolean N6(int v, int v1, boolean z) throws IOException {
        switch(v1) {
            case 1: {
                int v2 = this.M6(0, -1);
                if(v2 < 0) {
                    this.M9 = 41;
                    return false;
                }
                this.k9.c(((char)v2));
                return true;
            }
            case 2: {
                if(z) {
                    int v3 = this.Q6(v, this.X7());
                    this.k9.c(((char)v3));
                    return true;
                }
                this.M9 = 42;
                this.G9 = v;
                return false;
            }
            case 3: {
                if(z) {
                    return this.O6(v & 15, 1, this.X7());
                }
                this.M9 = 43;
                this.G9 = v & 15;
                this.H9 = 1;
                return false;
            }
            case 4: {
                if(z) {
                    return this.P6(v & 7, 1, this.X7());
                }
                this.G9 = v & 7;
                this.H9 = 1;
                this.M9 = 44;
                return false;
            }
            default: {
                if(v < 0x20) {
                    this.Q5(v, "string value");
                }
                else {
                    this.z6(v);
                }
                this.k9.c(((char)v));
                return true;
            }
        }
    }

    protected r N7(int v) throws IOException {
        this.x9 = false;
        char[] arr_c = this.k9.s();
        arr_c[0] = (char)v;
        int v1 = this.a9;
        if(v1 >= this.b9) {
            this.M9 = 26;
            this.k9.P(1);
            this.h = r.j;
            return r.j;
        }
        int v2 = this.W7(v1) & 0xFF;
        for(int v3 = 1; true; ++v3) {
            if(v2 < 0x30) {
                if(v2 != 46) {
                    this.y9 = v3;
                    this.k9.P(v3);
                    return this.G6(r.r);
                }
                this.y9 = v3;
                ++this.a9;
                return this.H7(arr_c, v3, 46);
            }
            if(v2 > 57) {
                if(v2 != 69 && v2 != 101) {
                    this.y9 = v3;
                    this.k9.P(v3);
                    return this.G6(r.r);
                }
                this.y9 = v3;
                ++this.a9;
                return this.H7(arr_c, v3, v2);
            }
            if(v3 >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v3] = (char)v2;
            int v4 = this.a9 + 1;
            this.a9 = v4;
            if(v4 >= this.b9) {
                this.M9 = 26;
                this.k9.P(v3 + 1);
                this.h = r.j;
                return r.j;
            }
            v2 = this.W7(v4) & 0xFF;
        }
    }

    private final boolean O6(int v, int v1, int v2) throws IOException {
        if(v1 == 1) {
            if((v2 & 0xC0) != 0x80) {
                this.C6(v2 & 0xFF, this.a9);
            }
            v = v << 6 | v2 & 0x3F;
            if(this.a9 >= this.b9) {
                this.M9 = 43;
                this.G9 = v;
                this.H9 = 2;
                return false;
            }
            v2 = this.X7();
        }
        if((v2 & 0xC0) != 0x80) {
            this.C6(v2 & 0xFF, this.a9);
        }
        this.k9.c(((char)(v << 6 | v2 & 0x3F)));
        return true;
    }

    private final r O7(int v) throws IOException {
        if((this.a & d.Xa) == 0) {
            this.d5(0x2F, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)");
        }
        if(this.a9 >= this.b9) {
            this.G9 = v;
            this.M9 = 51;
            this.h = r.j;
            return r.j;
        }
        int v1 = this.X7();
        if(v1 == 42) {
            return this.X6(v, false);
        }
        if(v1 == 0x2F) {
            return this.Y6(v);
        }
        this.d5(v1 & 0xFF, "was expecting either \'*\' or \'/\' for a comment");
        return null;
    }

    private final boolean P6(int v, int v1, int v2) throws IOException {
        if(v1 == 1) {
            if((v2 & 0xC0) != 0x80) {
                this.C6(v2 & 0xFF, this.a9);
            }
            v = v << 6 | v2 & 0x3F;
            if(this.a9 >= this.b9) {
                this.M9 = 44;
                this.G9 = v;
                this.H9 = 2;
                return false;
            }
            v2 = this.X7();
            v1 = 2;
        }
        if(v1 == 2) {
            if((v2 & 0xC0) != 0x80) {
                this.C6(v2 & 0xFF, this.a9);
            }
            v = v << 6 | v2 & 0x3F;
            if(this.a9 >= this.b9) {
                this.M9 = 44;
                this.G9 = v;
                this.H9 = 3;
                return false;
            }
            v2 = this.X7();
        }
        if((v2 & 0xC0) != 0x80) {
            this.C6(v2 & 0xFF, this.a9);
        }
        int v3 = (v << 6 | v2 & 0x3F) - 0x10000;
        this.k9.c(((char)(v3 >> 10 | 0xD800)));
        this.k9.c(((char)(v3 & 0x3FF | 0xDC00)));
        return true;
    }

    protected r P7() throws IOException {
        int v = this.a9;
        char[] arr_c = this.k9.s();
        int[] arr_v = d.Za;
        int v1 = Math.min(this.b9, arr_c.length + v);
        int v2;
        for(v2 = 0; v < v1; ++v2) {
            int v3 = this.W7(v) & 0xFF;
            if(arr_v[v3] != 0) {
                if(v3 != 34) {
                    break;
                }
                this.a9 = v + 1;
                this.k9.P(v2);
                return this.G6(r.q);
            }
            ++v;
            arr_c[v2] = (char)v3;
        }
        this.k9.P(v2);
        this.a9 = v;
        return this.r7();
    }

    private final int Q6(int v, int v1) throws IOException {
        if((v1 & 0xC0) != 0x80) {
            this.C6(v1 & 0xFF, this.a9);
        }
        return (v & 0x1F) << 6 | v1 & 0x3F;
    }

    protected r Q7() throws IOException {
        int v = this.a9;
        if(v + 3 < this.b9 && this.W7(v) == 0x72 && this.W7(v + 1) == 0x75 && this.W7(v + 2) == 101) {
            int v1 = this.W7(v + 3);
            if((v1 & 0xFF) < 0x30 || ((v1 & 0xFF) == 93 || (v1 & 0xFF) == 0x7D)) {
                this.a9 = v + 3;
                return this.G6(r.t);
            }
        }
        this.M9 = 17;
        return this.f7("true", 1, r.t);
    }

    private final int R6(int v, int v1, int v2) throws IOException {
        if((v1 & 0xC0) != 0x80) {
            this.C6(v1 & 0xFF, this.a9);
        }
        if((v2 & 0xC0) != 0x80) {
            this.C6(v2 & 0xFF, this.a9);
        }
        return ((v & 15) << 6 | v1 & 0x3F) << 6 | v2 & 0x3F;
    }

    protected r R7(boolean z, int v) throws IOException {
        switch(v) {
            case 39: {
                if((this.a & d.Va) != 0) {
                    return this.C7();
                }
                break;
            }
            case 43: {
                return this.h7(2, 1);
            }
            case 44: {
            label_6:
                if(!this.i9.n() && (this.a & d.Ua) != 0) {
                    --this.a9;
                    return this.G6(r.v);
                }
                break;
            }
            case 73: {
                return this.h7(1, 1);
            }
            case 78: {
                return this.h7(0, 1);
            }
            case 93: {
                if(this.i9.l()) {
                    goto label_6;
                }
            }
        }
        this.d5(v, "expected a valid value " + this.S5());
        return null;
    }

    private final int S6(int v, int v1, int v2, int v3) throws IOException {
        if((v1 & 0xC0) != 0x80) {
            this.C6(v1 & 0xFF, this.a9);
        }
        if((v2 & 0xC0) != 0x80) {
            this.C6(v2 & 0xFF, this.a9);
        }
        if((v3 & 0xC0) != 0x80) {
            this.C6(v3 & 0xFF, this.a9);
        }
        return ((((v & 7) << 6 | v1 & 0x3F) << 6 | v2 & 0x3F) << 6 | v3 & 0x3F) - 0x10000;
    }

    private final r S7(int v) throws IOException {
        if(v <= 0x20) {
            v = this.A7(v);
            if(v <= 0) {
                this.M9 = 12;
                return this.h;
            }
        }
        this.F6();
        this.i9.z();
        switch(v) {
            case 34: {
                return this.P7();
            }
            case 35: {
                return this.e7(12);
            }
            case 43: {
                return this.M7();
            }
            case 45: {
                return this.J7();
            }
            case 46: {
                return this.a4(e.l.f()) ? this.I7() : this.R7(false, 46);
            }
            case 0x2F: {
                return this.O7(12);
            }
            case 0x30: {
                return this.L7();
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return this.N7(v);
            }
            case 91: {
                return this.D6();
            }
            case 93: {
                return this.p6();
            }
            case 102: {
                return this.E7();
            }
            case 110: {
                return this.K7();
            }
            case 0x74: {
                return this.Q7();
            }
            case 0x7B: {
                return this.E6();
            }
            case 0x7D: {
                return this.q6();
            }
            default: {
                return this.R7(false, v);
            }
        }
    }

    private final String T6() throws IOException {
        int[] arr_v = d.ab;
        int v = this.a9;
        int v1 = this.W7(v);
        if(arr_v[v1 & 0xFF] == 0) {
            int v2 = this.W7(v + 1);
            if(arr_v[v2 & 0xFF] == 0) {
                int v3 = v2 & 0xFF | (v1 & 0xFF) << 8;
                int v4 = this.W7(v + 2);
                if(arr_v[v4 & 0xFF] == 0) {
                    int v5 = v3 << 8 | v4 & 0xFF;
                    int v6 = this.W7(v + 3);
                    if(arr_v[v6 & 0xFF] == 0) {
                        int v7 = v5 << 8 | v6 & 0xFF;
                        int v8 = this.W7(v + 4);
                        if(arr_v[v8 & 0xFF] == 0) {
                            this.F9 = v7;
                            return this.x7(v + 5, v8 & 0xFF);
                        }
                        if((v8 & 0xFF) == 34) {
                            this.a9 = v + 5;
                            return this.t6(v7, 4);
                        }
                        return null;
                    }
                    if((v6 & 0xFF) == 34) {
                        this.a9 = v + 4;
                        return this.t6(v5, 3);
                    }
                    return null;
                }
                if((v4 & 0xFF) == 34) {
                    this.a9 = v + 3;
                    return this.t6(v3, 2);
                }
                return null;
            }
            if((v2 & 0xFF) == 34) {
                this.a9 = v + 2;
                return this.t6(v1 & 0xFF, 1);
            }
            return null;
        }
        if((v1 & 0xFF) == 34) {
            this.a9 = v + 1;
            return "";
        }
        return null;
    }

    private final r T7(int v) throws IOException {
        if(v <= 0x20) {
            v = this.A7(v);
            if(v <= 0) {
                this.M9 = 15;
                return this.h;
            }
        }
        this.F6();
        switch(v) {
            case 34: {
                return this.P7();
            }
            case 35: {
                return this.e7(15);
            }
            case 43: {
                return this.M7();
            }
            case 45: {
                return this.J7();
            }
            case 0x2F: {
                return this.O7(15);
            }
            case 0x30: {
                return this.L7();
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return this.N7(v);
            }
            case 91: {
                return this.D6();
            }
            case 93: {
                return (this.a & d.Sa) == 0 ? this.R7(true, 93) : this.p6();
            }
            case 102: {
                return this.E7();
            }
            case 110: {
                return this.K7();
            }
            case 0x74: {
                return this.Q7();
            }
            case 0x7B: {
                return this.E6();
            }
            case 0x7D: {
                return (this.a & d.Sa) == 0 ? this.R7(true, 0x7D) : this.q6();
            }
            default: {
                return this.R7(true, v);
            }
        }
    }

    private r U6(int v, int v1, int v2) throws IOException {
        int[] arr_v = this.D9;
        int[] arr_v1 = d.ab;
        while(true) {
            if(this.a9 >= this.b9) {
                this.E9 = v;
                this.G9 = v1;
                this.H9 = v2;
                this.M9 = 9;
                this.h = r.j;
                return r.j;
            }
            int v3 = this.Y7();
            if(v3 == 39) {
                if(v2 > 0) {
                    if(v >= arr_v.length) {
                        arr_v = this.G5(arr_v, arr_v.length);
                        this.D9 = arr_v;
                    }
                    arr_v[v] = c.y6(v1, v2);
                    ++v;
                }
                else if(v == 0) {
                    return this.s6("");
                }
                String s = this.C9.D(arr_v, v);
                if(s == null) {
                    s = this.o6(arr_v, v, v2);
                }
                return this.s6(s);
            }
            if(v3 != 34 && arr_v1[v3] != 0) {
                if(v3 == 92) {
                    v3 = this.K6();
                    if(v3 < 0) {
                        this.M9 = 8;
                        this.N9 = 9;
                        this.E9 = v;
                        this.G9 = v1;
                        this.H9 = v2;
                        this.h = r.j;
                        return r.j;
                    }
                }
                else {
                    this.Q5(v3, "name");
                }
                int v4 = 0;
                if(v3 > 0x7F) {
                    if(v2 >= 4) {
                        if(v >= arr_v.length) {
                            arr_v = this.G5(arr_v, arr_v.length);
                            this.D9 = arr_v;
                        }
                        arr_v[v] = v1;
                        ++v;
                        v1 = 0;
                        v2 = 0;
                    }
                    if(v3 < 0x800) {
                        v1 = v1 << 8 | (v3 >> 6 | 0xC0);
                        ++v2;
                    }
                    else {
                        int v5 = v1 << 8 | (v3 >> 12 | 0xE0);
                        int v6 = v2 + 1;
                        if(v6 >= 4) {
                            if(v >= arr_v.length) {
                                arr_v = this.G5(arr_v, arr_v.length);
                                this.D9 = arr_v;
                            }
                            arr_v[v] = v5;
                            ++v;
                            v6 = 0;
                        }
                        else {
                            v4 = v5;
                        }
                        v1 = v4 << 8 | (v3 >> 6 & 0x3F | 0x80);
                        v2 = v6 + 1;
                    }
                    v3 = v3 & 0x3F | 0x80;
                }
            }
            if(v2 < 4) {
                ++v2;
                v1 = v1 << 8 | v3;
            }
            else {
                if(v >= arr_v.length) {
                    arr_v = this.G5(arr_v, arr_v.length);
                    this.D9 = arr_v;
                }
                arr_v[v] = v1;
                ++v;
                v1 = v3;
                v2 = 1;
            }
        }
    }

    private final r U7(int v) throws IOException {
        if(v <= 0x20) {
            v = this.A7(v);
            if(v <= 0) {
                this.M9 = 14;
                return this.h;
            }
        }
        switch(v) {
            case 35: {
                return this.e7(14);
            }
            case 0x2F: {
                return this.O7(14);
            }
            case 58: {
                break;
            }
            default: {
                this.d5(v, "was expecting a colon to separate field name and value");
                break;
            }
        }
        int v1 = this.a9;
        if(v1 >= this.b9) {
            this.M9 = 12;
            this.h = r.j;
            return r.j;
        }
        int v2 = this.W7(v1);
        this.a9 = v1 + 1;
        if(v2 <= 0x20) {
            v2 = this.A7(v2);
            if(v2 <= 0) {
                this.M9 = 12;
                return this.h;
            }
        }
        this.F6();
        switch(v2) {
            case 34: {
                return this.P7();
            }
            case 35: {
                return this.e7(12);
            }
            case 43: {
                return this.M7();
            }
            case 45: {
                return this.J7();
            }
            case 0x2F: {
                return this.O7(12);
            }
            case 0x30: {
                return this.L7();
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return this.N7(v2);
            }
            case 91: {
                return this.D6();
            }
            case 102: {
                return this.E7();
            }
            case 110: {
                return this.K7();
            }
            case 0x74: {
                return this.Q7();
            }
            case 0x7B: {
                return this.E6();
            }
            default: {
                return this.R7(false, v2);
            }
        }
    }

    private final r V6() throws IOException {
        int v6;
        int v5;
        int[] arr_v = d.Za;
        char[] arr_c = this.k9.A();
        int v = this.k9.C();
        int v1 = this.a9;
        int v2 = this.b9 - 5;
        while(true) {
            int v3 = 0;
            if(v1 >= this.b9) {
                this.a9 = v1;
                this.M9 = 45;
                this.k9.P(v);
                this.h = r.j;
                return r.j;
            }
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            int v4 = Math.min(this.b9, arr_c.length - v + v1);
        label_16:
            if(v1 < v4) {
                v5 = v1 + 1;
                v6 = this.W7(v1) & 0xFF;
                int v7 = arr_v[v6];
                if(v7 == 0 || v6 == 34) {
                    break;
                }
                if(v5 >= v2) {
                    this.a9 = v5;
                    this.k9.P(v);
                    int v8 = arr_v[v6];
                    if(v5 < this.b9) {
                        v3 = 1;
                    }
                    if(!this.N6(v6, v8, ((boolean)v3))) {
                        this.N9 = 45;
                        this.h = r.j;
                        return r.j;
                    }
                    arr_c = this.k9.A();
                    v = this.k9.C();
                    v1 = this.a9;
                }
                else {
                    switch(v7) {
                        case 1: {
                            this.a9 = v5;
                            v6 = this.L6();
                            v1 = this.a9;
                            break;
                        }
                        case 2: {
                            v1 += 2;
                            v6 = this.Q6(v6, this.W7(v5));
                            break;
                        }
                        case 3: {
                            int v9 = v1 + 2;
                            v1 += 3;
                            v6 = this.R6(v6, this.W7(v5), this.W7(v9));
                            break;
                        }
                        case 4: {
                            int v10 = this.W7(v5);
                            int v11 = v1 + 3;
                            int v12 = this.W7(v1 + 2);
                            v1 += 4;
                            int v13 = this.S6(v6, v10, v12, this.W7(v11));
                            arr_c[v] = (char)(v13 >> 10 | 0xD800);
                            if(v + 1 >= arr_c.length) {
                                arr_c = this.k9.y();
                                v = 0;
                            }
                            else {
                                ++v;
                            }
                            v6 = v13 & 0x3FF | 0xDC00;
                            break;
                        }
                        default: {
                            if(v6 < 0x20) {
                                this.Q5(v6, "string value");
                            }
                            else {
                                this.z6(v6);
                            }
                            v1 = v5;
                        }
                    }
                    if(v >= arr_c.length) {
                        arr_c = this.k9.y();
                    }
                    else {
                        v3 = v;
                    }
                    v = v3 + 1;
                    arr_c[v3] = (char)v6;
                }
            }
        }
        if(v6 != 39) {
            arr_c[v] = (char)v6;
            ++v;
            v1 = v5;
            goto label_16;
        }
        this.a9 = v5;
        this.k9.P(v);
        return this.G6(r.q);
    }

    private final r V7(int v) throws IOException {
        if(v <= 0x20) {
            v = this.A7(v);
            if(v <= 0) {
                this.M9 = 13;
                return this.h;
            }
        }
        switch(v) {
            case 35: {
                return this.e7(13);
            }
            case 44: {
                break;
            }
            case 0x2F: {
                return this.O7(13);
            }
            case 93: {
                return this.p6();
            }
            case 0x7D: {
                return this.q6();
            }
            default: {
                this.d5(v, "was expecting comma to separate root entries");
                break;
            }
        }
        this.i9.z();
        int v1 = this.a9;
        if(v1 >= this.b9) {
            this.M9 = 15;
            this.h = r.j;
            return r.j;
        }
        int v2 = this.W7(v1);
        this.a9 = v1 + 1;
        if(v2 <= 0x20) {
            v2 = this.A7(v2);
            if(v2 <= 0) {
                this.M9 = 15;
                return this.h;
            }
        }
        this.F6();
        if(v2 == 34) {
            return this.P7();
        }
        switch(v2) {
            case 35: {
                return this.e7(15);
            }
            case 43: {
                return this.M7();
            }
            case 45: {
                return this.J7();
            }
            case 0x2F: {
                return this.O7(15);
            }
            case 0x30: {
                return this.L7();
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return this.N7(v2);
            }
            case 91: {
                return this.D6();
            }
            case 93: {
                return (this.a & d.Sa) == 0 ? this.R7(true, 93) : this.p6();
            }
            case 102: {
                return this.E7();
            }
            case 110: {
                return this.K7();
            }
            case 0x74: {
                return this.Q7();
            }
            case 0x7B: {
                return this.E6();
            }
            case 0x7D: {
                return (this.a & d.Sa) == 0 ? this.R7(true, 0x7D) : this.q6();
            }
            default: {
                return this.R7(true, v2);
            }
        }
    }

    private final r W6(int v) throws IOException {
        while(this.a9 < this.b9) {
            int v1 = this.Y7();
            switch(v) {
                case 1: {
                    if(v1 != 0xBB) {
                        this.U4("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", v1);
                    }
                    break;
                }
                case 2: {
                    if(v1 != 0xBF) {
                        this.U4("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", v1);
                    }
                    break;
                }
                case 3: {
                    this.c9 -= 3L;
                    return this.D7(v1);
                }
            }
            ++v;
        }
        this.G9 = v;
        this.M9 = 1;
        this.h = r.j;
        return r.j;
    }

    protected abstract byte W7(int arg1);

    private final r X6(int v, boolean z) throws IOException {
        while(true) {
            if(this.a9 >= this.b9) {
                this.M9 = z ? 52 : 53;
                this.G9 = v;
                this.h = r.j;
                return r.j;
            }
            int v1 = this.Y7();
            if(v1 < 0x20) {
                switch(v1) {
                    case 9: {
                        break;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = this.a9;
                        break;
                    }
                    case 13: {
                        ++this.R9;
                        this.e9 = this.a9;
                        break;
                    }
                    default: {
                        this.g5(v1);
                    }
                }
            }
            else {
                switch(v1) {
                    case 42: {
                        z = true;
                        continue;
                    }
                    case 0x2F: {
                        if(z) {
                            return this.B7(v);
                        }
                    }
                }
            }
            z = false;
        }
    }

    protected abstract byte X7();

    private final r Y6(int v) throws IOException {
        while(true) {
            if(this.a9 >= this.b9) {
                this.M9 = 54;
                this.G9 = v;
                this.h = r.j;
                return r.j;
            }
            int v1 = this.Y7();
            if(v1 < 0x20) {
                switch(v1) {
                    case 9: {
                        break;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = this.a9;
                        return this.B7(v);
                    }
                    case 13: {
                        ++this.R9;
                        this.e9 = this.a9;
                        return this.B7(v);
                    }
                    default: {
                        this.g5(v1);
                        break;
                    }
                }
            }
        }
    }

    protected abstract int Y7();

    protected r Z6() throws IOException {
        while(this.a9 < this.b9) {
            int v = (char)this.X7();
            if(Character.isJavaIdentifierPart(((char)v))) {
                this.k9.c(((char)v));
                if(this.k9.Q() >= this.X8.x().c()) {
                    return this.z7(this.k9.q());
                }
                continue;
            }
            return this.z7(this.k9.q());
        }
        this.h = r.j;
        return r.j;
    }

    public final boolean a() {
        return this.a9 >= this.b9 && !this.O9;
    }

    protected r a7() throws IOException {
        return this.z7(this.k9.q());
    }

    protected final r b7() throws IOException {
        int v6;
        int v5;
        int v = this.M6(this.I9, this.J9);
        if(v < 0) {
            this.M9 = 8;
            return r.j;
        }
        int[] arr_v = this.D9;
        if(this.E9 >= arr_v.length) {
            this.D9 = this.G5(arr_v, 0x20);
        }
        int v1 = 0;
        int v2 = this.G9;
        int v3 = this.H9;
        if(v > 0x7F) {
            if(v3 >= 4) {
                int v4 = this.E9;
                this.E9 = v4 + 1;
                this.D9[v4] = v2;
                v2 = 0;
                v3 = 0;
            }
            if(v < 0x800) {
                v5 = v2 << 8;
                v6 = v >> 6 | 0xC0;
            }
            else {
                int v7 = v2 << 8 | (v >> 12 | 0xE0);
                ++v3;
                if(v3 >= 4) {
                    int v8 = this.E9;
                    this.E9 = v8 + 1;
                    this.D9[v8] = v7;
                    v3 = 0;
                }
                else {
                    v1 = v7;
                }
                v5 = v1 << 8;
                v6 = v >> 6 & 0x3F | 0x80;
            }
            v2 = v5 | v6;
            ++v3;
            v = v & 0x3F | 0x80;
        }
        if(v3 < 4) {
            int v9 = v3 + 1;
            v |= v2 << 8;
            return this.N9 == 9 ? this.U6(this.E9, v, v9) : this.w7(this.E9, v, v9);
        }
        int v10 = this.E9;
        this.E9 = v10 + 1;
        this.D9[v10] = v2;
        return this.N9 == 9 ? this.U6(this.E9, v, 1) : this.w7(this.E9, v, 1);
    }

    protected r c7(boolean z, int v) throws IOException {
        if(z) {
            this.M9 = 0x20;
            if(v == 43 || v == 45) {
                this.k9.c(((char)v));
                if(this.a9 >= this.b9) {
                    this.M9 = 0x20;
                    this.A9 = 0;
                    return r.j;
                }
                v = this.X7();
            }
        }
        char[] arr_c = this.k9.A();
        int v1 = this.k9.C();
        int v2 = this.A9;
        while(v >= 0x30 && v <= 57) {
            ++v2;
            if(v1 >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v1] = (char)v;
            if(this.a9 >= this.b9) {
                this.k9.P(v1 + 1);
                this.A9 = v2;
                return r.j;
            }
            v = this.X7();
            ++v1;
        }
        if(v2 == 0) {
            this.e5(v & 0xFF, "Exponent indicator not followed by a digit");
        }
        --this.a9;
        this.k9.P(v1);
        this.A9 = v2;
        return this.G6(r.s);
    }

    protected r d7() throws IOException {
        int v = this.z9;
        char[] arr_c = this.k9.A();
        int v1 = this.k9.C();
        int v2 = this.X7();
        boolean z = true;
        while(z) {
            if(v2 >= 0x30 && v2 <= 57) {
                ++v;
                if(v1 >= arr_c.length) {
                    arr_c = this.k9.v();
                }
                arr_c[v1] = (char)v2;
                if(this.a9 >= this.b9) {
                    this.k9.P(v1 + 1);
                    this.z9 = v;
                    return r.j;
                }
                v2 = this.X7();
                ++v1;
            }
            else {
                switch(v2) {
                    case 46: {
                        this.e5(46, "Cannot parse number with more than one decimal point");
                        break;
                    }
                    case 68: 
                    case 70: 
                    case 100: 
                    case 102: {
                        this.e5(v2, "JSON does not support parsing numbers that have \'f\' or \'d\' suffixes");
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
            }
        }
        if(v == 0 && !this.a4(e.m.f())) {
            this.e5(v2, "Decimal point not followed by a digit");
        }
        this.z9 = v;
        this.k9.P(v1);
        if(v2 != 69 && v2 != 101) {
            --this.a9;
            this.k9.P(v1);
            this.A9 = 0;
            return this.G6(r.s);
        }
        this.k9.c(((char)v2));
        this.A9 = 0;
        if(this.a9 >= this.b9) {
            this.M9 = 0x1F;
            return r.j;
        }
        this.M9 = 0x20;
        return this.c7(true, this.Y7());
    }

    public void e() {
        this.O9 = true;
    }

    private final r e7(int v) throws IOException {
        if((this.a & d.Ya) == 0) {
            this.d5(35, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_YAML_COMMENTS\' not enabled for parser)");
        }
        while(true) {
            if(this.a9 >= this.b9) {
                this.M9 = 55;
                this.G9 = v;
                this.h = r.j;
                return r.j;
            }
            int v1 = this.Y7();
            if(v1 < 0x20) {
                switch(v1) {
                    case 9: {
                        break;
                    }
                    case 10: {
                        ++this.d9;
                        this.e9 = this.a9;
                        return this.B7(v);
                    }
                    case 13: {
                        ++this.R9;
                        this.e9 = this.a9;
                        return this.B7(v);
                    }
                    default: {
                        this.g5(v1);
                        break;
                    }
                }
            }
        }
    }

    protected r f7(String s, int v, r r0) throws IOException {
        int v1 = s.length();
        while(true) {
            int v2 = this.a9;
            if(v2 >= this.b9) {
                this.G9 = v;
                this.h = r.j;
                return r.j;
            }
            int v3 = this.W7(v2);
            if(v != v1) {
                if(v3 != s.charAt(v)) {
                    this.M9 = 50;
                    this.k9.I(s, 0, v);
                    return this.Z6();
                }
            }
            else if(v3 < 0x30 || (v3 == 93 || v3 == 0x7D)) {
                return this.G6(r0);
            }
            else {
                this.M9 = 50;
                this.k9.I(s, 0, v);
                return this.Z6();
            }
            ++v;
            ++this.a9;
        }
    }

    protected r g7(String s, int v, r r0) throws IOException {
        if(v == s.length()) {
            this.h = r0;
            return r0;
        }
        this.k9.I(s, 0, v);
        return this.a7();
    }

    protected r h7(int v, int v1) throws IOException {
        String s = this.x6(v);
        int v2 = s.length();
        while(true) {
            int v3 = this.a9;
            if(v3 >= this.b9) {
                this.P9 = v;
                this.G9 = v1;
                this.M9 = 19;
                this.h = r.j;
                return r.j;
            }
            int v4 = this.W7(v3);
            if(v1 != v2) {
                if(v4 != s.charAt(v1)) {
                    this.M9 = 50;
                    this.k9.I(s, 0, v1);
                    return this.Z6();
                }
            }
            else if(v4 < 0x30 || (v4 == 93 || v4 == 0x7D)) {
                return this.I6(v);
            }
            else {
                this.M9 = 50;
                this.k9.I(s, 0, v1);
                return this.Z6();
            }
            ++v1;
            ++this.a9;
        }
    }

    protected r i7(int v, int v1) throws IOException {
        String s = this.x6(v);
        if(v1 == s.length()) {
            return this.I6(v);
        }
        this.k9.I(s, 0, v1);
        return this.a7();
    }

    protected r j7(char[] arr_c, int v) throws IOException {
        int v1 = this.x9 ? -1 : 0;
        while(true) {
            int v2 = this.a9;
            if(v2 >= this.b9) {
                this.M9 = 26;
                this.k9.P(v);
                this.h = r.j;
                return r.j;
            }
            int v3 = this.W7(v2) & 0xFF;
            if(v3 < 0x30) {
                if(v3 != 46) {
                    this.y9 = v1 + v;
                    this.k9.P(v);
                    return this.G6(r.r);
                }
                this.y9 = v1 + v;
                ++this.a9;
                return this.H7(arr_c, v, 46);
            }
            if(v3 > 57) {
                if(v3 != 69 && v3 != 101) {
                    this.y9 = v1 + v;
                    this.k9.P(v);
                    return this.G6(r.r);
                }
                this.y9 = v1 + v;
                ++this.a9;
                return this.H7(arr_c, v, v3);
            }
            ++this.a9;
            if(v >= arr_c.length) {
                arr_c = this.k9.v();
            }
            arr_c[v] = (char)v3;
            ++v;
        }
    }

    protected r k7() throws IOException {
        return this.l7(true);
    }

    protected r l7(boolean z) throws IOException {
        char c;
        int v;
        do {
            if(this.a9 >= this.b9) {
                this.M9 = z ? 25 : 24;
                this.h = r.j;
                return r.j;
            }
            v = this.Y7();
            c = '+';
            if(v < 0x30) {
                if(v == 46) {
                    char[] arr_c = this.k9.s();
                    if(z) {
                        c = '-';
                    }
                    arr_c[0] = c;
                    arr_c[1] = '0';
                    this.y9 = 1;
                    return this.H7(arr_c, 2, 46);
                }
            }
            else if(v > 57) {
                switch(v) {
                    case 69: 
                    case 101: {
                        char[] arr_c1 = this.k9.s();
                        if(z) {
                            c = '-';
                        }
                        arr_c1[0] = c;
                        arr_c1[1] = '0';
                        this.y9 = 1;
                        return this.H7(arr_c1, 2, v);
                    }
                    case 93: 
                    case 0x7D: {
                        break;
                    }
                    default: {
                        this.e5(v, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow \'0\'");
                        break;
                    }
                }
            }
            else {
                goto label_28;
            }
            --this.a9;
            return this.H6(0, "0");
        label_28:
            if((this.a & d.Ta) == 0) {
                this.i5("Leading zeroes not allowed");
            }
        }
        while(v == 0x30);
        char[] arr_c2 = this.k9.s();
        if(z) {
            c = '-';
        }
        arr_c2[0] = c;
        arr_c2[1] = (char)v;
        this.y9 = 1;
        return this.j7(arr_c2, 2);
    }

    @Override  // com.fasterxml.jackson.core.base.d
    public r m4() throws IOException {
        int v = this.a9;
        if(v >= this.b9) {
            if(this.Z8) {
                return null;
            }
            if(this.O9) {
                return this.h == r.j ? this.t7() : this.r6();
            }
            return r.j;
        }
        if(this.h == r.j) {
            return this.s7();
        }
        this.p9 = 0;
        this.f9 = this.c9 + ((long)v);
        this.o9 = null;
        int v1 = this.Y7();
        switch(this.K9) {
            case 0: {
                return this.D7(v1);
            }
            case 1: {
                return this.S7(v1);
            }
            case 2: {
                return this.F7(v1);
            }
            case 3: {
                return this.G7(v1);
            }
            case 4: {
                return this.U7(v1);
            }
            case 5: {
                return this.S7(v1);
            }
            case 6: {
                return this.V7(v1);
            }
            default: {
                z.f();
                return null;
            }
        }
    }

    protected r m7() throws IOException {
        return this.l7(false);
    }

    protected r n7() throws IOException {
        int v;
        do {
            if(this.a9 >= this.b9) {
                this.M9 = 24;
                this.h = r.j;
                return r.j;
            }
            v = this.Y7();
            if(v < 0x30) {
                if(v == 46) {
                    char[] arr_c = this.k9.s();
                    arr_c[0] = '0';
                    this.y9 = 1;
                    return this.H7(arr_c, 1, 46);
                }
            }
            else if(v > 57) {
                switch(v) {
                    case 69: 
                    case 101: {
                        char[] arr_c1 = this.k9.s();
                        arr_c1[0] = '0';
                        this.y9 = 1;
                        return this.H7(arr_c1, 1, v);
                    }
                    case 93: 
                    case 0x7D: {
                        break;
                    }
                    default: {
                        this.e5(v, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow \'0\'");
                        break;
                    }
                }
            }
            else {
                goto label_21;
            }
            --this.a9;
            return this.H6(0, "0");
        label_21:
            if((this.a & d.Ta) == 0) {
                this.i5("Leading zeroes not allowed");
            }
        }
        while(v == 0x30);
        char[] arr_c2 = this.k9.s();
        arr_c2[0] = (char)v;
        this.y9 = 1;
        return this.j7(arr_c2, 1);
    }

    protected r o7(int v) throws IOException {
        return this.q7(v, true);
    }

    protected r p7(int v) throws IOException {
        return this.q7(v, false);
    }

    protected r q7(int v, boolean z) throws IOException {
        String s = "expected digit (0-9) for valid numeric value";
        char c = '+';
        if(v <= 0x30) {
            if(v == 0x30) {
                if(z) {
                    return this.k7();
                }
                if(!this.a4(e.k.f())) {
                    this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return this.m7();
            }
            if(v == 46 && this.a4(e.l.f())) {
                if(z) {
                    --this.a9;
                    return this.k7();
                }
                if(!this.a4(e.k.f())) {
                    this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                --this.a9;
                return this.m7();
            }
            if(z) {
                s = "expected digit (0-9) to follow minus sign, for valid numeric value";
            }
            this.e5(v, s);
        }
        else if(v > 57) {
            if(v == 73) {
                return z ? this.h7(3, 2) : this.h7(2, 2);
            }
            if(z) {
                s = "expected digit (0-9) to follow minus sign, for valid numeric value";
            }
            this.e5(v, s);
        }
        if(!z && !this.a4(e.k.f())) {
            this.e5(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] arr_c = this.k9.s();
        if(z) {
            c = '-';
        }
        arr_c[0] = c;
        arr_c[1] = (char)v;
        this.y9 = 1;
        return this.j7(arr_c, 2);
    }

    private final r r7() throws IOException {
        int[] arr_v = d.Za;
        char[] arr_c = this.k9.A();
        int v = this.k9.C();
        int v1 = this.a9;
        int v2 = this.b9 - 5;
        while(true) {
            int v3 = 0;
            if(v1 >= this.b9) {
                this.a9 = v1;
                this.M9 = 40;
                this.k9.P(v);
                this.h = r.j;
                return r.j;
            }
            if(v >= arr_c.length) {
                arr_c = this.k9.y();
                v = 0;
            }
            int v4 = Math.min(this.b9, arr_c.length - v + v1);
            while(v1 < v4) {
                int v5 = v1 + 1;
                int v6 = this.W7(v1) & 0xFF;
                int v7 = arr_v[v6];
                if(v7 != 0) {
                    if(v6 == 34) {
                        this.a9 = v5;
                        this.k9.P(v);
                        return this.G6(r.q);
                    }
                    if(v5 >= v2) {
                        this.a9 = v5;
                        this.k9.P(v);
                        int v8 = arr_v[v6];
                        if(v5 < this.b9) {
                            v3 = 1;
                        }
                        if(!this.N6(v6, v8, ((boolean)v3))) {
                            this.N9 = 40;
                            this.h = r.j;
                            return r.j;
                        }
                        arr_c = this.k9.A();
                        v = this.k9.C();
                        v1 = this.a9;
                    }
                    else {
                        switch(v7) {
                            case 1: {
                                this.a9 = v5;
                                v6 = this.L6();
                                v1 = this.a9;
                                break;
                            }
                            case 2: {
                                v1 += 2;
                                v6 = this.Q6(v6, this.W7(v5));
                                break;
                            }
                            case 3: {
                                int v9 = v1 + 2;
                                v1 += 3;
                                v6 = this.R6(v6, this.W7(v5), this.W7(v9));
                                break;
                            }
                            case 4: {
                                int v10 = this.W7(v5);
                                int v11 = v1 + 3;
                                int v12 = this.W7(v1 + 2);
                                v1 += 4;
                                int v13 = this.S6(v6, v10, v12, this.W7(v11));
                                arr_c[v] = (char)(v13 >> 10 | 0xD800);
                                if(v + 1 >= arr_c.length) {
                                    arr_c = this.k9.y();
                                    v = 0;
                                }
                                else {
                                    ++v;
                                }
                                v6 = v13 & 0x3FF | 0xDC00;
                                break;
                            }
                            default: {
                                if(v6 < 0x20) {
                                    this.Q5(v6, "string value");
                                }
                                else {
                                    this.z6(v6);
                                }
                                v1 = v5;
                            }
                        }
                        if(v >= arr_c.length) {
                            arr_c = this.k9.y();
                        }
                        else {
                            v3 = v;
                        }
                        v = v3 + 1;
                        arr_c[v3] = (char)v6;
                    }
                    break;
                }
                arr_c[v] = (char)v6;
                ++v;
                v1 = v5;
            }
        }
    }

    protected final r s7() throws IOException {
        switch(this.M9) {
            case 1: {
                return this.W6(this.G9);
            }
            case 4: {
                return this.F7(this.Y7());
            }
            case 5: {
                return this.G7(this.Y7());
            }
            case 7: {
                return this.w7(this.E9, this.G9, this.H9);
            }
            case 8: {
                return this.b7();
            }
            case 9: {
                return this.U6(this.E9, this.G9, this.H9);
            }
            case 10: {
                return this.u7(this.E9, this.G9, this.H9);
            }
            case 12: {
                return this.S7(this.Y7());
            }
            case 13: {
                return this.V7(this.Y7());
            }
            case 14: {
                return this.U7(this.Y7());
            }
            case 15: {
                return this.T7(this.Y7());
            }
            case 16: {
                return this.f7("null", this.G9, r.v);
            }
            case 17: {
                return this.f7("true", this.G9, r.t);
            }
            case 18: {
                return this.f7("false", this.G9, r.u);
            }
            case 19: {
                return this.h7(this.P9, this.G9);
            }
            case 22: {
                return this.p7(this.Y7());
            }
            case 23: {
                return this.o7(this.Y7());
            }
            case 24: {
                return this.n7();
            }
            case 25: {
                return this.k7();
            }
            case 26: {
                return this.j7(this.k9.A(), this.k9.C());
            }
            case 30: {
                return this.d7();
            }
            case 0x1F: {
                return this.c7(true, this.Y7());
            }
            case 0x20: {
                return this.c7(false, this.Y7());
            }
            case 40: {
                return this.r7();
            }
            case 41: {
                int v = this.M6(this.I9, this.J9);
                if(v < 0) {
                    return r.j;
                }
                this.k9.c(((char)v));
                return this.N9 == 45 ? this.V6() : this.r7();
            }
            case 42: {
                int v1 = (char)this.Q6(this.G9, this.X7());
                this.k9.c(((char)v1));
                return this.N9 == 45 ? this.V6() : this.r7();
            }
            case 43: {
                if(!this.O6(this.G9, this.H9, this.X7())) {
                    return r.j;
                }
                return this.N9 == 45 ? this.V6() : this.r7();
            }
            case 44: {
                if(!this.P6(this.G9, this.H9, this.X7())) {
                    return r.j;
                }
                return this.N9 == 45 ? this.V6() : this.r7();
            }
            case 45: {
                return this.V6();
            }
            case 50: {
                return this.Z6();
            }
            case 51: {
                return this.O7(this.G9);
            }
            case 52: {
                return this.X6(this.G9, true);
            }
            case 53: {
                return this.X6(this.G9, false);
            }
            case 54: {
                return this.Y6(this.G9);
            }
            case 55: {
                return this.e7(this.G9);
            }
            default: {
                z.f();
                return null;
            }
        }
    }

    protected final r t7() throws IOException {
        r r0 = this.h;
        switch(this.M9) {
            case 3: {
                return this.r6();
            }
            case 12: {
                return this.r6();
            }
            case 16: {
                return this.g7("null", this.G9, r.v);
            }
            case 17: {
                return this.g7("true", this.G9, r.t);
            }
            case 18: {
                return this.g7("false", this.G9, r.u);
            }
            case 19: {
                return this.i7(this.P9, this.G9);
            }
            case 24: 
            case 25: {
                return this.H6(0, "0");
            }
            case 26: {
                int v = this.k9.C();
                if(this.x9) {
                    --v;
                }
                this.y9 = v;
                return this.G6(r.r);
            }
            case 30: {
                this.A9 = 0;
                return this.G6(r.s);
            }
            case 0x1F: {
                this.Z4(": was expecting fraction after exponent marker", r.s);
                this.Z4(": was expecting closing \'*/\' for comment", r.j);
                return this.r6();
            }
            case 0x20: {
                return this.G6(r.s);
            }
            case 50: {
                return this.a7();
            }
            case 52: 
            case 53: {
                this.Z4(": was expecting closing \'*/\' for comment", r.j);
                break;
            }
            case 54: 
            case 55: {
                break;
            }
            default: {
                this.Z4(": was expecting rest of token (internal state: " + this.M9 + ")", this.h);
                return r0;
            }
        }
        return this.r6();
    }

    private r u7(int v, int v1, int v2) throws IOException {
        int[] arr_v = this.D9;
        int[] arr_v1 = com.fasterxml.jackson.core.io.c.m();
        while(true) {
            int v3 = this.a9;
            if(v3 >= this.b9) {
                this.E9 = v;
                this.G9 = v1;
                this.H9 = v2;
                this.M9 = 10;
                this.h = r.j;
                return r.j;
            }
            int v4 = this.W7(v3) & 0xFF;
            if(arr_v1[v4] != 0) {
                if(v2 > 0) {
                    if(v >= arr_v.length) {
                        arr_v = this.G5(arr_v, arr_v.length);
                        this.D9 = arr_v;
                    }
                    arr_v[v] = v1;
                    ++v;
                }
                String s = this.C9.D(arr_v, v);
                if(s == null) {
                    s = this.o6(arr_v, v, v2);
                }
                return this.s6(s);
            }
            ++this.a9;
            if(v2 < 4) {
                ++v2;
                v1 = v1 << 8 | v4;
            }
            else {
                if(v >= arr_v.length) {
                    arr_v = this.G5(arr_v, arr_v.length);
                    this.D9 = arr_v;
                }
                arr_v[v] = v1;
                ++v;
                v1 = v4;
                v2 = 1;
            }
        }
    }

    private r v7(int v) throws IOException {
        switch(v) {
            case 35: {
                if((this.a & d.Ya) != 0) {
                    return this.e7(4);
                }
                break;
            }
            case 39: {
                if((this.a & d.Va) != 0) {
                    return this.U6(0, 0, 0);
                }
                break;
            }
            case 0x2F: {
                return this.O7(4);
            }
            case 93: {
                return this.p6();
            }
        }
        if((this.a & d.Wa) == 0) {
            this.d5(((int)(((char)v))), "was expecting double-quote to start field name");
        }
        if(com.fasterxml.jackson.core.io.c.m()[v] != 0) {
            this.d5(v, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return this.u7(0, v, 1);
    }

    private final r w7(int v, int v1, int v2) throws IOException {
        int v4;
        int[] arr_v = this.D9;
        int[] arr_v1 = d.ab;
        while(true) {
            if(this.a9 >= this.b9) {
                this.E9 = v;
                this.G9 = v1;
                this.H9 = v2;
                this.M9 = 7;
                this.h = r.j;
                return r.j;
            }
            int v3 = this.Y7();
            if(arr_v1[v3] != 0) {
                switch(v3) {
                    case 34: {
                        if(v2 > 0) {
                            if(v >= arr_v.length) {
                                arr_v = this.G5(arr_v, arr_v.length);
                                this.D9 = arr_v;
                            }
                            arr_v[v] = c.y6(v1, v2);
                            ++v;
                        }
                        else if(v == 0) {
                            return this.s6("");
                        }
                        String s = this.C9.D(arr_v, v);
                        if(s == null) {
                            s = this.o6(arr_v, v, v2);
                        }
                        return this.s6(s);
                    }
                    case 92: {
                        v3 = this.K6();
                        if(v3 < 0) {
                            this.M9 = 8;
                            this.N9 = 7;
                            this.E9 = v;
                            this.G9 = v1;
                            this.H9 = v2;
                            this.h = r.j;
                            return r.j;
                        }
                        break;
                    }
                    default: {
                        this.Q5(v3, "name");
                        break;
                    }
                }
                if(v >= arr_v.length) {
                    arr_v = this.G5(arr_v, arr_v.length);
                    this.D9 = arr_v;
                }
                int v5 = 0;
                if(v3 > 0x7F) {
                    if(v2 >= 4) {
                        arr_v[v] = v1;
                        ++v;
                        v1 = 0;
                        v2 = 0;
                    }
                    if(v3 < 0x800) {
                        v1 = v1 << 8 | (v3 >> 6 | 0xC0);
                        ++v2;
                    }
                    else {
                        int v6 = v1 << 8 | (v3 >> 12 | 0xE0);
                        int v7 = v2 + 1;
                        if(v7 >= 4) {
                            arr_v[v] = v6;
                            ++v;
                            v7 = 0;
                        }
                        else {
                            v5 = v6;
                        }
                        v1 = v5 << 8 | (v3 >> 6 & 0x3F | 0x80);
                        v2 = v7 + 1;
                    }
                    v3 = v3 & 0x3F | 0x80;
                }
                if(v2 >= 4) {
                    v4 = v + 1;
                    arr_v[v] = v1;
                    v = v4;
                    v1 = v3;
                    v2 = 1;
                    continue;
                }
            }
            else if(v2 >= 4) {
                if(v >= arr_v.length) {
                    int[] arr_v2 = this.G5(arr_v, arr_v.length);
                    this.D9 = arr_v2;
                    arr_v = arr_v2;
                }
                v4 = v + 1;
                arr_v[v] = v1;
                v = v4;
                v1 = v3;
                v2 = 1;
                continue;
            }
            ++v2;
            v1 = v1 << 8 | v3;
        }
    }

    @Override  // com.fasterxml.jackson.core.base.c
    protected char x5() throws IOException {
        z.f();
        return ' ';
    }

    private final String x7(int v, int v1) throws IOException {
        int[] arr_v = d.ab;
        int v2 = this.W7(v);
        if(arr_v[v2 & 0xFF] == 0) {
            int v3 = v1 << 8 | v2 & 0xFF;
            int v4 = this.W7(v + 1);
            if(arr_v[v4 & 0xFF] == 0) {
                int v5 = v3 << 8 | v4 & 0xFF;
                int v6 = this.W7(v + 2);
                if(arr_v[v6 & 0xFF] == 0) {
                    int v7 = v5 << 8 | v6 & 0xFF;
                    int v8 = this.W7(v + 3);
                    if(arr_v[v8 & 0xFF] == 0) {
                        return this.y7(v + 4, v8 & 0xFF, v7);
                    }
                    if((v8 & 0xFF) == 34) {
                        this.a9 = v + 4;
                        return this.u6(this.F9, v7, 4);
                    }
                    return null;
                }
                if((v6 & 0xFF) == 34) {
                    this.a9 = v + 3;
                    return this.u6(this.F9, v5, 3);
                }
                return null;
            }
            if((v4 & 0xFF) == 34) {
                this.a9 = v + 2;
                return this.u6(this.F9, v3, 2);
            }
            return null;
        }
        if((v2 & 0xFF) == 34) {
            this.a9 = v + 1;
            return this.u6(this.F9, v1, 1);
        }
        return null;
    }

    private final String y7(int v, int v1, int v2) throws IOException {
        int[] arr_v = d.ab;
        int v3 = this.W7(v);
        if(arr_v[v3 & 0xFF] != 0) {
            if((v3 & 0xFF) == 34) {
                this.a9 = v + 1;
                return this.v6(this.F9, v2, v1, 1);
            }
            return null;
        }
        int v4 = v1 << 8 | v3 & 0xFF;
        int v5 = this.W7(v + 1);
        if(arr_v[v5 & 0xFF] != 0) {
            if((v5 & 0xFF) == 34) {
                this.a9 = v + 2;
                return this.v6(this.F9, v2, v4, 2);
            }
            return null;
        }
        int v6 = v4 << 8 | v5 & 0xFF;
        int v7 = this.W7(v + 2);
        if(arr_v[v7 & 0xFF] != 0) {
            if((v7 & 0xFF) == 34) {
                this.a9 = v + 3;
                return this.v6(this.F9, v2, v6, 3);
            }
            return null;
        }
        if((this.W7(v + 3) & 0xFF) == 34) {
            this.a9 = v + 4;
            return this.v6(this.F9, v2, v6 << 8 | v7 & 0xFF, 4);
        }
        return null;
    }

    protected r z7(String s) throws IOException {
        this.V4("Unrecognized token \'%s\': was expecting %s", this.k9.q(), this.R5());
        return r.j;
    }
}

