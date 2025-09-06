package javassist.bytecode.analysis;

import javassist.E;
import javassist.bytecode.T;
import javassist.bytecode.c0;
import javassist.bytecode.e;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;
import javassist.l;

public class c implements c0 {
    private final t a;
    private final g b;
    private final k c;
    private final k d;
    private final k e;
    private int f;

    public c(g g0, t t0) {
        this.a = t0;
        this.b = g0;
        try {
            this.c = this.r("java.lang.String");
            this.d = this.r("java.lang.Class");
            this.e = this.r("java.lang.Throwable");
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    private void A(k k0, k k1) throws e {
        if(!k0.r(k1)) {
            throw new e("Expected type: " + k0 + " Got: " + k1 + " [pos = " + this.f + "]");
        }
    }

    private k B(k k0) {
        return k0 == k.i || k0 == k.h || k0 == k.g || k0 == k.e ? k.j : k0;
    }

    private void a(int v, k k0, i i0) {
        if(i0 == null) {
            return;
        }
        i0.a(v);
        if(k0.p() == 2) {
            i0.a(v + 1);
        }
    }

    private void b(k k0, d d0) throws e {
        k k1 = d0.m();
        k k2 = d0.m();
        k k3 = k.m;
        if(k2 == k3) {
            this.A(k.j, k1);
            if(k0 == k.q) {
                this.x(k3, d0);
                return;
            }
            this.x(k0, d0);
            return;
        }
        k k4 = k2.k();
        if(k4 == null) {
            throw new e("Not an array! [pos = " + this.f + "]: " + null);
        }
        k k5 = this.B(k4);
        this.A(k0, k5);
        this.A(k.j, k1);
        this.x(k5, d0);
    }

    private void c(k k0, d d0) throws e {
        k k1 = this.w(d0);
        k k2 = d0.m();
        k k3 = d0.m();
        if(k3 == k.m) {
            this.A(k.j, k2);
            return;
        }
        k k4 = k3.k();
        if(k4 == null) {
            throw new e("Not an array! [pos = " + this.f + "]: " + null);
        }
        k k5 = this.B(k4);
        this.A(k0, k5);
        this.A(k.j, k2);
        if(k0 == k.q) {
            this.A(k0, k1);
            return;
        }
        this.A(k5, k1);
    }

    private void d(k k0, d d0) throws e {
        k k1 = this.w(d0);
        k k2 = this.w(d0);
        this.A(k0, k1);
        this.A(k0, k2);
        this.x(k2, d0);
    }

    private void e(int v, int v1, d d0) throws e {
        k k0 = this.B(this.z(this.a.J(v1)));
        if(v == 180) {
            this.A(this.t(this.a.G(v1)), this.w(d0));
        }
        this.x(k0, d0);
    }

    private void f(int v, int v1, d d0) throws e {
        String s = this.a.T(v1);
        k[] arr_k = this.s(s);
        int v2 = arr_k.length;
        while(v2 > 0) {
            --v2;
            this.A(this.B(arr_k[v2]), this.w(d0));
        }
        k k0 = this.u(s);
        if(k0 != k.l) {
            this.x(this.B(k0), d0);
        }
    }

    private void g(int v, int v1, d d0) throws e {
        String s = this.a.Q(v1);
        k[] arr_k = this.s(s);
        int v2 = arr_k.length;
        while(v2 > 0) {
            --v2;
            this.A(this.B(arr_k[v2]), this.w(d0));
        }
        this.A(this.t(this.a.N(v1)), this.w(d0));
        k k0 = this.u(s);
        if(k0 != k.l) {
            this.x(this.B(k0), d0);
        }
    }

    private void h(int v, int v1, d d0) throws e {
        String s = this.a.g0(v1);
        k[] arr_k = this.s(s);
        int v2 = arr_k.length;
        while(v2 > 0) {
            --v2;
            this.A(this.B(arr_k[v2]), this.w(d0));
        }
        if(v != 0xB8) {
            this.A(this.t(this.a.d0(v1)), this.w(d0));
        }
        k k0 = this.u(s);
        if(k0 != k.l) {
            this.x(this.B(k0), d0);
        }
    }

    private void i(int v, d d0) throws e {
        k k0;
        int v1 = this.a.n0(v);
        switch(v1) {
            case 3: {
                k0 = k.j;
                break;
            }
            case 4: {
                k0 = k.k;
                break;
            }
            case 5: {
                k0 = k.f;
                break;
            }
            case 6: {
                k0 = k.d;
                break;
            }
            case 7: {
                k0 = this.d;
                break;
            }
            case 8: {
                k0 = this.c;
                break;
            }
            default: {
                throw new e("bad LDC [pos = " + this.f + "]: " + v1);
            }
        }
        this.x(k0, d0);
    }

    private void j(k k0, int v, d d0, i i0) throws e {
        k k1 = d0.d(v);
        this.A(k0, k1);
        this.x(k1, d0);
        this.a(v, k1, i0);
    }

    private void k(int v, q q0, d d0) throws e {
        k k1;
        k k0 = this.w(d0);
        this.A(k.j, k0);
        int v1 = q0.f(v + 1);
        switch(v1) {
            case 4: {
                k1 = this.r("boolean[]");
                break;
            }
            case 5: {
                k1 = this.r("char[]");
                break;
            }
            case 6: {
                k1 = this.r("float[]");
                break;
            }
            case 7: {
                k1 = this.r("double[]");
                break;
            }
            case 8: {
                k1 = this.r("byte[]");
                break;
            }
            case 9: {
                k1 = this.r("short[]");
                break;
            }
            case 10: {
                k1 = this.r("int[]");
                break;
            }
            case 11: {
                k1 = this.r("long[]");
                break;
            }
            default: {
                throw new e("Invalid array type [pos = " + v + "]: " + v1);
            }
        }
        d0.n(k1);
    }

    private void l(int v, q q0, d d0) throws e {
        int v2;
        int v1 = q0.T(v + 1);
        String s = this.t(this.a.A(v1)).l().X();
        if(q0.f(v) == 0xC5) {
            v2 = q0.f(v + 3);
        }
        else {
            s = s + "[]";
            v2 = 1;
        }
        while(v2 > 0) {
            k k0 = this.w(d0);
            this.A(k.j, k0);
            --v2;
        }
        this.x(this.r(s), d0);
    }

    private void m(int v, int v1, d d0) throws e {
        this.A(this.B(this.z(this.a.J(v1))), this.w(d0));
        if(v == 0xB5) {
            this.A(this.t(this.a.G(v1)), this.w(d0));
        }
    }

    private void n(k k0, d d0) throws e {
        k k1 = this.w(d0);
        k k2 = this.w(d0);
        this.A(k.j, k1);
        this.A(k0, k2);
        this.x(k2, d0);
    }

    private void o(k k0, int v, d d0, i i0) throws e {
        k k1 = this.w(d0);
        if(k0 != k.q || k1 != k.n) {
            this.A(k0, k1);
        }
        this.y(v, k1, d0);
        this.a(v, k1, i0);
    }

    private void p(int v, q q0, d d0, i i0) throws e {
        int v1 = q0.f(v + 1);
        int v2 = q0.T(v + 2);
        switch(v1) {
            case 21: {
                this.j(k.j, v2, d0, i0);
                return;
            }
            case 22: {
                this.j(k.f, v2, d0, i0);
                return;
            }
            case 23: {
                this.j(k.k, v2, d0, i0);
                return;
            }
            case 24: {
                this.j(k.d, v2, d0, i0);
                return;
            }
            case 25: {
                this.j(k.q, v2, d0, i0);
                return;
            }
            case 54: {
                this.o(k.j, v2, d0, i0);
                return;
            }
            case 55: {
                this.o(k.f, v2, d0, i0);
                return;
            }
            case 56: {
                this.o(k.k, v2, d0, i0);
                return;
            }
            case 57: {
                this.o(k.d, v2, d0, i0);
                return;
            }
            case 58: {
                this.o(k.q, v2, d0, i0);
                return;
            }
            case 0x84: {
                k k0 = d0.d(v2);
                this.A(k.j, k0);
                return;
            }
            case 0xA9: {
                k k1 = d0.d(v2);
                this.A(k.n, k1);
                return;
            }
            default: {
                throw new e("Invalid WIDE operand [pos = " + v + "]: " + v1);
            }
        }
    }

    public void q(T t0, int v, q q0, d d0, i i0) throws e {
        this.f = v;
        int v1 = q0.f(v);
        switch(v1) {
            case 1: {
                d0.n(k.m);
                return;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                d0.n(k.j);
                return;
            }
            case 9: 
            case 10: {
                d0.n(k.f);
                d0.n(k.o);
                return;
            }
            case 11: 
            case 12: 
            case 13: {
                d0.n(k.k);
                return;
            }
            case 14: 
            case 15: {
                d0.n(k.d);
                d0.n(k.o);
                return;
            }
            case 16: 
            case 17: {
                d0.n(k.j);
                return;
            }
            case 18: {
                this.i(q0.f(v + 1), d0);
                return;
            }
            case 19: 
            case 20: {
                this.i(q0.T(v + 1), d0);
                return;
            }
            case 21: {
                int v2 = q0.f(v + 1);
                this.j(k.j, v2, d0, i0);
                return;
            }
            case 22: {
                int v3 = q0.f(v + 1);
                this.j(k.f, v3, d0, i0);
                return;
            }
            case 23: {
                int v4 = q0.f(v + 1);
                this.j(k.k, v4, d0, i0);
                return;
            }
            case 24: {
                int v5 = q0.f(v + 1);
                this.j(k.d, v5, d0, i0);
                return;
            }
            case 25: {
                int v6 = q0.f(v + 1);
                this.j(k.q, v6, d0, i0);
                return;
            }
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                this.j(k.j, v1 - 26, d0, i0);
                return;
            }
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: {
                this.j(k.f, v1 - 30, d0, i0);
                return;
            }
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                this.j(k.k, v1 - 34, d0, i0);
                return;
            }
            case 38: 
            case 39: 
            case 40: 
            case 41: {
                this.j(k.d, v1 - 38, d0, i0);
                return;
            }
            case 42: 
            case 43: 
            case 44: 
            case 45: {
                this.j(k.q, v1 - 42, d0, i0);
                return;
            }
            case 46: {
                this.b(k.j, d0);
                return;
            }
            case 0x2F: {
                this.b(k.f, d0);
                return;
            }
            case 0x30: {
                this.b(k.k, d0);
                return;
            }
            case 49: {
                this.b(k.d, d0);
                return;
            }
            case 50: {
                this.b(k.q, d0);
                return;
            }
            case 51: 
            case 52: 
            case 53: {
                this.b(k.j, d0);
                return;
            }
            case 54: {
                int v7 = q0.f(v + 1);
                this.o(k.j, v7, d0, i0);
                return;
            }
            case 55: {
                int v8 = q0.f(v + 1);
                this.o(k.f, v8, d0, i0);
                return;
            }
            case 56: {
                int v9 = q0.f(v + 1);
                this.o(k.k, v9, d0, i0);
                return;
            }
            case 57: {
                int v10 = q0.f(v + 1);
                this.o(k.d, v10, d0, i0);
                return;
            }
            case 58: {
                int v11 = q0.f(v + 1);
                this.o(k.q, v11, d0, i0);
                return;
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                this.o(k.j, v1 - 59, d0, i0);
                return;
            }
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: {
                this.o(k.f, v1 - 0x3F, d0, i0);
                return;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                this.o(k.k, v1 - 67, d0, i0);
                return;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: {
                this.o(k.d, v1 - 71, d0, i0);
                return;
            }
            case 75: 
            case 76: 
            case 77: 
            case 78: {
                this.o(k.q, v1 - 75, d0, i0);
                return;
            }
            case 0x4F: {
                this.c(k.j, d0);
                return;
            }
            case 80: {
                this.c(k.f, d0);
                return;
            }
            case 81: {
                this.c(k.k, d0);
                return;
            }
            case 82: {
                this.c(k.d, d0);
                return;
            }
            case 83: {
                this.c(k.q, d0);
                return;
            }
            case 84: 
            case 85: 
            case 86: {
                this.c(k.j, d0);
                return;
            }
            case 87: {
                if(d0.m() == k.o) {
                    throw new e("POP can not be used with a category 2 value, pos = " + v);
                }
                return;
            }
            case 88: {
                d0.m();
                d0.m();
                return;
            }
            case 89: {
                if(d0.l() == k.o) {
                    throw new e("DUP can not be used with a category 2 value, pos = " + v);
                }
                d0.n(d0.l());
                return;
            }
            case 90: 
            case 91: {
                k k0 = d0.l();
                if(k0 == k.o) {
                    throw new e("DUP can not be used with a category 2 value, pos = " + v);
                }
                int v12 = d0.f();
                int v13 = v12 - v1 + 89;
                d0.n(k0);
                while(v12 > v13) {
                    d0.r(v12, d0.e(v12 - 1));
                    --v12;
                }
                d0.r(v13, k0);
                return;
            }
            case 92: {
                d0.n(d0.e(d0.f() - 1));
                d0.n(d0.e(d0.f() - 1));
                return;
            }
            case 93: 
            case 94: {
                int v14 = d0.f();
                int v15 = v14 - (v1 - 93);
                k k1 = d0.e(d0.f() - 1);
                k k2 = d0.l();
                d0.n(k1);
                d0.n(k2);
                while(v14 > v15 - 1) {
                    d0.r(v14, d0.e(v14 - 2));
                    --v14;
                }
                d0.r(v15 - 1, k2);
                d0.r(v15 - 2, k1);
                return;
            }
            case 0x5F: {
                k k3 = d0.m();
                k k4 = d0.m();
                if(k3.p() == 2 || k4.p() == 2) {
                    throw new e("Swap can not be used with category 2 values, pos = " + v);
                }
                d0.n(k3);
                d0.n(k4);
                return;
            }
            case 0x60: {
                this.d(k.j, d0);
                return;
            }
            case 97: {
                this.d(k.f, d0);
                return;
            }
            case 98: {
                this.d(k.k, d0);
                return;
            }
            case 99: {
                this.d(k.d, d0);
                return;
            }
            case 100: {
                this.d(k.j, d0);
                return;
            }
            case 101: {
                this.d(k.f, d0);
                return;
            }
            case 102: {
                this.d(k.k, d0);
                return;
            }
            case 103: {
                this.d(k.d, d0);
                return;
            }
            case 104: {
                this.d(k.j, d0);
                return;
            }
            case 105: {
                this.d(k.f, d0);
                return;
            }
            case 106: {
                this.d(k.k, d0);
                return;
            }
            case 107: {
                this.d(k.d, d0);
                return;
            }
            case 108: {
                this.d(k.j, d0);
                return;
            }
            case 109: {
                this.d(k.f, d0);
                return;
            }
            case 110: {
                this.d(k.k, d0);
                return;
            }
            case 0x6F: {
                this.d(k.d, d0);
                return;
            }
            case 0x70: {
                this.d(k.j, d0);
                return;
            }
            case 0x71: {
                this.d(k.f, d0);
                return;
            }
            case 0x72: {
                this.d(k.k, d0);
                return;
            }
            case 0x73: {
                this.d(k.d, d0);
                return;
            }
            case 0x74: {
                k k5 = this.v(d0);
                this.A(k.j, k5);
                return;
            }
            case 0x75: {
                k k6 = this.v(d0);
                this.A(k.f, k6);
                return;
            }
            case 0x76: {
                k k7 = this.v(d0);
                this.A(k.k, k7);
                return;
            }
            case 0x77: {
                k k8 = this.v(d0);
                this.A(k.d, k8);
                return;
            }
            case 120: {
                this.n(k.j, d0);
                return;
            }
            case 0x79: {
                this.n(k.f, d0);
                return;
            }
            case 0x7A: {
                this.n(k.j, d0);
                return;
            }
            case 0x7B: {
                this.n(k.f, d0);
                return;
            }
            case 0x7C: {
                this.n(k.j, d0);
                return;
            }
            case 0x7D: {
                this.n(k.f, d0);
                return;
            }
            case 0x7E: {
                this.d(k.j, d0);
                return;
            }
            case 0x7F: {
                this.d(k.f, d0);
                return;
            }
            case 0x80: {
                this.d(k.j, d0);
                return;
            }
            case 0x81: {
                this.d(k.f, d0);
                return;
            }
            case 130: {
                this.d(k.j, d0);
                return;
            }
            case 0x83: {
                this.d(k.f, d0);
                return;
            }
            case 0x84: {
                int v16 = q0.f(v + 1);
                k k9 = d0.d(v16);
                this.A(k.j, k9);
                this.a(v16, k.j, i0);
                return;
            }
            case 0x85: {
                k k10 = this.w(d0);
                this.A(k.j, k10);
                this.x(k.f, d0);
                return;
            }
            case 0x86: {
                k k11 = this.w(d0);
                this.A(k.j, k11);
                this.x(k.k, d0);
                return;
            }
            case 0x87: {
                k k12 = this.w(d0);
                this.A(k.j, k12);
                this.x(k.d, d0);
                return;
            }
            case 0x88: {
                k k13 = this.w(d0);
                this.A(k.f, k13);
                this.x(k.j, d0);
                return;
            }
            case 0x89: {
                k k14 = this.w(d0);
                this.A(k.f, k14);
                this.x(k.k, d0);
                return;
            }
            case 0x8A: {
                k k15 = this.w(d0);
                this.A(k.f, k15);
                this.x(k.d, d0);
                return;
            }
            case 0x8B: {
                k k16 = this.w(d0);
                this.A(k.k, k16);
                this.x(k.j, d0);
                return;
            }
            case 140: {
                k k17 = this.w(d0);
                this.A(k.k, k17);
                this.x(k.f, d0);
                return;
            }
            case 0x8D: {
                k k18 = this.w(d0);
                this.A(k.k, k18);
                this.x(k.d, d0);
                return;
            }
            case 0x8E: {
                k k19 = this.w(d0);
                this.A(k.d, k19);
                this.x(k.j, d0);
                return;
            }
            case 0x8F: {
                k k20 = this.w(d0);
                this.A(k.d, k20);
                this.x(k.f, d0);
                return;
            }
            case 0x90: {
                k k21 = this.w(d0);
                this.A(k.d, k21);
                this.x(k.k, d0);
                return;
            }
            case 0x91: 
            case 0x92: 
            case 0x93: {
                k k22 = d0.l();
                this.A(k.j, k22);
                return;
            }
            case 0x94: {
                k k23 = this.w(d0);
                this.A(k.f, k23);
                k k24 = this.w(d0);
                this.A(k.f, k24);
                d0.n(k.j);
                return;
            }
            case 0x95: 
            case 150: {
                k k25 = this.w(d0);
                this.A(k.k, k25);
                k k26 = this.w(d0);
                this.A(k.k, k26);
                d0.n(k.j);
                return;
            }
            case 0x97: 
            case 0x98: {
                k k27 = this.w(d0);
                this.A(k.d, k27);
                k k28 = this.w(d0);
                this.A(k.d, k28);
                d0.n(k.j);
                return;
            }
            case 0x99: 
            case 0x9A: 
            case 0x9B: 
            case 0x9C: 
            case 0x9D: 
            case 0x9E: {
                k k29 = this.w(d0);
                this.A(k.j, k29);
                return;
            }
            case 0x9F: 
            case 0xA0: 
            case 0xA1: 
            case 0xA2: 
            case 0xA3: 
            case 0xA4: {
                k k30 = this.w(d0);
                this.A(k.j, k30);
                k k31 = this.w(d0);
                this.A(k.j, k31);
                return;
            }
            case 0xA5: 
            case 0xA6: {
                k k32 = this.w(d0);
                this.A(k.q, k32);
                k k33 = this.w(d0);
                this.A(k.q, k33);
                return;
            }
            case 0xA8: {
                d0.n(k.n);
                return;
            }
            case 0xA9: {
                k k34 = d0.d(q0.f(v + 1));
                this.A(k.n, k34);
                return;
            }
            case 170: 
            case 0xAB: 
            case 0xAC: {
                k k35 = this.w(d0);
                this.A(k.j, k35);
                return;
            }
            case 0xAD: {
                k k36 = this.w(d0);
                this.A(k.f, k36);
                return;
            }
            case 0xAE: {
                k k37 = this.w(d0);
                this.A(k.k, k37);
                return;
            }
            case 0xAF: {
                k k38 = this.w(d0);
                this.A(k.d, k38);
                return;
            }
            case 0xB0: {
                try {
                    this.A(k.h(w.j(t0.h(), this.b)), this.w(d0));
                    return;
                }
                catch(E e0) {
                    throw new RuntimeException(e0);
                }
            }
            case 0xB2: {
                this.e(0xB2, q0.T(v + 1), d0);
                return;
            }
            case 0xB3: {
                this.m(0xB3, q0.T(v + 1), d0);
                return;
            }
            case 180: {
                this.e(180, q0.T(v + 1), d0);
                return;
            }
            case 0xB5: {
                this.m(0xB5, q0.T(v + 1), d0);
                return;
            }
            case 0xB6: 
            case 0xB7: 
            case 0xB8: {
                this.h(v1, q0.T(v + 1), d0);
                return;
            }
            case 0xB9: {
                this.g(0xB9, q0.T(v + 1), d0);
                return;
            }
            case 0xBA: {
                this.f(0xBA, q0.T(v + 1), d0);
                return;
            }
            case 0xBB: {
                int v17 = q0.T(v + 1);
                d0.n(this.t(this.a.A(v17)));
                return;
            }
            case 0xBC: {
                this.k(v, q0, d0);
                return;
            }
            case 0xBD: {
                this.l(v, q0, d0);
                return;
            }
            case 190: {
                k k39 = this.w(d0);
                if(!k39.q() && k39 != k.m) {
                    throw new e("Array length passed a non-array [pos = " + v + "]: " + k39);
                }
                d0.n(k.j);
                return;
            }
            case 0xBF: {
                k k40 = this.w(d0);
                this.A(this.e, k40);
                return;
            }
            case 0xC0: {
                k k41 = this.w(d0);
                this.A(k.q, k41);
                int v18 = q0.T(v + 1);
                d0.n(this.z(this.a.B(v18)));
                return;
            }
            case 0xC1: {
                k k42 = this.w(d0);
                this.A(k.q, k42);
                d0.n(k.j);
                return;
            }
            case 0xC2: 
            case 0xC3: {
                k k43 = this.w(d0);
                this.A(k.q, k43);
                return;
            }
            case 0xC4: {
                this.p(v, q0, d0, i0);
                return;
            }
            case 0xC5: {
                this.l(v, q0, d0);
                return;
            }
            case 0xC6: 
            case 0xC7: {
                k k44 = this.w(d0);
                this.A(k.q, k44);
                return;
            }
            case 201: {
                d0.n(k.n);
            }
        }
    }

    private k r(String s) throws e {
        try {
            return k.h(this.b.s(s));
        }
        catch(E unused_ex) {
            throw new e("Could not find class [pos = " + this.f + "]: " + s);
        }
    }

    private k[] s(String s) throws e {
        l[] arr_l;
        try {
            arr_l = w.i(s, this.b);
        }
        catch(E e0) {
            throw new e("Could not find class in descriptor [pos = " + this.f + "]: " + e0.getMessage());
        }
        if(arr_l == null) {
            throw new e("Could not obtain parameters for descriptor [pos = " + this.f + "]: " + s);
        }
        k[] arr_k = new k[arr_l.length];
        for(int v = 0; v < arr_l.length; ++v) {
            arr_k[v] = k.h(arr_l[v]);
        }
        return arr_k;
    }

    private k t(String s) throws e {
        l l0;
        try {
            l0 = s.charAt(0) == 91 ? w.y(s, this.b) : this.b.s(s);
        }
        catch(E e0) {
            throw new e("Could not find class in descriptor [pos = " + this.f + "]: " + e0.getMessage());
        }
        if(l0 == null) {
            throw new e("Could not obtain type for descriptor [pos = " + this.f + "]: " + s);
        }
        return k.h(l0);
    }

    private k u(String s) throws e {
        l l0;
        try {
            l0 = w.j(s, this.b);
        }
        catch(E e0) {
            throw new e("Could not find class in descriptor [pos = " + this.f + "]: " + e0.getMessage());
        }
        if(l0 == null) {
            throw new e("Could not obtain return type for descriptor [pos = " + this.f + "]: " + s);
        }
        return k.h(l0);
    }

    private k v(d d0) {
        k k0 = d0.l();
        return k0 == k.o ? d0.e(d0.f() - 1) : k0;
    }

    private k w(d d0) {
        k k0 = d0.m();
        return k0 == k.o ? d0.m() : k0;
    }

    private void x(k k0, d d0) {
        d0.n(k0);
        if(k0.p() == 2) {
            d0.n(k.o);
        }
    }

    private void y(int v, k k0, d d0) {
        d0.p(v, k0);
        if(k0.p() == 2) {
            d0.p(v + 1, k.o);
        }
    }

    private k z(String s) throws e {
        l l0;
        try {
            l0 = w.y(s, this.b);
        }
        catch(E e0) {
            throw new e("Could not find class in descriptor [pos = " + this.f + "]: " + e0.getMessage());
        }
        if(l0 == null) {
            throw new e("Could not obtain type for descriptor [pos = " + this.f + "]: " + s);
        }
        return k.h(l0);
    }
}

