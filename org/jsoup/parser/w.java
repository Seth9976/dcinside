package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.helper.i;
import org.jsoup.nodes.b;
import org.jsoup.nodes.f;
import org.jsoup.nodes.g;
import org.jsoup.nodes.o;
import org.jsoup.nodes.s;
import org.jsoup.nodes.y;
import org.jsoup.nodes.z;

public class w extends v {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[j.values().length];
            a.a = arr_v;
            try {
                arr_v[j.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[j.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[j.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[j.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[j.a.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[j.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int n = 0x100;

    void D(c r$c0) {
        this.H(new y(r$c0.w()));
    }

    void E(d r$d0) {
        org.jsoup.nodes.d d0 = new org.jsoup.nodes.d("");
        if(r$d0.g && d0.B0()) {
            z z0 = d0.y0();
            if(z0 != null) {
                d0 = z0;
            }
        }
        this.H(d0);
    }

    void F(e r$e0) {
        g g0 = new g(this.h.d(""), "", "");
        g0.B0(r$e0.v());
        this.H(g0);
    }

    void G(h r$h0) {
        q q0 = this.B(r$h0.I(), this.h);
        b b0 = r$h0.h;
        if(b0 != null) {
            b0.q(this.h);
        }
        o o0 = new o(q0, null, this.h.c(r$h0.h));
        this.c().D0(o0);
        this.x(o0);
        if(r$h0.H()) {
            q0.F();
            this.s();
        }
    }

    void H(s s0) {
        this.c().D0(s0);
        this.p(s0);
    }

    w I() {
        return new w();
    }

    f J(Reader reader0, String s) {
        return this.q(reader0, s, new org.jsoup.parser.g(this));
    }

    f K(String s, String s1) {
        return this.q(new StringReader(s), s1, new org.jsoup.parser.g(this));
    }

    protected void L(org.jsoup.parser.r.g r$g0) {
        String s = this.h.d(r$g0.e);
        int v = this.e.size();
        for(int v1 = this.e.size() - 1; true; --v1) {
            o o0 = null;
            if(v1 < (v - 1 < 0x100 ? 0 : v - 0x101)) {
                break;
            }
            o o1 = (o)this.e.get(v1);
            if(o1.N().equals(s)) {
                o0 = o1;
                break;
            }
        }
        if(o0 == null) {
            return;
        }
        for(int v2 = this.e.size() - 1; v2 >= 0 && this.s() != o0; --v2) {
        }
    }

    @Override  // org.jsoup.parser.v
    List b() {
        return this.d.q();
    }

    @Override  // org.jsoup.parser.v
    public String f() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override  // org.jsoup.parser.v
    org.jsoup.parser.f g() {
        return org.jsoup.parser.f.d;
    }

    @Override  // org.jsoup.parser.v
    protected void j(Reader reader0, String s, org.jsoup.parser.g g0) {
        super.j(reader0, s, g0);
        this.d.s3().s(org.jsoup.nodes.f.a.a.b).f(org.jsoup.nodes.p.c.e).p(false);
    }

    @Override  // org.jsoup.parser.v
    v m() {
        return this.I();
    }

    @Override  // org.jsoup.parser.v
    protected boolean t(r r0) {
        this.g = r0;
        switch(r0.a) {
            case 1: {
                this.G(((h)r0));
                break;
            }
            case 2: {
                this.L(((org.jsoup.parser.r.g)r0));
                return true;
            }
            case 3: {
                this.E(((d)r0));
                return true;
            }
            case 4: {
                this.D(((c)r0));
                return true;
            }
            case 5: {
                this.F(((e)r0));
                return true;
            }
            case 6: {
                break;
            }
            default: {
                i.d(("Unexpected token type: " + r0.a));
                return true;
            }
        }
        return true;
    }
}

