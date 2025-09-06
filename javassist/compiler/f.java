package javassist.compiler;

import javassist.E;
import javassist.compiler.ast.a;
import javassist.compiler.ast.b;
import javassist.compiler.ast.k;
import javassist.compiler.ast.p;
import javassist.compiler.ast.v;
import javassist.g;
import javassist.l;
import javassist.w;

public class f extends r {
    private e k;

    public f(l l0, g g0, e e0) {
        super(l0, g0);
        this.k = e0;
    }

    @Override  // javassist.compiler.r
    protected void B(k k0, int v, b b0, b b1) throws c {
        if(b0 instanceof p && ((p)b0).g().equals(this.k.C)) {
            b1.a(this);
            l[] arr_l = this.k.E;
            if(arr_l == null) {
                return;
            }
            for(int v1 = 0; v1 < arr_l.length; ++v1) {
                this.o0(arr_l[v1]);
            }
            return;
        }
        super.B(k0, v, b0, b1);
    }

    @Override  // javassist.compiler.r
    public void F(a a0, int[] arr_v, int[] arr_v1, String[] arr_s) throws c {
        l[] arr_l = this.k.E;
        String s = this.k.D;
        int v = 0;
        while(a0 != null) {
            b b0 = a0.i();
            if(!(b0 instanceof p) || !((p)b0).g().equals(s)) {
                b0.a(this);
                arr_v[v] = this.a;
                arr_v1[v] = this.b;
                arr_s[v] = this.c;
                ++v;
            }
            else if(arr_l != null) {
                for(int v1 = 0; v1 < arr_l.length; ++v1) {
                    this.q0(arr_l[v1]);
                    arr_v[v] = this.a;
                    arr_v1[v] = this.b;
                    arr_s[v] = this.c;
                    ++v;
                }
            }
            a0 = a0.q();
        }
    }

    @Override  // javassist.compiler.r
    public int U(a a0) {
        String s = this.k.D;
        int v = 0;
        while(a0 != null) {
            b b0 = a0.i();
            if(!(b0 instanceof p) || !((p)b0).g().equals(s)) {
                ++v;
            }
            else {
                l[] arr_l = this.k.E;
                if(arr_l != null) {
                    v += arr_l.length;
                }
            }
            a0 = a0.q();
        }
        return v;
    }

    @Override  // javassist.compiler.r
    public void e(javassist.compiler.ast.f f0) throws c {
        b b0 = f0.w();
        if(b0 instanceof p) {
            String s = ((p)b0).g();
            if(this.k.N != null && s.equals(this.k.M)) {
                this.k.N.a(this, ((a)f0.x()));
                return;
            }
            if(s.equals("$cflow")) {
                this.m0(((a)f0.x()));
                return;
            }
        }
        super.e(f0);
    }

    @Override  // javassist.compiler.r
    public void f(javassist.compiler.ast.g g0) throws c {
        a a0 = g0.s();
        if(a0 != null && g0.r() == 0) {
            b b0 = a0.i();
            if(b0 instanceof v && a0.q() == null) {
                String s = ((v)b0).g();
                if(s.equals(this.k.K)) {
                    this.k0(g0);
                    return;
                }
                if(s.equals("$w")) {
                    this.l0(g0);
                    return;
                }
            }
        }
        super.f(g0);
    }

    public void j0() {
        if(this.a == 344) {
            this.a = 307;
            this.b = 0;
            this.c = "java/lang/Object";
        }
    }

    protected void k0(javassist.compiler.ast.g g0) throws c {
        l l0 = this.k.J;
        g0.u().a(this);
        if(this.a == 344 || javassist.compiler.b.F0(this.a) || this.b > 0) {
            this.o0(l0);
        }
        else if(l0 instanceof w) {
            this.a = j.b(((w)l0).W0());
            this.b = 0;
            this.c = null;
        }
    }

    protected void l0(javassist.compiler.ast.g g0) throws c {
        g0.u().a(this);
        if(!javassist.compiler.b.F0(this.a) && (this.b <= 0 && this.d.m(this.a, this.b, this.c) instanceof w)) {
            this.a = 307;
            this.b = 0;
            this.c = "java/lang/Object";
        }
    }

    protected void m0(a a0) throws c {
        this.a = 324;
        this.b = 0;
        this.c = null;
    }

    void n0(b b0, String s, String s1, String s2, a a0) throws c {
        b0.a(this);
        int v = this.U(a0);
        this.F(a0, new int[v], new int[v], new String[v]);
        this.f0(s2);
        this.j0();
    }

    @Override  // javassist.compiler.r
    public void o(p p0) throws c {
        String s = p0.g();
        if(s.equals(this.k.C)) {
            this.a = 307;
            this.b = 1;
            this.c = "java/lang/Object";
            return;
        }
        if(s.equals("$sig")) {
            this.a = 307;
            this.b = 1;
            this.c = "java/lang/Class";
            return;
        }
        if(!s.equals("$type") && !s.equals("$class")) {
            super.o(p0);
            return;
        }
        this.a = 307;
        this.b = 0;
        this.c = "java/lang/Class";
    }

    protected void o0(l l0) throws c {
        if(l0 == l.m) {
            this.j0();
            return;
        }
        this.q0(l0);
    }

    public boolean p0(a a0) {
        if(this.k.E != null && a0 != null && a0.q() == null) {
            b b0 = a0.i();
            return b0 instanceof p && ((p)b0).g().equals(this.k.D);
        }
        return false;
    }

    public void q0(l l0) throws c {
        this.r0(l0, 0);
    }

    private void r0(l l0, int v) throws c {
        if(l0.p0()) {
            this.a = j.b(((w)l0).W0());
            this.b = v;
            this.c = null;
            return;
        }
        if(l0.k0()) {
            try {
                this.r0(l0.x(), v + 1);
                return;
            }
            catch(E unused_ex) {
                throw new c("undefined type: " + l0.X());
            }
        }
        this.a = 307;
        this.b = v;
        this.c = j.k(l0.X());
    }
}

