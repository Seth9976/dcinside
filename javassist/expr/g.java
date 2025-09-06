package javassist.expr;

import javassist.E;
import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.compiler.d;
import javassist.compiler.e;
import javassist.compiler.f;
import javassist.compiler.m;
import javassist.k;
import javassist.l;

public class g extends c {
    static class a implements m {
        int a;

        a(int v) {
            this.a = v;
        }

        @Override  // javassist.compiler.m
        public void a(f f0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            f0.F(a0, new int[1], new int[1], new String[1]);
            f0.q0(l.e);
        }

        @Override  // javassist.compiler.m
        public void b(e e0, j j0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            if(e0.j1(a0) != 1) {
                throw new javassist.compiler.c("$proceed() cannot take more than one parameter for instanceof");
            }
            e0.W0(a0, new int[1], new int[1], new String[1]);
            j0.s0(0xC1);
            j0.G(this.a);
            e0.N1(l.e);
        }
    }

    protected g(int v, q q0, l l0, T t0) {
        super(v, q0, l0, t0);
    }

    @Override  // javassist.expr.c
    public String f() {
        return super.f();
    }

    @Override  // javassist.expr.c
    public int g() {
        return super.g();
    }

    @Override  // javassist.expr.c
    public l[] j() {
        return super.j();
    }

    @Override  // javassist.expr.c
    public void k(String s) throws b {
        this.c.t();
        int v = this.a;
        int v1 = this.b.T(v + 1);
        d d0 = new d(this.c);
        javassist.g g0 = this.c.w();
        p p0 = this.b.i();
        try {
            l[] arr_l = {g0.s("java.lang.Object")};
            l l0 = l.e;
            int v2 = p0.D();
            d0.m("java.lang.Object", arr_l, true, v2, this.s());
            int v3 = d0.q(l0, true);
            d0.p(new a(v1));
            d0.t(this.t());
            c.b(l0, s);
            j j0 = d0.h();
            c.p(arr_l, true, v2, j0);
            d0.k(p0, v);
            j0.q(l0);
            j0.C0(v3, l0);
            d0.g(s);
            j0.j0(v3, l0);
            this.m(v, j0, 3);
        }
        catch(javassist.compiler.c c0) {
            throw new b(c0);
        }
        catch(E e0) {
            throw new b(e0);
        }
        catch(javassist.bytecode.e unused_ex) {
            throw new b("broken method");
        }
    }

    @Override  // javassist.expr.c
    public k r() {
        return super.r();
    }

    public l t() throws E {
        String s = this.d().A(this.b.T(this.a + 1));
        return this.c.w().R(s);
    }
}

