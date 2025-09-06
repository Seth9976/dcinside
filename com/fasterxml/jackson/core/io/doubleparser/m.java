package com.fasterxml.jackson.core.io.doubleparser;

import java.math.BigInteger;

class m {
    static final class a {
        private final double[] a;
        private final int b;
        private final int c;
        private static final int d = 1;
        static final int e = 1;
        static final int f;

        a(int v) {
            this.a = new double[v << 1];
            this.b = v;
            this.c = 0;
        }

        a(a m$a0, int v, int v1) {
            this.b = v1 - v;
            this.a = m$a0.a;
            this.c = v << 1;
        }

        void b(int v, b m$b0) {
            int v1 = this.u(v);
            this.a[v1] += m$b0.a;
            int v2 = this.j(v);
            this.a[v2] += m$b0.b;
        }

        void c(int v, a m$a0, int v1, b m$b0) {
            m$b0.a = this.a[this.u(v)] + m$a0.s(v1);
            m$b0.b = this.a[this.j(v)] + m$a0.h(v1);
        }

        void d(int v, a m$a0, int v1, b m$b0) {
            m$b0.a = this.a[this.u(v)] - m$a0.h(v1);
            m$b0.b = this.a[this.j(v)] + m$a0.s(v1);
        }

        void e(a m$a0) {
            int v = m$a0.c;
            double[] arr_f = m$a0.a;
            int v1 = this.c;
            int v2 = this.b + v1 << 1;
            while(v1 < v2) {
                double f = this.a[v1];
                double f1 = this.a[v1 + 1];
                this.a[v1] = j.a(f, arr_f[v], f1 * arr_f[v + 1]);
                this.a[v1 + 1] = j.a(-f, arr_f[v + 1], arr_f[v] * f1);
                v += 2;
                v1 += 2;
            }
        }

        void f(a m$a0) {
            int v = m$a0.c;
            double[] arr_f = m$a0.a;
            int v1 = this.c;
            int v2 = this.b + v1 << 1;
            while(v1 < v2) {
                double f = this.a[v1];
                this.a[v1] = arr_f[v] * f;
                this.a[v1 + 1] = f * arr_f[v + 1];
                v += 2;
                v1 += 2;
            }
        }

        void g(int v, b m$b0) {
            m$b0.a = this.a[this.u(v)];
            m$b0.b = this.a[this.j(v)];
        }

        double h(int v) {
            return this.a[(v << 1) + this.c + 1];
        }

        void i(int v, double f) {
            this.a[(v << 1) + this.c + 1] = f;
        }

        private int j(int v) {
            return (v << 1) + this.c + 1;
        }

        void k(int v, b m$b0) {
            int v1 = this.u(v);
            int v2 = this.j(v);
            double f = this.a[v1];
            double f1 = this.a[v2];
            this.a[v1] = f * m$b0.a + m$b0.b * -f1;
            this.a[v2] = f * m$b0.b + f1 * m$b0.a;
        }

        void l(int v, b m$b0) {
            int v1 = this.u(v);
            int v2 = this.j(v);
            double f = this.a[v1];
            double f1 = m$b0.b;
            double f2 = -this.a[v2];
            this.a[v1] = -f * f1 + m$b0.a * f2;
            this.a[v2] = f * m$b0.a + m$b0.b * f2;
        }

        void m(int v, b m$b0) {
            int v1 = this.u(v);
            int v2 = this.j(v);
            double f = this.a[v1];
            double f1 = this.a[v2];
            this.a[v1] = f * m$b0.a + f1 * m$b0.b;
            this.a[v2] = -f * m$b0.b + m$b0.a * f1;
        }

        void n(int v, b m$b0, b m$b1) {
            double f = this.a[this.u(v)];
            double f1 = this.a[this.j(v)];
            m$b1.a = j.a(f, m$b0.a, f1 * m$b0.b);
            m$b1.b = j.a(-f, m$b0.b, f1 * m$b0.a);
        }

        void o(int v, b m$b0) {
            int v1 = this.u(v);
            int v2 = this.j(v);
            double f = this.a[v1];
            double f1 = this.a[v2];
            this.a[v1] = j.a(-f, m$b0.b, f1 * m$b0.a);
            this.a[v2] = j.a(-f, m$b0.a, -f1 * m$b0.b);
        }

        void p(int v, b m$b0, b m$b1) {
            double f = this.a[this.u(v)];
            double f1 = this.a[this.j(v)];
            m$b1.a = f * m$b0.a + -f1 * m$b0.b;
            m$b1.b = f * m$b0.b + f1 * m$b0.a;
        }

