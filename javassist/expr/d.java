package javassist.expr;

import javassist.bytecode.A;
import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.l;

public class d {
    static final class a {
        b a;
        int b;
        int c;

        a(int v) {
            this.b = v;
            this.c = 0;
            this.a = null;
        }

        void a(int v, int v1) {
            if(this.b < v) {
                this.b = v;
            }
            if(this.c < v1) {
                this.c = v1;
            }
        }
    }

    static final class b {
        b a;
        int b;
        String c;

        b(b d$b0, int v, String s) {
            this.a = d$b0;
            this.b = v;
            this.c = s;
        }
    }

    public boolean a(l l0, T t0) throws javassist.b {
        p p0 = t0.f();
        if(p0 == null) {
            return false;
        }
        q q0 = p0.G();
        a d$a0 = new a(p0.D());
        boolean z = false;
        while(q0.l()) {
            if(this.k(q0, l0, t0, d$a0)) {
                z = true;
            }
        }
        A a0 = p0.C();
        int v = a0.p();
        boolean z1 = z;
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = new f(a0, v1, q0, l0, t0);
            if(f0.c()) {
                d$a0.a(f0.i(), f0.o());
                z1 = true;
            }
        }
        int v2 = d$a0.b;
        if(p0.D() < v2) {
            p0.K(v2);
        }
        p0.L(p0.E() + d$a0.c);
        if(z1) {
            try {
                t0.t(l0.w(), l0.u());
                return true;
            }
            catch(e e0) {
                throw new javassist.b(e0.getMessage(), e0);
            }
        }
        return false;
    }

    boolean b(l l0, T t0, a d$a0, q q0, int v) throws javassist.b {
        boolean z = false;
        while(q0.l() && q0.E() < v) {
            int v1 = q0.j();
            if(this.k(q0, l0, t0, d$a0)) {
                int v2 = q0.j();
                if(v1 != v2) {
                    v += v2 - v1;
                }
                z = true;
            }
        }
        return z;
    }

    public void c(javassist.expr.a a0) throws javassist.b {
    }

    public void d(javassist.expr.b b0) throws javassist.b {
    }

    public void e(javassist.expr.e e0) throws javassist.b {
    }

    public void f(f f0) throws javassist.b {
    }

    public void g(g g0) throws javassist.b {
    }

    public void h(h h0) throws javassist.b {
    }

    public void i(i i0) throws javassist.b {
    }

    public void j(j j0) throws javassist.b {
    }

    final boolean k(q q0, l l0, T t0, a d$a0) throws javassist.b {
        h h0;
        try {
            int v = q0.J();
            int v1 = q0.f(v);
            if(v1 < 0xB2) {
                h0 = null;
            }
            else if(v1 >= 0xBC) {
                switch(v1) {
                    case 0xC0: {
                        h0 = new javassist.expr.a(v, q0, l0, t0);
                        break;
                    }
                    case 0xC1: {
                        h0 = new g(v, q0, l0, t0);
                        break;
                    }
                    case 0xBC: 
                    case 0xBD: 
                    case 0xC5: {
                        h0 = new i(v, q0, l0, t0, v1);
                        break;
                    }
                    default: {
                        h0 = null;
                    }
                }
            }
            else if(v1 == 0xB6 || v1 == 0xB8 || v1 == 0xB9) {
                h0 = new h(v, q0, l0, t0);
            }
            else if(v1 != 0xB2 && v1 != 180) {
                switch(v1) {
                    case 0xB3: 
                    case 0xB5: {
                        h0 = new javassist.expr.e(v, q0, l0, t0, v1);
                        this.e(((javassist.expr.e)h0));
                        break;
                    }
                    case 0xB7: {
                        b d$b0 = d$a0.a;
                        if(d$b0 == null || t0.g().q0(d$b0.c, q0.T(v + 1)) <= 0) {
                            h0 = new h(v, q0, l0, t0);
                            if(h0.w().equals("<init>")) {
                                h0 = new javassist.expr.b(v, q0, l0, t0);
                            }
                        }
                        else {
                            h0 = new j(v, q0, l0, t0, d$b0.c, d$b0.b);
                            d$a0.a = d$b0.a;
                        }
                        break;
                    }
                    case 0xBB: {
                        d$a0.a = new b(d$a0.a, v, t0.g().A(q0.T(v + 1)));
                        h0 = null;
                        break;
                    }
                    default: {
                        h0 = null;
                        break;
                    }
                }
            }
            else {
                h0 = new javassist.expr.e(v, q0, l0, t0, v1);
                this.e(((javassist.expr.e)h0));
            }
            if(h0 != null && h0.c()) {
                d$a0.a(h0.i(), h0.o());
                return true;
            }
            return false;
        }
        catch(e e0) {
        }
        throw new javassist.b(e0);
    }
}

