package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.i;
import org.jsoup.internal.n;

public class z extends s {
    private final boolean f;

    public z(String s, boolean z) {
        i.o(s);
        this.e = s;
        this.f = z;
    }

    private void A0(Appendable appendable0, a f$a0) throws IOException {
        for(Object object0: this.j()) {
            String s = ((org.jsoup.nodes.a)object0).c();
            String s1 = ((org.jsoup.nodes.a)object0).e();
            if(!s.equals("#declaration")) {
                appendable0.append(' ');
                appendable0.append(s);
                if(!s1.isEmpty()) {
                    appendable0.append("=\"");
                    p.g(appendable0, s1, f$a0, false, true, false, false, false);
                    appendable0.append('\"');
                }
            }
        }
    }

    public String B0() {
        return this.u0();
    }

    @Override  // org.jsoup.nodes.t
    public String N() [...] // Inlined contents

    @Override  // org.jsoup.nodes.t
    void U(Appendable appendable0, int v, a f$a0) throws IOException {
        String s = "?";
        appendable0.append("<").append((this.f ? "!" : "?")).append(this.u0());
        this.A0(appendable0, f$a0);
        if(this.f) {
            s = "!";
        }
        appendable0.append(s).append(">");
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

    public z y0() {
        return (z)super.u();
    }

    public String z0() {
        StringBuilder stringBuilder0 = n.d();
        try {
            this.A0(stringBuilder0, new a());
            return n.v(stringBuilder0).trim();
        }
        catch(IOException iOException0) {
            throw new org.jsoup.i(iOException0);
        }
    }
}

