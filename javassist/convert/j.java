package javassist.convert;

import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.l;
import javassist.o;

public final class j extends i {
    public j(k k0, o o0, String s, String s1) {
        super(k0, o0, s, s1);
    }

    @Override  // javassist.convert.i
    public int g(l l0, int v, q q0, t t0) throws e {
        int v1 = q0.f(v);
        if(v1 == 0xB3 || v1 == 0xB5) {
            int v2 = q0.T(v + 1);
            String s = i.h(l0.w(), t0, this.c, this.b, this.d, v2);
            if(s != null) {
                if(v1 == 0xB3) {
                    p p0 = q0.i();
                    q0.H(v);
                    switch(s.charAt(0)) {
                        case 68: 
                        case 74: {
                            int v4 = q0.w(3);
                            q0.Y(1, v4);
                            q0.Y(91, v4 + 1);
                            q0.Y(87, v4 + 2);
                            p0.L(p0.E() + 2);
                            break;
                        }
                        default: {
                            int v3 = q0.w(2);
                            q0.Y(1, v3);
                            q0.Y(0x5F, v3 + 1);
                            p0.L(p0.E() + 1);
                        }
                    }
                    v = q0.J();
                }
                int v5 = t0.r(t0.a(this.e), this.f, "(Ljava/lang/Object;" + s + ")V");
                q0.Y(0xB8, v);
                q0.W(v5, v + 1);
            }
        }
        return v;
    }
}

