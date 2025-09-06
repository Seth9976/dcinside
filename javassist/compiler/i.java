package javassist.compiler;

import java.util.ArrayList;
import java.util.List;
import javassist.E;
import javassist.bytecode.D;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.compiler.ast.c;
import javassist.compiler.ast.f;
import javassist.compiler.ast.k;
import javassist.compiler.ast.p;
import javassist.compiler.ast.q;
import javassist.compiler.ast.s;
import javassist.compiler.ast.v;
import javassist.g;
import javassist.l;
import javassist.o;

public class i extends b {
    static class a extends javassist.compiler.b.b {
        int b;
        int c;

        a(b b0, int[] arr_v) {
            super(b0);
            this.c = arr_v[0];
            this.b = arr_v[1];
        }

        @Override  // javassist.compiler.b$b
        protected boolean a(j j0, int v) {
            switch(v) {
                case 0xAC: {
                    j0.c0(this.b);
                    break;
                }
                case 0xAD: {
                    j0.l0(this.b);
                    break;
                }
                case 0xAE: {
                    j0.z(this.b);
                    break;
                }
                case 0xAF: {
                    j0.t(this.b);
                    break;
                }
                case 0xB0: {
                    j0.n(this.b);
                    break;
                }
                case 0xB1: {
                    break;
                }
                default: {
                    throw new RuntimeException("fatal");
                }
            }
            j0.s0(0xA7);
            j0.G(this.c - j0.D0() + 3);
            return true;
        }
    }

    static class javassist.compiler.i.b extends javassist.compiler.b.b {
        List b;
        b c;
        int d;

        javassist.compiler.i.b(b b0) {
            super(b0);
            this.b = new ArrayList();
            this.c = b0;
            this.d = -1;
        }

        @Override  // javassist.compiler.b$b
        protected boolean a(j j0, int v) {
            switch(v) {
                case 0xAC: {
                    j0.c0(this.c(1));
                    this.d(j0);
                    j0.F(this.d);
                    return false;
                }
                case 0xAD: {
                    j0.l0(this.c(2));
                    this.d(j0);
                    j0.i0(this.d);
                    return false;
                }
                case 0xAE: {
                    j0.z(this.c(1));
                    this.d(j0);
                    j0.y(this.d);
                    return false;
                }
                case 0xAF: {
                    j0.t(this.c(2));
                    this.d(j0);
                    j0.s(this.d);
                    return false;
                }
                case 0xB0: {
                    j0.n(this.c(1));
                    this.d(j0);
                    j0.k(this.d);
                    return false;
                }
                case 0xB1: {
                    this.d(j0);
                    return false;
                }
                default: {
                    throw new RuntimeException("fatal");
                }
            }
        }

        private int c(int v) {
            if(this.d < 0) {
                this.d = this.c.u0();
                this.c.y0(v);
            }
            return this.d;
        }

        private void d(j j0) {
            j0.s0(0xA7);
            this.b.add(new int[]{j0.D0(), this.d});
            j0.G(0);
        }
    }

    protected T A;
    protected boolean B;
    protected javassist.compiler.j y;
    protected l z;

    public i(j j0, l l0, g g0) {
        super(j0);
        this.y = new javassist.compiler.j(g0);
        this.z = l0;
        this.A = null;
    }

    @Override  // javassist.compiler.b
    protected void B(c c0, int v, int v1, String s) throws javassist.compiler.c {
        this.b1(v, null, s, c0);
    }

    @Override  // javassist.compiler.b
    protected void G(String s) throws javassist.compiler.c {
        if(this.i1() < 49) {
            super.G(s);
            return;
        }
        this.a.e0(this.a.F0().a(s));
    }