        void q(a m$a0) {
            int v = m$a0.c;
            double[] arr_f = m$a0.a;
            int v1 = this.c;
            int v2 = this.b + v1 << 1;
            while(v1 < v2) {
                double f = this.a[v1];
                double f1 = this.a[v1 + 1];
                double f2 = arr_f[v];
                double f3 = arr_f[v + 1];
                this.a[v1] = f * f2 + -f1 * f3;
                this.a[v1 + 1] = f * f3 + f1 * f2;
                v += 2;
                v1 += 2;
            }
        }

        double r(int v, int v1) {
            return this.a[(v << 1) + v1];
        }

        double s(int v) {
            return this.a[(v << 1) + this.c];
        }

        void t(int v, double f) {
            this.a[(v << 1) + this.c] = f;
        }

        private int u(int v) {
            return (v << 1) + this.c;
        }

        void v(int v, double f, double f1) {
            int v1 = this.u(v);
            this.a[v1] = f;
            this.a[v1 + 1] = f1;
        }

        void w() {
            int v = this.c;
            int v1 = this.b + v << 1;
            while(v < v1) {
                double f = this.a[v];
                double f1 = this.a[v + 1];
                this.a[v] = f * f + -f1 * f1;
                this.a[v + 1] = f * 2.0 * f1;
                v += 2;
            }
        }

        void x(int v, a m$a0, int v1, b m$b0) {
            m$b0.a = this.a[this.u(v)] - m$a0.s(v1);
            m$b0.b = this.a[this.j(v)] - m$a0.h(v1);
        }

        void y(int v, a m$a0, int v1, b m$b0) {
            m$b0.a = this.a[this.u(v)] + m$a0.h(v1);
            m$b0.b = this.a[this.j(v)] - m$a0.s(v1);
        }

        void z(int v, int v1) {
            int v2 = this.u(v);
            int v3 = this.j(v);
            double f = this.a[v2];
            double f1 = this.a[v3];
            this.a[v2] = i.a(f, ((long)v1));
            this.a[v3] = i.a(f1, ((long)v1));
        }
    }

    static final class b {
        double a;
        double b;

        void a(a m$a0, int v) {
            this.a += m$a0.s(v);
            this.b += m$a0.h(v);
        }

        void b(b m$b0) {
            this.a += m$b0.a;
            this.b += m$b0.b;
        }

        void c(b m$b0, b m$b1) {
            m$b1.a = this.a + m$b0.a;
            m$b1.b = this.b + m$b0.b;
        }

        void d(a m$a0, int v) {
            this.a -= m$a0.h(v);
            this.b += m$a0.s(v);
        }

        void e(b m$b0) {
            this.a -= m$b0.b;
            this.b += m$b0.a;
        }

        void f(b m$b0, b m$b1) {
            m$b1.a = this.a - m$b0.b;
            m$b1.b = this.b + m$b0.a;
        }

        void g(a m$a0, int v) {
            m$a0.t(v, this.a);
            m$a0.i(v, this.b);
        }

        void h(b m$b0) {
            double f = this.a;
            this.a = f * m$b0.a + m$b0.b * -this.b;
            this.b = f * m$b0.b + m$b0.a * this.b;
        }

        void i(b m$b0) {
            double f = this.a;
            this.a = j.a(f, m$b0.a, m$b0.b * this.b);
            this.b = j.a(-f, m$b0.b, this.b * m$b0.a);
        }

        void j(a m$a0, int v) {
            this.a = m$a0.s(v);
            this.b = m$a0.h(v);
        }

        void k(b m$b0) {
            m$b0.a = this.a * this.a + -this.b * this.b;
            m$b0.b = this.a * 2.0 * this.b;
        }

        void l(a m$a0, int v) {
            this.a -= m$a0.s(v);
            this.b -= m$a0.h(v);
        }

        void m(b m$b0) {
            this.a -= m$b0.a;
            this.b -= m$b0.b;
        }

        void n(b m$b0, a m$a0, int v) {
            m$a0.t(v, this.a - m$b0.a);
            m$a0.i(v, this.b - m$b0.b);
        }

        void o(b m$b0, b m$b1) {
            m$b1.a = this.a - m$b0.a;
            m$b1.b = this.b - m$b0.b;
        }

        void p(a m$a0, int v) {
            this.a += m$a0.h(v);
            this.b -= m$a0.s(v);
        }

