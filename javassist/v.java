package javassist;

import java.util.Map;
import javassist.bytecode.T;
import javassist.bytecode.a;
import javassist.bytecode.e;
import javassist.bytecode.j;
import javassist.bytecode.k0;
import javassist.bytecode.k;

class v {
    private static final String a = "_added_m$";

    private static String a(m m0, k k0, q q0) throws e, b {
        Map map0 = m0.d1();
        String s = (String)map0.get(q0);
        if(s == null) {
            do {
                s = "_added_m$" + m0.h1();
            }
            while(k0.q(s) != null);
            d d0 = new d();
            d0.d(q0.f().X(), m0.X());
            T t0 = new T(k0.l(), s, q0.D(), d0);
            t0.x(a.h(t0.c()));
            t0.a(new k0(k0.l()));
            k0.e(t0);
            map0.put(q0, s);
            javassist.p.a p$a0 = m0.k1();
            if(p$a0 != null) {
                p$a0.u(new q(t0, m0));
            }
        }
        return s;
    }

    private static void b(q q0, String s) throws b {
        if(!s.equals(q0.D().h())) {
            throw new b("wrapped method with a bad signature: " + q0.f().X() + '.' + q0.i());
        }
    }

    static int c(j j0, l[] arr_l, int v) {
        return javassist.compiler.e.z1(j0, arr_l, v);
    }

    private static void d(j j0, l l0) {
        if(l0.p0()) {
            if(((w)l0) != l.m) {
                String s = ((w)l0).a1();
                j0.o(s);
                j0.Z(s, ((w)l0).Y0(), ((w)l0).X0());
            }
            j0.s0(((w)l0).Z0());
            return;
        }
        j0.p(l0);
        j0.s0(0xB0);
    }

    static j e(l l0, k k0, q q0, l[] arr_l, l l1, javassist.q.a q$a0) throws b {
        boolean z = D.l(q0.h());
        j j0 = new j(k0.l(), 0, 0);
        j0.R0(v.f(l0, k0, q0, z, arr_l, l1, q$a0, j0));
        j0.Q0(z, arr_l, 0);
        return j0;
    }

    protected static int f(l l0, k k0, q q0, boolean z, l[] arr_l, l l1, javassist.q.a q$a0, j j0) throws b {
        String s;
        int v = 0;
        if(!(l0 instanceof m)) {
            throw new b("bad declaring class" + l0.X());
        }
        if(!z) {
            j0.k(0);
        }
        int v1 = v.c(j0, arr_l, !z);
        if(q$a0 != null) {
            v = q$a0.a(j0);
        }
        v.b(q0, "([Ljava/lang/Object;)Ljava/lang/Object;");
        try {
            s = v.a(((m)l0), k0, q0);
        }
        catch(e e0) {
            throw new b(e0);
        }
        if(z) {
            j0.W(j.h, s, "([Ljava/lang/Object;)Ljava/lang/Object;");
        }
        else {
            j0.Q(j.h, s, "([Ljava/lang/Object;)Ljava/lang/Object;");
        }
        v.d(j0, l1);
        return v1 >= v + 2 ? v1 : v + 2;
    }

    public static q g(l l0, String s, l[] arr_l, l[] arr_l1, q q0, javassist.q.a q$a0, l l1) throws b {
        q q1 = new q(l0, s, arr_l, l1);
        q1.q(q0.h());
        try {
            q1.Z(arr_l1);
        }
        catch(E e0) {
            throw new b(e0);
        }
        q1.D().y(v.e(l1, l1.u(), q0, arr_l, l0, q$a0).T0());
        return q1;
    }
}

