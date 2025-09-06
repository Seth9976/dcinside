package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.parser.g;

public class d extends s {
    public d(String s) {
        this.e = s;
    }

    public String A0() {
        return this.u0();
    }

    public boolean B0() {
        return d.C0(this.A0());
    }

    // 去混淆评级： 低(30)
    private static boolean C0(String s) {
        return s.length() > 1 && (s.startsWith("!") || s.startsWith("?"));
    }

    public d D0(String s) {
        this.v0(s);
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public String N() {
        return "#comment";
    }

    @Override  // org.jsoup.nodes.t
    void U(Appendable appendable0, int v, a f$a0) throws IOException {
        if(f$a0.q() && (this.J() && (this.a instanceof o && ((o)this.a).O2().k()) || f$a0.n())) {
            this.I(appendable0, v, f$a0);
        }
        appendable0.append("<!--").append(this.A0()).append("-->");
    }

    @Override  // org.jsoup.nodes.t
    void V(Appendable appendable0, int v, a f$a0) {
    }

    @Override  // org.jsoup.nodes.t
    public Object clone() throws CloneNotSupportedException {
        return this.z0();
    }

    @Override  // org.jsoup.nodes.t
    public String toString() {
        return this.S();
    }

    @Override  // org.jsoup.nodes.t
    public t u() {
        return this.z0();
    }

    public z y0() {
        String s = this.A0();
        String s1 = s.substring(1, s.length() - 1);
        z z0 = null;
        if(d.C0(s1)) {
            return null;
        }
        f f0 = g.d().u(org.jsoup.parser.f.d).o("<" + s1 + ">", "");
        if(f0.c3().T0() > 0) {
            o o0 = f0.c3().Q0(0);
            z0 = new z(v.b(f0).t().d(o0.P2()), s.startsWith("!"));
            z0.j().g(o0.j());
        }
        return z0;
    }

    public d z0() {
        return (d)super.u();
    }
}

