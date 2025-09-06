package javassist.bytecode.stackmap;

import javassist.bytecode.c0;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;

public abstract class c implements e {
    protected g g;
    protected t h;
    protected String i;
    protected int j;
    protected d[] k;
    protected d[] l;

    public c(c c0) {
        this.g = c0.g;
        this.h = c0.h;
        this.i = c0.i;
        this.j = c0.j;
        this.k = d.q(c0.k.length);
        this.l = d.q(c0.l.length);
    }

    public c(g g0, t t0, int v, int v1, String s) {
        this.g = g0;
        this.h = t0;
        this.i = s;
        this.j = 0;
        this.k = d.q(v);
        this.l = d.q(v1);
    }

    private void A(String s) {
        int v = 0;
        if(s.charAt(0) == 40) {
            v = s.indexOf(41) + 1;
            if(v < 1) {
                throw new IndexOutOfBoundsException("bad descriptor: " + s);
            }
        }
        d[] arr_d = this.k;
        int v1 = this.j;
        switch(s.charAt(v)) {
            case 68: {
                arr_d[v1] = e.e;
                arr_d[v1 + 1] = e.b;
                this.j += 2;
                return;
            }
            case 70: {
                arr_d[v1] = e.d;
                break;
            }
            case 74: {
                arr_d[v1] = e.f;
                arr_d[v1 + 1] = e.b;
                this.j += 2;
                return;
            }
            case 76: {
                arr_d[v1] = new javassist.bytecode.stackmap.d.e(c.z(s, v));
                break;
            }
            case 86: {
                return;
            }
            case 91: {
                arr_d[v1] = new javassist.bytecode.stackmap.d.e(s.substring(v));
                break;
            }
            default: {
                arr_d[v1] = e.c;
                break;
            }
        }
        ++this.j;
    }

    private void B(boolean z, int v) throws javassist.bytecode.e {
        if(z) {
            String s = this.h.G(v);
            int v1 = this.j - 1;
            this.j = v1;
            this.k[v1].r(s, this.g);
        }
    }

    protected void C(int v, byte[] arr_b, int v1) throws javassist.bytecode.e {
    }

    protected void D(int v, byte[] arr_b, int v1) throws javassist.bytecode.e {
    }

    protected void E(int v, byte[] arr_b) throws javassist.bytecode.e {
    }

    protected void F(int v, byte[] arr_b, int v1, int v2, int v3) throws javassist.bytecode.e {
    }

    protected void G(int v, byte[] arr_b) throws javassist.bytecode.e {
    }

    protected void H(int v, byte[] arr_b) throws javassist.bytecode.e {
    }

    protected void I(int v, byte[] arr_b, int v1, int v2, int v3) throws javassist.bytecode.e {
    }

    protected void J(int v, byte[] arr_b) throws javassist.bytecode.e {
    }

    private void a(String s, int v) throws javassist.bytecode.e {
        int v3;
        int v1 = s.charAt(v);
        if(v1 == 41) {
            return;
        }
        boolean z = false;
        int v2 = v;
        while(true) {
            switch(v1) {
                case 76: {
                    v3 = s.indexOf(59, v2) + 1;
                    if(v3 <= 0) {
                        throw new IndexOutOfBoundsException("bad descriptor");
                    }
                label_11:
                    this.a(s, v3);
                    if(z || v1 != 68 && v1 != 74) {
                        --this.j;
                    }
                    else {
                        this.j -= 2;
                    }
                    if(z) {
                        this.k[this.j].r(s.substring(v, v3), this.g);
                        return;
                    }
                    if(v1 == 76) {
                        this.k[this.j].r(s.substring(v + 1, v3 - 1).replace('/', '.'), this.g);
                    }
                    return;
                }
                case 91: {
                    break;
                }
                default: {
                    v3 = v2 + 1;
                    goto label_11;
                }
            }
            ++v2;
            v1 = s.charAt(v2);
            z = true;
        }
    }

    private void b(d d0, int v) {
        d0.d(v);
        for(int v2 = 0; v2 < this.j; ++v2) {
            this.k[v2].d(v);
        }
        for(int v1 = 0; true; ++v1) {
            d[] arr_d = this.l;
            if(v1 >= arr_d.length) {
                break;
            }
            arr_d[v1].d(v);
        }
    }

    private int c(int v) {
        int v1 = this.j;
        this.j = v1 + 1;
        this.k[v1] = this.l[v];
        return 2;
    }