        void q(b m$b0) {
            this.a += m$b0.b;
            this.b -= m$b0.a;
        }

        void r(b m$b0, b m$b1) {
            m$b1.a = this.a + m$b0.b;
            m$b1.b = this.b - m$b0.a;
        }
    }

    public static final double a = 0.0;
    public static final double b = 0.0;
    private static final int c = 33220;
    private static final int d = 0x4000000;
    private static final int e = 20;
    private static final int f = 20;
    private static final int g = 0x780;
    private static volatile a[] h;
    private static volatile a[] i;
    static final boolean j;

    static {
        m.a = 0.707107;
        m.b = 0.707107;
        m.h = new a[20];
        m.i = new a[20];
    }

    static int a(int v) {
        if(v <= 0x2600) {
            return 19;
        }
        if(v <= 0x4800) {
            return 18;
        }
        if(v <= 0x11000) {
            return 17;
        }
        if(v <= 0x40000) {
            return 16;
        }
        if(v <= 0xF0000) {
            return 15;
        }
        if(v <= 0x380000) {
            return 14;
        }
        if(v <= 0xD00000) {
            return 13;
        }
        if(v <= 0x1800000) {
            return 12;
        }
        if(v <= 0x5800000) {
            return 11;
        }
        if(v <= 0x14000000) {
            return 10;
        }
        return v > 0x48000000 ? 8 : 9;
    }

    private static a b(int v) {
        if(v == 1) {
            a m$a0 = new a(1);
            m$a0.t(0, 1.0);
            m$a0.i(0, 0.0);
            return m$a0;
        }
        a m$a1 = new a(v);
        m$a1.v(0, 1.0, 0.0);
        m$a1.v(v / 2, m.a, m.b);
        for(int v1 = 1; v1 < v / 2; ++v1) {
            double f = ((double)v1) * (1.570796 / ((double)v));
            double f1 = Math.cos(f);
            double f2 = Math.sin(f);
            m$a1.v(v1, f1, f2);
            m$a1.v(v - v1, f2, f1);
        }
        return m$a1;
    }

    private static void c(a m$a0, a[] arr_m$a) {
        int v = m$a0.b;
        int v1 = 0x1F - Integer.numberOfLeadingZeros(v);
        b m$b0 = new b();
        b m$b1 = new b();
        b m$b2 = new b();
        b m$b3 = new b();
        b m$b4 = new b();
        b m$b5 = new b();
        while(v1 >= 2) {
            a m$a1 = arr_m$a[v1 - 2];
            int v2 = 1 << v1;
            for(int v3 = 0; v3 < v; v3 += v2) {
                for(int v4 = 0; v4 < v2 / 4; ++v4) {
                    m$b4.j(m$a1, v4);
                    m$b4.k(m$b5);
                    int v5 = v3 + v4;
                    int v6 = v2 / 4 + v5;
                    int v7 = v5 + v2 / 2;
                    int v8 = v5 + v2 * 3 / 4;
                    m$a0.c(v5, m$a0, v6, m$b0);
                    m$b0.a(m$a0, v7);
                    m$b0.a(m$a0, v8);
                    m$a0.y(v5, m$a0, v6, m$b1);
                    m$b1.l(m$a0, v7);
                    m$b1.d(m$a0, v8);
                    m$b1.i(m$b4);
                    m$a0.x(v5, m$a0, v6, m$b2);
                    m$b2.a(m$a0, v7);
                    m$b2.l(m$a0, v8);
                    m$b2.i(m$b5);
                    m$a0.d(v5, m$a0, v6, m$b3);
                    m$b3.l(m$a0, v7);
                    m$b3.p(m$a0, v8);
                    m$b3.h(m$b4);
                    m$b0.g(m$a0, v5);
                    m$b1.g(m$a0, v6);
                    m$b2.g(m$a0, v7);
                    m$b3.g(m$a0, v8);
                }
            }
            v1 -= 2;
        }
        if(v1 > 0) {
            for(int v9 = 0; v9 < v; v9 += 2) {
                m$a0.g(v9, m$b0);
                m$a0.g(v9 + 1, m$b1);
                m$a0.b(v9, m$b1);
                m$b0.n(m$b1, m$a0, v9 + 1);
            }
        }
    }

