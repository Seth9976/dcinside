package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.i;
import org.jsoup.internal.n;

public class y extends s {
    public y(String s) {
        this.e = s;
    }

    public String A0() {
        return this.u0();
    }

    public boolean B0() {
        return n.i(this.u0());
    }

    static boolean C0(StringBuilder stringBuilder0) {
        return stringBuilder0.length() != 0 && stringBuilder0.charAt(stringBuilder0.length() - 1) == 0x20;
    }

    static String D0(String s) {
        return n.s(s);
    }

    public y E0(int v) {
        String s = this.u0();
        i.i(v >= 0, "Split offset must be not be negative");
        i.i(v < s.length(), "Split offset must not be greater than current text length");
        this.H0(s.substring(0, v));
        y y0 = new y(s.substring(v));
        t t0 = this.a;
        if(t0 != null) {
            t0.b(this.o0() + 1, new t[]{y0});
        }
        return y0;
    }

    static String F0(String s) {
        return s.replaceFirst("^\\s+", "");
    }

    public String G0() {
        return n.s(this.A0());
    }

    public y H0(String s) {
        this.v0(s);
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public String N() {
        return "#text";
    }

    @Override  // org.jsoup.nodes.t
    void U(Appendable appendable0, int v, a f$a0) throws IOException {
        boolean z6;
        boolean z5;
        t t0 = this.a;
        o o0 = t0 instanceof o ? ((o)t0) : null;
        boolean z = true;
        boolean z1 = f$a0.q() && !o.x2(t0);
        boolean z2 = o0 != null && (o0.O2().m() || o0.O2().k());
        if(z1) {
            boolean z3 = z2 && this.b == 0 || this.a instanceof f;
            if(!z2 || this.M() != null) {
                z = false;
            }
            t t1 = this.M();
            t t2 = this.b0();
            boolean z4 = this.B0();
            if((t1 instanceof o && ((o)t1).L2(f$a0) || t1 instanceof y && ((y)t1).B0() || t2 instanceof o && (((o)t2).c2() || t2.L("br"))) && z4) {
                return;
            }
            if(t2 == null && o0 != null && o0.O2().k() && !z4 || f$a0.n() && this.p0().size() > 0 && !z4 || t2 != null && t2.L("br")) {
                this.I(appendable0, v, f$a0);
            }
            z5 = z3;
            z6 = z;
        }
        else {
            z5 = false;
            z6 = false;
        }
        p.g(appendable0, this.u0(), f$a0, true, false, z1, z5, z6);
    }

    @Override  // org.jsoup.nodes.t
    void V(Appendable appendable0, int v, a f$a0) throws IOException {
    }

    @Override  // org.jsoup.nodes.t
    public Object clone() throws CloneNotSupportedException {
        return this.y0();
    }

    @Override  // org.jsoup.nodes.t
    public String toString() {
        return this.S();
    }

    @Override  // org.jsoup.nodes.t
    public t u() {
        return this.y0();
    }

    public y y0() {
        return (y)super.u();
    }

    public static y z0(String s) {
        return new y(p.l(s));
    }
}

