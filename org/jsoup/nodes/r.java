package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.g;
import org.jsoup.helper.f.c;
import org.jsoup.helper.i;
import org.jsoup.parser.q;
import org.jsoup.select.e;

public class r extends o {
    private final e l;

    public r(q q0, String s, b b0) {
        super(q0, s, b0);
        this.l = new e();
    }

    @Override  // org.jsoup.nodes.o
    public o Y0() {
        return this.d3();
    }

    public r c3(o o0) {
        this.l.add(o0);
        return this;
    }

    @Override  // org.jsoup.nodes.o
    public Object clone() throws CloneNotSupportedException {
        return this.d3();
    }

    public r d3() {
        return (r)super.Y0();
    }

    public e e3() {
        return this.l;
    }

    @Override  // org.jsoup.nodes.t
    protected void f0(t t0) {
        super.f0(t0);
        this.l.remove(t0);
    }

    public List f3() {
        List list0 = new ArrayList();
        for(Object object0: this.l) {
            o o0 = (o)object0;
            if(o0.O2().p() && !o0.D("disabled")) {
                String s = o0.g("name");
                if(s.length() != 0) {
                    String s1 = o0.g("type");
                    if(s1.equalsIgnoreCase("button") || s1.equalsIgnoreCase("image")) {
                    }
                    else if(o0.L("select")) {
                        boolean z = false;
                        for(Object object1: o0.E2("option[selected]")) {
                            ((ArrayList)list0).add(c.a(s, ((o)object1).X2()));
                            z = true;
                        }
                        if(z) {
                            continue;
                        }
                        o o1 = o0.G2("option");
                        if(o1 == null) {
                            continue;
                        }
                        ((ArrayList)list0).add(c.a(s, o1.X2()));
                    }
                    else if(!"checkbox".equalsIgnoreCase(s1) && !"radio".equalsIgnoreCase(s1)) {
                        ((ArrayList)list0).add(c.a(s, o0.X2()));
                    }
                    else if(o0.D("checked")) {
                        ((ArrayList)list0).add(c.a(s, (o0.X2().length() <= 0 ? "on" : o0.X2())));
                    }
                }
            }
        }
        return list0;
    }

    public org.jsoup.b g3() {
        String s = this.D("action") ? this.a("action") : "";
        i.m(s, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        org.jsoup.b.c b$c0 = this.g("method").equalsIgnoreCase("POST") ? org.jsoup.b.c.c : org.jsoup.b.c.b;
        f f0 = this.W();
        return f0 == null ? g.f().t(s).E(this.f3()).p(b$c0) : f0.g3().F().t(s).E(this.f3()).p(b$c0);
    }

    @Override  // org.jsoup.nodes.o
    public t u() {
        return this.d3();
    }
}

