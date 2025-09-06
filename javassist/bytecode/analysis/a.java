package javassist.bytecode.analysis;

import javassist.E;
import javassist.bytecode.A;
import javassist.bytecode.T;
import javassist.bytecode.c0;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;
import javassist.l;

public class a implements c0 {
    static class javassist.bytecode.analysis.a.a {
    }

    static class b {
        private int a;
        private int b;
        private int c;
        private k d;

        private b(int v, int v1, int v2, k k0) {
            this.c = v;
            this.a = v1;
            this.b = v2;
            this.d = k0;
        }

        b(int v, int v1, int v2, k k0, javassist.bytecode.analysis.a.a a$a0) {
            this(v, v1, v2, k0);
        }
    }

    private final j a;
    private l b;
    private b[] c;
    private d[] d;
    private i[] e;

    public a() {
        this.a = new j();
    }

    public d[] a(l l0, T t0) throws e {
        this.b = l0;
        p p0 = t0.f();
        if(p0 == null) {
            return null;
        }
        q q0 = p0.G();
        f f0 = new f();
        this.c = this.d(t0);
        this.e = this.a.b(t0);
        c c0 = new c(l0.w(), t0.g());
        d[] arr_d = new d[p0.A()];
        this.d = arr_d;
        arr_d[q0.E()] = this.e(t0, p0.D(), p0.E());
        f0.a(q0.J());
        while(!f0.b()) {
            this.c(t0, q0, f0, c0);
        }
        return this.d;
    }

    public d[] b(javassist.q q0) throws e {
        return this.a(q0.f(), q0.D());
    }

    private void c(T t0, q q0, f f0, c c0) throws e {
        int v = f0.c();
        q0.H(v);
        q0.J();
        d d0 = this.d[v].b();
        i i0 = this.e[v];
        try {
            c0.q(t0, v, q0, d0, i0);
        }
        catch(RuntimeException runtimeException0) {
            throw new e(runtimeException0.getMessage() + "[pos = " + v + "]", runtimeException0);
        }
        int v1 = q0.f(v);
        if(v1 == 170) {
            this.m(f0, v, q0, d0);
        }
        else {
            switch(v1) {
                case 0xA9: {
                    this.l(f0, q0, v, d0, i0);
                    break;
                }
                case 0xAB: {
                    this.k(f0, v, q0, d0);
                    break;
                }
                default: {
                    if(javassist.bytecode.analysis.l.d(v1)) {
                        int v2 = javassist.bytecode.analysis.l.a(v, q0);
                        if(javassist.bytecode.analysis.l.c(v1)) {
                            this.j(f0, this.d[v], this.e[v2], v, this.g(q0, v));
                        }
                        else if(!javassist.bytecode.analysis.l.b(v1)) {
                            this.h(f0, d0, this.g(q0, v));
                        }
                        this.h(f0, d0, v2);
                    }
                    else if(v1 != 0xBF && !javassist.bytecode.analysis.l.e(v1)) {
                        this.h(f0, d0, this.g(q0, v));
                    }
                }
            }
        }
        this.i(f0, t0, v, d0);
    }

    private b[] d(T t0) {
        k k0;
        t t1 = t0.g();
        g g0 = this.b.w();
        A a0 = t0.f().C();
        b[] arr_a$b = new b[a0.p()];
        for(int v = 0; v < a0.p(); ++v) {
            int v1 = a0.d(v);
            try {
                k0 = v1 == 0 ? k.t : k.h(g0.s(t1.A(v1)));
            }
            catch(E e0) {
                throw new IllegalStateException(e0.getMessage());
            }
            arr_a$b[v] = new b(a0.q(v), a0.f(v), a0.g(v), k0, null);
        }
        return arr_a$b;
    }

