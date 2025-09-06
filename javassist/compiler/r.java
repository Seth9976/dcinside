package javassist.compiler;

import javassist.D;
import javassist.E;
import javassist.bytecode.T;
import javassist.bytecode.c0;
import javassist.compiler.ast.a;
import javassist.compiler.ast.b;
import javassist.compiler.ast.d;
import javassist.compiler.ast.e;
import javassist.compiler.ast.f;
import javassist.compiler.ast.h;
import javassist.compiler.ast.i;
import javassist.compiler.ast.k;
import javassist.compiler.ast.m;
import javassist.compiler.ast.n;
import javassist.compiler.ast.p;
import javassist.compiler.ast.u;
import javassist.compiler.ast.v;
import javassist.compiler.ast.w;
import javassist.compiler.ast.x;
import javassist.g;
import javassist.l;
import javassist.o;

public class r extends x implements c0, q {
    protected int a;
    protected int b;
    protected String c;
    protected j d;
    protected l e;
    protected T f;
    static final String g = "java.lang.Object";
    static final String h = "java/lang/Object";
    static final String i = "java/lang/String";
    static final String j = "java/lang/Class";

    public r(l l0, g g0) {
        this.d = new j(g0);
        this.e = l0;
        this.f = null;
    }

    public void A(k k0) throws c {
        this.a = 307;
        this.b = 0;
        this.c = "java/lang/Class";
    }

    protected void B(k k0, int v, b b0, b b1) throws c {
        this.D(this.Q(b0));
        int v1 = this.a;
        int v2 = this.b;
        String s = this.c;
        b1.a(this);
        this.a = v1;
        this.b = v2;
        this.c = s;
    }

    protected void C(b b0) throws c {
        this.D(this.Q(b0));
        if(this.a == 303 || this.a == 306 || this.a == 324 || this.a == 334) {
            this.a = 324;
        }
    }

    private void D(o o0) throws c {
        String s = o0.v().h();
        int v = 0;
        int v1 = s.charAt(0);
        int v2 = 0;
        while(v1 == 91) {
            ++v;
            ++v2;
            v1 = s.charAt(v2);
        }
        this.b = v;
        this.a = j.b(((char)v1));
        if(v1 == 76) {
            this.c = s.substring(v2 + 1, s.indexOf(59, v2 + 1));
            return;
        }
        this.c = null;
    }

    private void E(b b0) throws c {
        this.D(this.Q(b0));
    }

    public void F(a a0, int[] arr_v, int[] arr_v1, String[] arr_s) throws c {
        int v = 0;
        while(a0 != null) {
            a0.i().a(this);
            arr_v[v] = this.a;
            arr_v1[v] = this.b;
            arr_s[v] = this.c;
            ++v;
            a0 = a0.q();
        }
    }

    public javassist.compiler.j.a G(l l0, String s, a a0) throws c {
        int v = this.U(a0);
        int[] arr_v = new int[v];
        int[] arr_v1 = new int[v];
        String[] arr_s = new String[v];
        this.F(a0, arr_v, arr_v1, arr_s);
        javassist.compiler.j.a j$a0 = this.d.w(l0, this.e, this.f, s, arr_v, arr_v1, arr_s);
        if(j$a0 == null) {
            String s1 = l0.X();
            String s2 = r.w(arr_v, arr_v1, arr_s);
            throw new c((s.equals("<init>") ? "cannot find constructor " + s1 + s2 : s + s2 + " not found in " + s1));
        }
        this.f0(j$a0.b.h());
        return j$a0;
    }

    protected void H(int v, a a0, a a1) throws c {
        while(a1 != null) {
            b b0 = a1.i();
            if(b0 == null) {
                break;
            }
            b0.a(this);
            a1 = a1.q();
        }
        this.a = v;
        this.b = 0;
        if(v == 307) {
            this.c = this.e0(a0);
            return;
        }
        this.c = null;
    }

    public void I(javassist.compiler.ast.r r0) throws c {
        int v = r0.u();
        a a0 = r0.s();
        a a1 = r0.w();
        javassist.compiler.ast.c c0 = r0.x();
        if(c0 != null) {
            c0.a(this);
        }
        b b0 = a0.i();
        if(b0 != null) {
            b0.a(this);
        }
        this.a = v;
        this.b = 1;
        if(v == 307) {
            this.c = this.e0(a1);
            return;
        }
        this.c = null;
    }

