package javassist;

import java.io.DataOutputStream;
import java.io.IOException;
import javassist.bytecode.k;

class r extends m {
    protected boolean D;

    r(String s, g g0, boolean z, l l0) {
        super(s, g0);
        this.p = true;
        k k0 = new k(z, s, (z || l0 == null ? null : l0.X()));
        this.t = k0;
        if(z && l0 != null) {
            k0.M(new String[]{l0.X()});
        }
        this.F0(D.u(this.W()));
        this.D = z;
    }

    public void E1() throws b, E {
        l l0 = this.c0();
        n[] arr_n = l0.D();
        int v1 = 0;
        for(int v = 0; v < arr_n.length; ++v) {
            n n0 = arr_n[v];
            int v2 = n0.h();
            if(this.F1(v2, l0)) {
                n n1 = s.f(n0.G(), n0.A(), this);
                n1.q(v2 & 7);
                this.a(n1);
                ++v1;
            }
        }
        if(v1 < 1) {
            throw new b("no inheritable constructor in " + l0.X());
        }
    }

    private boolean F1(int v, l l0) {
        if(D.i(v)) {
            return false;
        }
        if(D.h(v)) {
            String s = this.Z();
            String s1 = l0.Z();
            return s == null ? s1 == null : s.equals(s1);
        }
        return true;
    }

    @Override  // javassist.m
    public void L0(DataOutputStream dataOutputStream0) throws b, IOException {
        if(!this.D) {
            try {
                this.E1();
                this.D = true;
            }
            catch(E e0) {
                throw new b(e0);
            }
        }
        super.L0(dataOutputStream0);
    }

    @Override  // javassist.m
    public void a(n n0) throws b {
        this.D = true;
        super.a(n0);
    }

    @Override  // javassist.m
    protected void m(StringBuffer stringBuffer0) {
        if(this.D) {
            stringBuffer0.append("hasConstructor ");
        }
        super.m(stringBuffer0);
    }
}

