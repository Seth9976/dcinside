package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.i;
import org.jsoup.internal.n;

public class g extends s {
    public static final String f = "PUBLIC";
    public static final String g = "SYSTEM";
    private static final String h = "name";
    private static final String i = "pubSysKey";
    private static final String j = "publicId";
    private static final String k = "systemId";

    public g(String s, String s1, String s2) {
        i.o(s);
        i.o(s1);
        i.o(s2);
        this.h("name", s);
        this.h("publicId", s1);
        this.h("systemId", s2);
        this.D0();
    }

    public String A0() {
        return this.g("publicId");
    }

    public void B0(String s) {
        if(s != null) {
            this.h("pubSysKey", s);
        }
    }

    public String C0() {
        return this.g("systemId");
    }

    private void D0() {
        if(this.y0("publicId")) {
            this.h("pubSysKey", "PUBLIC");
            return;
        }
        if(this.y0("systemId")) {
            this.h("pubSysKey", "SYSTEM");
        }
    }

    @Override  // org.jsoup.nodes.t
    public String N() {
        return "#doctype";
    }

    @Override  // org.jsoup.nodes.t
    void U(Appendable appendable0, int v, a f$a0) throws IOException {
        if(this.b > 0 && f$a0.q()) {
            appendable0.append('\n');
        }
        if(f$a0.r() != org.jsoup.nodes.f.a.a.a || this.y0("publicId") || this.y0("systemId")) {
            appendable0.append("<!DOCTYPE");
        }
        else {
            appendable0.append("<!doctype");
        }
        if(this.y0("name")) {
            appendable0.append(" ").append(this.g("name"));
        }
        if(this.y0("pubSysKey")) {
            appendable0.append(" ").append(this.g("pubSysKey"));
        }
        if(this.y0("publicId")) {
            appendable0.append(" \"").append(this.g("publicId")).append('\"');
        }
        if(this.y0("systemId")) {
            appendable0.append(" \"").append(this.g("systemId")).append('\"');
        }
        appendable0.append('>');
    }

    @Override  // org.jsoup.nodes.t
    void V(Appendable appendable0, int v, a f$a0) {
    }

    private boolean y0(String s) {
        return !n.i(this.g(s));
    }

    public String z0() {
        return this.g("name");
    }
}

