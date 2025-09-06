package javassist.convert;

import javassist.b;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.l;

public final class h extends k {
    private int b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;

    public h(k k0, String s, String s1) {
        super(k0);
        this.c = s;
        this.d = s1;
    }

    @Override  // javassist.convert.k
    public void f(t t0, p p0) {
        this.b = 0;
        this.g = 0;
        this.f = 0;
        this.e = 0;
    }

    @Override  // javassist.convert.k
    public int g(l l0, int v, q q0, t t0) throws b {
        int v1 = q0.f(v);
        if(v1 == 0xBB) {
            if(t0.A(q0.T(v + 1)).equals(this.c)) {
                if(q0.f(v + 3) != 89) {
                    throw new b("NEW followed by no DUP was found");
                }
                if(this.e == 0) {
                    this.e = t0.a(this.d);
                }
                q0.W(this.e, v + 1);
                ++this.b;
                return v;
            }
        }
        else if(v1 == 0xB7) {
            int v2 = q0.T(v + 1);
            if(t0.q0(this.c, v2) != 0 && this.b > 0) {
                int v3 = t0.f0(v2);
                if(this.f != v3) {
                    this.f = v3;
                    this.g = t0.q(this.e, v3);
                }
                q0.W(this.g, v + 1);
                --this.b;
            }
        }
        return v;
    }
}

