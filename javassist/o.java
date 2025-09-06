package javassist;

import javassist.bytecode.D;
import javassist.bytecode.f0;
import javassist.bytecode.j;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.compiler.ast.n;
import javassist.compiler.ast.u;
import javassist.compiler.c;
import javassist.compiler.d;

public class o extends p {
    static class a extends f {
        l a;
        int b;

        a(l l0, int v) {
            this.a = l0;
            this.b = v;
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            this.x(j0);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return 2;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            this.x(j0);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return 1;
        }

        private void x(j j0) {
            if(this.a.p0()) {
                j0.r0(((javassist.w)this.a).U0(), this.b);
                return;
            }
            j0.m(this.a, this.b);
        }
    }

    static abstract class javassist.o.b extends f {
        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            try {
                j0.k(0);
                this.x(d0);
                String s1 = w.o(l0);
                j0.v0(j.h, s, s1);
                return j0.I0();
            }
            catch(c c0) {
                throw new b(c0);
            }
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            try {
                this.x(d0);
                String s1 = w.o(l0);
                j0.y0(j.h, s, s1);
                return j0.I0();
            }
            catch(c c0) {
                throw new b(c0);
            }
        }

        abstract void x(d arg1) throws c;

        int y(t t0, l l0, javassist.compiler.ast.b b0) {
            if(l0.p0()) {
                if(b0 instanceof n) {
                    long v = ((n)b0).j();
                    if(l0 == l.l) {
                        return t0.d(((double)v));
                    }
                    if(l0 == l.k) {
                        return t0.g(((float)v));
                    }
                    if(l0 == l.j) {
                        return t0.n(v);
                    }
                    return l0 == l.m ? 0 : t0.h(((int)v));
                }
                if(b0 instanceof javassist.compiler.ast.j) {
                    double f = ((javassist.compiler.ast.j)b0).k();
                    if(l0 == l.k) {
                        return t0.g(((float)f));
                    }
                    return l0 == l.l ? t0.d(f) : 0;
                }
                return 0;
            }
            return !(b0 instanceof u) || !l0.X().equals("java.lang.String") ? 0 : t0.w(((u)b0).g());
        }
    }

    static class javassist.o.c extends javassist.o.b {
        private String a;

        javassist.o.c(String s) {
            this.a = s;
        }

        @Override  // javassist.o$f
        int w(t t0, l l0) {
            try {
                return this.y(t0, l0, d.j(this.a, new javassist.compiler.n()));
            }
            catch(c unused_ex) {
                return 0;
            }
        }

        @Override  // javassist.o$b
        void x(d d0) throws c {
            d0.c(this.a);
        }
    }

    static class javassist.o.d extends f {
        double a;

        javassist.o.d(double f) {
            this.a = f;
        }

        @Override  // javassist.o$f
        void n(String s) throws b {
            if(!s.equals("D")) {
                throw new b("type mismatch");
            }
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.g0(this.a);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return 3;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            j0.g0(this.a);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return 2;
        }

        @Override  // javassist.o$f
        int w(t t0, l l0) {
            return l0 == l.l ? t0.d(this.a) : 0;
        }
    }

    static class e extends f {
        float a;

        e(float f) {
            this.a = f;
        }

        @Override  // javassist.o$f
        void n(String s) throws b {
            if(!s.equals("F")) {
                throw new b("type mismatch");
            }
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.x(this.a);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return 3;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            j0.x(this.a);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return 2;
        }

        @Override  // javassist.o$f
        int w(t t0, l l0) {
            return l0 == l.k ? t0.g(this.a) : 0;
        }
    }

    public static abstract class f {
        public static f a(l l0, String s) {
            f o$f0 = new i();
            o$f0.a = l0;
            o$f0.d = s;
            o$f0.b = null;
            o$f0.c = false;
            return o$f0;
        }

        public static f b(l l0, String s, String[] arr_s) {
            f o$f0 = new i();
            o$f0.a = l0;
            o$f0.d = s;
            o$f0.b = arr_s;
            o$f0.c = false;
            return o$f0;
        }

        public static f c(l l0, String s) {
            f o$f0 = new i();
            o$f0.a = l0;
            o$f0.d = s;
            o$f0.b = null;
            o$f0.c = true;
            return o$f0;
        }

        public static f d(l l0, String s, String[] arr_s) {
            f o$f0 = new i();
            o$f0.a = l0;
            o$f0.d = s;
            o$f0.b = arr_s;
            o$f0.c = true;
            return o$f0;
        }

        public static f e(String s) {
            return new javassist.o.c(s);
        }

        static f f(javassist.compiler.ast.b b0) {
            return new m(b0);
        }

        public static f g(l l0) {
            f o$f0 = new k();
            o$f0.a = l0;
            o$f0.b = null;
            o$f0.c = false;
            return o$f0;
        }

        public static f h(l l0, String[] arr_s) {
            f o$f0 = new k();
            o$f0.a = l0;
            o$f0.b = arr_s;
            o$f0.c = false;
            return o$f0;
        }

        public static f i(l l0, int v) throws E {
            return new a(l0.x(), v);
        }

        public static f j(l l0, int[] arr_v) {
            return new javassist.o.j(l0, arr_v);
        }

        public static f k(l l0) {
            f o$f0 = new k();
            o$f0.a = l0;
            o$f0.b = null;
            o$f0.c = true;
            return o$f0;
        }

        public static f l(l l0, String[] arr_s) {
            f o$f0 = new k();
            o$f0.a = l0;
            o$f0.b = arr_s;
            o$f0.c = true;
            return o$f0;
        }

        public static f m(int v) {
            f o$f0 = new javassist.o.l();
            o$f0.a = v;
            return o$f0;
        }

        void n(String s) throws b {
        }

        abstract int o(l arg1, String arg2, j arg3, l[] arg4, d arg5) throws b;

        abstract int p(l arg1, String arg2, j arg3, d arg4) throws b;

        public static f q(double f) {
            return new javassist.o.d(f);
        }

        public static f r(float f) {
            return new e(f);
        }

        public static f s(int v) {
            return new g(v);
        }

        public static f t(long v) {
            return new h(v);
        }

        public static f u(String s) {
            return new javassist.o.n(s);
        }

        public static f v(boolean z) {
            return new g(((int)z));
        }

        int w(t t0, l l0) {
            return 0;
        }
    }

    static class g extends f {
        int a;

        g(int v) {
            this.a = v;
        }

        @Override  // javassist.o$f
        void n(String s) throws b {
            switch(s.charAt(0)) {
                case 66: 
                case 67: 
                case 73: 
                case 83: 
                case 90: {
                    return;
                }
                default: {
                    throw new b("type mismatch");
                }
            }
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.E(this.a);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return 2;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            j0.E(this.a);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return 1;
        }

        @Override  // javassist.o$f
        int w(t t0, l l0) {
            return t0.h(this.a);
        }
    }

    static class h extends f {
        long a;

        h(long v) {
            this.a = v;
        }

        @Override  // javassist.o$f
        void n(String s) throws b {
            if(!s.equals("J")) {
                throw new b("type mismatch");
            }
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.h0(this.a);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return 3;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            j0.h0(this.a);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return 2;
        }

        @Override  // javassist.o$f
        int w(t t0, l l0) {
            return l0 == l.j ? t0.n(this.a) : 0;
        }
    }

    static class i extends k {
        String d;

        @Override  // javassist.o$k
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.k(0);
            int v = this.b == null ? 2 : this.x(j0) + 2;
            if(this.c) {
                v += v.c(j0, arr_l, 1);
            }
            String s1 = w.o(l0);
            j0.W(this.a, this.d, "(Ljava/lang/Object;)" + s1);
            j0.v0(j.h, s, s1);
            return v;
        }

        @Override  // javassist.o$k
        int p(l l0, String s, j j0, d d0) throws b {
            String s1;
            int v = 1;
            if(this.b == null) {
                s1 = "()";
            }
            else {
                v = this.x(j0) + 1;
                s1 = "([Ljava/lang/String;)";
            }
            String s2 = w.o(l0);
            j0.W(this.a, this.d, s1 + s2);
            j0.y0(j.h, s, s2);
            return v;
        }

        private String y() [...] // 潜在的解密器
    }

    static class javassist.o.j extends f {
        l a;
        int[] b;

        javassist.o.j(l l0, int[] arr_v) {
            this.a = l0;
            this.b = arr_v;
        }

        @Override  // javassist.o$f
        void n(String s) throws b {
            if(s.charAt(0) != 91) {
                throw new b("type mismatch");
            }
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            int v = j0.o0(l0, this.b);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return v + 1;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            int v = j0.o0(l0, this.b);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return v;
        }
    }

    static class k extends f {
        l a;
        String[] b;
        boolean c;

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.q0(this.a);
            j0.a(89);
            j0.k(0);
            int v = this.b == null ? 4 : this.x(j0) + 4;
            if(this.c) {
                v += v.c(j0, arr_l, 1);
            }
            j0.Q(this.a, "<init>", "(Ljava/lang/Object;)V");
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return v;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            String s1;
            j0.q0(this.a);
            j0.a(89);
            int v = 2;
            if(this.b == null) {
                s1 = "()V";
            }
            else {
                v = this.x(j0) + 2;
                s1 = "([Ljava/lang/String;)V";
            }
            j0.Q(this.a, "<init>", s1);
            String s2 = w.o(l0);
            j0.y0(j.h, s, s2);
            return v;
        }

        protected final int x(j j0) throws b {
            int v = this.b.length;
            j0.E(v);
            j0.l("java.lang.String");
            for(int v1 = 0; v1 < v; ++v1) {
                j0.a(89);
                j0.E(v1);
                j0.f0(this.b[v1]);
                j0.a(83);
            }
            return 4;
        }

        private String y() [...] // 潜在的解密器
    }

    static class javassist.o.l extends f {
        int a;

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            if(arr_l != null && this.a < arr_l.length) {
                j0.k(0);
                int v = j0.j0(javassist.o.l.x(this.a, arr_l, false), l0);
                String s1 = w.o(l0);
                j0.v0(j.h, s, s1);
                return v + 1;
            }
            return 0;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            return 0;
        }

        static int x(int v, l[] arr_l, boolean z) {
            l l0 = l.j;
            l l1 = l.l;
            int v1 = !z;
            for(int v2 = 0; v2 < v; ++v2) {
                l l2 = arr_l[v2];
                v1 = l2 == l0 || l2 == l1 ? v1 + 2 : v1 + 1;
            }
            return v1;
        }
    }

    static class m extends javassist.o.b {
        private javassist.compiler.ast.b a;

        m(javassist.compiler.ast.b b0) {
            this.a = b0;
        }

        @Override  // javassist.o$f
        int w(t t0, l l0) {
            return this.y(t0, l0, this.a);
        }

        @Override  // javassist.o$b
        void x(d d0) throws c {
            d0.d(this.a);
        }
    }

    static class javassist.o.n extends f {
        String a;

        javassist.o.n(String s) {
            this.a = s;
        }

        @Override  // javassist.o$f
        int o(l l0, String s, j j0, l[] arr_l, d d0) throws b {
            j0.k(0);
            j0.f0(this.a);
            String s1 = w.o(l0);
            j0.v0(j.h, s, s1);
            return 2;
        }

        @Override  // javassist.o$f
        int p(l l0, String s, j j0, d d0) throws b {
            j0.f0(this.a);
            String s1 = w.o(l0);
            j0.y0(j.h, s, s1);
            return 1;
        }

        // 去混淆评级： 低(20)
        @Override  // javassist.o$f
        int w(t t0, l l0) {
            return l0.X().equals("java.lang.String") ? t0.w(this.a) : 0;
        }
    }

    protected D c;
    static final String d = "java.lang.String";

    private o(String s, String s1, l l0) throws b {
        super(l0);
        javassist.bytecode.k k0 = l0.u();
        if(k0 == null) {
            throw new b("bad declaring class: " + l0.X());
        }
        this.c = new D(k0.l(), s1, s);
    }

    o(D d0, l l0) {
        super(l0);
        this.c = d0;
    }

    public o(l l0, String s, l l1) throws b {
        this(w.o(l0), s, l1);
    }

    public o(o o0, l l0) throws b {
        this(o0.c.h(), o0.c.i(), l0);
        D d0 = this.c;
        d0.m(o0.c.c());
        t t0 = d0.f();
        for(Object object0: o0.c.e()) {
            d0.a(((javassist.bytecode.d)object0).a(t0, null));
        }
    }

    public void A(String s) {
        this.b.g();
        this.c.o(s);
    }

    public void B(l l0) {
        this.b.g();
        this.c.n(w.o(l0));
    }

    @Override  // javassist.p
    protected void a(StringBuffer stringBuffer0) {
        stringBuffer0.append(' ');
        stringBuffer0.append(this.i());
        stringBuffer0.append(' ');
        stringBuffer0.append(this.c.h());
    }

    @Override  // javassist.p
    public Object b(Class class0) throws ClassNotFoundException {
        D d0 = this.v();
        javassist.bytecode.c c0 = (javassist.bytecode.c)d0.d("RuntimeInvisibleAnnotations");
        javassist.bytecode.c c1 = (javassist.bytecode.c)d0.d("RuntimeVisibleAnnotations");
        return javassist.m.Y0(class0, this.f().w(), c0, c1);
    }

    @Override  // javassist.p
    public Object[] c() throws ClassNotFoundException {
        return this.s(false);
    }

    @Override  // javassist.p
    public byte[] d(String s) {
        javassist.bytecode.d d0 = this.c.d(s);
        return d0 == null ? null : d0.c();
    }

    @Override  // javassist.p
    public Object[] e() {
        try {
            return this.s(true);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Unexpected exception", classNotFoundException0);
        }
    }

    @Override  // javassist.p
    public l f() {
        return super.f();
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
    public String i() {
        return this.c.i();
    }

    @Override  // javassist.p
    public String j() {
        return this.c.h();
    }

    @Override  // javassist.p
    public boolean l(String s) {
        D d0 = this.v();
        javassist.bytecode.c c0 = (javassist.bytecode.c)d0.d("RuntimeInvisibleAnnotations");
        javassist.bytecode.c c1 = (javassist.bytecode.c)d0.d("RuntimeVisibleAnnotations");
        return javassist.m.j1(s, this.f().w(), c0, c1);
    }

    @Override  // javassist.p
    public void o(String s, byte[] arr_b) {
        this.b.g();
        this.c.a(new javassist.bytecode.d(this.c.f(), s, arr_b));
    }

    @Override  // javassist.p
    public void p(String s) {
        this.b.g();
        this.c.a(new f0(this.c.f(), s));
    }

    @Override  // javassist.p
    public void q(int v) {
        this.b.g();
        this.c.m(v);
    }

    private Object[] s(boolean z) throws ClassNotFoundException {
        D d0 = this.v();
        javassist.bytecode.c c0 = (javassist.bytecode.c)d0.d("RuntimeInvisibleAnnotations");
        javassist.bytecode.c c1 = (javassist.bytecode.c)d0.d("RuntimeVisibleAnnotations");
        return javassist.m.B1(z, this.f().w(), c0, c1);
    }

    public Object t() {
        int v = this.c.g();
        if(v == 0) {
            return null;
        }
        t t0 = this.c.f();
        switch(t0.n0(v)) {
            case 3: {
                int v1 = t0.L(v);
                if("Z".equals(this.c.h())) {
                    return v1 == 0 ? false : true;
                }
                return v1;
            }
            case 4: {
                return t0.K(v);
            }
            case 5: {
                return t0.W(v);
            }
            case 6: {
                return t0.E(v);
            }
            case 8: {
                return t0.m0(v);
            }
            default: {
                throw new RuntimeException("bad tag: " + t0.n0(v) + " at " + v);
            }
        }
    }

    @Override  // javassist.p
    public String toString() {
        return this.f().X() + "." + this.i() + ":" + this.c.h();
    }

    public D u() {
        this.b.g();
        return this.c;
    }

    public D v() {
        return this.c;
    }

    f w() {
        javassist.compiler.ast.b b0 = this.x();
        return b0 == null ? null : f.f(b0);
    }

    protected javassist.compiler.ast.b x() {
        return null;
    }

    public l y() throws E {
        return w.y(this.c.h(), this.b.w());
    }

    public static o z(String s, l l0) throws b {
        d d0 = new d(l0);
        try {
            p p0 = d0.a(s);
            if(p0 instanceof o) {
                return (o)p0;
            }
        }
        catch(c c0) {
            throw new b(c0);
        }
        throw new b("not a field");
    }
}

