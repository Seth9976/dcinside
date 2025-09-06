package javassist;

import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.w;

public final class q extends k {
    public static class a {
        int a(j j0) throws b {
            return 0;
        }

        String b() [...] // 潜在的解密器

        static String c() [...] // Inlined contents

        static String d() [...] // Inlined contents

        String e() [...] // 潜在的解密器

        public static a f(int v) {
            return new javassist.q.b(v);
        }

        public static a g(long v) {
            return new c(v);
        }

        public static a h(String s) {
            return new d(s);
        }
    }

    static class javassist.q.b extends a {
        int a;

        javassist.q.b(int v) {
            this.a = v;
        }

        @Override  // javassist.q$a
        int a(j j0) throws b {
            j0.E(this.a);
            return 1;
        }

        @Override  // javassist.q$a
        String b() {
            return "([Ljava/lang/Object;I)V";
        }

        @Override  // javassist.q$a
        String e() {
            return "([Ljava/lang/Object;I)Ljava/lang/Object;";
        }
    }

    static class c extends a {
        long a;

        c(long v) {
            this.a = v;
        }

        @Override  // javassist.q$a
        int a(j j0) throws b {
            j0.d0(this.a);
            return 2;
        }

        @Override  // javassist.q$a
        String b() {
            return "([Ljava/lang/Object;J)V";
        }

        @Override  // javassist.q$a
        String e() {
            return "([Ljava/lang/Object;J)Ljava/lang/Object;";
        }
    }

    static class d extends a {
        String a;

        d(String s) {
            this.a = s;
        }

        @Override  // javassist.q$a
        int a(j j0) throws b {
            j0.f0(this.a);
            return 1;
        }

        @Override  // javassist.q$a
        String b() {
            return "([Ljava/lang/Object;Ljava/lang/String;)V";
        }

        @Override  // javassist.q$a
        String e() {
            return "([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;";
        }
    }

    protected String d;

    q(T t0, l l0) {
        super(l0, t0);
        this.d = null;
    }

    public q(l l0, String s, l[] arr_l, l l1) {
        this(null, l1);
        String s1 = w.q(l0, arr_l);
        this.c = new T(l1.u().l(), s, s1);
        this.q(0x401);
    }

    public q(q q0, l l0, javassist.d d0) throws b {
        this(null, l0);
        this.x(q0, false, d0);
    }

    @Override  // javassist.k
    public String B() {
        return this.f().X() + "." + this.i() + w.E(this.j());
    }

    @Override  // javassist.k
    public boolean V() {
        p p0 = this.D().f();
        if(p0 == null) {
            return (this.h() & 0x400) != 0;
        }
        javassist.bytecode.q q0 = p0.G();
        try {
            return !q0.l() || q0.f(q0.J()) != 0xB1 || q0.l() ? false : true;
        }
        catch(e unused_ex) {
            return false;
        }
    }

    public l b0() throws E {
        return this.H();
    }

    final String c0() {
        if(this.d == null) {
            this.d = this.c.k() + w.h(this.c.h());
        }
        return this.d;
    }

    public static q d0(String s, l l0) throws b {
        return t.h(s, l0);
    }

    public static q e0(T t0, l l0) throws b {
        if(l0.u().l() != t0.g()) {
            throw new b("bad declaring class");
        }
        return new q(t0, l0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 != null && object0 instanceof q && ((q)object0).c0().equals(this.c0());
    }

    public void f0(q q0, javassist.d d0) throws b {
        k.Y(q0.b, q0.c, this.b, this.c, d0);
    }

    public void g0(String s) {
        this.b.g();
        this.c.B(s);
    }

    public void h0(q q0, a q$a0) throws b {
        l l1;
        l[] arr_l;
        this.b.g();
        l l0 = this.f();
        try {
            arr_l = this.G();
            l1 = this.b0();
        }
        catch(E e0) {
            throw new b(e0);
        }
        p p0 = v.e(l0, l0.u(), q0, arr_l, l1, q$a0).T0();
        this.c.y(p0);
        this.c.x(this.c.c() & 0xFFFFFBFF);
    }

    @Override
    public int hashCode() {
        return this.c0().hashCode();
    }

    @Override  // javassist.p
    public String i() {
        return this.c.k();
    }

    @Override  // javassist.p
    void m() {
        this.d = null;
    }
}