    @Override  // javassist.compiler.b
    protected void H(k k0, int v, javassist.compiler.ast.b b0, javassist.compiler.ast.b b1, boolean z) throws javassist.compiler.c {
        int v1 = 0;
        o o0 = this.f1(b0, false);
        boolean z1 = this.B;
        int v2 = 89;
        if(v != 61 && !z1) {
            this.a.s0(89);
        }
        if(v == 61) {
            D d0 = o0.v();
            this.p1(d0);
            if(this.l1(o0, d0) == null) {
                v1 = this.R0(o0, d0);
            }
        }
        else {
            v1 = this.V0(o0, z1);
        }
        int v3 = this.i;
        int v4 = this.j;
        String s = this.k;
        this.C(k0, v, b1, v3, v4, s);
        boolean z2 = b.B0(v3, v4);
        if(z) {
            if(!z1) {
                v2 = z2 ? 93 : 90;
            }
            else if(z2) {
                v2 = 92;
            }
            this.a.s0(v2);
        }
        this.U0(o0, z1, v1, z2);
        this.i = v3;
        this.j = v4;
        this.k = s;
    }

    @Override  // javassist.compiler.b
    protected void I(int v, boolean z, javassist.compiler.ast.b b0, k k0, boolean z1) throws javassist.compiler.c {
        o o0 = this.f1(b0, false);
        boolean z2 = this.B;
        int v1 = 89;
        if(!z2) {
            this.a.s0(89);
        }
        int v2 = this.V0(o0, z2);
        boolean z3 = b.B0(this.i, this.j);
        if(!z2) {
            v1 = z3 ? 93 : 90;
        }
        else if(z3) {
            v1 = 92;
        }
        this.P(v1, z1, v, z, k0);
        this.U0(o0, z2, v2, z3);
    }

    @Override  // javassist.compiler.b
    protected void J(javassist.compiler.ast.b b0) throws javassist.compiler.c {
        o o0 = this.f1(b0, true);
        if(o0 == null) {
            this.T0(b0);
            return;
        }
        boolean z = this.B;
        javassist.compiler.ast.b b1 = r.S(o0);
        if(b1 == null) {
            this.V0(o0, z);
            return;
        }
        b1.a(this);
        this.p1(o0.v());
    }

    @Override  // javassist.compiler.b
    protected String J0(String s) throws javassist.compiler.c {
        return this.y.y(s);
    }

    @Override  // javassist.compiler.b
    protected String K0(javassist.compiler.ast.a a0) throws javassist.compiler.c {
        return this.y.x(a0);
    }

    private int R0(o o0, D d0) {
        t t0 = this.a.F0();
        return t0.f(t0.a(o0.f().X()), d0.i(), d0.h());
    }

    private void S0(List list0, javassist.compiler.ast.t t0) throws javassist.compiler.c {
        j j0 = this.a;
        for(Object object0: list0) {
            int v = ((int[])object0)[0];
            j0.U0(v, j0.D0() - v + 1);
            a i$a0 = new a(this, ((int[])object0));
            t0.a(this);
            i$a0.b(this);
            if(!this.d) {
                j0.s0(0xA7);
                j0.G(v + 3 - j0.D0());
            }
        }
    }

    private void T0(javassist.compiler.ast.b b0) throws javassist.compiler.c {
        if(this.j == 0) {
            throw new javassist.compiler.c(".length applied to a non array");
        }
        this.a.s0(190);
        this.i = 324;
        this.j = 0;
    }

    private void U0(o o0, boolean z, int v, boolean z1) throws javassist.compiler.c {
        int v1 = -2;
        if(v != 0) {
            if(z) {
                this.a.a(0xB3);
                j j0 = this.a;
                if(!z1) {
                    v1 = -1;
                }
                j0.K0(v1);
            }
            else {
                this.a.a(0xB5);
                j j1 = this.a;
                if(z1) {
                    v1 = -3;
                }
                j1.K0(v1);
            }
            this.a.G(v);
            return;
        }
        l l0 = o0.f();
        T t0 = l0.o().d(o0.v(), z);
        this.a.W(l0, t0.k(), t0.h());
    }

