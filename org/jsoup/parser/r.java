package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.nodes.x;

abstract class r {
    static class a {
    }

    static final class b extends c {
        b(String s) {
            this.v(s);
        }

        @Override  // org.jsoup.parser.r$c
        public String toString() {
            return "<![CDATA[" + this.w() + "]]>";
        }
    }

    static class c extends r implements Cloneable {
        private String e;

        c() {
            super(j.e, null);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return this.u();
        }

        @Override  // org.jsoup.parser.r
        r p() {
            super.p();
            this.e = null;
            return this;
        }

        @Override
        public String toString() {
            return this.w();
        }

        protected c u() {
            try {
                return (c)super.clone();
            }
            catch(CloneNotSupportedException cloneNotSupportedException0) {
                throw new RuntimeException(cloneNotSupportedException0);
            }
        }

        c v(String s) {
            this.e = s;
            return this;
        }

        String w() {
            return this.e;
        }
    }

    static final class d extends r {
        private final StringBuilder e;
        private String f;
        boolean g;

        d() {
            super(j.d, null);
            this.e = new StringBuilder();
            this.g = false;
        }

        @Override  // org.jsoup.parser.r
        r p() {
            super.p();
            r.q(this.e);
            this.f = null;
            this.g = false;
            return this;
        }

        // 去混淆评级： 中等(60)
        @Override
        public String toString() {
            return "<!---->";
        }

        d u(char c) {
            this.w();
            this.e.append(c);
            return this;
        }

        d v(String s) {
            this.w();
            if(this.e.length() == 0) {
                this.f = s;
                return this;
            }
            this.e.append(s);
            return this;
        }

        private void w() {
            String s = this.f;
            if(s != null) {
                this.e.append(s);
                this.f = null;
            }
        }

        String x() [...] // 潜在的解密器
    }

    static final class e extends r {
        final StringBuilder e;
        String f;
        final StringBuilder g;
        final StringBuilder h;
        boolean i;

        e() {
            super(j.a, null);
            this.e = new StringBuilder();
            this.f = null;
            this.g = new StringBuilder();
            this.h = new StringBuilder();
            this.i = false;
        }

        @Override  // org.jsoup.parser.r
        r p() {
            super.p();
            r.q(this.e);
            this.f = null;
            r.q(this.g);
            r.q(this.h);
            this.i = false;
            return this;
        }

        // 去混淆评级： 中等(60)
        @Override
        public String toString() {
            return "<!doctype >";
        }

        String u() [...] // 潜在的解密器

        String v() {
            return this.f;
        }

        String w() [...] // 潜在的解密器

        public String x() [...] // 潜在的解密器

        public boolean y() {
            return this.i;
        }
    }

    static final class f extends r {
        f() {
            super(j.f, null);
        }

        @Override  // org.jsoup.parser.r
        r p() {
            super.p();
            return this;
        }

        @Override
        public String toString() {
            return "";
        }
    }

    static final class g extends i {
        g(v v0) {
            super(j.c, v0);
        }

        @Override  // org.jsoup.parser.r$i
        public String toString() {
            return "</" + this.P() + ">";
        }
    }

    static final class h extends i {
        h(v v0) {
            super(j.b, v0);
        }

        @Override  // org.jsoup.parser.r$i
        i M() {
            super.M();
            this.h = null;
            return this;
        }

        h R(String s, org.jsoup.nodes.b b0) {
            this.e = s;
            this.h = b0;
            this.f = org.jsoup.parser.f.a(s);
            return this;
        }

        @Override  // org.jsoup.parser.r$i
        r p() {
            return this.M();
        }

        // 去混淆评级： 低(25)
        @Override  // org.jsoup.parser.r$i
        public String toString() {
            String s = this.H() ? "/>" : ">";
            return !this.G() || this.h.size() <= 0 ? "<" + this.P() + s : "<" + this.P() + " " + "" + s;
        }
    }

    static abstract class i extends r {
        protected String e;
        protected String f;
        boolean g;
        org.jsoup.nodes.b h;
        private String i;
        private final StringBuilder j;
        private boolean k;
        private String l;
        private final StringBuilder m;
        private boolean n;
        private boolean o;
        final v p;
        final boolean q;
        int r;
        int s;
        int t;
        int u;
        private static final int v = 0x200;
        static final boolean w;

        static {
        }

        i(j r$j0, v v0) {
            super(r$j0, null);
            this.g = false;
            this.j = new StringBuilder();
            this.k = false;
            this.m = new StringBuilder();
            this.n = false;
            this.o = false;
            this.p = v0;
            this.q = v0.m;
        }

        final void A(String s) {
            String s1 = s.replace('\u0000', '\uFFFD');
            String s2 = this.e;
            if(s2 != null) {
                s1 = s2 + s1;
            }
            this.e = s1;
            this.f = org.jsoup.parser.f.a(s1);
        }

        private void B(int v, int v1) {
            this.k = true;
            String s = this.i;
            if(s != null) {
                this.j.append(s);
                this.i = null;
            }
            if(this.q) {
                int v2 = this.r;
                if(v2 > -1) {
                    v = v2;
                }
                this.r = v;
                this.s = v1;
            }
        }

        private void C(int v, int v1) {
            this.n = true;
            String s = this.l;
            if(s != null) {
                this.m.append(s);
                this.l = null;
            }
            if(this.q) {
                int v2 = this.t;
                if(v2 > -1) {
                    v = v2;
                }
                this.t = v;
                this.u = v1;
            }
        }

