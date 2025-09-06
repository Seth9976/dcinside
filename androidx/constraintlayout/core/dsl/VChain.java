package androidx.constraintlayout.core.dsl;

import java.util.Map;

public class VChain extends Chain {
    public class VAnchor extends Anchor {
        final VChain f;

        VAnchor(VSide constraint$VSide0) {
            super(Side.valueOf(constraint$VSide0.name()));
        }
    }

    private VAnchor j;
    private VAnchor k;
    private VAnchor l;

    public VChain(String s) {
        super(s);
        this.j = new VAnchor(this, VSide.a);
        this.k = new VAnchor(this, VSide.b);
        this.l = new VAnchor(this, VSide.c);
        this.b = new HelperType("vChain");
    }

    public VChain(String s, String s1) {
        super(s);
        this.j = new VAnchor(this, VSide.a);
        this.k = new VAnchor(this, VSide.b);
        this.l = new VAnchor(this, VSide.c);
        this.c = s1;
        this.b = new HelperType("vChain");
        Map map0 = this.b();
        this.d = map0;
        if(map0.containsKey("contains")) {
            Ref.a(((String)this.d.get("contains")), this.h);
        }
    }

    public VAnchor l() {
        return this.l;
    }

    public VAnchor m() {
        return this.k;
    }

    public VAnchor n() {
        return this.j;
    }

    public void o(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0) {
        this.p(constraint$VAnchor0, 0);
    }

    public void p(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0, int v) {
        this.q(constraint$VAnchor0, v, 0x80000000);
    }

    public void q(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0, int v, int v1) {
        this.l.b = constraint$VAnchor0;
        this.l.c = v;
        this.l.d = v1;
        this.d.put("baseline", this.l.toString());
    }

    public void r(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0) {
        this.s(constraint$VAnchor0, 0);
    }

    public void s(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0, int v) {
        this.t(constraint$VAnchor0, v, 0x80000000);
    }

    public void t(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0, int v, int v1) {
        this.k.b = constraint$VAnchor0;
        this.k.c = v;
        this.k.d = v1;
        this.d.put("bottom", this.k.toString());
    }

    public void u(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0) {
        this.v(constraint$VAnchor0, 0);
    }

    public void v(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0, int v) {
        this.w(constraint$VAnchor0, v, 0x80000000);
    }

    public void w(androidx.constraintlayout.core.dsl.Constraint.VAnchor constraint$VAnchor0, int v, int v1) {
        this.j.b = constraint$VAnchor0;
        this.j.c = v;
        this.j.d = v1;
        this.d.put("top", this.j.toString());
    }
}

