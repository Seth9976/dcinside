package javassist.bytecode.analysis;

import javassist.E;
import javassist.l;

public class g extends k {
    private h u;
    private int v;

    public g(h h0, int v) {
        super(null);
        this.u = h0;
        this.v = v;
    }

    // 去混淆评级： 低(20)
    @Override  // javassist.bytecode.analysis.k
    public boolean equals(Object object0) {
        return object0 instanceof g ? this.u.equals(((g)object0).u) && this.v == ((g)object0).v : false;
    }

    @Override  // javassist.bytecode.analysis.k
    public int hashCode() {
        return this.u.hashCode() + this.v;
    }

    @Override  // javassist.bytecode.analysis.k
    public k k() {
        int v = this.v;
        return v == 1 ? this.u : new g(this.u, v - 1);
    }

    @Override  // javassist.bytecode.analysis.k
    public l l() {
        l l0 = this.u.l();
        if(l0 == null) {
            return null;
        }
        javassist.g g0 = l0.w();
        if(g0 == null) {
            g0 = javassist.g.T();
        }
        String s = this.a(l0.X(), this.v);
        try {
            return g0.s(s);
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
    }

    @Override  // javassist.bytecode.analysis.k
    public int n() {
        return this.v;
    }

    @Override  // javassist.bytecode.analysis.k
    public int p() {
        return 1;
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean q() {
        return true;
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean r(k k0) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override  // javassist.bytecode.analysis.k
    public boolean s() {
        return true;
    }

    @Override  // javassist.bytecode.analysis.k
    public String toString() {
        return this.a(this.u.toString(), this.v);
    }

    @Override  // javassist.bytecode.analysis.k
    boolean y() {
        return this.u.y();
    }

    public boolean z(k k0) {
        k k1 = k.q;
        if(k.c(k0.l(), k1.l())) {
            return true;
        }
        k k2 = k.s;
        if(k.c(k0.l(), k2.l())) {
            return true;
        }
        k k3 = k.r;
        if(k.c(k0.l(), k3.l())) {
            return true;
        }
        if(!k0.q()) {
            return false;
        }
        k k4 = this.o(k0);
        int v = k0.n();
        int v1 = this.v;
        if(v > v1) {
            return false;
        }
        if(v < v1) {
            if(k.c(k4.l(), k1.l())) {
                return true;
            }
            return k.c(k4.l(), k2.l()) ? true : k.c(k4.l(), k3.l());
        }
        return this.u.B(k4);
    }
}

