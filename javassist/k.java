package javassist;

import javassist.bytecode.C;
import javassist.bytecode.L.a;
import javassist.bytecode.L;
import javassist.bytecode.M;
import javassist.bytecode.N;
import javassist.bytecode.T;
import javassist.bytecode.e0;
import javassist.bytecode.e;
import javassist.bytecode.f0;
import javassist.bytecode.h0;
import javassist.bytecode.i0;
import javassist.bytecode.j;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.compiler.c;
import javassist.compiler.d;

public abstract class k extends p {
    protected T c;

    protected k(l l0, T t0) {
        super(l0);
        this.c = t0;
    }

    public l[] A() throws E {
        C c0 = this.c.i();
        if(c0 == null) {
            return this.b.w().t(null);
        }
        String[] arr_s = c0.w();
        return this.b.w().t(arr_s);
    }

    public abstract String B();

    public T C() {
        this.b.g();
        return this.c;
    }

    public T D() {
        return this.c;
    }

    public Object[][] E() throws ClassNotFoundException {
        return this.F(false);
    }

    Object[][] F(boolean z) throws ClassNotFoundException {
        T t0 = this.D();
        e0 e00 = (e0)t0.d("RuntimeInvisibleParameterAnnotations");
        e0 e01 = (e0)t0.d("RuntimeVisibleParameterAnnotations");
        return m.C1(z, this.f().w(), e00, e01, t0);
    }

    public l[] G() throws E {
        return w.i(this.c.h(), this.b.w());
    }

    l H() throws E {
        return w.j(this.c.h(), this.b.w());
    }

    int I(javassist.bytecode.p p0) throws b {
        return 0;
    }

    public void J(String s) throws b {
        this.K(s, false);
    }