    private k J(e e0) throws c {
        b b0 = e0.w();
        b b1 = e0.x();
        if(b1 == null) {
            b0.a(this);
            return null;
        }
        if(r.b0(b0)) {
            k k0 = this.J(((e)b0));
            if(k0 != null) {
                b1.a(this);
                this.a = 307;
                this.b = 0;
                this.c = "java/lang/StringBuffer";
                return r.c0(k0, b1);
            }
        }
        else {
            b0.a(this);
        }
        int v = this.a;
        int v1 = this.b;
        String s = this.c;
        b1.a(this);
        if(this.Y(e0, 43, b0, b1)) {
            return null;
        }
        if(v == 307 && v1 == 0 && "java/lang/String".equals(s) || this.a == 307 && this.b == 0 && "java/lang/String".equals(this.c)) {
            javassist.compiler.ast.r r0 = new javassist.compiler.ast.r(a.l(new v("java"), new v("lang"), new v("StringBuffer")), null);
            this.a = 307;
            this.b = 0;
            this.c = "java/lang/StringBuffer";
            return r.c0(r.c0(r0, b0), b1);
        }
        this.O(e0, 43, v);
        return null;
    }

    private void K(int v, b b0, k k0) throws c {
        if(b0 == null) {
            b0 = k0.x();
        }
        if(b0 instanceof w) {
            i i0 = ((w)b0).h();
            this.a = i0.A();
            this.b = i0.w();
            return;
        }
        if(b0 instanceof k && ((k)b0).r() == 65) {
            this.z(((k)b0).w(), ((k)b0).x());
            if(this.a == 303 || this.a == 306 || this.a == 324 || this.a == 334) {
                this.a = 324;
            }
            return;
        }
        this.C(b0);
    }

    private void L(k k0, int v, w w0, i i0, b b0) throws c {
        int v1 = i0.A();
        int v2 = i0.w();
        String s = i0.x();
        if(v != 61) {
            this.v(w0);
        }
        b0.a(this);
        this.a = v1;
        this.b = v2;
        this.c = s;
    }

    private static void M() throws c {
        throw new c("bad method");
    }

    private void N(b b0) throws c {
        int v = javassist.compiler.b.r0(b0);
        if(v == 358) {
            ((e)b0).w().a(this);
            int v1 = this.a;
            int v2 = this.b;
            ((e)b0).x().a(this);
            if(v2 == 0 && this.b == 0) {
                this.X(((e)b0), v1, this.a);
            }
        }
        else {
            switch(v) {
                case 33: {
                    ((k)b0).w().a(this);
                    break;
                }
                case 0x170: 
                case 369: {
                    ((e)b0).w().a(this);
                    ((e)b0).x().a(this);
                    break;
                }
                default: {
                    b0.a(this);
                }
            }
        }
        this.a = 301;
        this.b = 0;
    }

    private void O(e e0, int v, int v1) throws c {
        int v2 = this.a;
        if(v == 364 || v == 366 || v == 370) {
            this.a = v1;
        }
        else {
            this.X(e0, v1, v2);
        }
        if(javassist.compiler.b.D0(this.a) && this.a != 301) {
            this.a = 324;
        }
    }

    protected static void P() throws c {
        throw new c("fatal");
    }

    protected o Q(b b0) throws c {
        if(b0 instanceof p) {
            p p0 = (p)b0;
            String s = p0.g();
            try {
                o o0 = this.e.O(s);
                if(D.l(o0.h())) {
                    p0.i(o0);
                }
                return o0;
            }
            catch(E unused_ex) {
                throw new javassist.compiler.k(s, b0);
            }
        }
        if(b0 instanceof k) {
            k k0 = (k)b0;
            int v = k0.r();
            if(v == 35) {
                p p1 = (p)k0.x();
                o o1 = this.d.s(((v)k0.w()).g(), p1);
                p1.i(o1);
                return o1;
            }
            if(v == 46) {
                try {
                    k0.w().a(this);
                }
                catch(javassist.compiler.k k1) {
                    if(k1.b() != k0.w()) {
                        throw k1;
                    }
                    return this.R(k0, k1.c());
                }
                try {
                    if(this.a == 307 && this.b == 0) {
                        return this.d.t(this.c, ((v)k0.x()));
                    }
                    c0 = null;
                }
                catch(c c0) {
                }
                b b1 = k0.w();
                if(!(b1 instanceof v)) {
                    throw c0 == null ? new c("bad filed access") : c0;
                }
                return this.R(k0, ((v)b1).g());
            }
        }
        throw new c("bad filed access");
    }

    private o R(k k0, String s) throws c {
        p p0 = (p)k0.x();
        o o0 = this.d.u(s, p0, k0);
        k0.y(35);
        k0.z(new v(j.l(s)));
        p0.i(o0);
        return o0;
    }

