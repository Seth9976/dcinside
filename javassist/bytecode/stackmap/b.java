package javassist.bytecode.stackmap;

import java.util.ArrayList;
import javassist.E;
import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.h0.i;
import javassist.bytecode.h0;
import javassist.bytecode.i0.k;
import javassist.bytecode.i0;
import javassist.bytecode.p;
import javassist.bytecode.t;
import javassist.g;

public class b extends c {
    protected b(b b0) {
        super(b0);
    }

    public b(g g0, T t0, p p0) {
        super(g0, t0.g(), p0.E(), p0.D(), f.e(t0.h()));
    }

    protected static void K(int v, d[] arr_d, d[] arr_d1) {
        for(int v1 = 0; v1 < v; ++v1) {
            arr_d1[v1] = arr_d[v1];
        }
    }

    private static int L(d[] arr_d, int v, int v1) {
        int v2 = 0;
        while(v < v1) {
            ++v2;
            if(arr_d[v].l()) {
                v += 2;
            }
            else {
                ++v;
            }
        }
        return v2;
    }

    private int[] M(int v, int v1, int[] arr_v, d[] arr_d) {
        int v2 = b.L(arr_d, v1, v1 + v);
        t t0 = this.h;
        int[] arr_v1 = new int[v2];
        int v4 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            d d0 = arr_d[v1 + v3];
            arr_v1[v4] = d0.k();
            arr_v[v4] = d0.j(t0);
            if(d0.l()) {
                ++v3;
            }
            ++v4;
        }
        return arr_v1;
    }

    private void N(byte[] arr_b, f[] arr_f) throws e {
        for(int v = 0; v < arr_f.length; ++v) {
            f f0 = arr_f[v];
            if(!f0.c()) {
                this.O(arr_b, f0);
                a a$a0 = f0.f;
                if(a$a0 != null) {
                    f f1 = (f)a$a0.b;
                    if(!f1.c()) {
                        this.Y(f1, a$a0.c);
                        this.O(arr_b, f1);
                        f1.c = 1;
                    }
                }
            }
        }
    }

    private void O(byte[] arr_b, f f0) throws e {
        int v = f0.a;
        int v1 = f0.b;
        if(v1 - 3 < 0) {
            if(v1 - 3 == -1) {
                arr_b[v] = 0;
            }
            arr_b[v + v1 - 1] = -65;
            f0.c = 1;
            this.Y(f0, 0);
            return;
        }
        f0.c = 0;
        for(int v2 = 0; v2 < v1 - 3; ++v2) {
            arr_b[v + v2] = 0;
        }
        int v3 = v + (v1 - 3);
        arr_b[v3] = -89;
        javassist.bytecode.g.e(-(v1 - 3), arr_b, v3 + 1);
    }

    private void P(byte[] arr_b, f[] arr_f) throws E, e {
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        for(int v = 0; v < arr_f.length; ++v) {
            f f0 = arr_f[v];
            if(f0.c()) {
                int v2 = f0.i.length;
                for(int v3 = 0; v3 < v2; ++v3) {
                    v1 = f0.i[v3].e(arrayList0, v1, this.g);
                }
                int v4 = f0.g;
                for(int v5 = 0; v5 < v4; ++v5) {
                    v1 = f0.j[v5].e(arrayList0, v1, this.g);
                }
            }
        }
    }

    private boolean Q(f f0, f f1) {
        int v = f0.c;
        if(v > 1) {
            return true;
        }
        return v >= 1 ? f1.e : false;
    }

    public static i0 R(g g0, T t0) throws e {
        f[] arr_f;
        p p0 = t0.f();
        if(p0 == null) {
            return null;
        }
        try {
            arr_f = f.g(t0, p0, true);
        }
        catch(javassist.bytecode.stackmap.a.b unused_ex) {
            return null;
        }
        if(arr_f == null) {
            return null;
        }
        b b0 = new b(g0, t0, p0);
        try {
            b0.T(arr_f, p0.z());
            return b0.e0(arr_f);
        }
        catch(e e0) {
            throw new e(t0, e0);
        }
    }

    private void S(byte[] arr_b, f f0) throws e {
        b.K(f0.g, f0.j, this.k);
        this.j = f0.g;
        b.K(f0.i.length, f0.i, this.l);
        this.h0(arr_b, f0.f);
        int v = f0.a;
        int v1 = f0.b + v;
        while(v < v1) {
            v += this.m(v, arr_b);
            this.h0(arr_b, f0.f);
        }
        if(f0.d != null) {
            for(int v2 = 0; true; ++v2) {
                javassist.bytecode.stackmap.a[] arr_a = f0.d;
                if(v2 >= arr_a.length) {
                    break;
                }
                f f1 = (f)arr_a[v2];
                if(f1.c()) {
                    this.W(f1, true);
                }
                else {
                    this.X(f1);
                    new b(this).S(arr_b, f1);
                }
            }
        }
    }

    void T(f[] arr_f, byte[] arr_b) throws e {
        this.S(arr_b, arr_f[0]);
        this.N(arr_b, arr_f);
        try {
            this.P(arr_b, arr_f);
        }
        catch(E e0) {
            throw new e("failed to resolve types", e0);
        }
    }

    public static h0 U(g g0, T t0) throws e {
        f[] arr_f;
        p p0 = t0.f();
        if(p0 == null) {
            return null;
        }
        try {
            arr_f = f.g(t0, p0, true);
        }
        catch(javassist.bytecode.stackmap.a.b unused_ex) {
            return null;
        }
        if(arr_f == null) {
            return null;
        }
        b b0 = new b(g0, t0, p0);
        try {
            b0.T(arr_f, p0.z());
            return b0.f0(t0.g(), arr_f);
        }
        catch(e e0) {
            throw new e(t0, e0);
        }
    }

    private d V(d d0, d d1) throws e {
        if(d0 == d1) {
            return d1;
        }
        if(!(d1 instanceof javassist.bytecode.stackmap.d.e) && !(d1 instanceof javassist.bytecode.stackmap.d.d)) {
            if(!(d1 instanceof javassist.bytecode.stackmap.d.a)) {
                throw new RuntimeException("fatal: this should never happen");
            }
            ((javassist.bytecode.stackmap.d.a)d1).v(d0);
            return d1;
        }
        return d1;
    }

    private void W(f f0, boolean z) throws e {
        for(int v1 = 0; v1 < this.l.length; ++v1) {
            d[] arr_d = f0.i;
            arr_d[v1] = this.V(b.i0(this.l, this.l.length, v1), f0.i[v1]);
        }
        if(z) {
            int v2 = this.j;
            for(int v = 0; v < v2; ++v) {
                d[] arr_d1 = f0.j;
                arr_d1[v] = this.V(this.k[v], arr_d1[v]);
            }
        }
    }

    private void X(f f0) throws e {
        d[] arr_d = d.q(this.k.length);
        int v = this.j;
        b.a0(v, this.k, arr_d);
        this.Z(f0, v, arr_d);
    }

    private void Y(f f0, int v) throws e {
        d[] arr_d = d.q(this.k.length);
        arr_d[0] = this.d0(v).p();
        this.Z(f0, 1, arr_d);
    }

    private void Z(f f0, int v, d[] arr_d) throws e {
        int v1 = this.l.length;
        d[] arr_d1 = d.q(v1);
        f0.j(v, arr_d, b.a0(v1, this.l, arr_d1), arr_d1);
    }

    protected static int a0(int v, d[] arr_d, d[] arr_d1) {
        int v1 = -1;
        for(int v2 = 0; v2 < v; ++v2) {
            d d0 = b.i0(arr_d, v, v2);
            arr_d1[v2] = d0.p();
            if(d0 != javassist.bytecode.stackmap.e.b) {
                v1 = v2 + 1;
            }
        }
        return v1 + 1;
    }

    private static int b0(int v, d[] arr_d, int v1, d[] arr_d1) {
        int v2 = v1 - v;
        int v3 = v2 <= 0 ? v1 : v;
        if(b.c0(arr_d, arr_d1, v3)) {
            return v2 <= 0 ? -b.L(arr_d, v3, v) : b.L(arr_d1, v3, v1);
        }
        return -100;
    }

    private static boolean c0(d[] arr_d, d[] arr_d1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(!arr_d[v1].g(arr_d1[v1])) {
                return false;
            }
        }
        return true;
    }

    private javassist.bytecode.stackmap.d.e d0(int v) {
        return v == 0 ? new javassist.bytecode.stackmap.d.e("java.lang.Throwable") : new javassist.bytecode.stackmap.d.e(this.h.A(v));
    }

    public i0 e0(f[] arr_f) {
        k i0$k0 = new k(0x20);
        f f0 = arr_f[0];
        int v = f0.b;
        if(f0.c > 0) {
            i0$k0.d(0);
            --v;
        }
        f f1 = f0;
        int v1 = v;
        for(int v2 = 1; v2 < arr_f.length; ++v2) {
            f f2 = arr_f[v2];
            if(this.Q(f2, arr_f[v2 - 1])) {
                f2.i();
                this.g0(i0$k0, f2, b.b0(f1.h, f1.i, f2.h, f2.i), v1, f1);
                v1 = f2.b - 1;
                f1 = f2;
            }
            else if(f2.c == 0) {
                i0$k0.d(v1);
                v1 = f2.b - 1;
            }
            else {
                v1 += f2.b;
            }
        }
        return i0$k0.g(this.h);
    }

    public h0 f0(t t0, f[] arr_f) {
        i h0$i0 = new i();
        boolean[] arr_z = new boolean[arr_f.length];
        int v2 = arr_f[0].c <= 0 ? 0 : 1;
        arr_z[0] = v2;
        for(int v1 = 1; v1 < arr_f.length; ++v1) {
            f f0 = arr_f[v1];
            boolean z = this.Q(f0, arr_f[v1 - 1]);
            arr_z[v1] = z;
            if(z) {
                f0.i();
                ++v2;
            }
        }
        if(!v2) {
            return null;
        }
        h0$i0.c(true);
        for(int v = 0; v < arr_f.length; ++v) {
            if(arr_z[v]) {
                f f1 = arr_f[v];
                this.j0(h0$i0, t0, f1.a, f1);
            }
        }
        return h0$i0.b(t0);
    }

    private void g0(k i0$k0, f f0, int v, int v1, f f1) {
        int v2 = f0.g;
        if(v2 == 0) {
            if(v == 0) {
                i0$k0.d(v1);
                return;
            }
            if(v < 0 && v >= -3) {
                i0$k0.b(v1, -v);
                return;
            }
            if(v > 0 && v <= 3) {
                int[] arr_v = new int[v];
                i0$k0.a(v1, this.M(f0.h - f1.h, f1.h, arr_v, f0.i), arr_v);
                return;
            }
        }
        else {
            if(v2 == 1 && v == 0) {
                d d0 = f0.j[0];
                i0$k0.e(v1, d0.k(), d0.j(this.h));
                return;
            }
            if(v2 == 2 && v == 0) {
                d d1 = f0.j[0];
                if(d1.l()) {
                    i0$k0.e(v1, d1.k(), d1.j(this.h));
                    return;
                }
            }
        }
        int[] arr_v1 = new int[v2];
        int[] arr_v2 = this.M(v2, 0, arr_v1, f0.j);
        int v3 = f0.h;
        int[] arr_v3 = new int[v3];
        i0$k0.c(v1, this.M(v3, 0, arr_v3, f0.i), arr_v3, arr_v2, arr_v1);
    }

    private void h0(byte[] arr_b, a a$a0) throws e {
        while(a$a0 != null) {
            f f0 = (f)a$a0.b;
            if(f0.c()) {
                this.W(f0, false);
                if(f0.g < 1) {
                    throw new e("bad catch clause: " + a$a0.c);
                }
                d[] arr_d = f0.j;
                arr_d[0] = this.V(this.d0(a$a0.c), f0.j[0]);
            }
            else {
                this.Y(f0, a$a0.c);
                new b(this).S(arr_b, f0);
            }
            a$a0 = a$a0.a;
        }
    }

    private static d i0(d[] arr_d, int v, int v1) {
        d d0 = arr_d[v1];
        if(d0.l() && v1 + 1 < v) {
            return arr_d[v1 + 1] == javassist.bytecode.stackmap.e.b ? d0 : javassist.bytecode.stackmap.e.b;
        }
        return d0;
    }

    private void j0(i h0$i0, t t0, int v, f f0) {
        h0$i0.c(v);
        this.k0(h0$i0, t0, f0.i, f0.h);
        this.k0(h0$i0, t0, f0.j, f0.g);
    }

    private void k0(i h0$i0, t t0, d[] arr_d, int v) {
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            d d0 = arr_d[v2];
            if(d0 != null && d0.l()) {
                ++v3;
                ++v2;
            }
        }
        h0$i0.c(v - v3);
        for(int v1 = 0; v1 < v; ++v1) {
            d d1 = arr_d[v1];
            h0$i0.d(d1.k(), d1.j(t0));
            if(d1.l()) {
                ++v1;
            }
        }
    }
}

