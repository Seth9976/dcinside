package com.google.common.net;

import J1.b;
import O1.j;
import com.google.common.base.C;
import com.google.common.base.H;
import com.google.common.base.M;
import com.google.common.base.c;
import com.google.common.base.e;
import com.google.common.base.y;
import com.google.common.collect.O2;
import java.util.List;

@b(emulated = true)
@j
@a
public final class f {
    private final String a;
    private final O2 b;
    @P1.b
    private int c;
    @P1.b
    private int d;
    private static final e e = null;
    private static final M f = null;
    private static final y g = null;
    private static final int h = -1;
    private static final int i = -2;
    private static final int j = 0x7F;
    private static final int k = 0xFD;
    private static final int l = 0x3F;
    private static final e m;
    private static final e n;
    private static final e o;
    private static final e p;

    static {
        f.e = e.d(".。．｡");
        f.f = M.h('.');
        f.g = y.o('.');
        e e0 = e.d("-_");
        f.m = e0;
        e e1 = e.m('0', '9');
        f.n = e1;
        e e2 = e.m('a', 'z').I(e.m('A', 'Z'));
        f.o = e2;
        f.p = e1.I(e2).I(e0);
    }

    f(String s) {
        this.c = -2;
        this.d = -2;
        String s1 = c.g(f.e.N(s, '.'));
        boolean z = true;
        if(s1.endsWith(".")) {
            s1 = s1.substring(0, s1.length() - 1);
        }
        H.u(s1.length() <= 0xFD, "Domain name too long: \'%s\':", s1);
        this.a = s1;
        O2 o20 = O2.q(f.f.n(s1));
        this.b = o20;
        if(o20.size() > 0x7F) {
            z = false;
        }
        H.u(z, "Domain has too many parts: \'%s\'", s1);
        H.u(f.y(o20), "Not a valid domain name: \'%s\'", s1);
    }

    private f a(int v) {
        O2 o20 = this.b.R(v, this.b.size());
        return f.d(f.g.k(o20));
    }

    public f b(String s) {
        return f.d((((String)H.E(s)) + "." + this.a));
    }

    private int c(C c0) {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            O2 o20 = this.b.R(v1, v);
            String s = f.g.k(o20);
            if(v1 > 0 && f.o(c0, C.c(((com.google.thirdparty.publicsuffix.b)com.google.thirdparty.publicsuffix.a.b.get(s))))) {
                return v1 - 1;
            }
            if(f.o(c0, C.c(((com.google.thirdparty.publicsuffix.b)com.google.thirdparty.publicsuffix.a.a.get(s))))) {
                return v1;
            }
            if(com.google.thirdparty.publicsuffix.a.c.containsKey(s)) {
                return v1 + 1;
            }
        }
        return -1;
    }

    @O1.a
    public static f d(String s) {
        return new f(((String)H.E(s)));
    }

    public boolean e() {
        return this.b.size() > 1;
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof f ? this.a.equals(((f)object0).a) : false;
    }

    public boolean f() {
        return this.s() != -1;
    }

    public boolean g() {
        return this.u() != -1;
    }

    public boolean h() {
        return this.s() == 0;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        return this.u() == 0;
    }

    public boolean j() {
        return this.u() == 1;
    }

    public boolean k() {
        return this.s() == 1;
    }

    public boolean l() {
        return this.s() > 0;
    }

    public boolean m() {
        return this.u() > 0;
    }

    public static boolean n(String s) {
        try {
            f.d(s);
            return true;
        }
        catch(IllegalArgumentException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    private static boolean o(C c0, C c1) {
        return c0.e() ? c0.equals(c1) : c1.e();
    }

    public f p() {
        H.x0(this.e(), "Domain \'%s\' has no parent", this.a);
        return this.a(1);
    }

    public O2 q() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @o3.a
    public f r() {
        return this.f() ? this.a(this.s()) : null;
    }

    private int s() {
        int v = this.c;
        if(v == -2) {
            v = this.c(C.a());
            this.c = v;
        }
        return v;
    }

    // 去混淆评级： 低(20)
    @o3.a
    public f t() {
        return this.g() ? this.a(this.u()) : null;
    }

    @Override
    public String toString() {
        return this.a;
    }

    private int u() {
        int v = this.d;
        if(v == -2) {
            v = this.c(C.f(com.google.thirdparty.publicsuffix.b.d));
            this.d = v;
        }
        return v;
    }

    public f v() {
        if(this.j()) {
            return this;
        }
        H.x0(this.m(), "Not under a registry suffix: %s", this.a);
        return this.a(this.u() - 1);
    }

    public f w() {
        if(this.k()) {
            return this;
        }
        H.x0(this.l(), "Not under a public suffix: %s", this.a);
        return this.a(this.s() - 1);
    }

    private static boolean x(String s, boolean z) {
        if(s.length() >= 1 && s.length() <= 0x3F) {
            String s1 = e.f().P(s);
            return f.p.C(s1) ? !f.m.B(s.charAt(0)) && !f.m.B(s.charAt(s.length() - 1)) && (!z || !f.n.B(s.charAt(0))) : false;
        }
        return false;
    }

    private static boolean y(List list0) {
        int v = list0.size();
        if(!f.x(((String)list0.get(v - 1)), true)) {
            return false;
        }
        for(int v1 = 0; v1 < v - 1; ++v1) {
            if(!f.x(((String)list0.get(v1)), false)) {
                return false;
            }
        }
        return true;
    }
}

