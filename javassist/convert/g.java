package javassist.convert;

import javassist.b;
import javassist.bytecode.h0;
import javassist.bytecode.i0;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.l;

public final class g extends k {
    private int b;
    private String c;
    private String d;
    private String e;

    public g(k k0, String s, String s1, String s2) {
        super(k0);
        this.c = s;
        this.d = s1;
        this.e = s2;
    }

    @Override  // javassist.convert.k
    public void f(t t0, p p0) {
        this.b = 0;
    }

    @Override  // javassist.convert.k
    public int g(l l0, int v, q q0, t t0) throws b {
        int v1 = q0.f(v);
        if(v1 == 0xBB) {
            if(t0.A(q0.T(v + 1)).equals(this.c)) {
                if(q0.f(v + 3) != 89) {
                    throw new b("NEW followed by no DUP was found");
                }
                q0.Y(0, v);
                q0.Y(0, v + 1);
                q0.Y(0, v + 2);
                q0.Y(0, v + 3);
                ++this.b;
                i0 i00 = (i0)q0.i().x("StackMapTable");
                if(i00 != null) {
                    i00.w(v);
                }
                h0 h00 = (h0)q0.i().x("StackMap");
                if(h00 != null) {
                    h00.w(v);
                    return v;
                }
            }
        }
        else if(v1 == 0xB7) {
            int v2 = q0.T(v + 1);
            int v3 = t0.q0(this.c, v2);
            if(v3 != 0 && this.b > 0) {
                int v4 = this.h(v3, t0);
                q0.Y(0xB8, v);
                q0.W(v4, v + 1);
                --this.b;
            }
        }
        return v;
    }

    private int h(int v, t t0) {
        return t0.q(t0.a(this.d), t0.t(t0.x(this.e), t0.x(w.d(this.c, t0.p0(v)))));
    }
}

