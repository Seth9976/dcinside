package androidx.constraintlayout.core.dsl;

import java.util.Map;

public class HChain extends Chain {
    public class HAnchor extends Anchor {
        final HChain f;

        HAnchor(HSide constraint$HSide0) {
            super(Side.valueOf(constraint$HSide0.name()));
        }
    }

    private HAnchor j;
    private HAnchor k;
    private HAnchor l;
    private HAnchor m;

    public HChain(String s) {
        super(s);
        this.j = new HAnchor(this, HSide.a);
        this.k = new HAnchor(this, HSide.b);
        this.l = new HAnchor(this, HSide.c);
        this.m = new HAnchor(this, HSide.d);
        this.b = new HelperType("hChain");
    }

    public HChain(String s, String s1) {
        super(s);
        this.j = new HAnchor(this, HSide.a);
        this.k = new HAnchor(this, HSide.b);
        this.l = new HAnchor(this, HSide.c);
        this.m = new HAnchor(this, HSide.d);
        this.c = s1;
        this.b = new HelperType("hChain");
        Map map0 = this.b();
        this.d = map0;
        if(map0.containsKey("contains")) {
            Ref.a(((String)this.d.get("contains")), this.h);
        }
    }

    public void A(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v, int v1) {
        this.l.b = constraint$HAnchor0;
        this.l.c = v;
        this.l.d = v1;
        this.d.put("start", this.l.toString());
    }

    public HAnchor l() {
        return this.m;
    }

    public HAnchor m() {
        return this.j;
    }

    public HAnchor n() {
        return this.k;
    }

    public HAnchor o() {
        return this.l;
    }

    public void p(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0) {
        this.q(constraint$HAnchor0, 0);
    }

    public void q(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v) {
        this.r(constraint$HAnchor0, v, 0x80000000);
    }

    public void r(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v, int v1) {
        this.m.b = constraint$HAnchor0;
        this.m.c = v;
        this.m.d = v1;
        this.d.put("end", this.m.toString());
    }

    public void s(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0) {
        this.t(constraint$HAnchor0, 0);
    }

    public void t(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v) {
        this.u(constraint$HAnchor0, v, 0x80000000);
    }

    public void u(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v, int v1) {
        this.j.b = constraint$HAnchor0;
        this.j.c = v;
        this.j.d = v1;
        this.d.put("left", this.j.toString());
    }

    public void v(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0) {
        this.w(constraint$HAnchor0, 0);
    }

    public void w(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v) {
        this.x(constraint$HAnchor0, v, 0x80000000);
    }

    public void x(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v, int v1) {
        this.k.b = constraint$HAnchor0;
        this.k.c = v;
        this.k.d = v1;
        this.d.put("right", this.k.toString());
    }

    public void y(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0) {
        this.z(constraint$HAnchor0, 0);
    }

    public void z(androidx.constraintlayout.core.dsl.Constraint.HAnchor constraint$HAnchor0, int v) {
        this.A(constraint$HAnchor0, v, 0x80000000);
    }
}

