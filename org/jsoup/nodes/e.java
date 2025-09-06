package org.jsoup.nodes;

import java.io.IOException;

public class e extends s {
    public e(String s) {
        this.e = s;
    }

    public e A0(String s) {
        this.v0(s);
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public String N() {
        return "#data";
    }

    @Override  // org.jsoup.nodes.t
    void U(Appendable appendable0, int v, a f$a0) throws IOException {
        String s = this.z0();
        if(f$a0.r() == org.jsoup.nodes.f.a.a.b && !s.contains("<![CDATA[")) {
            if(this.Z("script")) {
                appendable0.append("//<![CDATA[\n").append(s).append("\n//]]>");
                return;
            }
            if(this.Z("style")) {
                appendable0.append("/*<![CDATA[*/\n").append(s).append("\n/*]]>*/");
                return;
            }
            appendable0.append("<![CDATA[").append(s).append("]]>");
            return;
        }
        appendable0.append(this.z0());
    }

    @Override  // org.jsoup.nodes.t
    void V(Appendable appendable0, int v, a f$a0) {
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

    public e y0() {
        return (e)super.u();
    }

    public String z0() {
        return this.u0();
    }
}

