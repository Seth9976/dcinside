package javassist.convert;

import javassist.E;
import javassist.bytecode.e;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.l;
import javassist.q;

public class c extends d {
    protected l[] j;
    protected int k;
    protected int l;
    protected byte[] m;
    protected byte[] n;

    public c(k k0, q q0, q q1) throws E {
        super(k0, q0, q1);
        this.d = q0.D().h();
        this.j = q0.G();
        this.k = 0;
        this.l = 0;
        this.n = null;
        this.m = null;
    }

    @Override  // javassist.convert.k
    public int b() {
        return this.k;
    }

    @Override  // javassist.convert.d
    public void f(t t0, p p0) {
        super.f(t0, p0);
        this.k = 0;
        this.l = p0.D();
        this.n = null;
        this.m = null;
    }

    @Override  // javassist.convert.d
    protected int h(int v, int v1, javassist.bytecode.q q0, int v2, t t0) throws e {
        if(this.h == 0) {
            String s = w.k(this.b, w.r(this.j) + 'V');
            int v3 = t0.u(this.f, s);
            this.h = t0.q(t0.a(this.e), v3);
            this.i = t0;
        }
        if(this.m == null) {
            this.j(this.j, t0);
        }
        return this.l(v1, q0);
    }

    protected void j(l[] arr_l, t t0) {
        j j0 = new j(t0, 0, 0);
        j j1 = new j(t0, 0, 0);
        int v = this.l;
        j1.k(v);
        this.k(j0, j1, 0, (arr_l == null ? 0 : arr_l.length), arr_l, v + 1);
        j0.n(v);
        this.m = j0.E0();
        this.n = j1.E0();
    }

    private void k(j j0, j j1, int v, int v1, l[] arr_l, int v2) {
        if(v < v1) {
            this.k(j0, j1, v + 1, v1, arr_l, v2 + j1.j0(v2, arr_l[v]));
            j0.C0(v2, arr_l[v]);
            return;
        }
        this.k = v2 - this.l;
    }

    protected int l(int v, javassist.bytecode.q q0) throws e {
        q0.H(v);
        q0.m(this.m);
        q0.m(this.n);
        int v1 = q0.w(3);
        q0.Y(0xB8, v1);
        q0.W(this.h, v1 + 1);
        q0.m(this.n);
        return q0.J();
    }
}

