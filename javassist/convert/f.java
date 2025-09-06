package javassist.convert;

import javassist.D;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.l;
import javassist.o;

public final class f extends k {
    private String b;
    private String c;
    private String d;
    private l e;
    private boolean f;
    private int g;
    private t h;

    public f(k k0, o o0, String s, String s1) {
        super(k0);
        this.e = o0.f();
        this.d = o0.i();
        this.f = D.i(o0.h());
        this.b = s;
        this.c = s1;
        this.h = null;
    }

    @Override  // javassist.convert.k
    public void f(t t0, p p0) {
        if(this.h != t0) {
            this.g = 0;
        }
    }

    @Override  // javassist.convert.k
    public int g(l l0, int v, q q0, t t0) {
        switch(q0.f(v)) {
            case 0xB2: 
            case 0xB3: 
            case 180: 
            case 0xB5: {
                int v1 = q0.T(v + 1);
                String s = i.h(l0.w(), t0, this.e, this.d, this.f, v1);
                if(s != null) {
                    if(this.g == 0) {
                        int v2 = t0.u(this.c, s);
                        this.g = t0.e(t0.a(this.b), v2);
                        this.h = t0;
                    }
                    q0.W(this.g, v + 1);
                }
                return v;
            }
            default: {
                return v;
            }
        }
    }
}

