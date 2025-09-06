package javassist.tools.reflect;

import javassist.D;
import javassist.E;
import javassist.G;
import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.k;
import javassist.g;
import javassist.i;
import javassist.l;
import javassist.o.f;
import javassist.o;
import javassist.q.a;
import javassist.q;
import javassist.t;

public class j implements G {
    protected q a;
    protected q b;
    protected q c;
    protected q d;
    protected l[] e;
    protected g f;
    protected i g;
    static final String h = "_classobject";
    static final String i = "_getClass";
    static final String j = "_metaobject";
    static final String k = "_getMetaobject";
    static final String l = "_setMetaobject";
    static final String m = "_r_";
    static final String n = "_w_";
    static final String o = "javassist.tools.reflect.Metaobject";
    static final String p = "javassist.tools.reflect.ClassMetaobject";

    public j() {
        this.f = null;
        this.g = new i();
    }

    @Override  // javassist.G
    public void a(g g0) throws E {
        try {
            this.f = g0;
            l l0 = g0.s("javassist.tools.reflect.Sample");
            this.l(l0.t());
            this.a = l0.H("trap");
            this.b = l0.H("trapStatic");
            this.c = l0.H("trapRead");
            this.d = l0.H("trapWrite");
            this.e = new l[]{this.f.s("java.lang.Object")};
        }
        catch(E unused_ex) {
            throw new RuntimeException("javassist.tools.reflect.Sample is not found or broken.");
        }
        catch(e unused_ex) {
            throw new RuntimeException("javassist.tools.reflect.Sample is not found or broken.");
        }
    }

    @Override  // javassist.G
    public void b(g g0, String s) throws b, E {
        g0.s(s).h0(this.g);
    }

    private q c(q q0, boolean z) throws E {
        if(z) {
            return q0;
        }
        String s = q0.i();
        q[] arr_q = q0.f().J();
        for(int v = 0; v < arr_q.length; ++v) {
            String s1 = arr_q[v].i();
            if(s1.endsWith(s) && s1.startsWith("_m_") && arr_q[v].j().equals(q0.j())) {
                return arr_q[v];
            }
        }
        return q0;
    }

    // 去混淆评级： 中等(60)
    private boolean d(String s) {
        return s.startsWith("_m_") || s.equals("_getClass") || s.equals("_setMetaobject") || s.equals("_getMetaobject") || s.startsWith("_r_") || s.startsWith("_w_");
    }

    public boolean e(Class class0, Class class1, Class class2) throws b, E {
        return this.f(class0.getName(), class1.getName(), class2.getName());
    }

    public boolean f(String s, String s1, String s2) throws b, E {
        return this.g(this.f.s(s), this.f.s(s1), this.f.s(s2));
    }

    public boolean g(l l0, l l1, l l2) throws b, c, E {
        if(l0.n0()) {
            throw new c("Cannot reflect an interface: " + l0.X());
        }
        if(l0.J0(this.f.s("javassist.tools.reflect.ClassMetaobject"))) {
            throw new c("Cannot reflect a subclass of ClassMetaobject: " + l0.X());
        }
        if(l0.J0(this.f.s("javassist.tools.reflect.Metaobject"))) {
            throw new c("Cannot reflect a subclass of Metaobject: " + l0.X());
        }
        this.m(l0);
        return this.h(l0, l1, l2);
    }

    private boolean h(l l0, l l1, l l2) throws b, E {
        if(l0.r("Reflective") != null) {
            return false;
        }
        l0.C0("Reflective", new byte[0]);
        l l3 = this.f.s("javassist.tools.reflect.Metalevel");
        boolean z = l0.K0(l3);
        if(!z) {
            l0.e(l3);
        }
        this.j(l0, !z);
        this.i(l0);
        if(!z) {
            o o0 = new o(this.f.s("javassist.tools.reflect.Metaobject"), "_metaobject", l0);
            o0.q(4);
            l0.d(o0, f.k(l1));
            l0.f(t.f("_getMetaobject", o0));
            l0.f(t.k("_setMetaobject", o0));
        }
        o o1 = new o(this.f.s("javassist.tools.reflect.ClassMetaobject"), "_classobject", l0);
        o1.q(10);
        l0.d(o1, f.h(l2, new String[]{l0.X()}));
        l0.f(t.f("_getClass", o1));
        return true;
    }

    private void i(l l0) throws b, E {
        o[] arr_o = l0.G();
        for(int v = 0; v < arr_o.length; ++v) {
            o o0 = arr_o[v];
            int v1 = o0.h();
            if((v1 & 1) != 0 && (v1 & 16) == 0) {
                String s = o0.i();
                l l1 = o0.y();
                q q0 = t.l(l1, "_r_" + s, this.e, null, this.c, a.h(s), l0);
                q0.q(v1 | 8);
                l0.f(q0);
                l[] arr_l = {this.f.s("java.lang.Object"), l1};
                q q1 = t.l(l.m, "_w_" + s, arr_l, null, this.d, a.h(s), l0);
                q1.q(v1 | 8);
                l0.f(q1);
            }
        }
    }

    private void j(l l0, boolean z) throws b, E {
        q[] arr_q = l0.V();
        for(int v = 0; v < arr_q.length; ++v) {
            q q0 = arr_q[v];
            int v1 = q0.h();
            if(D.k(v1) && !D.b(v1)) {
                this.k(v1, l0, q0, v, z);
            }
        }
    }

    private void k(int v, l l0, q q0, int v1, boolean z) throws b, E {
        q q1;
        String s = q0.i();
        if(this.d(s)) {
            return;
        }
        if(q0.f() == l0) {
            if(D.g(v)) {
                return;
            }
            if(D.e(v)) {
                v &= -17;
                q0.q(v);
            }
            q1 = q0;
        }
        else {
            if(D.e(v)) {
                return;
            }
            v &= 0xFFFFFEFF;
            q1 = t.d(this.c(q0, z), l0);
            q1.q(v);
            l0.f(q1);
        }
        q1.g0("_m_" + v1 + "_" + s);
        q q2 = D.l(v) ? this.b : this.a;
        q q3 = t.l(q0.b0(), s, q0.G(), q0.A(), q2, a.f(v1), l0);
        q3.q(v);
        l0.f(q3);
    }

    public void l(k k0) throws e {
        if(k.y < 50) {
            return;
        }
        for(Object object0: k0.r()) {
            ((T)object0).r(this.f);
        }
    }

    private void m(l l0) {
        o[] arr_o = l0.G();
        for(int v = 0; v < arr_o.length; ++v) {
            o o0 = arr_o[v];
            int v1 = o0.h();
            if((v1 & 1) != 0 && (v1 & 16) == 0) {
                String s = o0.i();
                this.g.i(o0, l0, "_r_" + s);
                this.g.j(o0, l0, "_w_" + s);
            }
        }
    }
}