    private int V0(o o0, boolean z) throws javassist.compiler.c {
        D d0 = o0.v();
        boolean z1 = this.p1(d0);
        javassist.compiler.a a0 = this.l1(o0, d0);
        if(a0 != null) {
            T t0 = a0.c(d0, z);
            this.a.W(o0.f(), t0.k(), t0.h());
            return 0;
        }
        int v = this.R0(o0, d0);
        if(z) {
            this.a.a(0xB2);
            this.a.K0((z1 ? 2 : 1));
        }
        else {
            this.a.a(180);
            this.a.K0(((int)z1));
        }
        this.a.G(v);
        return v;
    }

    public void W0(javassist.compiler.ast.a a0, int[] arr_v, int[] arr_v1, String[] arr_s) throws javassist.compiler.c {
        int v = 0;
        while(a0 != null) {
            a0.i().a(this);
            arr_v[v] = this.i;
            arr_v1[v] = this.j;
            arr_s[v] = this.k;
            ++v;
            a0 = a0.q();
        }
    }

    @Override  // javassist.compiler.b
    protected void X(javassist.compiler.ast.t t0) throws javassist.compiler.c {
        j j0 = this.a;
        javassist.compiler.ast.t t1 = (javassist.compiler.ast.t)t0.b();
        if(t1 == null) {
            return;
        }
        javassist.compiler.ast.a a0 = (javassist.compiler.ast.a)t0.c().b();
        javassist.compiler.ast.t t2 = (javassist.compiler.ast.t)t0.c().c().b();
        ArrayList arrayList0 = new ArrayList();
        javassist.compiler.i.b i$b0 = t2 == null ? null : new javassist.compiler.i.b(this);
        int v = j0.D0();
        t1.a(this);
        int v1 = j0.D0();
        if(v == v1) {
            throw new javassist.compiler.c("empty try block");
        }
        int v2 = !this.d;
        if(!this.d) {
            j0.s0(0xA7);
            arrayList0.add(j0.D0());
            j0.G(0);
        }
        int v3 = this.u0();
        this.y0(1);
        while(a0 != null) {
            s s0 = (s)a0.i();
            a0 = a0.q();
            javassist.compiler.ast.i i0 = (javassist.compiler.ast.i)s0.b();
            javassist.compiler.ast.t t3 = (javassist.compiler.ast.t)s0.c();
            i0.E(v3);
            l l0 = this.y.q(i0.x());
            i0.D(javassist.compiler.j.k(l0.X()));
            j0.w(v, v1, j0.D0(), l0);
            j0.K0(1);
            j0.n(v3);
            this.d = false;
            if(t3 != null) {
                t3.a(this);
            }
            if(!this.d) {
                j0.s0(0xA7);
                arrayList0.add(j0.D0());
                j0.G(0);
                v2 = 1;
            }
        }
        if(t2 != null) {
            i$b0.b(this);
            int v4 = j0.D0();
            j0.u(v, v4, v4, 0);
            j0.K0(1);
            j0.n(v3);
            this.d = false;
            t2.a(this);
            if(!this.d) {
                j0.k(v3);
                j0.s0(0xBF);
            }
            this.S0(i$b0.b, t2);
        }
        this.I0(arrayList0, j0.D0());
        this.d = v2 ^ 1;
        if(t2 != null && v2 != 0) {
            t2.a(this);
        }
    }

    public void X0(l l0, String s, javassist.compiler.ast.a a0, boolean z, boolean z1, int v, javassist.compiler.j.a j$a0) throws javassist.compiler.c {
        boolean z2;
        int v1 = this.j1(a0);
        int[] arr_v = new int[v1];
        int[] arr_v1 = new int[v1];
        String[] arr_s = new String[v1];
        if(z || j$a0 == null || !j$a0.a()) {
            z2 = z;
        }
        else {
            this.a.s0(87);
            z2 = true;
        }
        this.W0(a0, arr_v, arr_v1, arr_s);
        javassist.compiler.j.a j$a1 = j$a0 == null ? this.y.w(l0, this.z, this.A, s, arr_v, arr_v1, arr_s) : j$a0;
        if(j$a1 == null) {
            throw new javassist.compiler.c((s.equals("<init>") ? "constructor not found" : "Method " + s + " not found in " + l0.X()));
        }
        this.Y0(l0, s, z2, z1, v, j$a1);
    }

