package javassist.compiler;

import java.util.HashMap;
import java.util.Map;
import javassist.E;
import javassist.b;
import javassist.bytecode.C;
import javassist.bytecode.D;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.bytecode.k0;
import javassist.bytecode.k;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.g;
import javassist.l;

public class a {
    private l a;
    private int b;
    private Map c;
    static final String d = "javassist.runtime.Inner";

    public a(l l0) {
        this.a = l0;
        this.b = 1;
        this.c = new HashMap();
    }

    private String a(k k0) {
        String s;
        do {
            int v = this.b;
            this.b = v + 1;
            s = "access$" + v;
        }
        while(k0.q(s) != null);
        return s;
    }

    public String b(l l0, String s, T t0) throws c {
        String s1 = (String)this.c.get("<init>:" + s);
        if(s1 != null) {
            return s1;
        }
        String s2 = w.a("javassist.runtime.Inner", s);
        k k0 = this.a.t();
        try {
            t t1 = k0.l();
            g g0 = this.a.w();
            T t2 = new T(t1, "<init>", s2);
            t2.x(0);
            t2.a(new k0(t1));
            C c0 = t0.i();
            if(c0 != null) {
                t2.a(c0.a(t1, null));
            }
            l[] arr_l = w.i(s, g0);
            j j0 = new j(t1);
            j0.k(0);
            int v1 = 1;
            for(int v = 0; v < arr_l.length; ++v) {
                v1 += j0.j0(v1, arr_l[v]);
            }
            j0.P0(v1 + 1);
            j0.Q(this.a, "<init>", s);
            j0.B0(null);
            t2.y(j0.T0());
            k0.e(t2);
            goto label_33;
        }
        catch(b b0) {
        }
        catch(E e0) {
            throw new c(e0);
        }
        throw new c(b0);
    label_33:
        this.c.put("<init>:" + s, s2);
        return s2;
    }

    public T c(D d0, boolean z) throws c {
        String s = d0.i();
        Object object0 = this.c.get(s + ":getter");
        if(object0 != null) {
            return (T)object0;
        }
        k k0 = this.a.t();
        String s1 = this.a(k0);
        try {
            t t0 = k0.l();
            g g0 = this.a.w();
            String s2 = d0.h();
            T t1 = new T(t0, s1, (z ? "()" + s2 : "(" + w.o(this.a) + ")" + s2));
            t1.x(8);
            t1.a(new k0(t0));
            j j0 = new j(t0);
            if(z) {
                j0.D(j.h, s, s2);
            }
            else {
                j0.k(0);
                j0.B(j.h, s, s2);
                j0.P0(1);
            }
            j0.B0(w.y(s2, g0));
            t1.y(j0.T0());
            k0.e(t1);
            this.c.put(s + ":getter", t1);
            return t1;
        }
        catch(b b0) {
        }
        catch(E e0) {
            throw new c(e0);
        }
        throw new c(b0);
    }

    public T d(D d0, boolean z) throws c {
        int v;
        String s = d0.i();
        Object object0 = this.c.get(s + ":setter");
        if(object0 != null) {
            return (T)object0;
        }
        k k0 = this.a.t();
        String s1 = this.a(k0);
        try {
            t t0 = k0.l();
            g g0 = this.a.w();
            String s2 = d0.h();
            T t1 = new T(t0, s1, (z ? "(" + s2 + ")V" : "(" + w.o(this.a) + s2 + ")V"));
            t1.x(8);
            t1.a(new k0(t0));
            j j0 = new j(t0);
            if(z) {
                v = j0.j0(0, w.y(s2, g0));
                j0.y0(j.h, s, s2);
            }
            else {
                j0.k(0);
                v = j0.j0(1, w.y(s2, g0)) + 1;
                j0.v0(j.h, s, s2);
            }
            j0.B0(null);
            j0.P0(v);
            t1.y(j0.T0());
            k0.e(t1);
            this.c.put(s + ":setter", t1);
            return t1;
        }
        catch(b b0) {
        }
        catch(E e0) {
            throw new c(e0);
        }
        throw new c(b0);
    }

    public String e(String s, String s1, String s2, T t0) throws c {
        String s3 = s + ":" + s1;
        String s4 = (String)this.c.get(s3);
        if(s4 != null) {
            return s4;
        }
        k k0 = this.a.t();
        String s5 = this.a(k0);
        try {
            t t1 = k0.l();
            g g0 = this.a.w();
            T t2 = new T(t1, s5, s2);
            t2.x(8);
            t2.a(new k0(t1));
            C c0 = t0.i();
            if(c0 != null) {
                t2.a(c0.a(t1, null));
            }
            l[] arr_l = w.i(s2, g0);
            j j0 = new j(t1);
            int v1 = 0;
            for(int v = 0; v < arr_l.length; ++v) {
                v1 += j0.j0(v1, arr_l[v]);
            }
            j0.P0(v1);
            if(s1 == s2) {
                j0.W(this.a, s, s1);
            }
            else {
                j0.a0(this.a, s, s1);
            }
            j0.B0(w.j(s1, g0));
            t2.y(j0.T0());
            k0.e(t2);
            goto label_36;
        }
        catch(b b0) {
        }
        catch(E e0) {
            throw new c(e0);
        }
        throw new c(b0);
    label_36:
        this.c.put(s3, s5);
        return s5;
    }
}

