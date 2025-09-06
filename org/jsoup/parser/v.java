package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.helper.i;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import org.jsoup.nodes.x.b;
import org.jsoup.nodes.x;
import org.jsoup.select.l;

abstract class v {
    protected g a;
    a b;
    t c;
    f d;
    ArrayList e;
    String f;
    r g;
    org.jsoup.parser.f h;
    Map i;
    l j;
    private h k;
    private final org.jsoup.parser.r.g l;
    boolean m;

    v() {
        this.l = new org.jsoup.parser.r.g(this);
    }

    q A(String s, String s1, org.jsoup.parser.f f0) {
        q q0 = (q)this.i.get(s);
        if(q0 != null && q0.C().equals(s1)) {
            return q0;
        }
        q q1 = q.I(s, s1, f0);
        this.i.put(s, q1);
        return q1;
    }

    // 去混淆评级： 低(20)
    q B(String s, org.jsoup.parser.f f0) {
        return this.A(s, "http://www.w3.org/1999/xhtml", f0);
    }

    private void C(org.jsoup.nodes.t t0, boolean z) {
        if(!this.m) {
            return;
        }
        r r0 = this.g;
        int v = r0.r();
        int v1 = r0.f();
        if(t0 instanceof o) {
            if(r0.m()) {
                if(((o)t0).k1().e()) {
                    return;
                }
                v = this.b.P();
                v1 = v;
            }
            else if(!z) {
                if(!((o)t0).O2().n() && !((o)t0).O2().t() && (!r0.n() || !((o)t0).R().equals(((org.jsoup.parser.r.g)r0).f))) {
                    v1 = v;
                }
            }
            else if(!r0.o() || !((o)t0).R().equals(((h)r0).f)) {
                v1 = v;
            }
        }
        x x0 = new x(new b(v, this.b.B(v), this.b.f(v)), new b(v1, this.b.B(v1), this.b.f(v1)));
        t0.j().S((z ? "jsoup.start" : "jsoup.end"), x0);
    }

    void a() {
        a a0 = this.b;
        if(a0 == null) {
            return;
        }
        a0.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.i = null;
    }

    abstract List b();

    o c() {
        int v = this.e.size();
        return v > 0 ? ((o)this.e.get(v - 1)) : this.d;
    }

    boolean d(String s) {
        if(this.e.size() == 0) {
            return false;
        }
        o o0 = this.c();
        return o0 != null && o0.R().equals(s) && o0.O2().C().equals("http://www.w3.org/1999/xhtml");
    }

    boolean e(String s, String s1) {
        if(this.e.size() == 0) {
            return false;
        }
        o o0 = this.c();
        return o0 != null && o0.R().equals(s) && o0.O2().C().equals(s1);
    }

    String f() [...] // 潜在的解密器

    abstract org.jsoup.parser.f g();

    void h(String s) {
        this.i(s, null);
    }

    void i(String s, Object[] arr_object) {
        e e0 = this.a.b();
        if(e0.a()) {
            e0.add(new d(this.b, s, arr_object));
        }
    }

    void j(Reader reader0, String s, g g0) {
        i.q(reader0, "input");
        i.q(s, "baseUri");
        i.o(g0);
        f f0 = new f(g0.a(), s);
        this.d = f0;
        f0.u3(g0);
        this.a = g0;
        this.h = g0.t();
        this.b = new a(reader0);
        this.m = g0.g();
        this.b.W(g0.f() || this.m);
        this.c = new t(this);
        this.e = new ArrayList(0x20);
        this.i = new HashMap();
        h r$h0 = new h(this);
        this.k = r$h0;
        this.g = r$h0;
        this.f = s;
    }

    void k(o o0) {
    }

    boolean l(String s) {
        return false;
    }

    abstract v m();

    void n(l l0) {
        this.j = l0;
    }

    void o(org.jsoup.nodes.t t0) {
        this.C(t0, false);
        l l0 = this.j;
        if(l0 != null) {
            l0.a(t0, this.e.size());
        }
    }

    void p(org.jsoup.nodes.t t0) {
        this.C(t0, true);
        l l0 = this.j;
        if(l0 != null) {
            l0.b(t0, this.e.size());
        }
    }

    f q(Reader reader0, String s, g g0) {
        this.j(reader0, s, g0);
        this.y();
        return this.d;
    }

    List r(String s, o o0, String s1, g g0) {
        this.j(new StringReader(s), s1, g0);
        this.k(o0);
        this.y();
        return this.b();
    }

    final o s() {
        o o0 = (o)this.e.remove(this.e.size() - 1);
        this.o(o0);
        return o0;
    }

    abstract boolean t(r arg1);

    boolean u(String s) {
        return this.g == this.l ? this.t(new org.jsoup.parser.r.g(this).J(s)) : this.t(this.l.M().J(s));
    }

    boolean v(String s) {
        return this.g == this.k ? this.t(new h(this).J(s)) : this.t(this.k.M().J(s));
    }

    boolean w(String s, org.jsoup.nodes.b b0) {
        h r$h0 = this.k;
        if(this.g == r$h0) {
            return this.t(new h(this).R(s, b0));
        }
        r$h0.M();
        r$h0.R(s, b0);
        return this.t(r$h0);
    }

    final void x(o o0) {
        this.e.add(o0);
        this.p(o0);
    }

    void y() {
        while(this.z()) {
        }
        this.a();
    }

    boolean z() {
        if(this.g.a == j.f) {
            if(this.e != null && !this.e.isEmpty()) {
                this.s();
                return true;
            }
            return false;
        }
        r r0 = this.c.A();
        this.g = r0;
        this.t(r0);
        r0.p();
        return true;
    }
}

