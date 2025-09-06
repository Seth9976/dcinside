package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.i;
import org.jsoup.internal.n;
import org.jsoup.nodes.e;
import org.jsoup.nodes.o;
import org.jsoup.nodes.r;
import org.jsoup.nodes.t;
import org.jsoup.nodes.y;

public class b extends v {
    private final String[] A;
    static final String[] B = null;
    static final String[] C = null;
    static final String[] D = null;
    static final String[] E = null;
    static final String[] F = null;
    static final String[] G = null;
    static final String[] H = null;
    static final String[] I = null;
    static final String[] J = null;
    static final String[] K = null;
    public static final int L = 100;
    private static final int M = 0x100;
    private static final int N = 12;
    static final boolean O;
    private c n;
    private c o;
    private boolean p;
    private o q;
    private r r;
    private o s;
    private ArrayList t;
    private ArrayList u;
    private List v;
    private g w;
    private boolean x;
    private boolean y;
    private boolean z;

    static {
        b.B = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        b.C = new String[]{"ol", "ul"};
        b.D = new String[]{"button"};
        b.E = new String[]{"html", "table"};
        b.F = new String[]{"optgroup", "option"};
        b.G = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
        b.H = new String[]{"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        b.I = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
        b.J = new String[]{"mi", "mn", "mo", "ms", "mtext"};
        b.K = new String[]{"desc", "foreignObject", "title"};
    }

    public b() {
        this.A = new String[]{0};
    }

    // 去混淆评级： 低(20)
    static boolean A0(o o0) {
        return "http://www.w3.org/1998/Math/MathML".equals(o0.O2().C()) && n.f(o0.R(), b.J);
    }

    // 去混淆评级： 低(20)
    private static boolean B0(o o0, o o1) {
        return o0.R().equals(o1.R()) && o0.j().equals(o1.j());
    }

    static boolean C0(o o0) {
        return n.f(o0.R(), b.I);
    }

    o D(o o0) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            if(((o)this.e.get(v)) == o0) {
                return (o)this.e.get(v - 1);
            }
        }
        return null;
    }

    o D0() {
        return this.t.size() <= 0 ? null : ((o)this.t.get(this.t.size() - 1));
    }

    void E(org.jsoup.parser.r.c r$c0) {
        org.jsoup.parser.r.c r$c1 = r$c0.u();
        this.v.add(r$c1);
    }

    void E0() {
        this.o = this.n;
    }

    void F(o o0) {
        int v = this.t.size();
        int v1 = v - 1;
        int v2 = v - 13;
        int v3 = 0;
        if(v2 < 0) {
            v2 = 0;
        }
        while(v1 >= v2) {
            o o1 = (o)this.t.get(v1);
            if(o1 == null) {
                break;
            }
            if(b.B0(o0, o1)) {
                ++v3;
            }
            if(v3 == 3) {
                this.t.remove(v1);
                return;
            }
            --v1;
        }
    }

    void F0(o o0) {
        if(this.p) {
            return;
        }
        String s = o0.a("href");
        if(s.length() != 0) {
            this.f = s;
            this.p = true;
            this.d.k0(s);
        }
    }

    void G() {
        while(!this.t.isEmpty() && this.Y0() != null) {
        }
    }

    b G0() {
        return new b();
    }

    private void H(String[] arr_s) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            o o0 = (o)this.e.get(v);
            if("http://www.w3.org/1999/xhtml".equals(o0.O2().C()) && (n.e(o0.R(), arr_s) || o0.L("html"))) {
                break;
            }
            this.s();
        }
    }

    boolean H0(String s) {
        return this.Z(s) != null;
    }

    void I() {
        this.H(new String[]{"tbody", "tfoot", "thead", "template"});
    }

    private static boolean I0(ArrayList arrayList0, o o0) {
        int v = arrayList0.size();
        int v1 = v - 1;
        int v2 = v1 < 0x100 ? 0 : v - 0x101;
        while(v1 >= v2) {
            if(((o)arrayList0.get(v1)) == o0) {
                return true;
            }
            --v1;
        }
        return false;
    }

    void J() {
        this.H(new String[]{"table", "template"});
    }

    boolean J0(o o0) {
        return b.I0(this.e, o0);
    }

    void K() {
        this.H(new String[]{"tr", "template"});
    }

    boolean K0(String[] arr_s) {
        int v = this.e.size();
        int v1 = v - 1;
        int v2 = v1 <= 100 ? 0 : v - 101;
        while(v1 >= v2) {
            if(!n.f(((o)this.e.get(v1)).R(), arr_s)) {
                return true;
            }
            --v1;
        }
        return false;
    }

    void L(String s) {
        this.T(s);
        if(!s.equals(this.c().R())) {
            this.P(this.i1());
        }
        this.M0(s);
    }

    c L0() {
        return this.o;
    }

    o M(h r$h0, String s, boolean z) {
        org.jsoup.nodes.b b0 = z ? r$h0.h : this.h.c(r$h0.h);
        if(b0 != null && !b0.isEmpty() && b0.q(this.h) > 0) {
            this.i("Dropped duplicate attribute(s) in tag [%s]", new Object[]{r$h0.f});
        }
        q q0 = this.A(r$h0.e, s, (z ? f.d : this.h));
        return q0.D().equals("form") ? new r(q0, null, b0) : new o(q0, null, b0);
    }

    o M0(String s) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            o o0 = this.s();
            if(o0.h1(s, "http://www.w3.org/1999/xhtml")) {
                return o0;
            }
        }
        return null;
    }

    c N() {
        return this.u.size() <= 0 ? null : ((c)this.u.get(this.u.size() - 1));
    }

    void N0(String[] arr_s) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            o o0 = this.s();
            if(n.f(o0.R(), arr_s) && "http://www.w3.org/1999/xhtml".equals(o0.O2().C())) {
                break;
            }
        }
    }

    private void O(o o0, org.jsoup.parser.r r0) {
        if(o0.O2().o()) {
            r r1 = this.r;
            if(r1 != null) {
                r1.c3(o0);
            }
        }
        if(this.a.b().a() && o0.D("xmlns") && !o0.g("xmlns").equals(o0.O2().C())) {
            this.i("Invalid xmlns attribute [%s] on tag [%s]", new Object[]{o0.g("xmlns"), o0.P2()});
        }
        if(!this.w0() || !n.f(this.c().R(), z.B)) {
            this.c().D0(o0);
        }
        else {
            this.t0(o0);
        }
        this.x(o0);
    }

    o O0(String s) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            o o0 = this.s();
            if(o0.L(s)) {
                return o0;
            }
        }
        return null;
    }

    void P(c c0) {
        if(this.a.b().a()) {
            this.a.b().add(new d(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.t(), this.g, c0}));
        }
    }

    c P0() {
        return this.u.size() <= 0 ? null : ((c)this.u.remove(this.u.size() - 1));
    }

    void Q(boolean z) {
        this.x = z;
    }

    int Q0(o o0) {
        for(int v = 0; v < this.t.size(); ++v) {
            if(o0 == this.t.get(v)) {
                return v;
            }
        }
        return -1;
    }

    boolean R() {
        return this.x;
    }

    boolean R0(org.jsoup.parser.r r0, c c0) {
        return c0.i(r0, this);
    }

    void S() {
        this.U(false);
    }

    void S0(o o0) {
        this.F(o0);
        this.t.add(o0);
    }

    void T(String s) {
        while(n.f(this.c().R(), b.G) && (s == null || !this.d(s))) {
            this.s();
        }
    }

    void T0(c c0) {
        this.u.add(c0);
    }

    void U(boolean z) {
        String[] arr_s = z ? b.H : b.G;
        while("http://www.w3.org/1999/xhtml".equals(this.c().O2().C()) && n.f(this.c().R(), arr_s)) {
            this.s();
        }
    }

    void U0(o o0, int v) {
        this.F(o0);
        try {
            this.t.add(v, o0);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            this.t.add(o0);
        }
    }

    o V(String s) {
        for(int v = this.t.size() - 1; v >= 0; --v) {
            o o0 = (o)this.t.get(v);
            if(o0 == null) {
                break;
            }
            if(o0.L(s)) {
                return o0;
            }
        }
        return null;
    }

    // This method was un-flattened
    void V0() {
        if(this.e.size() > 0x100) {
            return;
        }
        o o0 = this.D0();
        if(o0 != null && !this.J0(o0)) {
            int v = this.t.size();
            int v1 = v - 1;
            while(v1 != (v - 12 >= 0 ? v - 12 : 0)) {
                --v1;
                o0 = (o)this.t.get(v1);
                if(o0 != null && !this.J0(o0)) {
                    continue;
                }
                goto label_16;
            }
            while(true) {
                i.o(o0);
                o o1 = new o(this.B(o0.R(), this.h), null, o0.j().n());
                this.O(o1, null);
                this.t.set(v1, o1);
                if(v1 == v - 1) {
                    break;
                }
            label_16:
                ++v1;
                o0 = (o)this.t.get(v1);
            }
        }
    }

    String W() {
        return this.f;
    }

    void W0(o o0) {
        for(int v = this.t.size() - 1; v >= 0; --v) {
            if(((o)this.t.get(v)) == o0) {
                this.t.remove(v);
                return;
            }
        }
    }

    org.jsoup.nodes.f X() {
        return this.d;
    }

    boolean X0(o o0) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            if(((o)this.e.get(v)) == o0) {
                this.e.remove(v);
                this.o(o0);
                return true;
            }
        }
        return false;
    }

    r Y() {
        return this.r;
    }

    o Y0() {
        int v = this.t.size();
        return v <= 0 ? null : ((o)this.t.remove(v - 1));
    }

    o Z(String s) {
        int v = this.e.size();
        int v1 = v - 1;
        int v2 = v1 < 0x100 ? 0 : v - 0x101;
        while(v1 >= v2) {
            o o0 = (o)this.e.get(v1);
            if(o0.h1(s, "http://www.w3.org/1999/xhtml")) {
                return o0;
            }
            --v1;
        }
        return null;
    }

    void Z0(o o0, o o1) {
        b.a1(this.t, o0, o1);
    }

    o a0() {
        return this.q;
    }

    private static void a1(ArrayList arrayList0, o o0, o o1) {
        int v = arrayList0.lastIndexOf(o0);
        i.h(v != -1);
        arrayList0.set(v, o1);
    }

    @Override  // org.jsoup.parser.v
    List b() {
        o o0 = this.s;
        if(o0 != null) {
            List list0 = o0.p0();
            if(!list0.isEmpty()) {
                this.s.Y1(-1, list0);
            }
            return this.s.q();
        }
        return this.d.q();
    }

    List b0() {
        return this.v;
    }

    void b1(o o0, o o1) {
        b.a1(this.e, o0, o1);
    }

    ArrayList c0() {
        return this.e;
    }

    void c1() {
        if(!this.H0("body")) {
            this.e.add(this.d.c3());
        }
        this.k1(c.g);
    }

    boolean d0(String s) {
        return this.g0(s, b.D);
    }

    // This method was un-flattened
    boolean d1() {
        int v = this.e.size();
        int v1 = v - 1;
        int v2 = v1 < 0x100 ? 0 : v - 0x101;
        c c0 = this.n;
        if(this.e.size() == 0) {
            this.k1(c.g);
        }
        boolean z = false;
        while(v1 >= v2) {
            o o0 = (o)this.e.get(v1);
            if(v1 == v2) {
                if(this.z) {
                    o0 = this.s;
                }
                z = true;
            }
            String s = o0 == null ? "" : o0.R();
            if("http://www.w3.org/1999/xhtml".equals(o0.O2().C())) {
                s.hashCode();
                switch(s) {
                    case "body": {
                        this.k1(c.g);
                        return this.n != c0;
                    }
                    case "caption": {
                        this.k1(c.k);
                        return this.n != c0;
                    }
                    case "colgroup": {
                        this.k1(c.l);
                        return this.n != c0;
                    }
                    case "frameset": {
                        this.k1(c.t);
                        return this.n != c0;
                    }
                    case "head": {
                        if(!z) {
                            this.k1(c.d);
                            return this.n != c0;
                        }
                        break;
                    }
                    case "html": {
                        this.k1((this.q == null ? c.c : c.f));
                        return this.n != c0;
                    }
                    case "select": {
                        this.k1(c.p);
                        return this.n != c0;
                    }
                    case "table": {
                        this.k1(c.i);
                        return this.n != c0;
                    }
                    case "tbody": 
                    case "tfoot": 
                    case "thead": {
                        this.k1(c.m);
                        return this.n != c0;
                    }
                    case "td": 
                    case "th": {
                        if(!z) {
                            this.k1(c.o);
                            return this.n != c0;
                        }
                        break;
                    }
                    case "template": {
                        c c1 = this.N();
                        i.p(c1, "Bug: no template insertion mode on stack!");
                        this.k1(c1);
                        return this.n != c0;
                    }
                    case "tr": {
                        this.k1(c.n);
                        return this.n != c0;
                    }
                }
                if(z) {
                    this.k1(c.g);
                    return this.n != c0;
                }
            }
            --v1;
        }
        return this.n != c0;
    }

    boolean e0(String s) {
        return this.g0(s, b.C);
    }

    void e1() {
        this.v.clear();
    }

    boolean f0(String s) {
        return this.g0(s, null);
    }

    void f1(r r0) {
        this.r = r0;
    }

    @Override  // org.jsoup.parser.v
    f g() {
        return f.c;
    }

    boolean g0(String s, String[] arr_s) {
        return this.j0(s, b.B, arr_s);
    }

    void g1(boolean z) {
        this.y = z;
    }

    boolean h0(String[] arr_s) {
        return this.k0(arr_s, b.B, null);
    }

    void h1(o o0) {
        this.q = o0;
    }

    boolean i0(String s) {
        for(int v = this.e.size() - 1; v >= 0; --v) {
            String s1 = ((o)this.e.get(v)).R();
            if(s1.equals(s)) {
                return true;
            }
            if(!n.f(s1, b.F)) {
                return false;
            }
        }
        i.d("Should not be reachable");
        return false;
    }

    c i1() {
        return this.n;
    }

    @Override  // org.jsoup.parser.v
    protected void j(Reader reader0, String s, org.jsoup.parser.g g0) {
        super.j(reader0, s, g0);
        this.n = c.a;
        this.o = null;
        this.p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new g(this);
        this.x = true;
        this.y = false;
        this.z = false;
    }

    private boolean j0(String s, String[] arr_s, String[] arr_s1) {
        this.A[0] = s;
        return this.k0(this.A, arr_s, arr_s1);
    }

    int j1() {
        return this.u.size();
    }

    @Override  // org.jsoup.parser.v
    void k(o o0) {
        this.n = c.a;
        this.z = true;
        if(o0 != null) {
            String s = o0.R();
            this.s = new o(this.B(s, this.h), this.f);
            if(o0.W() != null) {
                this.d.x3(o0.W().w3());
            }
            s.hashCode();
            switch(s) {
                case "iframe": 
                case "noembed": 
                case "noframes": {
                    this.c.B(u.e);
                    break;
                }
                case "plaintext": {
                    this.c.B(u.g);
                    break;
                }
                case "script": {
                    this.c.B(u.f);
                    break;
                }
                case "style": {
                    this.c.B(u.e);
                    break;
                }
                case "template": {
                    this.c.B(u.a);
                    this.T0(c.r);
                    break;
                }
                case "textarea": {
                    this.c.B(u.c);
                    break;
                }
                case "title": {
                    this.c.B(u.c);
                    break;
                }
                case "xmp": {
                    this.c.B(u.e);
                    break;
                }
                default: {
                    this.c.B(u.a);
                }
            }
            this.d.D0(this.s);
            this.x(this.s);
            this.d1();
            while(o0 != null) {
                if(o0 instanceof r) {
                    this.r = (r)o0;
                    return;
                }
                o0 = o0.p2();
            }
        }
    }

    private boolean k0(String[] arr_s, String[] arr_s1, String[] arr_s2) {
        int v = this.e.size();
        int v1 = v - 1;
        int v2 = v1 <= 100 ? 0 : v - 101;
        while(v1 >= v2) {
            o o0 = (o)this.e.get(v1);
            if(o0.O2().C().equals("http://www.w3.org/1999/xhtml")) {
                String s = o0.R();
                if(n.f(s, arr_s)) {
                    return true;
                }
                if(n.f(s, arr_s1)) {
                    return false;
                }
                if(arr_s2 != null && n.f(s, arr_s2)) {
                    return false;
                }
            }
            --v1;
        }
        return false;
    }

    void k1(c c0) {
        this.n = c0;
    }

    // 去混淆评级： 低(20)
    @Override  // org.jsoup.parser.v
    protected boolean l(String s) {
        return s.equals("script") || s.equals("style");
    }

    boolean l0(String s) {
        return this.j0(s, b.E, null);
    }

    boolean l1(org.jsoup.parser.r r0) {
        if(this.e.isEmpty()) {
            return true;
        }
        o o0 = this.c();
        String s = o0.O2().C();
        if("http://www.w3.org/1999/xhtml".equals(s)) {
            return true;
        }
        if(b.A0(o0)) {
            if(r0.o() && !"mglyph".equals(((h)r0).f) && !"malignmark".equals(((h)r0).f)) {
                return true;
            }
            if(r0.j()) {
                return true;
            }
        }
        if("http://www.w3.org/1998/Math/MathML".equals(s) && o0.L("annotation-xml") && r0.o() && "svg".equals(((h)r0).f)) {
            return true;
        }
        return !b.y0(o0) || !r0.o() && !r0.j() ? r0.m() : true;
    }

    @Override  // org.jsoup.parser.v
    v m() {
        return this.G0();
    }

    void m0(org.jsoup.parser.r.c r$c0) {
        this.n0(r$c0, this.c());
    }

    void n0(org.jsoup.parser.r.c r$c0, o o0) {
        String s = o0.R();
        String s1 = r$c0.w();
        y y0 = this.l(s) ? new e(s1) : new y(s1);
        o0.D0(y0);
        this.p(y0);
    }

    void o0(org.jsoup.parser.r.d r$d0) {
        org.jsoup.nodes.d d0 = new org.jsoup.nodes.d("");
        this.c().D0(d0);
        this.p(d0);
    }

    o p0(h r$h0) {
        o o0 = this.M(r$h0, "http://www.w3.org/1999/xhtml", false);
        this.O(o0, r$h0);
        if(r$h0.H()) {
            q q0 = o0.O2();
            if(!q0.r()) {
                q0.F();
            }
            else if(!q0.n()) {
                this.c.w("Tag [%s] cannot be self closing; not a void tag", new Object[]{q0.D()});
            }
            this.c.B(u.a);
            this.c.o(this.w.M().J(o0.P2()));
        }
        return o0;
    }

    o q0(h r$h0) {
        o o0 = this.M(r$h0, "http://www.w3.org/1999/xhtml", false);
        this.O(o0, r$h0);
        this.s();
        return o0;
    }

    o r0(h r$h0, String s) {
        o o0 = this.M(r$h0, s, true);
        this.O(o0, r$h0);
        if(r$h0.H()) {
            o0.O2().F();
            this.s();
        }
        return o0;
    }

    r s0(h r$h0, boolean z, boolean z1) {
        r r0 = (r)this.M(r$h0, "http://www.w3.org/1999/xhtml", false);
        if(!z1) {
            this.f1(r0);
        }
        else if(!this.H0("template")) {
            this.f1(r0);
        }
        this.O(r0, r$h0);
        if(!z) {
            this.s();
        }
        return r0;
    }

    // 去混淆评级： 低(20)
    @Override  // org.jsoup.parser.v
    protected boolean t(org.jsoup.parser.r r0) {
        return this.l1(r0) ? this.n.i(r0, this) : c.x.i(r0, this);
    }

    void t0(t t0) {
        o o1;
        o o0 = this.Z("table");
        boolean z = false;
        if(o0 == null) {
            o1 = (o)this.e.get(0);
        }
        else if(o0.p2() != null) {
            o1 = o0.p2();
            z = true;
        }
        else {
            o1 = this.D(o0);
        }
        if(z) {
            i.o(o0);
            o0.P0(t0);
            return;
        }
        o1.D0(t0);
    }

    @Override
    public String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.n + ", currentElement=" + this.c() + '}';
    }

    void u0() {
        this.t.add(null);
    }

    void v0(o o0, o o1) {
        int v = this.e.lastIndexOf(o0);
        i.h(v != -1);
        this.e.add(v + 1, o1);
    }

    boolean w0() {
        return this.y;
    }

    boolean x0() {
        return this.z;
    }

    static boolean y0(o o0) {
        if("http://www.w3.org/1998/Math/MathML".equals(o0.O2().C()) && o0.L("annotation-xml")) {
            String s = org.jsoup.internal.g.b(o0.g("encoding"));
            return !s.equals("text/html") && !s.equals("application/xhtml+xml") ? "http://www.w3.org/2000/svg".equals(o0.O2().C()) && n.e(o0.P2(), b.K) : true;
        }
        return "http://www.w3.org/2000/svg".equals(o0.O2().C()) && n.e(o0.P2(), b.K);
    }

    boolean z0(o o0) {
        return b.I0(this.t, o0);
    }
}

