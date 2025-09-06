package javassist.convert;

import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.q;

public class e extends d {
    public e(k k0, q q0, q q1) {
        super(k0, q0, q1);
        this.d = q0.D().h();
    }

    @Override  // javassist.convert.d
    protected int h(int v, int v1, javassist.bytecode.q q0, int v2, t t0) {
        if(this.h == 0) {
            String s = w.k(this.b, this.d);
            int v3 = t0.u(this.f, s);
            this.h = t0.q(t0.a(this.e), v3);
            this.i = t0;
        }
        q0.Y(0xB8, v1);
        q0.W(this.h, v1 + 1);
        return v1;
    }
}

