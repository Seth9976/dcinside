package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.List;
import org.jsoup.helper.e;
import org.jsoup.helper.i;
import org.jsoup.internal.n;
import org.jsoup.parser.g;
import org.jsoup.parser.q;
import org.jsoup.select.g.N;

public class f extends o {
    public static class a implements Cloneable {
        public static enum org.jsoup.nodes.f.a.a {
            html,
            xml;

            private static org.jsoup.nodes.f.a.a[] a() [...] // Inlined contents
        }

        private c a;
        private Charset b;
        b c;
        private final ThreadLocal d;
        private boolean e;
        private boolean f;
        private int g;
        private int h;
        private org.jsoup.nodes.f.a.a i;

        public a() {
            this.a = c.f;
            this.d = new ThreadLocal();
            this.e = true;
            this.f = false;
            this.g = 1;
            this.h = 30;
            this.i = org.jsoup.nodes.f.a.a.a;
            this.c(e.b);
        }

        public Charset a() {
            return this.b;
        }

        public a b(String s) {
            this.c(Charset.forName(s));
            return this;
        }

        public a c(Charset charset0) {
            this.b = charset0;
            this.c = b.b(charset0.name());
            return this;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.d();
        }

        public a d() {
            a f$a0;
            try {
                f$a0 = (a)super.clone();
            }
            catch(CloneNotSupportedException cloneNotSupportedException0) {
                throw new RuntimeException(cloneNotSupportedException0);
            }
            f$a0.b(this.b.name());
            f$a0.a = c.valueOf(this.a.name());
            return f$a0;
        }

        CharsetEncoder e() {
            CharsetEncoder charsetEncoder0 = (CharsetEncoder)this.d.get();
            return charsetEncoder0 == null ? this.o() : charsetEncoder0;
        }

        public a f(c p$c0) {
            this.a = p$c0;
            return this;
        }

        public c g() {
            return this.a;
        }

        public int h() {
            return this.g;
        }

        public a j(int v) {
            i.h(v >= 0);
            this.g = v;
            return this;
        }

        public int k() {
            return this.h;
        }

        public a l(int v) {
            i.h(v >= -1);
            this.h = v;
            return this;
        }

        public a m(boolean z) {
            this.f = z;
            return this;
        }

        public boolean n() {
            return this.f;
        }

        CharsetEncoder o() {
            CharsetEncoder charsetEncoder0 = this.b.newEncoder();
            this.d.set(charsetEncoder0);
            return charsetEncoder0;
        }

        public a p(boolean z) {
            this.e = z;
            return this;
        }

        public boolean q() {
            return this.e;
        }

        public org.jsoup.nodes.f.a.a r() {
            return this.i;
        }

        public a s(org.jsoup.nodes.f.a.a f$a$a0) {
            this.i = f$a$a0;
            if(f$a$a0 == org.jsoup.nodes.f.a.a.b) {
                this.f(c.e);
            }
            return this;
        }
    }

    public static enum org.jsoup.nodes.f.b {
        noQuirks,
        quirks,
        limitedQuirks;

        private static org.jsoup.nodes.f.b[] a() [...] // Inlined contents
    }

    private org.jsoup.b l;
    private a m;
    private g n;
    private org.jsoup.nodes.f.b o;
    private final String p;
    private boolean q;
    private static final org.jsoup.select.g r;

    static {
        f.r = new N("title");
    }

    public f(String s) {
        this("http://www.w3.org/1999/xhtml", s);
    }

    public f(String s, String s1) {
        super(q.I("#root", s, org.jsoup.parser.f.c), s1);
        this.m = new a();
        this.o = org.jsoup.nodes.f.b.a;
        this.q = false;
        this.p = s1;
        this.n = g.d();
    }

    public void A3(String s) {
        i.o(s);
        o o0 = this.p3().H2(f.r);
        if(o0 == null) {
            o0 = this.p3().F0("title");
        }
        o0.T2(s);
    }

    public void B3(boolean z) {
        this.q = z;
    }

    public boolean C3() {
        return this.q;
    }

    @Override  // org.jsoup.nodes.o
    public o K2() {
        return this.y3();
    }

    @Override  // org.jsoup.nodes.o
    public String N() {
        return "#document";
    }

    @Override  // org.jsoup.nodes.t
    public String S() {
        return super.T1();
    }

    @Override  // org.jsoup.nodes.o
    public o T2(String s) {
        this.c3().T2(s);
        return this;
    }

    @Override  // org.jsoup.nodes.o
    public o Y0() {
        return this.f3();
    }

    public o c3() {
        o o0 = this.q3();
        o o1 = o0.p1();
        while(o1 != null) {
            if(!o1.L("body") && !o1.L("frameset")) {
                o1 = o1.k2();
                continue;
            }
            return o1;
        }
        return o0.F0("body");
    }