    private static void d(a m$a0, a m$a1, a m$a2, int v, double f) {
        for(int v1 = 0; v1 < m$a0.b; ++v1) {
            double f1 = m$a0.s(v1);
            double f2 = m$a1.s(v1);
            double f3 = m$a2.s(v1);
            double f4 = m$a0.h(v1);
            double f5 = m$a1.h(v1);
            double f6 = m$a2.h(v1);
            double f7 = (m$a2.h(v1) - m$a1.h(v1)) * (((double)v) * -0.866025);
            double f8 = (m$a1.s(v1) - m$a2.s(v1)) * (((double)v) * -0.866025);
            double f9 = (m$a1.s(v1) + m$a2.s(v1)) * 0.5;
            double f10 = (m$a1.h(v1) + m$a2.h(v1)) * 0.5;
            double f11 = m$a0.s(v1);
            double f12 = m$a0.h(v1);
            double f13 = m$a0.s(v1);
            double f14 = m$a0.h(v1);
            m$a0.t(v1, (f1 + f2 + f3) * f);
            m$a0.i(v1, (f4 + f5 + f6) * f);
            m$a1.t(v1, (f11 - f9 + f7) * f);
            m$a1.i(v1, (f12 + f8 - f10) * f);
            m$a2.t(v1, (f13 - f9 - f7) * f);
            m$a2.i(v1, (f14 - f8 - f10) * f);
        }
    }

    private static void e(a m$a0, a[] arr_m$a, a m$a1) {
        int v = m$a0.b;
        a m$a2 = new a(m$a0, 0, v / 3);
        int v2 = v / 3 * 2;
        a m$a3 = new a(m$a0, v / 3, v2);
        a m$a4 = new a(m$a0, v2, m$a0.b);
        m.d(m$a2, m$a3, m$a4, 1, 1.0);
        b m$b0 = new b();
        for(int v1 = 0; v1 < m$a0.b / 4; ++v1) {
            m$b0.j(m$a1, v1);
            m$a3.m(v1, m$b0);
            m$a4.m(v1, m$b0);
            m$a4.m(v1, m$b0);
        }
        for(int v3 = m$a0.b / 4; v3 < v / 3; ++v3) {
            m$b0.j(m$a1, v3 - m$a0.b / 4);
            m$a3.o(v3, m$b0);
            m$a4.o(v3, m$b0);
            m$a4.o(v3, m$b0);
        }
        m.c(m$a2, arr_m$a);
        m.c(m$a3, arr_m$a);
        m.c(m$a4, arr_m$a);
    }

    static BigInteger f(a m$a0, int v, int v1) {
        int v2 = (int)Math.min(m$a0.b, 0x80000000L / ((long)v1) + 1L);
        int v3 = (int)((((long)v2) * ((long)v1) + 0x1FL) * 8L / 0x20L);
        byte[] arr_b = new byte[v3];
        int v4 = v3 * 8 - v1;
        int v5 = Math.min(Math.max(0, v4 >> 3), v3 - 4);
        int v7 = 0;
        for(int v8 = 0; v8 <= 1; ++v8) {
            int v9 = 0;
            for(long v6 = 0L; v9 < v2; v6 = v10 >> v1) {
                long v10 = Math.round(m$a0.r(v9, v8)) + v6;
                int v11 = Math.min(Math.max(0, v4 >> 3), v3 - 4);
                v7 = (int)((v10 & ((long)((1 << v1) - 1))) << 0x20 - v1 - v4 + (v11 << 3) | ((long)(v7 >>> (v5 - v11 << 3))));
                j.K(arr_b, v11, v7);
                v4 -= v1;
                ++v9;
                v5 = v11;
            }
        }
        return new BigInteger(v, arr_b);
    }

    private static a[] g(int v) {
        a[] arr_m$a = new a[v + 1];
        while(v >= 0) {
            if(v < 20) {
                if(m.h[v] == null) {
                    a[] arr_m$a1 = m.h;
                    arr_m$a1[v] = m.b(1 << v);
                }
                arr_m$a[v] = m.h[v];
            }
            else {
                arr_m$a[v] = m.b(1 << v);
            }
            v -= 2;
        }
        return arr_m$a;
    }

    private static a h(int v) {
        if(v < 20) {
            if(m.i[v] == null) {
                a[] arr_m$a = m.i;
                arr_m$a[v] = m.b(3 << v);
            }
            return m.i[v];
        }
        return m.b(3 << v);
    }

