package javassist;

import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.convert.c;
import javassist.convert.d;
import javassist.convert.f;
import javassist.convert.g;
import javassist.convert.h;
import javassist.convert.j;
import javassist.convert.k;

public class i {
    public interface a {
        String a();

        String b();

        String c();

        String d();

        String e();

        String f();

        String g();

        String h();

        String i();

        String j();

        String k();

        String l();

        String m();

        String n();

        String o();

        String p();
    }

    public static class b implements a {
        @Override  // javassist.i$a
        public String a() {
            return "arrayReadLong";
        }

        @Override  // javassist.i$a
        public String b() {
            return "arrayWriteShort";
        }

        @Override  // javassist.i$a
        public String c() {
            return "arrayReadObject";
        }

        @Override  // javassist.i$a
        public String d() {
            return "arrayReadShort";
        }

        @Override  // javassist.i$a
        public String e() {
            return "arrayReadInt";
        }

        @Override  // javassist.i$a
        public String f() {
            return "arrayWriteDouble";
        }

        @Override  // javassist.i$a
        public String g() {
            return "arrayWriteObject";
        }

        @Override  // javassist.i$a
        public String h() {
            return "arrayWriteByteOrBoolean";
        }

        @Override  // javassist.i$a
        public String i() {
            return "arrayReadDouble";
        }

        @Override  // javassist.i$a
        public String j() {
            return "arrayReadFloat";
        }

        @Override  // javassist.i$a
        public String k() {
            return "arrayWriteInt";
        }

        @Override  // javassist.i$a
        public String l() {
            return "arrayWriteChar";
        }

        @Override  // javassist.i$a
        public String m() {
            return "arrayWriteLong";
        }

        @Override  // javassist.i$a
        public String n() {
            return "arrayReadChar";
        }

        @Override  // javassist.i$a
        public String o() {
            return "arrayReadByteOrBoolean";
        }

        @Override  // javassist.i$a
        public String p() {
            return "arrayWriteFloat";
        }
    }

    protected k a;

    public i() {
        this.a = null;
    }

    protected void a(l l0, T t0, t t1) throws javassist.b {
        p p0 = t0.f();
        if(p0 != null) {
            k k0 = this.a;
            if(k0 != null) {
                while(k0 != null) {
                    k0.e(t1, l0, t0);
                    k0 = k0.d();
                }
                q q0 = p0.G();
                while(q0.l()) {
                    try {
                        int v = q0.J();
                        for(k k1 = this.a; k1 != null; k1 = k1.d()) {
                            v = k1.g(l0, v, q0, t1);
                        }
                    }
                    catch(e e0) {
                        throw new javassist.b(e0);
                    }
                }
                k k2 = this.a;
                int v1 = 0;
                while(k2 != null) {
                    int v2 = k2.b();
                    if(v2 > v1) {
                        v1 = v2;
                    }
                    k2 = k2.d();
                }
                for(k k3 = this.a; k3 != null; k3 = k3.d()) {
                    k3.a();
                }
                if(v1 > 0) {
                    p0.K(p0.D() + v1);
                }
                try {
                    t0.t(l0.w(), l0.u());
                }
                catch(e e1) {
                    throw new javassist.b(e1.getMessage(), e1);
                }
            }
        }
    }

    public void b(javassist.q q0, javassist.q q1) throws javassist.b {
        try {
            this.a = new javassist.convert.b(this.a, q0, q1);
        }
        catch(E e0) {
            throw new javassist.b(e0);
        }
    }

    public void c(javassist.q q0, javassist.q q1) throws javassist.b {
        try {
            this.a = new c(this.a, q0, q1);
        }
        catch(E e0) {
            throw new javassist.b(e0);
        }
    }

    public void d(o o0, l l0, String s) {
        this.a = new f(this.a, o0, l0.X(), s);
    }

    public void e(String s, javassist.q q0) throws javassist.b {
        this.a = new d(this.a, s, q0);
    }

    public void f(javassist.q q0, javassist.q q1) throws javassist.b {
        if(!q0.D().h().equals(q1.D().h())) {
            throw new javassist.b("signature mismatch: " + q1.B());
        }
        int v = q0.h();
        int v1 = q1.h();
        if(D.l(v) != D.l(v1) || D.i(v) && !D.i(v1) || q0.f().n0() != q1.f().n0()) {
            throw new javassist.b("invoke-type mismatch " + q1.B());
        }
        this.a = new d(this.a, q0, q1);
    }

    public void g(javassist.q q0, javassist.q q1) {
        this.a = new javassist.convert.e(this.a, q0, q1);
    }

    public void h(l l0, a i$a0) throws E {
        this.a = new javassist.convert.a(this.a, l0.X(), i$a0);
    }

    public void i(o o0, l l0, String s) {
        this.a = new javassist.convert.i(this.a, o0, l0.X(), s);
    }

    public void j(o o0, l l0, String s) {
        this.a = new j(this.a, o0, l0.X(), s);
    }

    public void k(l l0, l l1) {
        this.a = new h(this.a, l0.X(), l1.X());
    }

    public void l(l l0, l l1, String s) {
        this.a = new g(this.a, l0.X(), l1.X(), s);
    }
}

