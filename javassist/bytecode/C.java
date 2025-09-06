package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javassist.bytecode.annotation.e;
import javassist.bytecode.annotation.f;
import javassist.bytecode.annotation.g;
import javassist.bytecode.annotation.h;
import javassist.bytecode.annotation.i;
import javassist.bytecode.annotation.j;
import javassist.bytecode.annotation.k;
import javassist.bytecode.annotation.l;
import javassist.bytecode.annotation.m;
import javassist.bytecode.annotation.n;
import javassist.bytecode.annotation.o;
import javassist.bytecode.annotation.r;
import javassist.bytecode.annotation.s;

public class c extends d {
    static class a extends javassist.bytecode.c.d {
        ByteArrayOutputStream b;
        javassist.bytecode.annotation.d c;
        t d;
        t e;
        Map f;

        a(byte[] arr_b, t t0, t t1, Map map0) {
            this(arr_b, t0, t1, map0, true);
        }

        a(byte[] arr_b, t t0, t t1, Map map0, boolean z) {
            super(arr_b);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            this.b = byteArrayOutputStream0;
            if(z) {
                this.c = new javassist.bytecode.annotation.d(byteArrayOutputStream0, t1);
            }
            this.d = t0;
            this.e = t1;
            this.f = map0;
        }

        @Override  // javassist.bytecode.c$d
        int b(int v, int v1, int v2) throws Exception {
            this.c.a(this.r(v1), v2);
            return super.b(v, v1, v2);
        }

