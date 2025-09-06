package org.jsoup.nodes;

import java.io.IOException;

public class c extends y {
    public c(String s) {
        super(s);
    }

    @Override  // org.jsoup.nodes.y
    public String G0() {
        return this.A0();
    }

    public c I0() {
        return (c)super.y0();
    }

    @Override  // org.jsoup.nodes.y
    public String N() {
        return "#cdata";
    }

    @Override  // org.jsoup.nodes.y
    void U(Appendable appendable0, int v, a f$a0) throws IOException {
        appendable0.append("<![CDATA[").append(this.A0());
    }

    @Override  // org.jsoup.nodes.y
    void V(Appendable appendable0, int v, a f$a0) throws IOException {
        appendable0.append("]]>");
    }

    @Override  // org.jsoup.nodes.y
    public Object clone() throws CloneNotSupportedException {
        return this.I0();
    }

    @Override  // org.jsoup.nodes.y
    public t u() {
        return this.I0();
    }

    @Override  // org.jsoup.nodes.y
    public y y0() {
        return this.I0();
    }
}

