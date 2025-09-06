package javassist.expr;

import javassist.E;
import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.compiler.d;
import javassist.compiler.e;
import javassist.compiler.f;
import javassist.compiler.m;
import javassist.k;
import javassist.l;

public class i extends c {
    static class a implements m {
        l a;
        int b;
        int c;
        int d;

        a(l l0, int v, int v1, int v2) {
            this.a = l0;
            this.b = v;
            this.c = v1;
            this.d = v2;
        }

        @Override  // javassist.compiler.m
        public void a(f f0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            f0.q0(this.a);
        }

        @Override  // javassist.compiler.m
        public void b(e e0, j j0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            int v = e0.j1(a0);
            if(v != this.d) {
                throw new javassist.compiler.c("$proceed() with a wrong number of parameters");
            }
            e0.W0(a0, new int[v], new int[v], new String[v]);
            j0.s0(this.b);
            int v1 = this.b;
            if(v1 == 0xBD) {
                j0.G(this.c);
            }
            else if(v1 == 0xBC) {
                j0.a(this.c);
            }
            else {
                j0.G(this.c);
                j0.a(this.d);
                j0.K0(1 - this.d);
            }
            e0.N1(this.a);
        }
    }

    int i;

    protected i(int v, q q0, l l0, T t0, int v1) {
        super(v, q0, l0, t0);
        this.i = v1;
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
        try {
            this.x(s);
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
        int v = this.i;
        if(v == 0xBC) {
            return this.w(this.b.f(this.a + 1));
        }
        if(v != 0xBD && v != 0xC5) {
            throw new RuntimeException("bad opcode: " + this.i);
        }
        String s = this.d().A(this.b.T(this.a + 1));
        return w.y(w.v(s, w.c(s)), this.c.w());
    }

    public int u() {
        return this.i == 0xC5 ? this.b.f(this.a + 3) : 1;
    }

    public int v() {
        int v = this.i;
        int v1 = 1;
        if(v == 0xBC) {
            return 1;
        }
        if(v != 0xBD && v != 0xC5) {
            throw new RuntimeException("bad opcode: " + this.i);
        }
        int v2 = w.c(this.d().A(this.b.T(this.a + 1)));
        if(this.i != 0xBD) {
            v1 = 0;
        }
        return v2 + v1;
    }

    l w(int v) {
        switch(v) {
            case 4: {
                return l.e;
            }
            case 5: {
                return l.f;
            }
            case 6: {
                return l.k;
            }
            case 7: {
                return l.l;
            }
            case 8: {
                return l.g;
            }
            case 9: {
                return l.h;
            }
            case 10: {
                return l.i;
            }
            case 11: {
                return l.j;
            }
            default: {
                throw new RuntimeException("bad atype: " + v);
            }
        }
    }

    private void x(String s) throws javassist.compiler.c, E, javassist.bytecode.e, b {
        String s3;
        int v5;
        int v4;
        int v3;
        String s1;
        int v2;
        this.c.t();
        t t0 = this.d();
        int v = this.a;
        int v1 = this.i;
        if(v1 == 0xBC) {
            v2 = this.b.f(v + 1);
            s1 = "[" + ((javassist.w)this.w(v2)).W0();
            v3 = 1;
            v4 = 2;
        }
        else {
            switch(v1) {
                case 0xBD: {
                    v5 = this.b.T(v + 1);
                    String s2 = t0.A(v5);
                    s3 = s2.startsWith("[") ? "[" + s2 : "[L" + s2 + ";";
                    v3 = 1;
                    v4 = 3;
                    break;
                }
                case 0xC5: {
                    v5 = this.b.T(v + 1);
                    s3 = t0.A(v5);
                    v3 = this.b.f(this.a + 3);
                    v4 = 4;
                    break;
                }
                default: {
                    throw new RuntimeException("bad opcode: " + this.i);
                }
            }
            s1 = s3;
            v2 = v5;
        }
        l l0 = w.y(s1, this.c.w());
        d d0 = new d(this.c);
        p p0 = this.b.i();
        l[] arr_l = new l[v3];
        for(int v6 = 0; v6 < v3; ++v6) {
            arr_l[v6] = l.i;
        }
        int v7 = p0.D();
        d0.m("java.lang.Object", arr_l, true, v7, this.s());
        c.b(l0, s);
        int v8 = d0.q(l0, true);
        d0.p(new a(l0, this.i, v2, v3));
        j j0 = d0.h();
        c.p(arr_l, true, v7, j0);
        d0.k(p0, v);
        j0.s0(1);
        j0.n(v8);
        d0.g(s);
        j0.k(v8);
        this.m(v, j0, v4);
    }
}