        @Override  // javassist.bytecode.c$d
        int d(int v, int v1) throws Exception {
            this.c.w(v1);
            return super.d(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        int f(int v) throws Exception {
            this.c.c();
            return super.f(v);
        }

        @Override  // javassist.bytecode.c$d
        int g(int v, int v1) throws Exception {
            this.c.d(v1);
            return super.g(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void h(int v, int v1) throws Exception {
            this.c.e(this.r(v1));
            super.h(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void i(int v, int v1) throws Exception {
            this.c.m(v, this.q(v1));
            super.i(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void j(int v, int v1, int v2) throws Exception {
            this.c.r(this.r(v1), this.q(v2));
            super.j(v, v1, v2);
        }

        @Override  // javassist.bytecode.c$d
        int m(int v, int v1) throws Exception {
            this.c.u(this.q(v1));
            return super.m(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void o(int v, int v1) throws Exception {
            this.c.x(v);
            super.o(v, v1);
        }

        byte[] p() throws IOException {
            this.c.g();
            return this.b.toByteArray();
        }

        int q(int v) {
            return this.d.y(v, this.e, this.f);
        }

        int r(int v) {
            String s = w.u(this.d.p0(v), this.f);
            return this.e.x(s);
        }
    }

    static class b extends javassist.bytecode.c.d {
        t b;
        javassist.bytecode.annotation.a[][] c;
        javassist.bytecode.annotation.a[] d;
        javassist.bytecode.annotation.a e;
        o f;

        b(byte[] arr_b, t t0) {
            super(arr_b);
            this.b = t0;
        }

        @Override  // javassist.bytecode.c$d
        int b(int v, int v1, int v2) throws Exception {
            this.e = new javassist.bytecode.annotation.a(v1, this.b);
            return super.b(v, v1, v2);
        }

        @Override  // javassist.bytecode.c$d
        int d(int v, int v1) throws Exception {
            javassist.bytecode.annotation.a[] arr_a = new javassist.bytecode.annotation.a[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                v = this.a(v);
                arr_a[v2] = this.e;
            }
            this.d = arr_a;
            return v;
        }

        @Override  // javassist.bytecode.c$d
        int f(int v) throws Exception {
            javassist.bytecode.annotation.a a0 = this.e;
            int v1 = super.f(v);
            this.f = new javassist.bytecode.annotation.c(this.e, this.b);
            this.e = a0;
            return v1;
        }

        @Override  // javassist.bytecode.c$d
        int g(int v, int v1) throws Exception {
            e e0 = new e(this.b);
            o[] arr_o = new o[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                v = this.k(v);
                arr_o[v2] = this.f;
            }
            e0.i(arr_o);
            this.f = e0;
            return v;
        }

        @Override  // javassist.bytecode.c$d
        void h(int v, int v1) throws Exception {
            this.f = new i(v1, this.b);
            super.h(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void i(int v, int v1) throws Exception {
            l l0;
            t t0 = this.b;
            switch(v) {
                case 66: {
                    l0 = new g(v1, t0);
                    break;
                }
                case 67: {
                    l0 = new h(v1, t0);
                    break;
                }
                case 68: {
                    l0 = new j(v1, t0);
                    break;
                }
                case 70: {
                    l0 = new l(v1, t0);
                    break;
                }
                case 73: {
                    l0 = new m(v1, t0);
                    break;
                }
                case 74: {
                    l0 = new n(v1, t0);
                    break;
                }
                case 83: {
                    l0 = new r(v1, t0);
                    break;
                }
                case 90: {
                    l0 = new f(v1, t0);
                    break;
                }
                case 0x73: {
                    l0 = new s(v1, t0);
                    break;
                }
                default: {
                    throw new RuntimeException("unknown tag:" + v);
                }
            }
            this.f = l0;
            super.i(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void j(int v, int v1, int v2) throws Exception {
            this.f = new k(v1, v2, this.b);
            super.j(v, v1, v2);
        }

        @Override  // javassist.bytecode.c$d
        int m(int v, int v1) throws Exception {
            int v2 = super.m(v, v1);
            this.e.a(v1, this.f);
            return v2;
        }

        @Override  // javassist.bytecode.c$d
        void o(int v, int v1) throws Exception {
            javassist.bytecode.annotation.a[][] arr2_a = new javassist.bytecode.annotation.a[v][];
            for(int v2 = 0; v2 < v; ++v2) {
                v1 = this.c(v1);
                arr2_a[v2] = this.d;
            }
            this.c = arr2_a;
        }

        javassist.bytecode.annotation.a[] p() throws Exception {
            this.e();
            return this.d;
        }

        o q() throws Exception {
            this.k(0);
            return this.f;
        }

        javassist.bytecode.annotation.a[][] r() throws Exception {
            this.n();
            return this.c;
        }
    }

    static class javassist.bytecode.c.c extends javassist.bytecode.c.d {
        t b;
        Map c;

        javassist.bytecode.c.c(byte[] arr_b, t t0, Map map0) {
            super(arr_b);
            this.b = t0;
            this.c = map0;
        }

        @Override  // javassist.bytecode.c$d
        int b(int v, int v1, int v2) throws Exception {
            this.p(v - 4, v1);
            return super.b(v, v1, v2);
        }

        @Override  // javassist.bytecode.c$d
        void h(int v, int v1) throws Exception {
            this.p(v + 1, v1);
            super.h(v, v1);
        }

        @Override  // javassist.bytecode.c$d
        void j(int v, int v1, int v2) throws Exception {
            this.p(v + 1, v1);
            super.j(v, v1, v2);
        }

        private void p(int v, int v1) {
            String s = this.b.p0(v1);
            String s1 = w.u(s, this.c);
            if(!s.equals(s1)) {
                javassist.bytecode.g.e(this.b.x(s1), this.a, v);
            }
        }
    }

    static class javassist.bytecode.c.d {
        byte[] a;

        javassist.bytecode.c.d(byte[] arr_b) {
            this.a = arr_b;
        }

        final int a(int v) throws Exception {
            return this.b(v + 4, javassist.bytecode.g.d(this.a, v), javassist.bytecode.g.d(this.a, v + 2));
        }

        int b(int v, int v1, int v2) throws Exception {
            for(int v3 = 0; v3 < v2; ++v3) {
                v = this.l(v);
            }
            return v;
        }

        final int c(int v) throws Exception {
            return this.d(v + 2, javassist.bytecode.g.d(this.a, v));
        }

        int d(int v, int v1) throws Exception {
            for(int v2 = 0; v2 < v1; ++v2) {
                v = this.a(v);
            }
            return v;
        }

        final void e() throws Exception {
            this.c(0);
        }

        int f(int v) throws Exception {
            return this.a(v);
        }

        int g(int v, int v1) throws Exception {
            for(int v2 = 0; v2 < v1; ++v2) {
                v = this.k(v);
            }
            return v;
        }

        void h(int v, int v1) throws Exception {
        }

        void i(int v, int v1) throws Exception {
        }

        void j(int v, int v1, int v2) throws Exception {
        }

        final int k(int v) throws Exception {
            byte[] arr_b = this.a;
            int v1 = arr_b[v] & 0xFF;
            if(v1 == 101) {
                this.j(v, javassist.bytecode.g.d(arr_b, v + 1), javassist.bytecode.g.d(this.a, v + 3));
                return v + 5;
            }
            switch(v1) {
                case 0x40: {
                    return this.f(v + 1);
                }
                case 91: {
                    return this.g(v + 3, javassist.bytecode.g.d(arr_b, v + 1));
                }
                case 99: {
                    this.h(v, javassist.bytecode.g.d(arr_b, v + 1));
                    return v + 3;
                }
                default: {
                    this.i(v1, javassist.bytecode.g.d(arr_b, v + 1));
                    return v + 3;
                }
            }
        }

        final int l(int v) throws Exception {
            return this.m(v + 2, javassist.bytecode.g.d(this.a, v));
        }

        int m(int v, int v1) throws Exception {
            return this.k(v);
        }

        final void n() throws Exception {
            this.o(this.a[0] & 0xFF, 1);
        }

        void o(int v, int v1) throws Exception {
            for(int v2 = 0; v2 < v; ++v2) {
                v1 = this.c(v1);
            }
        }
    }

    public static final String d = "RuntimeVisibleAnnotations";
    public static final String e = "RuntimeInvisibleAnnotations";

    c(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public c(t t0, String s) {
        this(t0, s, new byte[]{0, 0});
    }

    public c(t t0, String s, byte[] arr_b) {
        super(t0, s, arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        a c$a0 = new a(this.c, this.a, t0, map0);
        try {
            c$a0.e();
            return new c(t0, this.f(), c$a0.p());
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
        javassist.bytecode.c.c c$c0 = new javassist.bytecode.c.c(this.c, this.d(), map0);
        try {
            c$c0.e();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public void t(javassist.bytecode.annotation.a a0) {
        String s = a0.g();
        javassist.bytecode.annotation.a[] arr_a = this.v();
        for(int v = 0; v < arr_a.length; ++v) {
            if(arr_a[v].g().equals(s)) {
                arr_a[v] = a0;
                this.z(arr_a);
                return;
            }
        }
        javassist.bytecode.annotation.a[] arr_a1 = new javassist.bytecode.annotation.a[arr_a.length + 1];
        System.arraycopy(arr_a, 0, arr_a1, 0, arr_a.length);
        arr_a1[arr_a.length] = a0;
        this.z(arr_a1);
    }

    @Override
    public String toString() {
        javassist.bytecode.annotation.a[] arr_a = this.v();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_a.length; ++v) {
            stringBuilder0.append(arr_a[v].toString());
            if(v + 1 != arr_a.length) {
                stringBuilder0.append(", ");
            }
        }
        return stringBuilder0.toString();
    }

    public javassist.bytecode.annotation.a u(String s) {
        javassist.bytecode.annotation.a[] arr_a = this.v();
        for(int v = 0; v < arr_a.length; ++v) {
            if(arr_a[v].g().equals(s)) {
                return arr_a[v];
            }
        }
        return null;
    }

    public javassist.bytecode.annotation.a[] v() {
        try {
            return new b(this.c, this.a).p();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public int w() {
        return javassist.bytecode.g.d(this.c, 0);
    }

    public boolean x(String s) {
        javassist.bytecode.annotation.a[] arr_a = this.v();
        for(int v = 0; v < arr_a.length; ++v) {
            if(arr_a[v].g().equals(s)) {
                javassist.bytecode.annotation.a[] arr_a1 = new javassist.bytecode.annotation.a[arr_a.length - 1];
                System.arraycopy(arr_a, 0, arr_a1, 0, v);
                if(v < arr_a.length - 1) {
                    System.arraycopy(arr_a, v + 1, arr_a1, v, arr_a.length - v - 1);
                }
                this.z(arr_a1);
                return true;
            }
        }
        return false;
    }

    public void y(javassist.bytecode.annotation.a a0) {
        this.z(new javassist.bytecode.annotation.a[]{a0});
    }

    public void z(javassist.bytecode.annotation.a[] arr_a) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        javassist.bytecode.annotation.d d0 = new javassist.bytecode.annotation.d(byteArrayOutputStream0, this.a);
        try {
            d0.w(arr_a.length);
            for(int v = 0; v < arr_a.length; ++v) {
                arr_a[v].i(d0);
            }
            d0.g();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        this.q(byteArrayOutputStream0.toByteArray());
    }
}