    private int d(int v) {
        int v1 = this.j - 1;
        this.j = v1;
        this.l[v] = this.k[v1];
        return 2;
    }

    private void e(int v, int v1) {
        d[] arr_d = this.k;
        int v2 = this.j - 1;
        int v3 = v2 - v1;
        while(v2 > v3) {
            arr_d[v2 + v] = arr_d[v2];
            --v2;
        }
    }

    private int f(int v, byte[] arr_b, boolean z) throws javassist.bytecode.e {
        int v1 = javassist.bytecode.g.d(arr_b, v + 1);
        this.B(z, v1);
        this.A(this.h.J(v1));
        return 3;
    }

    private int g(int v, byte[] arr_b) throws javassist.bytecode.e {
        int v1 = javassist.bytecode.g.d(arr_b, v + 1);
        String s = this.h.T(v1);
        this.a(s, 1);
        this.A(s);
        return 5;
    }

    private int h(int v, byte[] arr_b) throws javassist.bytecode.e {
        int v1 = javassist.bytecode.g.d(arr_b, v + 1);
        String s = this.h.Q(v1);
        this.a(s, 1);
        String s1 = this.h.N(v1);
        int v2 = this.j - 1;
        this.j = v2;
        this.k[v2].r(s1, this.g);
        this.A(s);
        return 5;
    }

    private int i(int v, byte[] arr_b, boolean z) throws javassist.bytecode.e {
        int v1 = javassist.bytecode.g.d(arr_b, v + 1);
        String s = this.h.g0(v1);
        this.a(s, 1);
        if(z) {
            String s1 = this.h.d0(v1);
            int v2 = this.j - 1;
            this.j = v2;
            d d0 = this.k[v2];
            if(d0 instanceof j && d0.o()) {
                this.b(d0, ((j)d0).w());
            }
            else if(d0 instanceof h) {
                this.b(d0, ((h)d0).w());
            }
            d0.r(s1, this.g);
        }
        this.A(s);
        return 3;
    }

    private void j(int v) {
        d[] arr_d = this.k;
        int v1 = this.h.n0(v);
        switch(v1) {
            case 3: {
                int v3 = this.j;
                this.j = v3 + 1;
                arr_d[v3] = e.c;
                return;
            }
            case 4: {
                int v4 = this.j;
                this.j = v4 + 1;
                arr_d[v4] = e.d;
                return;
            }
            case 5: {
                int v5 = this.j;
                this.j = v5 + 1;
                arr_d[v5] = e.f;
                this.j = v5 + 2;
                arr_d[v5 + 1] = e.b;
                return;
            }
            case 6: {
                int v6 = this.j;
                this.j = v6 + 1;
                arr_d[v6] = e.e;
                this.j = v6 + 2;
                arr_d[v6 + 1] = e.b;
                return;
            }
            case 7: {
                int v7 = this.j;
                this.j = v7 + 1;
                arr_d[v7] = new javassist.bytecode.stackmap.d.e("java.lang.Class");
                return;
            }
            case 8: {
                int v2 = this.j;
                this.j = v2 + 1;
                arr_d[v2] = new javassist.bytecode.stackmap.d.e("java.lang.String");
                return;
            }
            default: {
                throw new RuntimeException("bad LDC: " + v1);
            }
        }
    }

    private int k(int v, byte[] arr_b) {
        int v1 = javassist.bytecode.g.d(arr_b, v + 1);
        this.j -= (arr_b[v + 3] & 0xFF) - 1;
        d[] arr_d = this.k;
        int v2 = this.j - 1;
        arr_d[v2] = new javassist.bytecode.stackmap.d.e(this.h.A(v1).replace('.', '/'));
        return 4;
    }

    private int l(int v, byte[] arr_b) {
        String s;
        int v1 = this.j - 1;
        switch(arr_b[v + 1] & 0xFF) {
            case 4: {
                s = "[Z";
                break;
            }
            case 5: {
                s = "[C";
                break;
            }
            case 6: {
                s = "[F";
                break;
            }
            case 7: {
                s = "[D";
                break;
            }
            case 8: {
                s = "[B";
                break;
            }
            case 9: {
                s = "[S";
                break;
            }
            case 10: {
                s = "[I";
                break;
            }
            case 11: {
                s = "[J";
                break;
            }
            default: {
                throw new RuntimeException("bad newarray");
            }
        }
        d[] arr_d = this.k;
        arr_d[v1] = new javassist.bytecode.stackmap.d.e(s);
        return 2;
    }