    private void Y0(l l0, String s, boolean z, boolean z1, int v, javassist.compiler.j.a j$a0) throws javassist.compiler.c {
        l l1 = j$a0.a;
        T t0 = j$a0.b;
        String s1 = t0.h();
        int v1 = t0.c();
        boolean z2 = false;
        if(s.equals("<init>")) {
            if(l1 != l0) {
                throw new javassist.compiler.c("no such constructor: " + l0.X());
            }
            if(l1 != this.z && javassist.bytecode.a.c(v1)) {
                if(l1.t().p() >= 55) {
                    try {
                        l[] arr_l = l1.Y();
                        int v2 = 0;
                        while(v2 < arr_l.length) {
                            if(this.z == arr_l[v2]) {
                                goto label_17;
                            }
                            ++v2;
                        }
                    }
                    catch(E unused_ex) {
                    }
                }
                s1 = this.g1(s1, l1, t0);
                this.a.s0(1);
            }
        label_17:
            z1 = true;
        }
        else if(javassist.bytecode.a.c(v1)) {
            if(l1 == this.z) {
                z1 = true;
            }
            else {
                String s2 = (v1 & 8) == 0 ? w.k(l1.X(), s1) : s1;
                v1 = v1 & -8 | 8;
                s = this.h1(s, s1, s2, t0, l1);
                s1 = s2;
                z = true;
                z1 = false;
            }
        }
        if((v1 & 8) == 0) {
            if(z1) {
                this.a.Q(l0, s, s1);
                this.q1(s1, z, z2);
                return;
            }
            if(javassist.D.k(l1.W()) && l1.n0() == l0.n0()) {
                l0 = l1;
            }
            if(l0.n0()) {
                int v3 = w.s(s1);
                this.a.L(l0, s, s1, v3 + 1);
            }
            else if(!z) {
                this.a.a0(l0, s, s1);
            }
            else {
                throw new javassist.compiler.c(s + " is not static");
            }
        }
        else {
            if(!z) {
                if(v >= 0) {
                    this.a.h(v, 0);
                }
                else {
                    z2 = true;
                }
            }
            this.a.W(l1, s, s1);
            z = true;
        }
        this.q1(s1, z, z2);
    }

    protected void Z0(int v, javassist.compiler.ast.a a0, javassist.compiler.ast.a a1) throws javassist.compiler.c {
        String s1;
        int v1 = 0;
        while(a1 != null) {
            javassist.compiler.ast.b b0 = a1.i();
            if(b0 == null) {
                break;
            }
            ++v1;
            b0.a(this);
            if(this.i != 324) {
                throw new javassist.compiler.c("bad type for array size");
            }
            a1 = a1.q();
        }
        this.i = v;
        this.j = 0;
        if(v == 307) {
            String s = this.K0(a0);
            this.k = s;
            s1 = b.O0(s, 0);
        }
        else {
            s1 = b.P0(v, 0);
        }
        this.a.m0(s1, v1);
    }

    public void a1(javassist.compiler.ast.r r0) throws javassist.compiler.c {
        javassist.compiler.ast.a a0 = r0.s();
        javassist.compiler.ast.a a1 = r0.w();
        c c0 = r0.x();
        this.b1(r0.u(), a0.i(), javassist.compiler.ast.i.s(a1, '/'), c0);
    }

    @Override  // javassist.compiler.b
    public void b(c c0) throws javassist.compiler.c {
        throw new javassist.compiler.c("array initializer is not supported");
    }

