package javassist;

import javassist.bytecode.j;
import javassist.bytecode.k;
import javassist.bytecode.w;

class u extends v {
    private static final int b = 0;
    private static final int c = 2;

    protected static j h(l l0, k k0, int v, q q0, l[] arr_l, a q$a0) throws b {
        int v3;
        int v1 = 2;
        int v2 = k0.z();
        j j0 = new j(k0.l(), 0, 0);
        j0.Q0(false, arr_l, 0);
        j0.k(0);
        if(v == 0) {
            j0.O(v2, "<init>", "()V");
            v3 = 1;
        }
        else if(v == 2) {
            int v4 = j0.k0(arr_l, 1);
            j0.O(v2, "<init>", w.p(arr_l));
            v3 = v4 + 1;
        }
        else {
            v3 = v.c(j0, arr_l, 1);
            if(q$a0 != null) {
                v1 = q$a0.a(j0) + 2;
            }
            if(v3 < v1) {
                v3 = v1;
            }
            j0.O(v2, "<init>", "([Ljava/lang/Object;)V");
        }
        if(q0 == null) {
            j0.a(0xB1);
        }
        else {
            int v5 = v.f(l0, k0, q0, false, arr_l, l.m, q$a0, j0);
            if(v3 < v5) {
                v3 = v5;
            }
        }
        j0.R0(v3);
        return j0;
    }

    public static n i(l[] arr_l, l[] arr_l1, int v, q q0, a q$a0, l l0) throws b {
        try {
            n n0 = new n(arr_l, l0);
            n0.Z(arr_l1);
            n0.D().y(u.h(l0, l0.u(), v, q0, arr_l, q$a0).T0());
            return n0;
        }
        catch(E e0) {
            throw new b(e0);
        }
    }
}

