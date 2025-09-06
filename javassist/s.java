package javassist;

import javassist.bytecode.j;
import javassist.compiler.c;

public class s {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    public static n a(n n0, l l0, d d0) throws b {
        return new n(n0, l0, d0);
    }

    public static n b(l l0) throws b {
        n n0 = new n(null, l0);
        j j0 = new j(l0.u().l(), 1, 1);
        j0.k(0);
        try {
            j0.Q(l0.c0(), "<init>", "()V");
        }
        catch(E e0) {
            throw new b(e0);
        }
        j0.a(0xB1);
        n0.D().y(j0.T0());
        return n0;
    }

    public static n c(String s, l l0) throws b {
        javassist.compiler.d d0 = new javassist.compiler.d(l0);
        try {
            p p0 = d0.a(s);
            if(p0 instanceof n) {
                return (n)p0;
            }
        }
        catch(c c0) {
            throw new b(c0);
        }
        throw new b("not a constructor");
    }

    public static n d(l[] arr_l, l[] arr_l1, int v, q q0, a q$a0, l l0) throws b {
        return u.i(arr_l, arr_l1, v, q0, q$a0, l0);
    }

    public static n e(l[] arr_l, l[] arr_l1, String s, l l0) throws b {
        try {
            n n0 = new n(arr_l, l0);
            n0.Z(arr_l1);
            n0.W(s);
            return n0;
        }
        catch(E e0) {
            throw new b(e0);
        }
    }

    public static n f(l[] arr_l, l[] arr_l1, l l0) throws b {
        return s.d(arr_l, arr_l1, 2, null, null, l0);
    }

    public static n g(l[] arr_l, l[] arr_l1, l l0) throws b {
        return s.d(arr_l, arr_l1, 0, null, null, l0);
    }
}