    private d e(T t0, int v, int v1) {
        l[] arr_l;
        int v3;
        d d0 = new d(v, v1);
        if((t0.c() & 8) == 0) {
            d0.p(0, k.h(this.b));
            v3 = 1;
        }
        else {
            v3 = 0;
        }
        try {
            arr_l = w.i(t0.h(), this.b.w());
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
        for(int v2 = 0; v2 < arr_l.length; ++v2) {
            k k0 = this.n(k.h(arr_l[v2]));
            int v4 = v3 + 1;
            d0.p(v3, k0);
            if(k0.p() == 2) {
                v3 += 2;
                d0.p(v4, k.o);
            }
            else {
                v3 = v4;
            }
        }
        return d0;
    }

    private int f(q q0, int v, int v1) throws e {
        q0.H(v);
        q0.J();
        q0.H(v1);
        q0.J();
        return q0.E();
    }

    private int g(q q0, int v) throws e {
        if(!q0.l()) {
            throw new e("Execution falls off end! [pos = " + v + "]");
        }
        return q0.E();
    }

    private void h(f f0, d d0, int v) {
        boolean z;
        d[] arr_d = this.d;
        d d1 = arr_d[v];
        if(d1 == null) {
            arr_d[v] = d0.b();
            z = true;
        }
        else {
            z = d1.j(d0);
        }
        if(z) {
            f0.a(v);
        }
    }

    private void i(f f0, T t0, int v, d d0) {
        for(int v1 = 0; true; ++v1) {
            b[] arr_a$b = this.c;
            if(v1 >= arr_a$b.length) {
                break;
            }
            b a$b0 = arr_a$b[v1];
            if(v >= a$b0.c && v < a$b0.a) {
                d d1 = d0.b();
                d1.a();
                d1.n(a$b0.d);
                this.h(f0, d1, a$b0.b);
            }
        }
    }

    private void j(f f0, d d0, i i0, int v, int v1) throws e {
        int v3;
        if(i0 == null) {
            throw new e("No subroutine at jsr target! [pos = " + v + "]");
        }
        d[] arr_d = this.d;
        d d1 = arr_d[v1];
        int v2 = 1;
        if(d1 == null) {
            d1 = d0.b();
            arr_d[v1] = d1;
            v3 = 1;
        }
        else {
            v3 = 0;
            for(int v4 = 0; v4 < d0.i(); ++v4) {
                if(!i0.e(v4)) {
                    k k0 = d1.d(v4);
                    k k1 = d0.d(v4);
                    if(k0 == null) {
                        d1.p(v4, k1);
                        v3 = 1;
                    }
                    else {
                        k k2 = k0.v(k1);
                        d1.p(v4, k2);
                        if(!k2.equals(k0) || k2.y()) {
                            v3 = 1;
                        }
                    }
                }
            }
        }
        if(d1.g()) {
            v2 = v3;
        }
        else {
            d1.o(true);
        }
        if(v2 != 0 && d1.h()) {
            f0.a(v1);
        }
    }

    private void k(f f0, int v, q q0, d d0) throws e {
        this.h(f0, d0, q0.M((v & -4) + 4) + v);
        int v1 = q0.M((v & -4) + 8);
        for(int v2 = (v & -4) + 16; v2 < v1 * 8 + ((v & -4) + 12); v2 += 8) {
            this.h(f0, d0, q0.M(v2) + v);
        }
    }

    private void l(f f0, q q0, int v, d d0, i i0) throws e {
        boolean z1;
        if(i0 == null) {
            throw new e("Ret on no subroutine! [pos = " + v + "]");
        }
        for(Object object0: i0.d()) {
            int v1 = this.f(q0, ((int)(((Integer)object0))), v);
            d[] arr_d = this.d;
            d d1 = arr_d[v1];
            boolean z = true;
            if(d1 == null) {
                d1 = d0.c();
                arr_d[v1] = d1;
                z1 = true;
            }
            else {
                z1 = d1.k(d0);
            }
            for(Object object1: i0.b()) {
                int v2 = (int)(((Integer)object1));
                k k0 = d1.d(v2);
                k k1 = d0.d(v2);
                if(k0 != k1) {
                    d1.p(v2, k1);
                    z1 = true;
                }
            }
            if(d1.h()) {
                z = z1;
            }
            else {
                d1.q(true);
            }
            if(z && d1.g()) {
                f0.a(v1);
            }
        }
    }

    private void m(f f0, int v, q q0, d d0) throws e {
        this.h(f0, d0, q0.M((v & -4) + 4) + v);
        int v1 = (v & -4) + 16;
        int v2 = (q0.M((v & -4) + 12) - q0.M((v & -4) + 8) + 1) * 4 + v1;
        while(v1 < v2) {
            this.h(f0, d0, q0.M(v1) + v);
            v1 += 4;
        }
    }

    private k n(k k0) {
        return k0 == k.i || k0 == k.h || k0 == k.g || k0 == k.e ? k.j : k0;
    }
}

