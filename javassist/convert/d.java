package javassist.convert;

import javassist.D;
import javassist.E;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.t;
import javassist.g;
import javassist.l;
import javassist.q;

public class d extends k {
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected boolean g;
    protected int h;
    protected t i;

    public d(k k0, String s, q q0) {
        super(k0);
        this.c = s;
        this.d = q0.D().h();
        String s1 = q0.f().X();
        this.e = s1;
        this.b = s1;
        this.f = q0.i();
        this.i = null;
        this.g = D.i(q0.h());
    }

    public d(k k0, q q0, q q1) {
        this(k0, q0.i(), q1);
        this.b = q0.f().X();
    }

    @Override  // javassist.convert.k
    public void f(t t0, p p0) {
        if(this.i != t0) {
            this.h = 0;
        }
    }

    @Override  // javassist.convert.k
    public int g(l l0, int v, javassist.bytecode.q q0, t t0) throws e {
        int v1 = q0.f(v);
        if(v1 == 0xB6 || v1 == 0xB7 || v1 == 0xB8 || v1 == 0xB9) {
            int v2 = q0.T(v + 1);
            String s = t0.z(this.c, this.d, v2);
            return s == null || !this.i(s, l0.w()) ? v : this.h(v1, v, q0, t0.i0(t0.Y(v2)), t0);
        }
        return v;
    }

    protected int h(int v, int v1, javassist.bytecode.q q0, int v2, t t0) throws e {
        if(this.h == 0) {
            int v3 = t0.t(t0.x(this.f), v2);
            int v4 = t0.a(this.e);
            if(v == 0xB9) {
                this.h = t0.i(v4, v3);
            }
            else {
                if(this.g && v == 0xB6) {
                    q0.Y(0xB7, v1);
                }
                this.h = t0.q(v4, v3);
            }
            this.i = t0;
        }
        q0.W(this.h, v1 + 1);
        return v1;
    }

    private boolean i(String s, g g0) {
        if(this.b.equals(s)) {
            return true;
        }
        try {
            l l0 = g0.s(s);
            if(l0.K0(g0.s(this.b))) {
                try {
                    return l0.U(this.c, this.d).f().X().equals(this.b);
                }
                catch(E unused_ex) {
                    return true;
                }
            }
        }
        catch(E unused_ex) {
        }
        return false;
    }
}

