package javassist.convert;

import javassist.D;
import javassist.E;
import javassist.bytecode.e;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.g;
import javassist.l;
import javassist.o;

public class i extends k {
    protected String b;
    protected l c;
    protected boolean d;
    protected String e;
    protected String f;

    public i(k k0, o o0, String s, String s1) {
        super(k0);
        this.c = o0.f();
        this.b = o0.i();
        this.e = s;
        this.f = s1;
        this.d = D.i(o0.h());
    }

    @Override  // javassist.convert.k
    public int g(l l0, int v, q q0, t t0) throws e {
        int v1 = q0.f(v);
        if(v1 == 0xB2 || v1 == 180) {
            int v2 = q0.T(v + 1);
            String s = i.h(l0.w(), t0, this.c, this.b, this.d, v2);
            if(s != null) {
                if(v1 == 0xB2) {
                    q0.H(v);
                    q0.Y(1, q0.w(1));
                    v = q0.J();
                }
                int v3 = t0.r(t0.a(this.e), this.f, "(Ljava/lang/Object;)" + s);
                q0.Y(0xB8, v);
                q0.W(v3, v + 1);
            }
        }
        return v;
    }

    static String h(g g0, t t0, l l0, String s, boolean z, int v) {
        if(!t0.H(v).equals(s)) {
            return null;
        }
        try {
            l l1 = g0.s(t0.G(v));
            return l1 != l0 && (z || !i.i(l1, l0, s)) ? null : t0.J(v);
        }
        catch(E unused_ex) {
        }
        return null;
    }

    static boolean i(l l0, l l1, String s) {
        if(!l0.J0(l1)) {
            return false;
        }
        try {
            if(l0.O(s).f() == l1) {
                return true;
            }
        }
        catch(E unused_ex) {
        }
        return false;
    }
}