    public void K(String s, boolean z) throws b {
        int v7;
        l l0 = this.b;
        l0.g();
        t t0 = this.c.g();
        javassist.bytecode.p p0 = this.c.f();
        if(p0 == null) {
            throw new b("no method body");
        }
        q q0 = p0.G();
        boolean z1 = true;
        j j0 = new j(t0, 0, p0.D() + 1);
        j0.S0(p0.E() + 1);
        d d0 = new d(j0, l0);
        try {
            d0.l(p0, d0.n(this.G(), D.l(this.h())));
            l l1 = this.H();
            int v = d0.q(l1, true);
            d0.k(p0, 0);
            int v1 = this.M(z, j0, l1, v, d0, s);
            int v2 = q0.j();
            if(z) {
                p0.C().a(this.I(p0), v2, v2, 0);
            }
            int v3 = 0;
            int v4 = 0;
            while(q0.l()) {
                int v5 = q0.J();
                if(v5 >= v2) {
                    break;
                }
                switch(q0.f(v5)) {
                    case 0xAC: 
                    case 0xAD: 
                    case 0xAE: 
                    case 0xAF: 
                    case 0xB0: 
                    case 0xB1: {
                        if(z1) {
                            v3 = this.L(j0, d0, s, t0, l1, v);
                            int v6 = q0.b(j0.E0());
                            q0.c(j0.G0(), v6);
                            v4 = q0.j() - v3;
                            v1 = v4 - v6;
                            v7 = v5;
                            z1 = false;
                        }
                        else {
                            v7 = v5;
                        }
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                this.R(q0, v4, v7);
                v4 = q0.j() - v3;
                v2 = v4 - v1;
            }
            if(z1) {
                q0.c(j0.G0(), q0.b(j0.E0()));
            }
            p0.L(j0.I0());
            p0.K(j0.H0());
            this.c.t(l0.w(), l0.u());
            return;
        }
        catch(E e0) {
        }
        catch(c c0) {
            throw new b(c0);
        }
        catch(e e1) {
            throw new b(e1);
        }
        throw new b(e0);
    }

    private int L(j j0, d d0, String s, t t0, l l0, int v) throws c {
        int v1 = j0.D0();
        if(l0 == l.m) {
            j0.s0(1);
            j0.n(v);
            d0.g(s);
            j0.s0(0xB1);
            if(j0.H0() < 1) {
                j0.P0(1);
                return j0.D0() - v1;
            }
        }
        else {
            j0.C0(v, l0);
            d0.g(s);
            j0.j0(v, l0);
            if(l0.p0()) {
                j0.s0(((javassist.w)l0).Z0());
                return j0.D0() - v1;
            }
            j0.s0(0xB0);
        }
        return j0.D0() - v1;
    }

    private int M(boolean z, j j0, l l0, int v, d d0, String s) throws c {
        if(!z) {
            return 0;
        }
        int v1 = j0.H0();
        j0.L0(1);
        int v2 = j0.D0();
        j0.n(v1);
        if(l0.p0()) {
            int v3 = ((javassist.w)l0).W0();
            if(v3 == 68) {
                j0.r(0.0);
                j0.t(v);
            }
            else {
                switch(v3) {
                    case 70: {
                        j0.x(0.0f);
                        j0.z(v);
                        break;
                    }
                    case 74: {
                        j0.d0(0L);
                        j0.l0(v);
                        break;
                    }
                    case 86: {
                        j0.s0(1);
                        j0.n(v);
                        break;
                    }
                    default: {
                        j0.E(0);
                        j0.c0(v);
                    }
                }
            }
        }
        else {
            j0.s0(1);
            j0.n(v);
        }
        d0.g(s);
        j0.k(v1);
        j0.s0(0xBF);
        return j0.D0() - v2;
    }

    public int N(int v, String s) throws b {
        return this.O(v, true, s);
    }

    public int O(int v, boolean z, String s) throws b {
        javassist.bytecode.p p0 = this.c.f();
        if(p0 == null) {
            throw new b("no method body");
        }
        L l0 = (L)p0.x("LineNumberTable");
        if(l0 == null) {
            throw new b("no line number info");
        }
        a l$a0 = l0.y(v);
        int v1 = l$a0.b;
        int v2 = l$a0.a;
        if(!z) {
            return v1;
        }
        l l1 = this.b;
        l1.g();
        q q0 = p0.G();
        d d0 = new d(l1);
        try {
            d0.k(p0, v2);
            d0.n(this.G(), D.l(this.h()));
            d0.v(p0.D());
            d0.g(s);
            j j0 = d0.h();
            int v3 = j0.I0();
            p0.K(j0.H0());
            if(v3 > p0.E()) {
                p0.L(v3);
            }
            q0.o(j0.G0(), q0.q(v2, j0.E0()));
            this.c.t(l1.w(), l1.u());
            return v1;
        }
        catch(E e0) {
        }
        catch(c c0) {
            throw new b(c0);
        }
        catch(e e1) {
            throw new b(e1);
        }
        throw new b(e0);
    }

    public void P(String s) throws b {
        this.Q(s, true);
    }

    private void Q(String s, boolean z) throws b {
        l l0 = this.b;
        l0.g();
        javassist.bytecode.p p0 = this.c.f();
        if(p0 == null) {
            throw new b("no method body");
        }
        q q0 = p0.G();
        d d0 = new d(l0);
        try {
            d0.l(p0, d0.n(this.G(), D.l(this.h())));
            d0.k(p0, 0);
            d0.q(this.H(), false);
            d0.g(s);
            j j0 = d0.h();
            int v = j0.I0();
            int v1 = j0.H0();
            if(v > p0.E()) {
                p0.L(v);
            }
            if(v1 > p0.D()) {
                p0.K(v1);
            }
            q0.o(j0.G0(), q0.r(j0.E0()));
            if(z) {
                this.c.t(l0.w(), l0.u());
            }
            return;
        }
        catch(E e0) {
        }
        catch(c c0) {
            throw new b(c0);
        }
        catch(e e1) {
            throw new b(e1);
        }
        throw new b(e0);
    }

    private void R(q q0, int v, int v1) throws e {
        q0.N(v);
        q0.Y(0, v1);
        boolean z = v + 2 - v1 > 0x7FFF;
        javassist.bytecode.q.d q$d0 = q0.A(v1, (z ? 4 : 2), false);
        int v2 = q$d0.a + q$d0.b - (z ? 4 : 2);
        int v3 = q0.k() - v2;
        if(z) {
            q0.Y(200, v2);
            q0.X(v3, v2 + 1);
            return;
        }
        if(v3 <= 0x7FFF) {
            q0.Y(0xA7, v2);
            q0.W(v3, v2 + 1);
            return;
        }
        if(q$d0.b < 4) {
            javassist.bytecode.q.d q$d1 = q0.A(q$d0.a, 2, false);
            v2 = q$d1.a + q$d1.b + q$d0.b - 4;
        }
        q0.Y(200, v2);
        q0.X(q0.k() - v2, v2 + 1);
    }

    public void S(l l0) throws b {
        this.b.g();
        String s = this.c.h();
        String s1 = w.l(l0, s);
        try {
            this.w(!D.l(this.h()), l0, s);
        }
        catch(e e0) {
            throw new b(e0);
        }
        this.c.z(s1);
    }

    public void T(i i0) throws b {
        this.b.g();
        t t0 = this.c.g();
        i0.a(this.f(), this.c, t0);
    }

    public void U(javassist.expr.d d0) throws b {
        if(this.b.m0()) {
            this.b.g();
        }
        if(d0.a(this.b, this.c)) {
            this.b.g();
        }
    }

    public abstract boolean V();

    public void W(String s) throws b {
        this.X(s, null, null);
    }

    public void X(String s, String s1, String s2) throws b {
        l l0 = this.b;
        l0.g();
        try {
            d d0 = new d(l0);
            if(s2 != null) {
                d0.o(s1, s2);
            }
            j j0 = d0.b(this, s);
            this.c.y(j0.T0());
            this.c.x(this.c.c() & 0xFFFFFBFF);
            this.c.t(l0.w(), l0.u());
            this.b.w0();
            return;
        }
        catch(c c0) {
        }
        catch(e e0) {
            throw new b(e0);
        }
        throw new b(c0);
    }

    static void Y(l l0, T t0, l l1, T t1, javassist.d d0) throws b {
        l1.g();
        javassist.d d1 = new javassist.d(d0);
        d1.d(l0.X(), l1.X());
        try {
            javassist.bytecode.p p0 = t0.f();
            if(p0 != null) {
                t1.y(((javassist.bytecode.p)p0.a(t1.g(), d1)));
            }
        }
        catch(javassist.bytecode.p.b p$b0) {
            throw new b(p$b0);
        }
        t1.x(t1.c() & 0xFFFFFBFF);
        l1.w0();
    }

    public void Z(l[] arr_l) throws E {
        this.b.g();
        if(arr_l != null && arr_l.length != 0) {
            String[] arr_s = new String[arr_l.length];
            for(int v = 0; v < arr_l.length; ++v) {
                arr_s[v] = arr_l[v].X();
            }
            C c0 = this.c.i();
            if(c0 == null) {
                c0 = new C(this.c.g());
                this.c.A(c0);
            }
            c0.y(arr_s);
            return;
        }
        this.c.w();
    }

    @Override  // javassist.p
    protected void a(StringBuffer stringBuffer0) {
        stringBuffer0.append(' ');
        stringBuffer0.append(this.i());
        stringBuffer0.append(' ');
        stringBuffer0.append(this.c.h());
    }

    public void a0(String s) throws b {
        l l0 = this.b;
        l0.g();
        g g0 = l0.w();
        int v = 0;
        try {
            while(true) {
                l0.E("_cflow$" + v);
                ++v;
            }
        }
        catch(E unused_ex) {
            g0.t1(s, this.b.X(), "_cflow$" + v);
            try {
                l l1 = g0.s("javassist.runtime.Cflow");
                o o0 = new o(l1, "_cflow$" + v, l0);
                o0.q(9);
                l0.d(o0, f.g(l1));
                this.Q("_cflow$" + v + ".enter();", false);
                this.K("_cflow$" + v + ".exit();", true);
            }
            catch(E e0) {
                throw new b(e0);
            }
        }
    }

    @Override  // javassist.p
    public Object b(Class class0) throws ClassNotFoundException {
        T t0 = this.D();
        javassist.bytecode.c c0 = (javassist.bytecode.c)t0.d("RuntimeInvisibleAnnotations");
        javassist.bytecode.c c1 = (javassist.bytecode.c)t0.d("RuntimeVisibleAnnotations");
        return m.Y0(class0, this.f().w(), c0, c1);
    }

    @Override  // javassist.p
    public Object[] c() throws ClassNotFoundException {
        return this.y(false);
    }

    @Override  // javassist.p
    public byte[] d(String s) {
        javassist.bytecode.d d0 = this.c.d(s);
        return d0 == null ? null : d0.c();
    }

    @Override  // javassist.p
    public Object[] e() {
        try {
            return this.y(true);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Unexpected exception", classNotFoundException0);
        }
    }

    @Override  // javassist.p
    public String g() {
        f0 f00 = (f0)this.c.d("Signature");
        return f00 == null ? null : f00.v();
    }

    @Override  // javassist.p
    public int h() {
        return javassist.bytecode.a.k(this.c.c());
    }

    @Override  // javassist.p
    public String j() {
        return this.c.h();
    }

    @Override  // javassist.p
    public boolean l(String s) {
        T t0 = this.D();
        javassist.bytecode.c c0 = (javassist.bytecode.c)t0.d("RuntimeInvisibleAnnotations");
        javassist.bytecode.c c1 = (javassist.bytecode.c)t0.d("RuntimeVisibleAnnotations");
        return m.j1(s, this.f().w(), c0, c1);
    }

    @Override  // javassist.p
    public void o(String s, byte[] arr_b) {
        this.b.g();
        this.c.a(new javassist.bytecode.d(this.c.g(), s, arr_b));
    }

    @Override  // javassist.p
    public void p(String s) {
        this.b.g();
        this.c.a(new f0(this.c.g(), s));
    }

    @Override  // javassist.p
    public void q(int v) {
        this.b.g();
        this.c.x(v);
    }

    public void s(String s, l l0) throws b {
        this.t(s, l0, "$e");
    }

    public void t(String s, l l0, String s1) throws b {
        l l1 = this.b;
        l1.g();
        t t0 = this.c.g();
        javassist.bytecode.p p0 = this.c.f();
        q q0 = p0.G();
        j j0 = new j(t0, p0.E(), p0.D());
        j0.S0(1);
        d d0 = new d(j0, l1);
        try {
            d0.n(this.G(), D.l(this.h()));
            j0.n(d0.u(l0, s1));
            d0.g(s);
            int v = j0.I0();
            int v1 = j0.H0();
            if(v > p0.E()) {
                p0.L(v);
            }
            if(v1 > p0.D()) {
                p0.K(v1);
            }
            int v2 = q0.j();
            int v3 = q0.b(j0.E0());
            int v4 = t0.b(l0);
            p0.C().a(this.I(p0), v2, v2, v4);
            q0.c(j0.G0(), v3);
            this.c.t(l1.w(), l1.u());
            return;
        }
        catch(E e0) {
        }
        catch(c c0) {
            throw new b(c0);
        }
        catch(e e1) {
            throw new b(e1);
        }
        throw new b(e0);
    }

    public void u(String s, l l0) throws b {
        this.b.g();
        t t0 = this.c.g();
        javassist.bytecode.p p0 = this.c.f();
        if(p0 == null) {
            throw new b("no method body");
        }
        M m0 = (M)p0.x("LocalVariableTable");
        if(m0 == null) {
            m0 = new M(t0);
            p0.y().add(m0);
        }
        int v = p0.D();
        String s1 = w.o(l0);
        m0.t(0, p0.A(), t0.x(s), t0.x(s1), v);
        p0.K(v + w.e(s1));
    }

    public void v(l l0) throws b {
        this.b.g();
        String s = this.c.h();
        String s1 = w.b(l0, s);
        boolean z = D.l(this.h());
        try {
            this.w(!z + w.s(s), l0, s);
        }
        catch(e e0) {
            throw new b(e0);
        }
        this.c.z(s1);
    }

    private void w(int v, l l0, String s) throws e {
        int v3;
        int v2;
        int v1;
        javassist.bytecode.p p0 = this.c.f();
        if(p0 != null) {
            if(l0.p0()) {
                v1 = ((javassist.w)l0).V0();
                v2 = ((javassist.w)l0).W0();
                v3 = 0;
            }
            else {
                v3 = this.c.g().b(l0);
                v1 = 1;
                v2 = 76;
            }
            p0.F(v, v1);
            M m0 = (M)p0.x("LocalVariableTable");
            if(m0 != null) {
                m0.C(v, v1);
            }
            N n0 = (N)p0.x("LocalVariableTypeTable");
            if(n0 != null) {
                n0.C(v, v1);
            }
            i0 i00 = (i0)p0.x("StackMapTable");
            if(i00 != null) {
                i00.t(v, i0.z(((char)v2)), v3);
            }
            h0 h00 = (h0)p0.x("StackMap");
            if(h00 != null) {
                h00.t(v, i0.z(((char)v2)), v3);
            }
        }
    }

    void x(k k0, boolean z, javassist.d d0) throws b {
        String s1;
        l l0 = this.b;
        T t0 = k0.c;
        l l1 = k0.f();
        t t1 = l0.u().l();
        javassist.d d1 = new javassist.d(d0);
        d1.d(l1.X(), l0.X());
        try {
            l l2 = l1.c0();
            l l3 = l0.c0();
            boolean z1 = false;
            if(l2 == null || l3 == null) {
                s1 = null;
            }
            else {
                String s = l2.X();
                s1 = l3.X();
                if(!s.equals(s1)) {
                    if(s.equals("java.lang.Object")) {
                        z1 = true;
                    }
                    else {
                        d1.g(s, s1);
                    }
                }
            }
            T t2 = new T(t1, t0.k(), t0, d1);
            this.c = t2;
            if(z && z1) {
                t2.C(s1);
            }
            return;
        }
        catch(E e0) {
        }
        catch(e e1) {
            throw new b(e1);
        }
        throw new b(e0);
    }

    private Object[] y(boolean z) throws ClassNotFoundException {
        T t0 = this.D();
        javassist.bytecode.c c0 = (javassist.bytecode.c)t0.d("RuntimeInvisibleAnnotations");
        javassist.bytecode.c c1 = (javassist.bytecode.c)t0.d("RuntimeVisibleAnnotations");
        return m.B1(z, this.f().w(), c0, c1);
    }

    public Object[][] z() {
        try {
            return this.F(true);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Unexpected exception", classNotFoundException0);
        }
    }
}

