package org.jsoup.safety;

import java.util.List;
import org.jsoup.helper.i;
import org.jsoup.nodes.e;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;
import org.jsoup.nodes.y;
import org.jsoup.parser.g;
import org.jsoup.select.j;
import org.jsoup.select.l;

public class a {
    static class org.jsoup.safety.a.a {
    }

    final class b implements l {
        private int a;
        private final o b;
        private o c;
        final a d;

        private b(o o0, o o1) {
            this.a = 0;
            this.b = o0;
            this.c = o1;
        }

        b(o o0, o o1, org.jsoup.safety.a.a a$a0) {
            this(o0, o1);
        }

        @Override  // org.jsoup.select.l
        public void a(t t0, int v) {
            if(t0 instanceof o && a.this.a.i(t0.R())) {
                this.c = this.c.p2();
            }
        }

        @Override  // org.jsoup.select.l
        public void b(t t0, int v) {
            if(t0 instanceof o) {
                String s = ((o)t0).R();
                if(a.this.a.i(s)) {
                    c a$c0 = a.this.e(((o)t0));
                    o o0 = a$c0.a;
                    this.c.D0(o0);
                    this.a += a$c0.b;
                    this.c = o0;
                    return;
                }
                if(t0 != this.b) {
                    ++this.a;
                }
            }
            else {
                if(t0 instanceof y) {
                    y y0 = new y(((y)t0).A0());
                    this.c.D0(y0);
                    return;
                }
                if(t0 instanceof e) {
                    String s1 = t0.X().R();
                    if(a.this.a.i(s1)) {
                        e e0 = new e(((e)t0).z0());
                        this.c.D0(e0);
                        return;
                    }
                }
                ++this.a;
            }
        }
    }

    static class c {
        o a;
        int b;

        c(o o0, int v) {
            this.a = o0;
            this.b = v;
        }
    }

    private final org.jsoup.safety.b a;

    public a(org.jsoup.safety.b b0) {
        i.o(b0);
        this.a = b0;
    }

    public f c(f f0) {
        i.o(f0);
        f f1 = f.k3("");
        this.d(f0.c3(), f1.c3());
        f1.t3(f0.s3().d());
        return f1;
    }

    private int d(o o0, o o1) {
        b a$b0 = new b(this, o0, o1, null);
        j.c(a$b0, o0);
        return a$b0.a;
    }

    private c e(o o0) {
        o o1 = o0.K2();
        String s = o0.P2();
        org.jsoup.nodes.b b0 = o1.j();
        o1.X0();
        int v = 0;
        for(Object object0: o0.j()) {
            org.jsoup.nodes.a a0 = (org.jsoup.nodes.a)object0;
            if(this.a.h(s, o0, a0)) {
                b0.J(a0);
            }
            else {
                ++v;
            }
        }
        b0.g(this.a.g(s));
        o1.j().g(b0);
        return new c(o1, v);
    }

    public boolean f(f f0) {
        i.o(f0);
        f f1 = f.k3("");
        return this.d(f0.c3(), f1.c3()) == 0 && f0.p3().q().isEmpty();
    }

    public boolean g(String s) {
        f f0 = f.k3("");
        f f1 = f.k3("");
        org.jsoup.parser.e e0 = org.jsoup.parser.e.d(1);
        List list0 = g.l(s, f1.c3(), "", e0);
        f1.c3().Y1(0, list0);
        return this.d(f1.c3(), f0.c3()) == 0 && e0.isEmpty();
    }
}