        final void D() {
            if(this.k) {
                this.K();
            }
        }

        final boolean E(String s) {
            return this.h != null && this.h.y(s);
        }

        final boolean F(String s) {
            return this.h != null && this.h.z(s);
        }

        final boolean G() {
            return this.h != null;
        }

        final boolean H() {
            return this.g;
        }

        final String I() {
            org.jsoup.helper.i.f(this.e == null || this.e.length() == 0);
            return this.e;
        }

        final i J(String s) {
            this.e = s;
            this.f = org.jsoup.parser.f.a(s);
            return this;
        }

        final void K() {
            String s1;
            if(this.h == null) {
                this.h = new org.jsoup.nodes.b();
            }
            if(this.k && this.h.size() < 0x200) {
                String s = (this.j.length() <= 0 ? this.i : this.j.toString()).trim();
                if(s.length() > 0) {
                    if(!this.n) {
                        s1 = this.o ? "" : null;
                    }
                    else if(this.m.length() > 0) {
                        s1 = this.m.toString();
                    }
                    else {
                        s1 = this.l;
                    }
                    this.h.d(s, s1);
                    this.Q(s);
                }
            }
            this.N();
        }

        final String L() {
            return this.f;
        }

        i M() {
            super.p();
            this.e = null;
            this.f = null;
            this.g = false;
            this.h = null;
            this.N();
            return this;
        }

        private void N() {
            r.q(this.j);
            this.i = null;
            this.k = false;
            r.q(this.m);
            this.l = null;
            this.o = false;
            this.n = false;
            if(this.q) {
                this.u = -1;
                this.t = -1;
                this.s = -1;
                this.r = -1;
            }
        }

        final void O() {
            this.o = true;
        }

        final String P() {
            return this.e == null ? "[unset]" : this.e;
        }

        private void Q(String s) {
            if(this.q && this.o()) {
                org.jsoup.parser.a a0 = ((h)this).p.b;
                boolean z = ((h)this).p.h.e();
                Map map0 = (Map)this.h.Q("jsoup.attrs");
                if(map0 == null) {
                    map0 = new HashMap();
                    this.h.S("jsoup.attrs", map0);
                }
                if(!z) {
                    s = org.jsoup.internal.g.a(s);
                }
                if(map0.containsKey(s)) {
                    return;
                }
                if(!this.n) {
                    this.u = this.s;
                    this.t = this.s;
                }
                map0.put(s, new org.jsoup.nodes.x.a(new x(new org.jsoup.nodes.x.b(this.r, a0.B(this.r), a0.f(this.r)), new org.jsoup.nodes.x.b(this.s, a0.B(this.s), a0.f(this.s))), new x(new org.jsoup.nodes.x.b(this.t, a0.B(this.t), a0.f(this.t)), new org.jsoup.nodes.x.b(this.u, a0.B(this.u), a0.f(this.u)))));
            }
        }

        @Override  // org.jsoup.parser.r
        r p() {
            return this.M();
        }

        @Override
        public abstract String toString();

        final void u(char c, int v, int v1) {
            this.B(v, v1);
            this.j.append(c);
        }

        final void v(String s, int v, int v1) {
            String s1 = s.replace('\u0000', '\uFFFD');
            this.B(v, v1);
            if(this.j.length() == 0) {
                this.i = s1;
                return;
            }
            this.j.append(s1);
        }

        final void w(char c, int v, int v1) {
            this.C(v, v1);
            this.m.append(c);
        }

        final void x(String s, int v, int v1) {
            this.C(v, v1);
            if(this.m.length() == 0) {
                this.l = s;
                return;
            }
            this.m.append(s);
        }

        final void y(int[] arr_v, int v, int v1) {
            this.C(v, v1);
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                this.m.appendCodePoint(arr_v[v2]);
            }
        }

        final void z(char c) {
            this.A(String.valueOf(c));
        }
    }

    public static enum j {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF;

        private static j[] a() [...] // Inlined contents
    }

    final j a;
    private int b;
    private int c;
    static final int d = -1;

    private r(j r$j0) {
        this.c = -1;
        this.a = r$j0;
    }

    r(j r$j0, a r$a0) {
        this(r$j0);
    }

    final c a() [...] // Inlined contents

    final d b() [...] // Inlined contents

    final e c() [...] // Inlined contents

    final g d() [...] // Inlined contents

    final h e() [...] // Inlined contents

    int f() {
        return this.c;
    }

    void g(int v) {
        this.c = v;
    }

    final boolean h() [...] // 潜在的解密器

    final boolean j() {
        return this.a == j.e;
    }

    final boolean k() {
        return this.a == j.d;
    }

    final boolean l() {
        return this.a == j.a;
    }

    final boolean m() {
        return this.a == j.f;
    }

    final boolean n() {
        return this.a == j.c;
    }

    final boolean o() {
        return this.a == j.b;
    }

    r p() {
        this.b = -1;
        this.c = -1;
        return this;
    }

    static void q(StringBuilder stringBuilder0) {
        if(stringBuilder0 != null) {
            stringBuilder0.delete(0, stringBuilder0.length());
        }
    }

    int r() {
        return this.b;
    }

    void s(int v) {
        this.b = v;
    }

    String t() {
        return this.getClass().getSimpleName();
    }
}

