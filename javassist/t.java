package javassist;

import javassist.bytecode.C;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.compiler.c;

public class t {
    public static q a(l l0, String s, l[] arr_l, l[] arr_l1, l l1) throws E {
        q q0 = new q(l0, s, arr_l, l1);
        q0.Z(arr_l1);
        return q0;
    }

    public static q b(q q0, String s, l l0, d d0) throws b {
        q q1 = new q(q0, l0, d0);
        q1.g0(s);
        return q1;
    }

    public static q c(q q0, l l0, d d0) throws b {
        return new q(q0, l0, d0);
    }

    public static q d(q q0, l l0) throws b {
        try {
            return t.e(q0, l0);
        }
        catch(E e0) {
            throw new b(e0);
        }
    }

    private static q e(q q0, l l0) throws b, E {
        int v;
        T t0 = q0.D();
        String s = t0.k();
        String s1 = t0.h();
        javassist.bytecode.t t1 = l0.u().l();
        T t2 = new T(t1, s, s1);
        t2.x(t0.c());
        C c0 = t0.i();
        if(c0 != null) {
            t2.A(((C)c0.a(t1, null)));
        }
        j j0 = new j(t1, 0, 0);
        boolean z = D.l(q0.h());
        l l1 = q0.f();
        l[] arr_l = q0.G();
        if(z) {
            v = j0.k0(arr_l, 0);
            j0.W(l1, s, s1);
        }
        else {
            j0.j0(0, l1);
            v = j0.k0(arr_l, 1);
            j0.Q(l1, s, s1);
        }
        j0.B0(q0.b0());
        int v1 = v + 1;
        j0.P0(v1);
        if(v1 < 2) {
            v1 = 2;
        }
        j0.R0(v1);
        t2.y(j0.T0());
        return new q(t2, l0);
    }

    public static q f(String s, o o0) throws b {
        javassist.bytecode.D d0 = o0.v();
        String s1 = d0.h();
        javassist.bytecode.t t0 = d0.f();
        T t1 = new T(t0, s, "()" + s1);
        t1.x(1);
        j j0 = new j(t0, 2, 1);
        try {
            String s2 = d0.i();
            if((d0.c() & 8) == 0) {
                j0.k(0);
                j0.B(j.h, s2, s1);
            }
            else {
                j0.D(j.h, s2, s1);
            }
            j0.B0(o0.y());
        }
        catch(E e0) {
            throw new b(e0);
        }
        t1.y(j0.T0());
        return new q(t1, o0.f());
    }

    public static q g(int v, l l0, String s, l[] arr_l, l[] arr_l1, String s1, l l1) throws b {
        try {
            q q0 = new q(l0, s, arr_l, l1);
            q0.q(v);
            q0.Z(arr_l1);
            q0.W(s1);
            return q0;
        }
        catch(E e0) {
            throw new b(e0);
        }
    }

    public static q h(String s, l l0) throws b {
        return t.i(s, l0, null, null);
    }

    public static q i(String s, l l0, String s1, String s2) throws b {
        javassist.compiler.d d0 = new javassist.compiler.d(l0);
        try {
            if(s2 != null) {
                d0.o(s1, s2);
            }
            p p0 = d0.a(s);
            if(p0 instanceof q) {
                return (q)p0;
            }
        }
        catch(c c0) {
            throw new b(c0);
        }
        throw new b("not a method");
    }

    public static q j(l l0, String s, l[] arr_l, l[] arr_l1, String s1, l l1) throws b {
        return t.g(1, l0, s, arr_l, arr_l1, s1, l1);
    }

    public static q k(String s, o o0) throws b {
        javassist.bytecode.D d0 = o0.v();
        String s1 = d0.h();
        javassist.bytecode.t t0 = d0.f();
        T t1 = new T(t0, s, "(" + s1 + ")V");
        t1.x(1);
        j j0 = new j(t0, 3, 3);
        try {
            String s2 = d0.i();
            if((d0.c() & 8) == 0) {
                j0.k(0);
                j0.j0(1, o0.y());
                j0.v0(j.h, s2, s1);
            }
            else {
                j0.j0(1, o0.y());
                j0.y0(j.h, s2, s1);
            }
            j0.B0(null);
        }
        catch(E e0) {
            throw new b(e0);
        }
        t1.y(j0.T0());
        return new q(t1, o0.f());
    }

    public static q l(l l0, String s, l[] arr_l, l[] arr_l1, q q0, a q$a0, l l1) throws b {
        return v.g(l0, s, arr_l, arr_l1, q0, q$a0, l1);
    }
}