    private static void i(a m$a0, a[] arr_m$a) {
        int v3;
        int v = m$a0.b;
        int v1 = 0x1F - Integer.numberOfLeadingZeros(v);
        b m$b0 = new b();
        b m$b1 = new b();
        b m$b2 = new b();
        b m$b3 = new b();
        b m$b4 = new b();
        b m$b5 = new b();
        b m$b6 = new b();
        b m$b7 = new b();
        if(v1 % 2 == 0) {
            v3 = 1;
        }
        else {
            for(int v2 = 0; v2 < v; v2 += 2) {
                m$a0.g(v2 + 1, m$b2);
                m$a0.g(v2, m$b0);
                m$a0.b(v2, m$b2);
                m$b0.n(m$b2, m$a0, v2 + 1);
            }
            v3 = 2;
        }
        b m$b8 = new b();
        b m$b9 = new b();
        while(v3 <= v1) {
            a m$a1 = arr_m$a[v3 - 1];
            int v4 = 1 << v3 + 1;
            for(int v5 = 0; v5 < v; v5 += v4) {
                for(int v6 = 0; v6 < v4 / 4; ++v6) {
                    m$b8.j(m$a1, v6);
                    m$b8.k(m$b9);
                    int v7 = v5 + v6;
                    int v8 = v4 / 4 + v7;
                    int v9 = v7 + v4 / 2;
                    int v10 = v7 + v4 * 3 / 4;
                    m$a0.g(v7, m$b0);
                    m$a0.p(v8, m$b8, m$b1);
                    m$a0.p(v9, m$b9, m$b2);
                    m$a0.n(v10, m$b8, m$b3);
                    m$b0.c(m$b1, m$b4);
                    m$b4.b(m$b2);
                    m$b4.b(m$b3);
                    m$b0.f(m$b1, m$b5);
                    m$b5.m(m$b2);
                    m$b5.q(m$b3);
                    m$b0.o(m$b1, m$b6);
                    m$b6.b(m$b2);
                    m$b6.m(m$b3);
                    m$b0.r(m$b1, m$b7);
                    m$b7.m(m$b2);
                    m$b7.e(m$b3);
                    m$b4.g(m$a0, v7);
                    m$b5.g(m$a0, v8);
                    m$b6.g(m$a0, v9);
                    m$b7.g(m$a0, v10);
                }
            }
            v3 += 2;
        }
        for(int v11 = 0; v11 < v; ++v11) {
            m$a0.z(v11, -v1);
        }
    }

    private static void j(a m$a0, a[] arr_m$a, a m$a1) {
        int v = m$a0.b;
        a m$a2 = new a(m$a0, 0, v / 3);
        int v2 = v / 3 * 2;
        a m$a3 = new a(m$a0, v / 3, v2);
        a m$a4 = new a(m$a0, v2, m$a0.b);
        m.i(m$a2, arr_m$a);
        m.i(m$a3, arr_m$a);
        m.i(m$a4, arr_m$a);
        b m$b0 = new b();
        for(int v1 = 0; v1 < m$a0.b / 4; ++v1) {
            m$b0.j(m$a1, v1);
            m$a3.k(v1, m$b0);
            m$a4.k(v1, m$b0);
            m$a4.k(v1, m$b0);
        }
        for(int v3 = m$a0.b / 4; v3 < v / 3; ++v3) {
            m$b0.j(m$a1, v3 - m$a0.b / 4);
            m$a3.l(v3, m$b0);
            m$a4.l(v3, m$b0);
            m$a4.l(v3, m$b0);
        }
        m.d(m$a2, m$a3, m$a4, -1, 0.333333);
    }

    static BigInteger k(BigInteger bigInteger0, BigInteger bigInteger1) {
        if(bigInteger1.signum() != 0 && bigInteger0.signum() != 0) {
            if(bigInteger1 == bigInteger0) {
                return m.m(bigInteger1);
            }
            int v = bigInteger0.bitLength();
            int v1 = bigInteger1.bitLength();
            if(((long)v) + ((long)v1) > 0x80000000L) {
                throw new ArithmeticException("BigInteger would overflow supported range");
            }
            return v <= 0x780 || v1 <= 0x780 || v <= 33220 && v1 <= 33220 ? bigInteger0.multiply(bigInteger1) : m.l(bigInteger0, bigInteger1);
        }
        return BigInteger.ZERO;
    }