    public static b S(o o0) {
        if(o0 == null) {
            return null;
        }
        Object object0 = o0.t();
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof String) {
            return new u(((String)object0));
        }
        if(!(object0 instanceof Double) && !(object0 instanceof Float)) {
            if(object0 instanceof Number) {
                return object0 instanceof Long ? new n(((Number)object0).longValue(), 403) : new n(((Number)object0).longValue(), 402);
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? new javassist.compiler.ast.o(410) : new javassist.compiler.ast.o(411);
            }
            return null;
        }
        return object0 instanceof Double ? new javassist.compiler.ast.j(((Number)object0).doubleValue(), 405) : new javassist.compiler.ast.j(((Number)object0).doubleValue(), 404);
    }

    private static b T(p p0) {
        return r.S(p0.h());
    }

    public int U(a a0) {
        return a.k(a0);
    }

    protected String V() throws c {
        return j.k(j.i(this.e).X());
    }

    protected String W() {
        return j.k(this.e.X());
    }

    private void X(e e0, int v, int v1) throws c {
        if(javassist.compiler.b.L0(v, v1)) {
            e0.e(new javassist.compiler.ast.g(v1, 0, e0.w()));
            return;
        }
        this.a = v;
    }

    private boolean Y(e e0, int v, b b0, b b1) throws c {
        b b4;
        b b2 = r.h0(b0);
        b b3 = r.h0(b1);
        if(b2 instanceof u && b3 instanceof u && v == 43) {
            b4 = new u(((u)b2).g() + ((u)b3).g());
        }
        else if(b2 instanceof n) {
            b4 = ((n)b2).g(v, b3);
        }
        else {
            b4 = b2 instanceof javassist.compiler.ast.j ? ((javassist.compiler.ast.j)b2).g(v, b3) : null;
        }
        if(b4 == null) {
            return false;
        }
        e0.y(43);
        e0.z(b4);
        e0.A(null);
        b4.a(this);
        return true;
    }

    private boolean Z(k k0, int v, b b0) {
        long v2;
        b b1 = r.h0(b0);
        if(b1 instanceof n) {
            long v1 = ((n)b1).j();
            if(v == 45) {
                v2 = -v1;
            }
            else if(v == 0x7E) {
                v2 = ~v1;
            }
            else {
                return false;
            }
            ((n)b1).l(v2);
        }
        else if(b1 instanceof javassist.compiler.ast.j && v == 45) {
            ((javassist.compiler.ast.j)b1).m(-((javassist.compiler.ast.j)b1).k());
        }
        else {
            return false;
        }
        k0.y(43);
        return true;
    }

    static String a0(b b0) {
        if(b0 instanceof k && ((k)b0).r() == 46) {
            b b1 = ((k)b0).x();
            return !(b1 instanceof javassist.compiler.ast.o) || ((javassist.compiler.ast.o)b1).g() != 0x150 ? null : ((v)((k)b0).w()).g();
        }
        return null;
    }

    @Override  // javassist.compiler.ast.x
    public void b(javassist.compiler.ast.c c0) throws c {
        while(c0 != null) {
            b b0 = c0.i();
            c0 = c0.q();
            if(b0 != null) {
                b0.a(this);
            }
        }
    }

    private static boolean b0(b b0) {
        return b0 instanceof e && ((e)b0).r() == 43;
    }

    @Override  // javassist.compiler.ast.x
    public void c(d d0) throws c {
        int v = d0.r();
        b b0 = d0.w();
        b b1 = d0.x();
        if(b0 instanceof w) {
            this.L(d0, v, ((w)b0), ((w)b0).h(), b1);
            return;
        }
        if(b0 instanceof k && ((k)b0).r() == 65) {
            this.x(d0, v, ((k)b0), b1);
            return;
        }
        this.B(d0, v, b0, b1);
    }

    private static k c0(b b0, b b1) {
        return f.C(k.u(46, b0, new p("append")), new a(b1));
    }

    @Override  // javassist.compiler.ast.x
    public void d(e e0) throws c {
        int v = e0.r();
        if(javassist.compiler.b.G0(v) < 0) {
            this.N(e0);
        }
        else if(v == 43) {
            k k0 = this.J(e0);
            if(k0 != null) {
                e0.z(f.C(k.u(46, k0, new p("toString")), null));
                e0.A(null);
                this.c = "java/lang/String";
            }
        }
        else {
            b b0 = e0.w();
            b b1 = e0.x();
            b0.a(this);
            int v1 = this.a;
            b1.a(this);
            if(!this.Y(e0, v, b0, b1)) {
                this.O(e0, v, v1);
            }
        }
    }

    protected String d0(String s) throws c {
        return this.d.y(s);
    }

    @Override  // javassist.compiler.ast.x
    public void e(f f0) throws c {
        l l1;
        String s;
        l l0 = null;
        b b0 = f0.w();
        a a0 = (a)f0.x();
        if(b0 instanceof p) {
            s = ((p)b0).g();
            l1 = this.e;
        }
        else if(b0 instanceof javassist.compiler.ast.o) {
            l1 = ((javassist.compiler.ast.o)b0).g() == 0x150 ? j.i(this.e) : this.e;
            s = "<init>";
        }
        else if(b0 instanceof k) {
            String s1 = ((v)((k)b0).x()).g();
            int v = ((k)b0).r();
            if(v == 35) {
                l0 = this.d.n(((v)((k)b0).w()).g(), false);
            }
            else if(v == 46) {
                b b1 = ((k)b0).w();
                String s2 = r.a0(b1);
                if(s2 == null) {
                    try {
                        b1.a(this);
                    }
                    catch(javassist.compiler.k k0) {
                        if(k0.b() != b1) {
                            throw k0;
                        }
                        this.a = 307;
                        this.b = 0;
                        this.c = k0.c();
                        ((k)b0).y(35);
                        ((k)b0).z(new v(j.l(this.c)));
                    }
                    if(this.b > 0) {
                        l0 = this.d.n("java.lang.Object", true);
                    }
                    else if(this.a == 307) {
                        l0 = this.d.q(this.c);
                    }
                    else {
                        r.M();
                    }
                }
                else {
                    l0 = j.h(this.e, s2);
                }
            }
            else {
                r.M();
            }
            s = s1;
            l1 = l0;
        }
        else {
            r.P();
            s = null;
            l1 = null;
        }
        f0.D(this.G(l1, s, a0));
    }

    protected String e0(a a0) throws c {
        return this.d.x(a0);
    }

    @Override  // javassist.compiler.ast.x
    public void f(javassist.compiler.ast.g g0) throws c {
        String s = this.e0(g0.s());
        g0.u().a(this);
        this.a = g0.w();
        this.b = g0.r();
        this.c = s;
    }

    void f0(String s) throws c {
        int v = s.indexOf(41);
        if(v < 0) {
            r.M();
        }
        int v1 = v + 1;
        int v2 = s.charAt(v1);
        int v3 = 0;
        while(v2 == 91) {
            ++v3;
            ++v1;
            v2 = s.charAt(v1);
        }
        this.b = v3;
        if(v2 == 76) {
            int v4 = s.indexOf(59, v1 + 1);
            if(v4 < 0) {
                r.M();
            }
            this.a = 307;
            this.c = s.substring(v1 + 1, v4);
            return;
        }
        this.a = j.b(((char)v2));
        this.c = null;
    }

    @Override  // javassist.compiler.ast.x
    public void g(h h0) throws c {
        this.N(h0.r());
        h0.y().a(this);
        int v = this.a;
        int v1 = this.b;
        h0.s().a(this);
        if(v1 == 0 && 0 == this.b) {
            if(javassist.compiler.b.L0(v, this.a)) {
                h0.x(new javassist.compiler.ast.g(this.a, 0, h0.y()));
                return;
            }
            if(javassist.compiler.b.L0(this.a, v)) {
                h0.w(new javassist.compiler.ast.g(v, 0, h0.s()));
                this.a = v;
            }
        }
    }

    public void g0(T t0) {
        this.f = t0;
    }

    static b h0(b b0) {
        if(b0 instanceof e) {
            return ((e)b0).r() != 43 || ((e)b0).x() != null ? b0 : ((e)b0).b();
        }
        if(b0 instanceof k) {
            int v = ((k)b0).r();
            if(v == 35) {
                b b1 = r.T(((p)((k)b0).x()));
                return b1 == null ? b0 : b1;
            }
            return v != 43 || ((k)b0).c() != null ? b0 : ((k)b0).b();
        }
        if(b0 instanceof p) {
            b b2 = r.T(((p)b0));
            return b2 == null ? b0 : b2;
        }
        return b0;
    }

    @Override  // javassist.compiler.ast.x
    public void i(javassist.compiler.ast.j j0) throws c {
        this.b = 0;
        if(j0.l() == 405) {
            this.a = 312;
            return;
        }
        this.a = 317;
    }

    protected static StringBuffer i0(StringBuffer stringBuffer0, int v, int v1, String s) {
        String s1;
        switch(v) {
            case 307: {
                s1 = j.l(s);
                break;
            }
            case 412: {
                goto label_6;
            }
            default: {
                try {
                    s1 = "?";
                    s1 = j.j(v);
                    break;
                label_6:
                    s1 = "Object";
                }
                catch(c unused_ex) {
                }
            }
        }
        stringBuffer0.append(s1);
        while(v1 > 0) {
            stringBuffer0.append("[]");
            --v1;
        }
        return stringBuffer0;
    }

    @Override  // javassist.compiler.ast.x
    public void j(k k0) throws c {
        int v = k0.r();
        b b0 = k0.w();
        switch(v) {
            case 33: {
                this.N(k0);
                return;
            }
            case 35: {
                if(((v)k0.x()).g().equals("class")) {
                    this.A(k0);
                    return;
                }
                this.E(k0);
                return;
            }
            case 46: {
                String s = ((v)k0.x()).g();
                if(s.equals("length")) {
                    try {
                        this.y(k0);
                    }
                    catch(javassist.compiler.k unused_ex) {
                        this.E(k0);
                    }
                    return;
                }
                if(s.equals("class")) {
                    this.A(k0);
                    return;
                }
                this.E(k0);
                return;
            }
            case 65: {
                this.z(b0, k0.x());
                return;
            }
            case 67: {
                r.P();
                return;
            label_26:
                b0.a(this);
                if(!this.Z(k0, v, b0) && (v == 45 || v == 0x7E) && javassist.compiler.b.D0(this.a)) {
                    this.a = 324;
                    return;
                }
                break;
            }
            case 362: 
            case 363: {
                this.K(v, b0, k0);
                break;
            }
            default: {
                goto label_26;
            }
        }
    }

    @Override  // javassist.compiler.ast.x
    public void l(m m0) throws c {
        m0.u().a(this);
        this.a = 301;
        this.b = 0;
    }

    @Override  // javassist.compiler.ast.x
    public void m(n n0) throws c {
        this.b = 0;
        int v = n0.k();
        if(v != 401 && v != 402) {
            this.a = 326;
            return;
        }
        this.a = v == 402 ? 324 : 306;
    }

    @Override  // javassist.compiler.ast.x
    public void n(javassist.compiler.ast.o o0) throws c {
        this.b = 0;
        int v = o0.g();
        if(v != 0x150 && v != 339) {
            switch(v) {
                case 410: 
                case 411: {
                    this.a = 301;
                    return;
                }
                case 412: {
                    this.a = 412;
                    return;
                }
                default: {
                    r.P();
                    return;
                }
            }
        }
        this.a = 307;
        if(v == 339) {
            this.c = this.W();
            return;
        }
        this.c = this.V();
    }

    @Override  // javassist.compiler.ast.x
    public void o(p p0) throws c {
        this.E(p0);
    }

    @Override  // javassist.compiler.ast.x
    public void q(javassist.compiler.ast.r r0) throws c {
        if(r0.y()) {
            this.I(r0);
            return;
        }
        l l0 = this.d.r(r0.w());
        this.G(l0, "<init>", r0.r());
        this.a = 307;
        this.b = 0;
        this.c = j.k(l0.X());
    }

    @Override  // javassist.compiler.ast.x
    public void t(u u0) throws c {
        this.a = 307;
        this.b = 0;
        this.c = "java/lang/String";
    }

    @Override  // javassist.compiler.ast.x
    public void v(w w0) throws c {
        i i0 = w0.h();
        this.a = i0.A();
        this.b = i0.w();
        this.c = i0.x();
    }

    protected static String w(int[] arr_v, int[] arr_v1, String[] arr_s) {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append('(');
        if(arr_v.length > 0) {
            int v = 0;
            while(true) {
                r.i0(stringBuffer0, arr_v[v], arr_v1[v], arr_s[v]);
                ++v;
                if(v >= arr_v.length) {
                    break;
                }
                stringBuffer0.append(',');
            }
        }
        stringBuffer0.append(')');
        return stringBuffer0.toString();
    }

    private void x(k k0, int v, k k1, b b0) throws c {
        this.z(k1.w(), k1.x());
        int v1 = this.a;
        int v2 = this.b;
        String s = this.c;
        b0.a(this);
        this.a = v1;
        this.b = v2;
        this.c = s;
    }

    public void y(k k0) throws c {
        k0.w().a(this);
        if(this.b == 0) {
            throw new javassist.compiler.k("length", k0);
        }
        this.a = 324;
        this.b = 0;
    }

    public void z(b b0, b b1) throws c {
        b0.a(this);
        int v = this.a;
        int v1 = this.b;
        String s = this.c;
        b1.a(this);
        this.a = v;
        this.b = v1 - 1;
        this.c = s;
    }
}