    private void b1(int v, javassist.compiler.ast.b b0, String s, c c0) throws javassist.compiler.c {
        int v1;
        String s1;
        if(c0 == null) {
            if(b0 == null) {
                throw new javassist.compiler.c("no array size");
            }
            b0.a(this);
        }
        else {
            if(b0 != null) {
                throw new javassist.compiler.c("unnecessary array size specified for new");
            }
            this.a.E(0);
        }
        switch(v) {
            case 301: {
                v1 = 4;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 303: {
                v1 = 8;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 306: {
                v1 = 5;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 307: {
                s1 = this.J0(s);
                this.a.l(javassist.compiler.j.l(s1));
                break;
            }
            case 312: {
                v1 = 7;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 317: {
                v1 = 6;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 324: {
                v1 = 10;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 326: {
                v1 = 11;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            case 334: {
                v1 = 9;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
            default: {
                i.e1();
                v1 = 0;
                this.a.s0(0xBC);
                this.a.a(v1);
                s1 = null;
                break;
            }
        }
        this.i = v;
        this.j = 1;
        this.k = s1;
    }

    private static void c1() throws javassist.compiler.c {
        throw new javassist.compiler.c("bad l-value");
    }

    private static void d1() throws javassist.compiler.c {
        throw new javassist.compiler.c("bad method");
    }

    @Override  // javassist.compiler.b
    public void e(f f0) throws javassist.compiler.c {
        boolean z4;
        boolean z3;
        boolean z2;
        int v2;
        l l2;
        String s1;
        l l0 = null;
        javassist.compiler.ast.b b0 = f0.w();
        javassist.compiler.ast.b b1 = f0.x();
        javassist.compiler.j.a j$a0 = f0.B();
        boolean z = true;
        boolean z1 = false;
        int v = -1;
        if(b0 instanceof p) {
            String s = ((p)b0).g();
            l l1 = this.z;
            if(this.e || j$a0 != null && j$a0.a()) {
                s1 = s;
                l2 = l1;
                z2 = true;
                z3 = false;
                v2 = -1;
            }
            else {
                int v1 = this.a.D0();
                this.a.k(0);
                s1 = s;
                l2 = l1;
                v2 = v1;
                z2 = false;
                z3 = false;
            }
        }
        else if(b0 instanceof javassist.compiler.ast.o) {
            l l3 = this.z;
            if(this.e) {
                throw new javassist.compiler.c("a constructor cannot be static");
            }
            this.a.k(0);
            if(((javassist.compiler.ast.o)b0).g() == 0x150) {
                l3 = javassist.compiler.j.i(l3);
            }
            l2 = l3;
            s1 = "<init>";
            z2 = false;
            z3 = true;
            v2 = -1;
        }
        else if(b0 instanceof k) {
            String s2 = ((v)((k)b0).x()).g();
            int v3 = ((k)b0).r();
            if(v3 == 35) {
                l0 = this.y.n(((v)((k)b0).w()).g(), false);
            }
            else if(v3 == 46) {
                javassist.compiler.ast.b b2 = ((k)b0).w();
                String s3 = r.a0(b2);
                if(s3 == null) {
                    z4 = b2 instanceof javassist.compiler.ast.o && ((javassist.compiler.ast.o)b2).g() == 0x150;
                    try {
                        b2.a(this);
                    }
                    catch(javassist.compiler.k k0) {
                        if(k0.b() != b2) {
                            throw k0;
                        }
                        this.i = 307;
                        this.j = 0;
                        this.k = k0.c();
                        z1 = true;
                    }
                    if(this.j > 0) {
                        l0 = this.y.n("java.lang.Object", true);
                    }
                    else if(this.i == 307) {
                        l0 = this.y.q(this.k);
                    }
                    else {
                        i.d1();
                    }
                    z = z1;
                }
                else {
                    l0 = javassist.compiler.j.h(this.z, s3);
                    if(!this.e && (j$a0 == null || !j$a0.a())) {
                        v = this.a.D0();
                        this.a.k(0);
                        z = false;
                    }
                    z4 = true;
                }
                z1 = z4;
            }
            else {
                i.d1();
                z = false;
            }
            s1 = s2;
            z3 = z1;
            v2 = v;
            l2 = l0;
            z2 = z;
        }
        else {
            b.o0();
            l2 = null;
            s1 = null;
            z2 = false;
            z3 = false;
            v2 = -1;
        }
        this.X0(l2, s1, ((javassist.compiler.ast.a)b1), z2, z3, v2, j$a0);
    }

    private static void e1() throws javassist.compiler.c {
        throw new javassist.compiler.c("bad new expression");
    }

    protected o f1(javassist.compiler.ast.b b0, boolean z) throws javassist.compiler.c {
        o o1;
        o o0 = null;
        if(b0 instanceof p) {
            String s = ((p)b0).g();
            try {
                o1 = this.z.O(s);
            }
            catch(E unused_ex) {
                throw new javassist.compiler.k(s, b0);
            }
            boolean z1 = javassist.D.l(o1.h());
            if(!z1) {
                if(this.e) {
                    throw new javassist.compiler.c("not available in a static method: " + s);
                }
                this.a.k(0);
            }
            this.B = z1;
            return o1;
        }
        if(b0 instanceof k) {
            k k0 = (k)b0;
            int v = k0.r();
            if(v == 35) {
                o o2 = this.y.s(((v)k0.w()).g(), ((v)k0.x()));
                this.B = true;
                return o2;
            }
            if(v == 46) {
                try {
                    k0.w().a(this);
                    if(this.i != 307 || this.j != 0) {
                        if(z && this.j > 0 && ((v)k0.x()).g().equals("length")) {
                            return null;
                        }
                        i.c1();
                    }
                    else {
                        o0 = this.y.t(this.k, ((v)k0.x()));
                    }
                    boolean z2 = javassist.D.l(o0.h());
                    if(z2) {
                        this.a.s0(87);
                    }
                    this.B = z2;
                    return o0;
                }
                catch(javassist.compiler.k k1) {
                }
                if(k1.b() != k0.w()) {
                    throw k1;
                }
                v v1 = (v)k0.x();
                o o3 = this.y.u(k1.c(), v1, b0);
                this.B = true;
                return o3;
            }
        }
        i.c1();
        this.B = false;
        return null;
    }

    protected String g1(String s, l l0, T t0) throws javassist.compiler.c {
        if(this.m1(l0, this.z)) {
            javassist.compiler.a a0 = l0.o();
            if(a0 != null) {
                return a0.b(l0, s, t0);
            }
        }
        throw new javassist.compiler.c("the called constructor is private in " + l0.X());
    }

    protected String h1(String s, String s1, String s2, T t0, l l0) throws javassist.compiler.c {
        if(this.m1(l0, this.z)) {
            javassist.compiler.a a0 = l0.o();
            if(a0 != null) {
                return a0.e(s, s1, s2, t0);
            }
        }
        throw new javassist.compiler.c("Method " + s + " is private");
    }

    public int i1() {
        javassist.bytecode.k k0 = this.z.u();
        return k0 == null ? javassist.bytecode.k.y : k0.p();
    }

    public int j1(javassist.compiler.ast.a a0) {
        return javassist.compiler.ast.a.k(a0);
    }

    public l k1() {
        return this.z;
    }

    private javassist.compiler.a l1(o o0, D d0) throws javassist.compiler.c {
        if(javassist.bytecode.a.c(d0.c()) && o0.f() != this.z) {
            l l0 = o0.f();
            if(this.m1(l0, this.z)) {
                javassist.compiler.a a0 = l0.o();
                if(a0 != null) {
                    return a0;
                }
            }
            throw new javassist.compiler.c("Field " + o0.i() + " in " + l0.X() + " is private.");
        }
        return null;
    }

    private boolean m1(l l0, l l1) {
        while(l1 != null) {
            try {
                l1 = l1.L();
                if(l1 == l0) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            catch(E unused_ex) {
                break;
            }
        }
        return false;
    }

    public l[] n1(q q0) throws javassist.compiler.c {
        javassist.compiler.ast.a a0 = q0.u();
        if(a0 == null) {
            return new l[0];
        }
        l[] arr_l = new l[0];
        for(int v = 0; a0 != null; ++v) {
            arr_l[v] = this.y.o(((javassist.compiler.ast.i)a0.i()));
            a0 = a0.q();
        }
        return arr_l;
    }

    @Override  // javassist.compiler.b
    public void o(p p0) throws javassist.compiler.c {
        this.J(p0);
    }

    public l[] o1(q q0) throws javassist.compiler.c {
        javassist.compiler.ast.a a0 = q0.x();
        if(a0 == null) {
            return null;
        }
        l[] arr_l = new l[0];
        for(int v = 0; a0 != null; ++v) {
            arr_l[v] = this.y.r(((javassist.compiler.ast.a)a0.i()));
            a0 = a0.q();
        }
        return arr_l;
    }

    private boolean p1(D d0) throws javassist.compiler.c {
        String s = d0.h();
        int v = s.charAt(0);
        int v1 = 0;
        int v2 = 0;
        while(v == 91) {
            ++v1;
            ++v2;
            v = s.charAt(v2);
        }
        this.j = v1;
        this.i = javassist.compiler.j.b(((char)v));
        if(v == 76) {
            this.k = s.substring(v2 + 1, s.indexOf(59, v2 + 1));
            return false;
        }
        this.k = null;
        return v1 == 0 && (v == 68 || v == 74);
    }

    @Override  // javassist.compiler.b
    public void q(javassist.compiler.ast.r r0) throws javassist.compiler.c {
        if(r0.y()) {
            this.a1(r0);
            return;
        }
        l l0 = this.y.r(r0.w());
        String s = l0.X();
        javassist.compiler.ast.a a0 = r0.r();
        this.a.p0(s);
        this.a.s0(89);
        this.X0(l0, "<init>", a0, false, true, -1, null);
        this.i = 307;
        this.j = 0;
        this.k = javassist.compiler.j.k(s);
    }

    void q1(String s, boolean z, boolean z1) throws javassist.compiler.c {
        int v = s.indexOf(41);
        if(v < 0) {
            i.d1();
        }
        int v1 = v + 1;
        int v2 = s.charAt(v1);
        int v3 = 0;
        while(v2 == 91) {
            ++v3;
            ++v1;
            v2 = s.charAt(v1);
        }
        this.j = v3;
        if(v2 == 76) {
            int v4 = s.indexOf(59, v1 + 1);
            if(v4 < 0) {
                i.d1();
            }
            this.i = 307;
            this.k = s.substring(v1 + 1, v4);
        }
        else {
            this.i = javassist.compiler.j.b(((char)v2));
            this.k = null;
        }
        int v5 = this.i;
        if(z && z1) {
            if(b.B0(v5, v3)) {
                this.a.s0(93);
                this.a.s0(88);
                this.a.s0(87);
                return;
            }
            if(v5 == 344) {
                this.a.s0(87);
                return;
            }
            this.a.s0(0x5F);
            this.a.s0(87);
        }
    }

    public void r1(javassist.q q0) {
        T t0 = q0.D();
        this.A = t0;
        r r0 = this.c;
        if(r0 != null) {
            r0.g0(t0);
        }
    }

    @Override  // javassist.compiler.b
    protected String v0() throws javassist.compiler.c {
        return javassist.compiler.j.k(javassist.compiler.j.i(this.z).X());
    }

    @Override  // javassist.compiler.b
    protected String x0() {
        return javassist.compiler.j.k(this.z.X());
    }

    @Override  // javassist.compiler.b
    protected void z0() throws javassist.compiler.c {
        this.a.k(0);
        this.a.Q(javassist.compiler.j.i(this.z), "<init>", "()V");
    }
}

