package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;

public class g {
    private v a;
    private e b;
    private f c;
    private boolean d;
    public static final String e = "http://www.w3.org/1999/xhtml";
    public static final String f = "http://www.w3.org/XML/1998/namespace";
    public static final String g = "http://www.w3.org/1998/Math/MathML";
    public static final String h = "http://www.w3.org/2000/svg";

    private g(g g0) {
        this.d = false;
        this.a = g0.a.m();
        this.b = new e(g0.b);
        this.c = new f(g0.c);
        this.d = g0.d;
    }

    public g(v v0) {
        this.d = false;
        this.a = v0;
        this.c = v0.g();
        this.b = e.c();
    }

    // 去混淆评级： 低(20)
    public String a() {
        return "http://www.w3.org/1999/xhtml";
    }

    public e b() {
        return this.b;
    }

    public v c() {
        return this.a;
    }

    public static g d() {
        return new g(new b());
    }

    public boolean e(String s) {
        return this.c().l(s);
    }

    public boolean f() {
        return this.b.b() > 0;
    }

    public boolean g() {
        return this.d;
    }

    public g h() {
        return new g(this);
    }

    public static org.jsoup.nodes.f i(String s, String s1) {
        b b0 = new b();
        return b0.q(new StringReader(s), s1, new g(b0));
    }

    public static org.jsoup.nodes.f j(String s, String s1) {
        org.jsoup.nodes.f f0 = org.jsoup.nodes.f.k3(s1);
        o o0 = f0.c3();
        t[] arr_t = (t[])g.k(s, o0, s1).toArray(new t[0]);
        for(int v1 = arr_t.length - 1; v1 > 0; --v1) {
            arr_t[v1].d0();
        }
        for(int v = 0; v < arr_t.length; ++v) {
            o0.D0(arr_t[v]);
        }
        return f0;
    }

    public static List k(String s, o o0, String s1) {
        b b0 = new b();
        return b0.r(s, o0, s1, new g(b0));
    }

    public static List l(String s, o o0, String s1, e e0) {
        b b0 = new b();
        g g0 = new g(b0);
        g0.b = e0;
        return b0.r(s, o0, s1, g0);
    }

    public List m(String s, o o0, String s1) {
        return this.a.r(s, o0, s1, this);
    }

    public org.jsoup.nodes.f n(Reader reader0, String s) {
        return this.a.q(reader0, s, this);
    }

    public org.jsoup.nodes.f o(String s, String s1) {
        return this.a.q(new StringReader(s), s1, this);
    }

    public static List p(String s, String s1) {
        w w0 = new w();
        return w0.r(s, null, s1, new g(w0));
    }

    public g q(int v) {
        this.b = v <= 0 ? e.c() : e.d(v);
        return this;
    }

    public g r(boolean z) {
        this.d = z;
        return this;
    }

    public g s(v v0) {
        this.a = v0;
        v0.a = this;
        return this;
    }

    public f t() {
        return this.c;
    }

    public g u(f f0) {
        this.c = f0;
        return this;
    }

    public static String v(String s, boolean z) {
        g g0 = g.d();
        g0.a.j(new StringReader(s), "", g0);
        return new org.jsoup.parser.t(g0.a).C(z);
    }

    public static g w() {
        return new g(new w());
    }
}

