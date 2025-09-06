package org.jsoup.parser;

abstract enum u {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class A extends u {
        A(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    a0.X();
                    t0.x(this);
                    t0.k.K();
                    t0.B(u.I);
                    return;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    return;
                }
                case 0x2F: {
                    t0.B(u.P);
                    return;
                }
                case 60: {
                    a0.X();
                    t0.x(this);
                    break;
                }
                case 34: 
                case 39: 
                case 61: {
                    t0.x(this);
                    t0.k.K();
                    t0.k.u(((char)v), a0.P() - 1, a0.P());
                    t0.B(u.I);
                    return;
                }
                case 62: {
                    break;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.K();
                    a0.X();
                    t0.B(u.I);
                    return;
                }
            }
            t0.t();
            t0.B(u.a);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class B extends u {
        B(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            String s = a0.s(u.i9);
            t0.k.v(s, a0.P(), a0.P());
            int v = a0.P();
            int v1 = a0.g();
            switch(v1) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.J);
                    return;
                }
                case 0x2F: {
                    t0.B(u.P);
                    return;
                }
                case 34: 
                case 39: 
                case 60: {
                    t0.x(this);
                    t0.k.u(((char)v1), v, a0.P());
                    return;
                }
                case 61: {
                    t0.B(u.K);
                    return;
                }
                case 62: {
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.u(((char)v1), v, a0.P());
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class C extends u {
        C(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.k.u('\uFFFD', a0.P() - 1, a0.P());
                    t0.B(u.I);
                    break;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 0x2F: {
                    t0.B(u.P);
                    return;
                }
                case 34: 
                case 39: 
                case 60: {
                    t0.x(this);
                    t0.k.K();
                    t0.k.u(((char)v), a0.P() - 1, a0.P());
                    t0.B(u.I);
                    return;
                }
                case 61: {
                    t0.B(u.K);
                    return;
                }
                case 62: {
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.K();
                    a0.X();
                    t0.B(u.I);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class D extends u {
        D(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.k.w('\uFFFD', a0.P() - 1, a0.P());
                    t0.B(u.N);
                    break;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    t0.B(u.L);
                    return;
                }
                case 38: {
                    a0.X();
                    t0.B(u.N);
                    return;
                }
                case 39: {
                    t0.B(u.M);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                case 60: 
                case 61: 
                case 0x60: {
                    t0.x(this);
                    t0.k.w(((char)v), a0.P() - 1, a0.P());
                    t0.B(u.N);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                default: {
                    a0.X();
                    t0.B(u.N);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class E extends u {
        E(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.P();
            String s = a0.h(false);
            if(s.length() > 0) {
                t0.k.x(s, v, a0.P());
            }
            else {
                t0.k.O();
            }
            int v1 = a0.P();
            int v2 = a0.g();
            switch(v2) {
                case 0: {
                    t0.x(this);
                    t0.k.w('\uFFFD', v1, a0.P());
                    return;
                }
                case 34: {
                    t0.B(u.O);
                    return;
                }
                case 38: {
                    int[] arr_v = t0.e(Character.valueOf('\"'), true);
                    if(arr_v != null) {
                        t0.k.y(arr_v, v1, a0.P());
                        return;
                    }
                    t0.k.w('&', v1, a0.P());
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.w(((char)v2), v1, a0.P());
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class F extends u {
        F(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.P();
            String s = a0.h(true);
            if(s.length() > 0) {
                t0.k.x(s, v, a0.P());
            }
            else {
                t0.k.O();
            }
            int v1 = a0.P();
            int v2 = a0.g();
            switch(v2) {
                case 0: {
                    t0.x(this);
                    t0.k.w('\uFFFD', v1, a0.P());
                    return;
                }
                case 38: {
                    int[] arr_v = t0.e(Character.valueOf('\''), true);
                    if(arr_v != null) {
                        t0.k.y(arr_v, v1, a0.P());
                        return;
                    }
                    t0.k.w('&', v1, a0.P());
                    return;
                }
                case 39: {
                    t0.B(u.O);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.w(((char)v2), v1, a0.P());
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class G extends u {
        G(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.v()) {
                case 0: {
                    t0.x(this);
                    a0.a();
                    t0.l('\uFFFD');
                    return;
                }
                case 38: {
                    t0.a(u.d);
                    return;
                }
                case 60: {
                    t0.a(u.k);
                    return;
                }
                case 0xFFFF: {
                    t0.o(new f());
                    return;
                }
                default: {
                    t0.m(a0.i());
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class H extends u {
        H(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.P();
            String s = a0.s(u.j9);
            if(s.length() > 0) {
                t0.k.x(s, v, a0.P());
            }
            int v1 = a0.P();
            int v2 = a0.g();
            switch(v2) {
                case 0: {
                    t0.x(this);
                    t0.k.w('\uFFFD', v1, a0.P());
                    return;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.H);
                    return;
                }
                case 38: {
                    int[] arr_v = t0.e(Character.valueOf('>'), true);
                    if(arr_v != null) {
                        t0.k.y(arr_v, v1, a0.P());
                        return;
                    }
                    t0.k.w('&', v1, a0.P());
                    return;
                }
                case 62: {
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                case 34: 
                case 39: 
                case 60: 
                case 61: 
                case 0x60: {
                    t0.x(this);
                    t0.k.w(((char)v2), v1, a0.P());
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.w(((char)v2), v1, a0.P());
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class I extends u {
        I(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.H);
                    return;
                }
                case 0x2F: {
                    t0.B(u.P);
                    return;
                }
                case 62: {
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    a0.X();
                    t0.x(this);
                    t0.B(u.H);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class J extends u {
        J(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 62: {
                    t0.k.g = true;
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    a0.X();
                    t0.x(this);
                    t0.B(u.H);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class K extends u {
        K(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            String s = a0.p('>');
            t0.n.v(s);
            switch(a0.v()) {
                case 62: 
                case 0xFFFF: {
                    a0.g();
                    t0.r();
                    t0.B(u.a);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class M extends u {
        M(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 0: {
                    t0.x(this);
                    t0.n.u('\uFFFD');
                    t0.B(u.M8);
                    return;
                }
                case 45: {
                    t0.B(u.Z);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                default: {
                    a0.X();
                    t0.B(u.M8);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class N extends u {
        N(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.n.u('\uFFFD');
                    t0.B(u.M8);
                    return;
                }
                case 45: {
                    t0.B(u.O8);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.n.u(((char)v));
                    t0.B(u.M8);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class O extends u {
        O(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.v()) {
                case 0: {
                    t0.x(this);
                    a0.a();
                    t0.n.u('\uFFFD');
                    return;
                }
                case 45: {
                    t0.a(u.N8);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                default: {
                    String s = a0.r(new char[]{'-', '\u0000'});
                    t0.n.v(s);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class P extends u {
        P(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.n.u('-').u('\uFFFD');
                    t0.B(u.M8);
                    return;
                }
                case 45: {
                    t0.B(u.O8);
                    return;
                }
                default: {
                    if(v != 0xFFFF) {
                        t0.n.u('-').u(((char)v));
                        t0.B(u.M8);
                        return;
                    }
                    t0.u(this);
                    t0.r();
                    t0.B(u.a);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class Q extends u {
        Q(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.n.v("--").u('\uFFFD');
                    t0.B(u.M8);
                    return;
                }
                case 33: {
                    t0.B(u.P8);
                    return;
                }
                case 45: {
                    t0.n.u('-');
                    return;
                }
                case 62: {
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.n.v("--").u(((char)v));
                    t0.B(u.M8);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class R extends u {
        R(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.k(t0, u.c);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class S extends u {
        S(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.n.v("--!").u('\uFFFD');
                    t0.B(u.M8);
                    return;
                }
                case 45: {
                    t0.n.v("--!");
                    t0.B(u.N8);
                    return;
                }
                case 62: {
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.r();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.n.v("--!").u(((char)v));
                    t0.B(u.M8);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class T extends u {
        T(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.R8);
                    return;
                }
                case 62: {
                    break;
                }
                case 0xFFFF: {
                    t0.u(this);
                    break;
                }
                default: {
                    t0.x(this);
                    t0.B(u.R8);
                    return;
                }
            }
            t0.x(this);
            t0.h();
            t0.m.i = true;
            t0.s();
            t0.B(u.a);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class U extends u {
        U(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.J()) {
                t0.h();
                t0.B(u.S8);
                return;
            }
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.h();
                    t0.m.e.append('\uFFFD');
                    t0.B(u.S8);
                    break;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.h();
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.h();
                    t0.m.e.append(((char)v));
                    t0.B(u.S8);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class V extends u {
        V(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.M()) {
                String s = a0.l();
                t0.m.e.append(s);
                return;
            }
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.m.e.append('\uFFFD');
                    return;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.T8);
                    return;
                }
                case 62: {
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m.e.append(((char)v));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class W extends u {
        W(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.w()) {
                t0.u(this);
                t0.m.i = true;
                t0.s();
                t0.B(u.a);
                return;
            }
            if(a0.H(new char[]{'\t', '\n', '\r', '\f', ' '})) {
                a0.a();
                return;
            }
            if(a0.F('>')) {
                t0.s();
                t0.a(u.a);
                return;
            }
            if(a0.E("PUBLIC")) {
                t0.m.f = "PUBLIC";
                t0.B(u.U8);
                return;
            }
            if(a0.E("SYSTEM")) {
                t0.m.f = "SYSTEM";
                t0.B(u.a9);
                return;
            }
            t0.x(this);
            t0.m.i = true;
            t0.a(u.f9);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class X extends u {
        X(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.V8);
                    return;
                }
                case 34: {
                    t0.x(this);
                    t0.B(u.W8);
                    return;
                }
                case 39: {
                    t0.x(this);
                    t0.B(u.X8);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.B(u.f9);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class Y extends u {
        Y(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    t0.B(u.W8);
                    break;
                }
                case 39: {
                    t0.B(u.X8);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.B(u.f9);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class Z extends u {
        Z(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.m.g.append('\uFFFD');
                    return;
                }
                case 34: {
                    t0.B(u.Y8);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m.g.append(((char)v));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a0 extends u {
        a0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.m.g.append('\uFFFD');
                    return;
                }
                case 39: {
                    t0.B(u.Y8);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m.g.append(((char)v));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.u.a extends u {
        org.jsoup.parser.u.a(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            String s = a0.o();
            t0.k.A(s);
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.k.A("\uFFFD");
                    return;
                }
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.H);
                    return;
                }
                case 0x2F: {
                    t0.B(u.P);
                    return;
                }
                case 60: {
                    a0.X();
                    t0.x(this);
                    break;
                }
                case 62: {
                    break;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.k.z(((char)v));
                    return;
                }
            }
            t0.t();
            t0.B(u.a);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b0 extends u {
        b0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.Z8);
                    return;
                }
                case 34: {
                    t0.x(this);
                    t0.B(u.c9);
                    return;
                }
                case 39: {
                    t0.x(this);
                    t0.B(u.d9);
                    return;
                }
                case 62: {
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.B(u.f9);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b extends u {
        b(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.F('/')) {
                t0.j();
                t0.a(u.l);
                return;
            }
            if(a0.T() && a0.J() && t0.b() != null && !a0.u(t0.c())) {
                t0.k = t0.i(false).J(t0.b());
                t0.t();
                t0.B(u.h);
                return;
            }
            t0.m("<");
            t0.B(u.c);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class c0 extends u {
        c0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.m(t0, a0, this, u.n);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class c extends u {
        c(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.J()) {
                t0.i(false);
                t0.k.z(a0.v());
                int v = a0.v();
                t0.h.append(((char)v));
                t0.a(u.m);
                return;
            }
            t0.m("</");
            t0.B(u.c);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class d0 extends u {
        d0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    t0.x(this);
                    t0.B(u.c9);
                    break;
                }
                case 39: {
                    t0.x(this);
                    t0.B(u.d9);
                    return;
                }
                case 62: {
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.B(u.f9);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class d extends u {
        d(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.J()) {
                String s = a0.l();
                t0.k.A(s);
                t0.h.append(s);
                return;
            }
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    if(t0.z()) {
                        t0.B(u.H);
                        return;
                    }
                    this.n(t0, a0);
                    return;
                }
                case 0x2F: {
                    if(t0.z()) {
                        t0.B(u.P);
                        return;
                    }
                    this.n(t0, a0);
                    return;
                }
                case 62: {
                    if(t0.z()) {
                        t0.t();
                        t0.B(u.a);
                        return;
                    }
                    this.n(t0, a0);
                    return;
                }
                default: {
                    this.n(t0, a0);
                }
            }
        }

        private void n(t t0, a a0) {
            t0.m("</");
            t0.n(t0.h);
            a0.X();
            t0.B(u.c);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class e0 extends u {
        e0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.b9);
                    return;
                }
                case 34: {
                    t0.x(this);
                    t0.B(u.c9);
                    return;
                }
                case 39: {
                    t0.x(this);
                    t0.B(u.d9);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class e extends u {
        e(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.F('/')) {
                t0.j();
                t0.a(u.o);
                return;
            }
            t0.l('<');
            t0.B(u.e);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class f0 extends u {
        f0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 34: {
                    t0.B(u.c9);
                    break;
                }
                case 39: {
                    t0.B(u.d9);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.B(u.f9);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.u.f extends u {
        org.jsoup.parser.u.f(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.l(t0, a0, u.p, u.e);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class g0 extends u {
        g0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.m.h.append('\uFFFD');
                    return;
                }
                case 34: {
                    t0.B(u.e9);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m.h.append(((char)v));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class g extends u {
        g(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.i(t0, a0, u.e);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class h0 extends u {
        h0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.m.h.append('\uFFFD');
                    return;
                }
                case 39: {
                    t0.B(u.e9);
                    return;
                }
                case 62: {
                    t0.x(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m.h.append(((char)v));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class h extends u {
        h(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 33: {
                    t0.m("<!");
                    t0.B(u.t);
                    return;
                }
                case 0x2F: {
                    t0.j();
                    t0.B(u.r);
                    return;
                }
                case 0xFFFF: {
                    t0.m("<");
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m("<");
                    a0.X();
                    t0.B(u.f);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class i0 extends u {
        i0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 62: {
                    t0.s();
                    t0.B(u.a);
                    break;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.m.i = true;
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.x(this);
                    t0.B(u.f9);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class i extends u {
        i(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.l(t0, a0, u.s, u.f);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class j0 extends u {
        j0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.g()) {
                case 62: {
                    t0.s();
                    t0.B(u.a);
                    return;
                }
                case 0xFFFF: {
                    t0.s();
                    t0.B(u.a);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class j extends u {
        j(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.i(t0, a0, u.f);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class k0 extends u {
        k0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            String s = a0.q("]]>");
            t0.h.append(s);
            if(a0.D("]]>") || a0.w()) {
                t0.o(new org.jsoup.parser.r.b(t0.h.toString()));
                t0.B(u.a);
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class k extends u {
        k(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.v()) {
                case 0: {
                    t0.x(this);
                    t0.l(a0.g());
                    return;
                }
                case 38: {
                    t0.a(u.b);
                    return;
                }
                case 60: {
                    t0.a(u.h);
                    return;
                }
                case 0xFFFF: {
                    t0.o(new f());
                    return;
                }
                default: {
                    t0.m(a0.i());
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class l0 extends u {
        l0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.m(t0, a0, this, u.q);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class l extends u {
        l(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.F('-')) {
                t0.l('-');
                t0.a(u.u);
                return;
            }
            t0.B(u.f);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class m0 extends u {
        m0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.v()) {
                case 0: {
                    t0.x(this);
                    a0.a();
                    t0.l('\uFFFD');
                    return;
                }
                case 0xFFFF: {
                    t0.o(new f());
                    return;
                }
                default: {
                    t0.m(a0.p('\u0000'));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class m extends u {
        m(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.F('-')) {
                t0.l('-');
                t0.a(u.x);
                return;
            }
            t0.B(u.f);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class n0 extends u {
        n0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.v()) {
                case 33: {
                    t0.a(u.X);
                    return;
                }
                case 0x2F: {
                    t0.a(u.i);
                    return;
                }
                case 0x3F: {
                    t0.f();
                    t0.B(u.Q);
                    return;
                }
                default: {
                    if(a0.J()) {
                        t0.i(true);
                        t0.B(u.j);
                        return;
                    }
                    t0.x(this);
                    t0.l('<');
                    t0.B(u.a);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class n extends u {
        n(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.w()) {
                t0.u(this);
                t0.B(u.a);
                return;
            }
            switch(a0.v()) {
                case 0: {
                    t0.x(this);
                    a0.a();
                    t0.l('\uFFFD');
                    return;
                }
                case 45: {
                    t0.l('-');
                    t0.a(u.w);
                    return;
                }
                case 60: {
                    t0.a(u.y);
                    return;
                }
                default: {
                    t0.m(a0.r(new char[]{'-', '<', '\u0000'}));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class o0 extends u {
        o0(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.w()) {
                t0.u(this);
                t0.m("</");
                t0.B(u.a);
                return;
            }
            if(a0.J()) {
                t0.i(false);
                t0.B(u.j);
                return;
            }
            if(a0.F('>')) {
                t0.x(this);
                t0.a(u.a);
                return;
            }
            t0.x(this);
            t0.f();
            t0.n.u('/');
            t0.B(u.Q);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class o extends u {
        o(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.w()) {
                t0.u(this);
                t0.B(u.a);
                return;
            }
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.l('\uFFFD');
                    t0.B(u.v);
                    return;
                }
                case 45: {
                    t0.l('-');
                    t0.B(u.x);
                    return;
                }
                case 60: {
                    t0.B(u.y);
                    return;
                }
                default: {
                    t0.l(((char)v));
                    t0.B(u.v);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class p extends u {
        p(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.w()) {
                t0.u(this);
                t0.B(u.a);
                return;
            }
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.l('\uFFFD');
                    t0.B(u.v);
                    return;
                }
                case 45: {
                    t0.l('-');
                    return;
                }
                case 60: {
                    t0.B(u.y);
                    return;
                }
                case 62: {
                    t0.l('>');
                    t0.B(u.f);
                    return;
                }
                default: {
                    t0.l(((char)v));
                    t0.B(u.v);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class q extends u {
        q(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.J()) {
                t0.j();
                int v = a0.v();
                t0.h.append(((char)v));
                t0.m("<");
                t0.l(a0.v());
                t0.a(u.B);
                return;
            }
            if(a0.F('/')) {
                t0.j();
                t0.a(u.z);
                return;
            }
            t0.l('<');
            t0.B(u.v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class r extends u {
        r(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.J()) {
                t0.i(false);
                t0.k.z(a0.v());
                int v = a0.v();
                t0.h.append(((char)v));
                t0.a(u.A);
                return;
            }
            t0.m("</");
            t0.B(u.v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class s extends u {
        s(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.i(t0, a0, u.v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.u.t extends u {
        org.jsoup.parser.u.t(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.h(t0, a0, u.C, u.v);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class org.jsoup.parser.u.u extends u {
        org.jsoup.parser.u.u(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            switch(a0.v()) {
                case 0: {
                    t0.x(this);
                    a0.a();
                    t0.l('\uFFFD');
                    return;
                }
                case 45: {
                    t0.l('-');
                    t0.a(u.D);
                    return;
                }
                case 60: {
                    t0.l('<');
                    t0.a(u.F);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.m(a0.r(new char[]{'-', '<', '\u0000'}));
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class v extends u {
        v(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.k(t0, u.a);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class w extends u {
        w(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.l('\uFFFD');
                    t0.B(u.C);
                    return;
                }
                case 45: {
                    t0.l('-');
                    t0.B(u.E);
                    return;
                }
                case 60: {
                    t0.l('<');
                    t0.B(u.F);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.l(((char)v));
                    t0.B(u.C);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class x extends u {
        x(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            int v = a0.g();
            switch(v) {
                case 0: {
                    t0.x(this);
                    t0.l('\uFFFD');
                    t0.B(u.C);
                    return;
                }
                case 45: {
                    t0.l('-');
                    return;
                }
                case 60: {
                    t0.l('<');
                    t0.B(u.F);
                    return;
                }
                case 62: {
                    t0.l('>');
                    t0.B(u.f);
                    return;
                }
                case 0xFFFF: {
                    t0.u(this);
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.l(((char)v));
                    t0.B(u.C);
                }
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class y extends u {
        y(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.F('/')) {
                t0.l('/');
                t0.j();
                t0.a(u.G);
                return;
            }
            t0.B(u.C);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class z extends u {
        z(String s, int v) {
            super(null);
        }

        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            u.h(t0, a0, u.v, u.C);
        }
    }

    Data /* 警告！未生成枚举子类：org.jsoup.parser.u$k */,
    CharacterReferenceInData /* 警告！未生成枚举子类：org.jsoup.parser.u$v */,
    Rcdata /* 警告！未生成枚举子类：org.jsoup.parser.u$G */,
    CharacterReferenceInRcdata /* 警告！未生成枚举子类：org.jsoup.parser.u$R */,
    Rawtext /* 警告！未生成枚举子类：org.jsoup.parser.u$c0 */,
    ScriptData /* 警告！未生成枚举子类：org.jsoup.parser.u$l0 */,
    PLAINTEXT /* 警告！未生成枚举子类：org.jsoup.parser.u$m0 */,
    TagOpen /* 警告！未生成枚举子类：org.jsoup.parser.u$n0 */,
    EndTagOpen /* 警告！未生成枚举子类：org.jsoup.parser.u$o0 */,
    TagName /* 警告！未生成枚举子类：org.jsoup.parser.u$a */,
    RcdataLessthanSign /* 警告！未生成枚举子类：org.jsoup.parser.u$b */,
    RCDATAEndTagOpen /* 警告！未生成枚举子类：org.jsoup.parser.u$c */,
    RCDATAEndTagName /* 警告！未生成枚举子类：org.jsoup.parser.u$d */,
    RawtextLessthanSign /* 警告！未生成枚举子类：org.jsoup.parser.u$e */,
    RawtextEndTagOpen /* 警告！未生成枚举子类：org.jsoup.parser.u$f */,
    RawtextEndTagName /* 警告！未生成枚举子类：org.jsoup.parser.u$g */,
    ScriptDataLessthanSign /* 警告！未生成枚举子类：org.jsoup.parser.u$h */,
    ScriptDataEndTagOpen /* 警告！未生成枚举子类：org.jsoup.parser.u$i */,
    ScriptDataEndTagName /* 警告！未生成枚举子类：org.jsoup.parser.u$j */,
    ScriptDataEscapeStart /* 警告！未生成枚举子类：org.jsoup.parser.u$l */,
    ScriptDataEscapeStartDash /* 警告！未生成枚举子类：org.jsoup.parser.u$m */,
    ScriptDataEscaped /* 警告！未生成枚举子类：org.jsoup.parser.u$n */,
    ScriptDataEscapedDash /* 警告！未生成枚举子类：org.jsoup.parser.u$o */,
    ScriptDataEscapedDashDash /* 警告！未生成枚举子类：org.jsoup.parser.u$p */,
    ScriptDataEscapedLessthanSign /* 警告！未生成枚举子类：org.jsoup.parser.u$q */,
    ScriptDataEscapedEndTagOpen /* 警告！未生成枚举子类：org.jsoup.parser.u$r */,
    ScriptDataEscapedEndTagName /* 警告！未生成枚举子类：org.jsoup.parser.u$s */,
    ScriptDataDoubleEscapeStart /* 警告！未生成枚举子类：org.jsoup.parser.u$t */,
    ScriptDataDoubleEscaped /* 警告！未生成枚举子类：org.jsoup.parser.u$u */,
    ScriptDataDoubleEscapedDash /* 警告！未生成枚举子类：org.jsoup.parser.u$w */,
    ScriptDataDoubleEscapedDashDash /* 警告！未生成枚举子类：org.jsoup.parser.u$x */,
    ScriptDataDoubleEscapedLessthanSign /* 警告！未生成枚举子类：org.jsoup.parser.u$y */,
    ScriptDataDoubleEscapeEnd /* 警告！未生成枚举子类：org.jsoup.parser.u$z */,
    BeforeAttributeName /* 警告！未生成枚举子类：org.jsoup.parser.u$A */,
    AttributeName /* 警告！未生成枚举子类：org.jsoup.parser.u$B */,
    AfterAttributeName /* 警告！未生成枚举子类：org.jsoup.parser.u$C */,
    BeforeAttributeValue /* 警告！未生成枚举子类：org.jsoup.parser.u$D */,
    AttributeValue_doubleQuoted /* 警告！未生成枚举子类：org.jsoup.parser.u$E */,
    AttributeValue_singleQuoted /* 警告！未生成枚举子类：org.jsoup.parser.u$F */,
    AttributeValue_unquoted /* 警告！未生成枚举子类：org.jsoup.parser.u$H */,
    AfterAttributeValue_quoted /* 警告！未生成枚举子类：org.jsoup.parser.u$I */,
    SelfClosingStartTag /* 警告！未生成枚举子类：org.jsoup.parser.u$J */,
    BogusComment /* 警告！未生成枚举子类：org.jsoup.parser.u$K */,
    MarkupDeclarationOpen {
        @Override  // org.jsoup.parser.u
        void j(t t0, a a0) {
            if(a0.D("--")) {
                t0.g();
                t0.B(u.Y);
                return;
            }
            if(a0.E("DOCTYPE")) {
                t0.B(u.Q8);
                return;
            }
            if(a0.D("[CDATA[")) {
                t0.j();
                t0.B(u.g9);
                return;
            }
            t0.x(this);
            t0.f();
            t0.B(u.Q);
        }
    },
    CommentStart /* 警告！未生成枚举子类：org.jsoup.parser.u$M */,
    CommentStartDash /* 警告！未生成枚举子类：org.jsoup.parser.u$N */,
    Comment /* 警告！未生成枚举子类：org.jsoup.parser.u$O */,
    CommentEndDash /* 警告！未生成枚举子类：org.jsoup.parser.u$P */,
    CommentEnd /* 警告！未生成枚举子类：org.jsoup.parser.u$Q */,
    CommentEndBang /* 警告！未生成枚举子类：org.jsoup.parser.u$S */,
    Doctype /* 警告！未生成枚举子类：org.jsoup.parser.u$T */,
    BeforeDoctypeName /* 警告！未生成枚举子类：org.jsoup.parser.u$U */,
    DoctypeName /* 警告！未生成枚举子类：org.jsoup.parser.u$V */,
    AfterDoctypeName /* 警告！未生成枚举子类：org.jsoup.parser.u$W */,
    AfterDoctypePublicKeyword /* 警告！未生成枚举子类：org.jsoup.parser.u$X */,
    BeforeDoctypePublicIdentifier /* 警告！未生成枚举子类：org.jsoup.parser.u$Y */,
    DoctypePublicIdentifier_doubleQuoted /* 警告！未生成枚举子类：org.jsoup.parser.u$Z */,
    DoctypePublicIdentifier_singleQuoted /* 警告！未生成枚举子类：org.jsoup.parser.u$a0 */,
    AfterDoctypePublicIdentifier /* 警告！未生成枚举子类：org.jsoup.parser.u$b0 */,
    BetweenDoctypePublicAndSystemIdentifiers /* 警告！未生成枚举子类：org.jsoup.parser.u$d0 */,
    AfterDoctypeSystemKeyword /* 警告！未生成枚举子类：org.jsoup.parser.u$e0 */,
    BeforeDoctypeSystemIdentifier /* 警告！未生成枚举子类：org.jsoup.parser.u$f0 */,
    DoctypeSystemIdentifier_doubleQuoted /* 警告！未生成枚举子类：org.jsoup.parser.u$g0 */,
    DoctypeSystemIdentifier_singleQuoted /* 警告！未生成枚举子类：org.jsoup.parser.u$h0 */,
    AfterDoctypeSystemIdentifier /* 警告！未生成枚举子类：org.jsoup.parser.u$i0 */,
    BogusDoctype /* 警告！未生成枚举子类：org.jsoup.parser.u$j0 */,
    CdataSection /* 警告！未生成枚举子类：org.jsoup.parser.u$k0 */;

    static final char h9 = '\u0000';
    static final char[] i9 = null;
    static final char[] j9 = null;
    private static final char k9 = '\uFFFD';
    private static final String l9 = null;
    private static final char m9 = '\uFFFF';

    static {
        u.i9 = new char[]{'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        u.j9 = new char[]{'\u0000', '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        u.l9 = "\uFFFD";
    }

    private u() {
    }

    private static u[] a() [...] // Inlined contents

    // 去混淆评级： 低(20)
    static String d() [...] // 潜在的解密器

    private static void h(t t0, a a0, u u0, u u1) {
        if(a0.M()) {
            String s = a0.l();
            t0.h.append(s);
            t0.m(s);
            return;
        }
        int v = a0.g();
        switch(v) {
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 0x2F: 
            case 62: {
                if(t0.h.toString().equals("script")) {
                    t0.B(u0);
                }
                else {
                    t0.B(u1);
                }
                t0.l(((char)v));
                return;
            }
            default: {
                a0.X();
                t0.B(u1);
            }
        }
    }

    private static void i(t t0, a a0, u u0) {
        if(a0.M()) {
            String s = a0.l();
            t0.k.A(s);
            t0.h.append(s);
            return;
        }
        if(t0.z() && !a0.w()) {
            int v = a0.g();
            switch(v) {
                case 9: 
                case 10: 
                case 12: 
                case 13: 
                case 0x20: {
                    t0.B(u.H);
                    return;
                }
                case 0x2F: {
                    t0.B(u.P);
                    return;
                }
                case 62: {
                    t0.t();
                    t0.B(u.a);
                    return;
                }
                default: {
                    t0.h.append(((char)v));
                    break;
                }
            }
        }
        t0.m("</");
        t0.n(t0.h);
        t0.B(u0);
    }

    abstract void j(t arg1, a arg2);

    private static void k(t t0, u u0) {
        int[] arr_v = t0.e(null, false);
        if(arr_v == null) {
            t0.l('&');
        }
        else {
            t0.q(arr_v);
        }
        t0.B(u0);
    }

    private static void l(t t0, a a0, u u0, u u1) {
        if(a0.J()) {
            t0.i(false);
            t0.B(u0);
            return;
        }
        t0.m("</");
        t0.B(u1);
    }

    private static void m(t t0, a a0, u u0, u u1) {
        switch(a0.v()) {
            case 0: {
                t0.x(u0);
                a0.a();
                t0.l('\uFFFD');
                return;
            }
            case 60: {
                t0.a(u1);
                return;
            }
            case 0xFFFF: {
                t0.o(new f());
                return;
            }
            default: {
                t0.m(a0.n());
            }
        }
    }
}