    static BigInteger l(BigInteger bigInteger0, BigInteger bigInteger1) {
        int v = bigInteger0.signum() * bigInteger1.signum();
        if(bigInteger0.signum() < 0) {
            bigInteger0 = bigInteger0.negate();
        }
        byte[] arr_b = bigInteger0.toByteArray();
        if(bigInteger1.signum() < 0) {
            bigInteger1 = bigInteger1.negate();
        }
        byte[] arr_b1 = bigInteger1.toByteArray();
        int v1 = Math.max(arr_b.length, arr_b1.length);
        int v2 = m.a(v1 * 8);
        int v3 = (v1 * 8 + v2 - 1) / v2;
        int v4 = Integer.numberOfLeadingZeros(v3);
        int v5 = 1 << 0x20 - v4;
        int v6 = v5 * 3 / 4;
        if(v3 + 1 < v6 && 0x20 - v4 > 3) {
            a[] arr_m$a = m.g(30 - v4);
            a m$a0 = m.h(30 - v4);
            a m$a1 = m.h(28 - v4);
            a m$a2 = m.o(arr_b, v6, v2);
            m$a2.f(m$a0);
            m.e(m$a2, arr_m$a, m$a1);
            a m$a3 = m.o(arr_b1, v6, v2);
            m$a3.f(m$a0);
            m.e(m$a3, arr_m$a, m$a1);
            m$a2.q(m$a3);
            m.j(m$a2, arr_m$a, m$a1);
            m$a2.e(m$a0);
            return m.f(m$a2, v, v2);
        }
        a[] arr_m$a1 = m.g(0x20 - v4);
        a m$a4 = m.o(arr_b, v5, v2);
        m$a4.f(arr_m$a1[0x20 - v4]);
        m.c(m$a4, arr_m$a1);
        a m$a5 = m.o(arr_b1, v5, v2);
        m$a5.f(arr_m$a1[0x20 - v4]);
        m.c(m$a5, arr_m$a1);
        m$a4.q(m$a5);
        m.i(m$a4, arr_m$a1);
        m$a4.e(arr_m$a1[0x20 - v4]);
        return m.f(m$a4, v, v2);
    }

    static BigInteger m(BigInteger bigInteger0) {
        if(bigInteger0.signum() == 0) {
            return BigInteger.ZERO;
        }
        return bigInteger0.bitLength() >= 33220 ? m.n(bigInteger0) : bigInteger0.multiply(bigInteger0);
    }

    static BigInteger n(BigInteger bigInteger0) {
        byte[] arr_b = bigInteger0.toByteArray();
        int v = m.a(arr_b.length * 8);
        int v1 = (arr_b.length * 8 + v - 1) / v;
        int v2 = Integer.numberOfLeadingZeros(v1);
        int v3 = 1 << 0x20 - v2;
        int v4 = v3 * 3 / 4;
        if(v1 + 1 < v4) {
            a m$a0 = m.o(arr_b, v4, v);
            a[] arr_m$a = m.g(30 - v2);
            a m$a1 = m.h(30 - v2);
            a m$a2 = m.h(28 - v2);
            m$a0.f(m$a1);
            m.e(m$a0, arr_m$a, m$a2);
            m$a0.w();
            m.j(m$a0, arr_m$a, m$a2);
            m$a0.e(m$a1);
            return m.f(m$a0, 1, v);
        }
        a m$a3 = m.o(arr_b, v3, v);
        a[] arr_m$a1 = m.g(0x20 - v2);
        m$a3.f(arr_m$a1[0x20 - v2]);
        m.c(m$a3, arr_m$a1);
        m$a3.w();
        m.i(m$a3, arr_m$a1);
        m$a3.e(arr_m$a1[0x20 - v2]);
        return m.f(m$a3, 1, v);
    }

    static a o(byte[] arr_b, int v, int v1) {
        a m$a0 = new a(v);
        if(arr_b.length < 4) {
            byte[] arr_b1 = new byte[4];
            System.arraycopy(arr_b, 0, arr_b1, 4 - arr_b.length, arr_b.length);
            arr_b = arr_b1;
        }
        int v2 = arr_b.length * 8 - v1;
        int v3 = 0;
        int v4 = 0;
        while(v2 > -v1) {
            int v5 = Math.min(Math.max(0, v2 >> 3), arr_b.length - 4);
            int v6 = (j.n(arr_b, v5) >>> 0x20 - v1 - v2 + (v5 << 3) & (1 << v1) - 1) + v3;
            v3 = (1 << v1) / 2 - v6 >>> 0x1F;
            m$a0.t(v4, ((double)(v6 - (-v3 & 1 << v1))));
            ++v4;
            v2 -= v1;
        }
        if(v3 > 0) {
            m$a0.t(v4, ((double)v3));
        }
        return m$a0;
    }
}

