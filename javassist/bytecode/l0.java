package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class l0 extends d {
    static class a extends javassist.bytecode.c.a {
        c g;

        a(byte[] arr_b, t t0, t t1, Map map0) {
            super(arr_b, t0, t1, map0, false);
            javassist.bytecode.annotation.t t2 = new javassist.bytecode.annotation.t(this.b, t1);
            this.c = t2;
            this.g = new c(arr_b, t0, t1, map0, t2);
        }

        @Override  // javassist.bytecode.c$a
        int d(int v, int v1) throws Exception {
            this.c.w(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = this.g.h(v + 1, this.a[v] & 0xFF);
                v = this.a(this.g.m(v3));
            }
            return v;
        }
    }

    static class b extends javassist.bytecode.c.c {
        javassist.bytecode.l0.d d;

        b(byte[] arr_b, t t0, Map map0) {
            super(arr_b, t0, map0);
            this.d = new javassist.bytecode.l0.d(arr_b);
        }

        @Override  // javassist.bytecode.c$d
        int d(int v, int v1) throws Exception {
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = this.d.h(v + 1, this.a[v] & 0xFF);
                v = this.a(this.d.m(v3));
            }
            return v;
        }
    }

    static class c extends javassist.bytecode.l0.d {
        t b;
        t c;
        Map d;
        javassist.bytecode.annotation.t e;

        c(byte[] arr_b, t t0, t t1, Map map0, javassist.bytecode.annotation.t t2) {
            super(arr_b);
            this.b = t0;
            this.c = t1;
            this.d = map0;
            this.e = t2;
        }

        @Override  // javassist.bytecode.l0$d
        void a(int v, int v1) throws Exception {
            this.e.z(v1);
        }

        @Override  // javassist.bytecode.l0$d
        void b(int v, int v1) throws Exception {
            this.e.A(v1);
        }

        @Override  // javassist.bytecode.l0$d
        void c(int v, int v1) throws Exception {
            this.e.B(v1);
        }

        @Override  // javassist.bytecode.l0$d
        int d(int v, int v1, int v2) throws Exception {
            this.e.C(v1, v2);
            return super.d(v, v1, v2);
        }

        @Override  // javassist.bytecode.l0$d
        void e(int v, int v1, int v2, int v3, int v4) throws Exception {
            this.e.D(v2, v3, v4);
        }

        @Override  // javassist.bytecode.l0$d
        void f(int v, int v1, int v2) throws Exception {
            this.e.E(v1, v2);
        }

        @Override  // javassist.bytecode.l0$d
        void g(int v, int v1) throws Exception {
            this.e.F(v1);
        }

        @Override  // javassist.bytecode.l0$d
        void i(int v, int v1) throws Exception {
            this.e.G(v1);
        }

        @Override  // javassist.bytecode.l0$d
        void j(int v, int v1, int v2, int v3) throws Exception {
            this.e.H(v1, v2, v3);
        }

        @Override  // javassist.bytecode.l0$d
        void k(int v, int v1, int v2, int v3) throws Exception {
            this.e.I(v1, v2, v3);
        }

        @Override  // javassist.bytecode.l0$d
        void l(int v, int v1, int v2) throws Exception {
            this.e.J(v1, v2);
        }

        @Override  // javassist.bytecode.l0$d
        int n(int v, int v1) throws Exception {
            this.e.K(v1);
            return super.n(v, v1);
        }

        @Override  // javassist.bytecode.l0$d
        void o(int v, int v1, int v2) throws Exception {
            this.e.L(v1, v2);
        }
    }

    static class javassist.bytecode.l0.d {
        byte[] a;

        javassist.bytecode.l0.d(byte[] arr_b) {
            this.a = arr_b;
        }

        void a(int v, int v1) throws Exception {
        }

        void b(int v, int v1) throws Exception {
        }

        void c(int v, int v1) throws Exception {
        }

        int d(int v, int v1, int v2) throws Exception {
            for(int v3 = 0; v3 < v2; ++v3) {
                this.e(v, v1, g.d(this.a, v), g.d(this.a, v + 2), g.d(this.a, v + 4));
                v += 6;
            }
            return v;
        }

        void e(int v, int v1, int v2, int v3, int v4) throws Exception {
        }

        void f(int v, int v1, int v2) throws Exception {
        }

        void g(int v, int v1) throws Exception {
        }

        final int h(int v, int v1) throws Exception {
            if(v1 != 0 && v1 != 1) {
                switch(v1) {
                    case 16: {
                        this.g(v, g.d(this.a, v));
                        return v + 2;
                    }
                    case 17: 
                    case 18: {
                        this.k(v, v1, this.a[v] & 0xFF, this.a[v + 1] & 0xFF);
                        return v + 2;
                    }
                    case 19: 
                    case 20: 
                    case 21: {
                        this.b(v, v1);
                        return v;
                    }
                    case 22: {
                        this.c(v, this.a[v] & 0xFF);
                        return v + 1;
                    }
                    case 23: {
                        this.i(v, g.d(this.a, v));
                        return v + 2;
                    }
                    case 0x40: 
                    case 65: {
                        return this.d(v + 2, v1, g.d(this.a, v));
                    }
                    case 66: {
                        this.a(v, g.d(this.a, v));
                        return v + 2;
                    }
                    case 67: 
                    case 68: 
                    case 69: 
                    case 70: {
                        this.f(v, v1, g.d(this.a, v));
                        return v + 2;
                    }
                    case 71: 
                    case 72: 
                    case 73: 
                    case 74: 
                    case 75: {
                        this.j(v, v1, g.d(this.a, v), this.a[v + 2] & 0xFF);
                        return v + 3;
                    }
                    default: {
                        throw new RuntimeException("invalid target type: " + v1);
                    }
                }
            }
            this.l(v, v1, this.a[v] & 0xFF);
            return v + 1;
        }

        void i(int v, int v1) throws Exception {
        }

        void j(int v, int v1, int v2, int v3) throws Exception {
        }

        void k(int v, int v1, int v2, int v3) throws Exception {
        }

        void l(int v, int v1, int v2) throws Exception {
        }

        final int m(int v) throws Exception {
            return this.n(v + 1, this.a[v] & 0xFF);
        }

        int n(int v, int v1) throws Exception {
            for(int v2 = 0; v2 < v1; ++v2) {
                this.o(v, this.a[v] & 0xFF, this.a[v + 1] & 0xFF);
                v += 2;
            }
            return v;
        }

        void o(int v, int v1, int v2) throws Exception {
        }
    }

    static class e extends javassist.bytecode.c.d {
        javassist.bytecode.l0.d b;

        e(byte[] arr_b) {
            super(arr_b);
            this.b = new javassist.bytecode.l0.d(arr_b);
        }

        @Override  // javassist.bytecode.c$d
        int d(int v, int v1) throws Exception {
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = this.b.h(v + 1, this.a[v] & 0xFF);
                v = this.a(this.b.m(v3));
            }
            return v;
        }
    }

    public static final String d = "RuntimeVisibleTypeAnnotations";
    public static final String e = "RuntimeInvisibleTypeAnnotations";

    l0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public l0(t t0, String s, byte[] arr_b) {
        super(t0, s, arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        a l0$a0 = new a(this.c, this.a, t0, map0);
        try {
            l0$a0.e();
            return new l0(t0, this.f(), l0$a0.p());
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    @Override  // javassist.bytecode.d
    void h(Map map0) {
        this.p(map0);
    }

    @Override  // javassist.bytecode.d
    void m(String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(s, s1);
        this.p(hashMap0);
    }

    @Override  // javassist.bytecode.d
    void p(Map map0) {
        b l0$b0 = new b(this.c, this.d(), map0);
        try {
            l0$b0.e();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public int t() {
        return g.d(this.c, 0);
    }
}