    @Override  // org.jsoup.nodes.o
    public Object clone() throws CloneNotSupportedException {
        return this.f3();
    }

    public Charset d3() {
        return this.m.a();
    }

    public void e3(Charset charset0) {
        this.B3(true);
        this.m.c(charset0);
        this.m3();
    }

    public f f3() {
        f f0 = (f)super.Y0();
        f0.m = this.m.d();
        return f0;
    }

    public org.jsoup.b g3() {
        return this.l == null ? org.jsoup.g.f() : this.l;
    }

    public f h3(org.jsoup.b b0) {
        i.o(b0);
        this.l = b0;
        return this;
    }

    // 去混淆评级： 低(20)
    public o j3(String s) {
        return new o(q.I(s, this.n.a(), org.jsoup.parser.f.d), "");
    }

    public static f k3(String s) {
        i.o(s);
        f f0 = new f(s);
        f0.n = f0.v3();
        o o0 = f0.F0("html");
        o0.F0("head");
        o0.F0("body");
        return f0;
    }

    public org.jsoup.nodes.g l3() {
        for(Object object0: this.g) {
            t t0 = (t)object0;
            if(t0 instanceof org.jsoup.nodes.g) {
                return (org.jsoup.nodes.g)t0;
            }
            if(!(t0 instanceof s)) {
                break;
            }
        }
        return null;
    }

    private void m3() {
        if(this.q) {
            org.jsoup.nodes.f.a.a f$a$a0 = this.s3().r();
            if(f$a$a0 == org.jsoup.nodes.f.a.a.a) {
                o o0 = this.G2("meta[charset]");
                if(o0 == null) {
                    this.p3().F0("meta").L0("charset", this.d3().displayName());
                }
                else {
                    o0.L0("charset", this.d3().displayName());
                }
                this.E2("meta[name=charset]").T();
                return;
            }
            if(f$a$a0 == org.jsoup.nodes.f.a.a.b) {
                t t0 = (t)this.y().get(0);
                if(t0 instanceof z) {
                    if(!((z)t0).B0().equals("xml")) {
                        goto label_18;
                    }
                    ((z)t0).h("encoding", this.d3().displayName());
                    if(((z)t0).D("version")) {
                        ((z)t0).h("version", "1.0");
                        return;
                    label_18:
                        z z0 = new z("xml", false);
                        z0.h("version", "1.0");
                        z0.h("encoding", this.d3().displayName());
                        this.s2(z0);
                    }
                }
                else {
                    z z1 = new z("xml", false);
                    z1.h("version", "1.0");
                    z1.h("encoding", this.d3().displayName());
                    this.s2(z1);
                }
            }
        }
    }

    @Override  // org.jsoup.nodes.o
    public t n0() {
        return this.y3();
    }

    public r n3(String s) {
        for(Object object0: this.E2(s)) {
            o o0 = (o)object0;
            if(o0 instanceof r) {
                return (r)o0;
            }
            if(false) {
                break;
            }
        }
        i.e("No form elements matched the query \'%s\' in the document.", new Object[]{s});
        return null;
    }

    public List o3() {
        return this.E2("form").x();
    }

    public o p3() {
        o o0 = this.q3();
        for(o o1 = o0.p1(); o1 != null; o1 = o1.k2()) {
            if(o1.L("head")) {
                return o1;
            }
        }
        return o0.u2("head");
    }

    private o q3() {
        for(o o0 = this.p1(); o0 != null; o0 = o0.k2()) {
            if(o0.L("html")) {
                return o0;
            }
        }
        return this.F0("html");
    }

    public String r3() {
        return this.p;
    }

    public a s3() {
        return this.m;
    }

    public f t3(a f$a0) {
        i.o(f$a0);
        this.m = f$a0;
        return this;
    }

    @Override  // org.jsoup.nodes.o
    public t u() {
        return this.f3();
    }

    public f u3(g g0) {
        this.n = g0;
        return this;
    }

    public g v3() {
        return this.n;
    }

    public org.jsoup.nodes.f.b w3() {
        return this.o;
    }

    public f x3(org.jsoup.nodes.f.b f$b0) {
        this.o = f$b0;
        return this;
    }

    public f y3() {
        f f0 = new f(this.O2().C(), "");
        org.jsoup.nodes.b b0 = this.h;
        if(b0 != null) {
            f0.h = b0.n();
        }
        f0.m = this.m.d();
        return f0;
    }

    public String z3() {
        o o0 = this.p3().H2(f.r);
        return o0 == null ? "" : n.s(o0.S2()).trim();
    }
}

