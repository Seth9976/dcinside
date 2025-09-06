package javassist;

import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w.a;
import javassist.bytecode.w;
import javassist.compiler.c;

public final class n extends k {
    protected n(T t0, l l0) {
        super(l0, t0);
    }

    public n(n n0, l l0, d d0) throws b {
        this(null, l0);
        this.x(n0, true, d0);
    }

    public n(l[] arr_l, l l0) {
        this(null, l0);
        String s = w.p(arr_l);
        this.c = new T(l0.u().l(), "<init>", s);
        this.q(1);
    }

    // 去混淆评级： 低(20)
    @Override  // javassist.k
    public String B() {
        return this.f().X() + (this.f0() ? w.E(this.j()) : ".<clinit>()");
    }

    @Override  // javassist.k
    int I(p p0) throws b {
        q q0 = p0.G();
        try {
            q0.P();
            return q0.J();
        }
        catch(e e0) {
            throw new b(e0);
        }
    }

    @Override  // javassist.k
    public boolean V() {
        p p0 = this.D().f();
        if(p0 == null) {
            return false;
        }
        t t0 = p0.d();
        q q0 = p0.G();
        try {
            switch(q0.f(q0.J())) {
                case 42: {
                    int v = q0.J();
                    if(q0.f(v) == 0xB7) {
                        int v1 = t0.q0(this.c0(), q0.T(v + 1));
                        return v1 != 0 && "()V".equals(t0.p0(v1)) && q0.f(q0.J()) == 0xB1 && !q0.l();
                    }
                    return false;
                }
                case 0xB1: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        catch(e unused_ex) {
            return false;
        }
    }

    @Override  // javassist.k
    public void W(String s) throws b {
        if(s == null) {
            s = this.e0() ? ";" : "super();";
        }
        super.W(s);
    }

    public boolean b0() throws b {
        p p0 = this.c.f();
        if(p0 != null) {
            q q0 = p0.G();
            try {
                return q0.Q() >= 0;
            }
            catch(e e0) {
                throw new b(e0);
            }
        }
        return false;
    }

    private String c0() {
        return this.b.u().y();
    }

    public void d0(String s) throws b {
        l l0 = this.b;
        l0.g();
        if(!this.e0()) {
            p p0 = this.c.f();
            q q0 = p0.G();
            j j0 = new j(this.c.g(), p0.E(), p0.D());
            j0.S0(p0.E());
            javassist.compiler.d d0 = new javassist.compiler.d(j0, l0);
            try {
                d0.n(this.G(), false);
                d0.g(s);
                p0.L(j0.I0());
                p0.K(j0.H0());
                q0.P();
                q0.o(j0.G0(), q0.r(j0.E0()));
                this.c.t(l0.w(), l0.u());
                return;
            }
            catch(E e1) {
                throw new b(e1);
            }
            catch(c c0) {
                throw new b(c0);
            }
            catch(e e0) {
                throw new b(e0);
            }
        }
        throw new b("class initializer");
    }

    public boolean e0() {
        return this.c.n();
    }

    public boolean f0() {
        return this.c.l();
    }

    private static void g0(p p0) throws b {
        q q0 = p0.G();
        try {
            int v = q0.P();
            if(v >= 0) {
                String s = p0.d().g0(q0.T(v + 1));
                int v1 = w.m(s);
                if(v1 + 1 > 3) {
                    v = q0.A(v, v1 - 2, false).a;
                }
                int v2 = v + 1;
                q0.Y(87, v);
                q0.Y(0, v2);
                q0.Y(0, v + 2);
                a w$a0 = new a(s);
                while(true) {
                    w$a0.e();
                    if(!w$a0.d()) {
                        break;
                    }
                    q0.Y((w$a0.c() ? 88 : 87), v2);
                    ++v2;
                }
            }
            return;
        }
        catch(e e0) {
        }
        throw new b(e0);
    }

    public void h0(n n0, d d0) throws b {
        k.Y(n0.b, n0.c, this.b, this.c, d0);
    }

    // 去混淆评级： 低(20)
    @Override  // javassist.p
    public String i() {
        return this.c.n() ? "<clinit>" : this.b.b0();
    }

    public javassist.q i0(String s, l l0) throws b {
        return this.j0(s, l0, null);
    }

    public javassist.q j0(String s, l l0, d d0) throws b {
        javassist.q q0 = new javassist.q(null, l0);
        q0.x(this, false, d0);
        if(this.f0()) {
            p p0 = q0.D().f();
            if(p0 != null) {
                n.g0(p0);
                try {
                    this.c.t(l0.w(), l0.u());
                }
                catch(e e0) {
                    throw new b(e0);
                }
            }
        }
        q0.g0(s);
        return q0;
    }
}