    protected int m(int v, byte[] arr_b) throws javassist.bytecode.e {
        try {
            int v1 = arr_b[v] & 0xFF;
            if(v1 < 54) {
                return this.n(v, arr_b, v1);
            }
            if(v1 < 0x60) {
                return this.p(v, arr_b, v1);
            }
            return v1 >= 0x94 ? this.o(v, arr_b, v1) : this.q(v, arr_b, v1);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw new javassist.bytecode.e("inconsistent stack height " + arrayIndexOutOfBoundsException0.getMessage(), arrayIndexOutOfBoundsException0);
    }

    private int n(int v, byte[] arr_b, int v1) throws javassist.bytecode.e {
        d[] arr_d = this.k;
        switch(v1) {
            case 0: {
                break;
            }
            case 1: {
                int v18 = this.j;
                this.j = v18 + 1;
                arr_d[v18] = new f();
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                int v2 = this.j;
                this.j = v2 + 1;
                arr_d[v2] = e.c;
                return 1;
            }
            case 9: 
            case 10: {
                int v3 = this.j;
                this.j = v3 + 1;
                arr_d[v3] = e.f;
                this.j = v3 + 2;
                arr_d[v3 + 1] = e.b;
                return 1;
            }
            case 11: 
            case 12: 
            case 13: {
                int v4 = this.j;
                this.j = v4 + 1;
                arr_d[v4] = e.d;
                return 1;
            }
            case 14: 
            case 15: {
                int v5 = this.j;
                this.j = v5 + 1;
                arr_d[v5] = e.e;
                this.j = v5 + 2;
                arr_d[v5 + 1] = e.b;
                return 1;
            }
            case 16: 
            case 17: {
                int v6 = this.j;
                this.j = v6 + 1;
                arr_d[v6] = e.c;
                return v1 == 17 ? 3 : 2;
            }
            case 18: {
                this.j(arr_b[v + 1] & 0xFF);
                return 2;
            }
            case 19: 
            case 20: {
                this.j(javassist.bytecode.g.d(arr_b, v + 1));
                return 3;
            }
            case 21: {
                return this.w(e.c, arr_b, v);
            }
            case 22: {
                return this.w(e.f, arr_b, v);
            }
            case 23: {
                return this.w(e.d, arr_b, v);
            }
            case 24: {
                return this.w(e.e, arr_b, v);
            }
            case 25: {
                return this.c(arr_b[v + 1] & 0xFF);
            }
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                int v7 = this.j;
                this.j = v7 + 1;
                arr_d[v7] = e.c;
                return 1;
            }
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: {
                int v8 = this.j;
                this.j = v8 + 1;
                arr_d[v8] = e.f;
                this.j = v8 + 2;
                arr_d[v8 + 1] = e.b;
                return 1;
            }
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                int v9 = this.j;
                this.j = v9 + 1;
                arr_d[v9] = e.d;
                return 1;
            }
            case 38: 
            case 39: 
            case 40: 
            case 41: {
                int v10 = this.j;
                this.j = v10 + 1;
                arr_d[v10] = e.e;
                this.j = v10 + 2;
                arr_d[v10 + 1] = e.b;
                return 1;
            }
            case 42: 
            case 43: 
            case 44: 
            case 45: {
                int v11 = this.j;
                this.j = v11 + 1;
                arr_d[v11] = this.l[v1 - 42];
                return 1;
            }
            case 46: {
                int v12 = this.j;
                this.j = v12 - 1;
                arr_d[v12 - 2] = e.c;
                return 1;
            }
            case 0x2F: {
                int v13 = this.j;
                arr_d[v13 - 2] = e.f;
                arr_d[v13 - 1] = e.b;
                return 1;
            }
            case 0x30: {
                int v14 = this.j;
                this.j = v14 - 1;
                arr_d[v14 - 2] = e.d;
                return 1;
            }
            case 49: {
                int v15 = this.j;
                arr_d[v15 - 2] = e.e;
                arr_d[v15 - 1] = e.b;
                return 1;
            }
            case 50: {
                int v16 = this.j;
                this.j = v16 - 1;
                arr_d[v16 - 2] = b.y(arr_d[v16 - 2]);
                return 1;
            }
            case 51: 
            case 52: 
            case 53: {
                int v17 = this.j;
                this.j = v17 - 1;
                arr_d[v17 - 2] = e.c;
                return 1;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private int o(int v, byte[] arr_b, int v1) throws javassist.bytecode.e {
        switch(v1) {
            case 0x94: {
                int v2 = this.j;
                this.k[v2 - 4] = e.c;
                this.j = v2 - 3;
                return 1;
            }
            case 0x95: 
            case 150: {
                int v3 = this.j;
                this.j = v3 - 1;
                this.k[v3 - 2] = e.c;
                return 1;
            }
            case 0x97: 
            case 0x98: {
                int v4 = this.j;
                this.k[v4 - 4] = e.c;
                this.j = v4 - 3;
                return 1;
            }
            case 0x99: 
            case 0x9A: 
            case 0x9B: 
            case 0x9C: 
            case 0x9D: 
            case 0x9E: {
                --this.j;
                this.C(v, arr_b, javassist.bytecode.g.c(arr_b, v + 1));
                return 3;
            }
            case 0x9F: 
            case 0xA0: 
            case 0xA1: 
            case 0xA2: 
            case 0xA3: 
            case 0xA4: 
            case 0xA5: 
            case 0xA6: {
                this.j -= 2;
                this.C(v, arr_b, javassist.bytecode.g.c(arr_b, v + 1));
                return 3;
            }
            case 0xA7: {
                this.D(v, arr_b, javassist.bytecode.g.c(arr_b, v + 1));
                return 3;
            }
            case 0xA8: {
                return 3;
            }
            case 0xA9: {
                return 2;
            }
            case 170: {
                --this.j;
                int v5 = javassist.bytecode.g.b(arr_b, (v & -4) + 12) - javassist.bytecode.g.b(arr_b, (v & -4) + 8) + 1;
                this.I(v, arr_b, v5, (v & -4) + 16, javassist.bytecode.g.b(arr_b, (v & -4) + 4));
                return v5 * 4 + 16 - (v & 3);
            }
            case 0xAB: {
                --this.j;
                int v6 = javassist.bytecode.g.b(arr_b, (v & -4) + 8);
                this.F(v, arr_b, v6, (v & -4) + 12, javassist.bytecode.g.b(arr_b, (v & -4) + 4));
                return v6 * 8 + 12 - (v & 3);
            }
            case 0xAC: {
                --this.j;
                return 1;
            }
            case 0xAD: {
                this.j -= 2;
                return 1;
            }
            case 0xAE: {
                --this.j;
                return 1;
            }
            case 0xAF: {
                this.j -= 2;
                return 1;
            }
            case 0xB0: {
                int v7 = this.j - 1;
                this.j = v7;
                this.k[v7].r(this.i, this.g);
                return 1;
            }
            case 0xB2: {
                return this.f(v, arr_b, false);
            }
            case 0xB3: {
                return this.r(v, arr_b, false);
            }
            case 180: {
                return this.f(v, arr_b, true);
            }
            case 0xB5: {
                return this.r(v, arr_b, true);
            }
            case 0xB6: 
            case 0xB7: {
                return this.i(v, arr_b, true);
            }
            case 0xB8: {
                return this.i(v, arr_b, false);
            }
            case 0xB9: {
                return this.h(v, arr_b);
            }
            case 0xBA: {
                return this.g(v, arr_b);
            }
            case 0xBB: {
                int v8 = javassist.bytecode.g.d(arr_b, v + 1);
                d[] arr_d = this.k;
                int v9 = this.j;
                this.j = v9 + 1;
                arr_d[v9] = new h(v, this.h.A(v8));
                return 3;
            }
            case 0xBC: {
                return this.l(v, arr_b);
            }
            case 0xBD: {
                int v10 = javassist.bytecode.g.d(arr_b, v + 1);
                String s = this.h.A(v10).replace('.', '/');
                d[] arr_d1 = this.k;
                int v11 = this.j - 1;
                arr_d1[v11] = new javassist.bytecode.stackmap.d.e((s.charAt(0) == 91 ? "[" + s : "[L" + s + ";"));
                return 3;
            }
            case 190: {
                this.k[this.j - 1].r("[Ljava.lang.Object;", this.g);
                this.k[this.j - 1] = e.c;
                return 1;
            }
            case 0xBF: {
                int v12 = this.j - 1;
                this.j = v12;
                this.k[v12].r("java.lang.Throwable", this.g);
                return 1;
            }
            case 0xC0: {
                int v13 = javassist.bytecode.g.d(arr_b, v + 1);
                String s1 = this.h.A(v13);
                if(s1.charAt(0) == 91) {
                    s1 = s1.replace('.', '/');
                }
                d[] arr_d2 = this.k;
                int v14 = this.j - 1;
                arr_d2[v14] = new javassist.bytecode.stackmap.d.e(s1);
                return 3;
            }
            case 0xC1: {
                this.k[this.j - 1] = e.c;
                return 3;
            }
            case 0xC2: 
            case 0xC3: {
                --this.j;
                return 1;
            }
            case 0xC4: {
                return this.s(v, arr_b);
            }
            case 0xC5: {
                return this.k(v, arr_b);
            }
            case 0xC6: 
            case 0xC7: {
                --this.j;
                this.C(v, arr_b, javassist.bytecode.g.c(arr_b, v + 1));
                return 3;
            }
            case 200: {
                this.D(v, arr_b, javassist.bytecode.g.b(arr_b, v + 1));
                return 5;
            }
            case 201: {
                return 5;
            }
            default: {
                return 1;
            }
        }
    }

    private int p(int v, byte[] arr_b, int v1) throws javassist.bytecode.e {
        int v2 = 3;
        switch(v1) {
            case 54: {
                return this.y(v, arr_b, e.c);
            }
            case 55: {
                return this.y(v, arr_b, e.f);
            }
            case 56: {
                return this.y(v, arr_b, e.d);
            }
            case 57: {
                return this.y(v, arr_b, e.e);
            }
            case 58: {
                return this.d(arr_b[v + 1] & 0xFF);
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                this.l[v1 - 59] = e.c;
                --this.j;
                return 1;
            }
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: {
                d[] arr_d = this.l;
                arr_d[v1 - 0x3F] = e.f;
                arr_d[v1 - 62] = e.b;
                this.j -= 2;
                return 1;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                this.l[v1 - 67] = e.d;
                --this.j;
                return 1;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: {
                d[] arr_d1 = this.l;
                arr_d1[v1 - 71] = e.e;
                arr_d1[v1 - 70] = e.b;
                this.j -= 2;
                return 1;
            }
            case 75: 
            case 76: 
            case 77: 
            case 78: {
                this.d(v1 - 75);
                return 1;
            }
            case 0x4F: 
            case 80: 
            case 81: 
            case 82: {
                int v3 = this.j;
                if(v1 == 80 || v1 == 82) {
                    v2 = 4;
                }
                this.j = v3 - v2;
                return 1;
            }
            case 83: {
                d.a(this.k[this.j - 3], this.k[this.j - 1], this.g);
                this.j -= 3;
                return 1;
            }
            case 84: 
            case 85: 
            case 86: {
                this.j -= 3;
                return 1;
            }
            case 87: {
                --this.j;
                return 1;
            }
            case 88: {
                this.j -= 2;
                return 1;
            }
            case 89: {
                int v4 = this.j;
                this.k[v4] = this.k[v4 - 1];
                this.j = v4 + 1;
                return 1;
            }
            case 90: 
            case 91: {
                this.e(1, v1 - 88);
                int v5 = this.j;
                this.k[v5 - (v1 - 88)] = this.k[v5];
                this.j = v5 + 1;
                return 1;
            }
            case 92: {
                this.e(2, 2);
                this.j += 2;
                return 1;
            }
            case 93: 
            case 94: {
                this.e(2, v1 - 90);
                int v6 = this.j;
                d[] arr_d2 = this.k;
                int v7 = v6 - (v1 - 90);
                arr_d2[v7] = arr_d2[v6];
                arr_d2[v7 + 1] = arr_d2[v6 + 1];
                this.j = v6 + 2;
                return 1;
            }
            case 0x5F: {
                int v8 = this.j;
                d[] arr_d3 = this.k;
                d d0 = arr_d3[v8 - 1];
                arr_d3[v8 - 1] = arr_d3[v8 - 2];
                arr_d3[v8 - 2] = d0;
                return 1;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
    }

    private int q(int v, byte[] arr_b, int v1) {
        if(v1 <= 0x83) {
            this.j += c0.M6[v1];
            return 1;
        }
        switch(v1) {
            case 0x84: {
                return 3;
            }
            case 0x85: {
                d[] arr_d3 = this.k;
                int v9 = this.j;
                arr_d3[v9 - 1] = e.f;
                arr_d3[v9] = e.b;
                this.j = v9 + 1;
                break;
            }
            case 0x86: {
                this.k[this.j - 1] = e.d;
                return 1;
            }
            case 0x87: {
                d[] arr_d = this.k;
                int v2 = this.j;
                arr_d[v2 - 1] = e.e;
                arr_d[v2] = e.b;
                this.j = v2 + 1;
                return 1;
            }
            case 0x88: {
                int v3 = this.j;
                this.j = v3 - 1;
                this.k[v3 - 2] = e.c;
                return 1;
            }
            case 0x89: {
                int v4 = this.j;
                this.j = v4 - 1;
                this.k[v4 - 2] = e.d;
                return 1;
            }
            case 0x8A: {
                this.k[this.j - 2] = e.e;
                return 1;
            }
            case 0x8B: {
                this.k[this.j - 1] = e.c;
                return 1;
            }
            case 140: {
                d[] arr_d1 = this.k;
                int v5 = this.j;
                arr_d1[v5 - 1] = e.f;
                arr_d1[v5] = e.b;
                this.j = v5 + 1;
                return 1;
            }
            case 0x8D: {
                d[] arr_d2 = this.k;
                int v6 = this.j;
                arr_d2[v6 - 1] = e.e;
                arr_d2[v6] = e.b;
                this.j = v6 + 1;
                return 1;
            }
            case 0x8E: {
                int v7 = this.j;
                this.j = v7 - 1;
                this.k[v7 - 2] = e.c;
                return 1;
            }
            case 0x8F: {
                this.k[this.j - 2] = e.f;
                return 1;
            }
            case 0x90: {
                int v8 = this.j;
                this.j = v8 - 1;
                this.k[v8 - 2] = e.d;
                return 1;
            }
            case 0x91: 
            case 0x92: 
            case 0x93: {
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private int r(int v, byte[] arr_b, boolean z) throws javassist.bytecode.e {
        int v1 = javassist.bytecode.g.d(arr_b, v + 1);
        String s = this.h.J(v1);
        this.j -= w.e(s);
        int v2 = s.charAt(0);
        if(v2 == 76) {
            this.k[this.j].r(c.z(s, 0), this.g);
        }
        else if(v2 == 91) {
            this.k[this.j].r(s, this.g);
        }
        this.B(z, v1);
        return 3;
    }

    private int s(int v, byte[] arr_b) throws javassist.bytecode.e {
        int v1 = arr_b[v + 1] & 0xFF;
        switch(v1) {
            case 21: {
                this.u(v, arr_b, e.c);
                break;
            }
            case 22: {
                this.u(v, arr_b, e.f);
                return 4;
            }
            case 23: {
                this.u(v, arr_b, e.d);
                return 4;
            }
            case 24: {
                this.u(v, arr_b, e.e);
                return 4;
            }
            case 25: {
                this.c(javassist.bytecode.g.d(arr_b, v + 2));
                return 4;
            }
            case 54: {
                this.t(v, arr_b, e.c);
                return 4;
            }
            case 55: {
                this.t(v, arr_b, e.f);
                return 4;
            }
            case 56: {
                this.t(v, arr_b, e.d);
                return 4;
            }
            case 57: {
                this.t(v, arr_b, e.e);
                return 4;
            }
            case 58: {
                this.d(javassist.bytecode.g.d(arr_b, v + 2));
                return 4;
            }
            case 0x84: {
                return 6;
            }
            case 0xA9: {
                break;
            }
            default: {
                throw new RuntimeException("bad WIDE instruction: " + v1);
            }
        }
        return 4;
    }

    private void t(int v, byte[] arr_b, d d0) {
        this.x(javassist.bytecode.g.d(arr_b, v + 2), d0);
    }

    private void u(int v, byte[] arr_b, d d0) {
        this.v(javassist.bytecode.g.d(arr_b, v + 2), d0);
    }

    private int v(int v, d d0) {
        int v1 = this.j;
        this.j = v1 + 1;
        this.k[v1] = d0;
        if(d0.l()) {
            int v2 = this.j;
            this.j = v2 + 1;
            this.k[v2] = e.b;
        }
        return 2;
    }

    private int w(d d0, byte[] arr_b, int v) {
        return this.v(arr_b[v + 1] & 0xFF, d0);
    }

    private int x(int v, d d0) {
        --this.j;
        this.l[v] = d0;
        if(d0.l()) {
            --this.j;
            this.l[v + 1] = e.b;
        }
        return 2;
    }

    private int y(int v, byte[] arr_b, d d0) {
        return this.x(arr_b[v + 1] & 0xFF, d0);
    }

    private static String z(String s, int v) {
        return s.substring(v + 1, s.length() - 1).replace('/', '.');
    }
}

