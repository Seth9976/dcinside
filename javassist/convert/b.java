package javassist.convert;

import javassist.E;
import javassist.bytecode.e;
import javassist.q;

public class b extends c {
    public b(k k0, q q0, q q1) throws E {
        super(k0, q0, q1);
    }

    @Override  // javassist.convert.c
    protected int l(int v, javassist.bytecode.q q0) throws e {
        q0.H(v);
        q0.m(this.m);
        q0.m(this.n);
        q0.N(q0.w(3));
        q0.m(this.n);
        int v1 = q0.J();
        int v2 = q0.k();
        q0.Y(q0.f(v1), v2);
        q0.W(q0.T(v1 + 1), v2 + 1);
        q0.Y(0xB8, v1);
        q0.W(this.h, v1 + 1);
        q0.H(v2);
        return q0.J();
    }
}

