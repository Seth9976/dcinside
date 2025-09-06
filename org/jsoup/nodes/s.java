package org.jsoup.nodes;

import java.util.List;

public abstract class s extends t {
    Object e;

    @Override  // org.jsoup.nodes.t
    public boolean D(String s) {
        this.x0();
        return super.D(s);
    }

    @Override  // org.jsoup.nodes.t
    protected final boolean E() {
        return this.e instanceof b;
    }

    @Override  // org.jsoup.nodes.t
    public String a(String s) {
        this.x0();
        return super.a(s);
    }

    @Override  // org.jsoup.nodes.t
    public t e0(String s) {
        this.x0();
        return super.e0(s);
    }

    @Override  // org.jsoup.nodes.t
    public String g(String s) {
        if(!this.E()) {
            return this.N().equals(s) ? ((String)this.e) : "";
        }
        return super.g(s);
    }

    @Override  // org.jsoup.nodes.t
    public t h(String s, String s1) {
        if(!this.E() && s.equals(this.N())) {
            this.e = s1;
            return this;
        }
        this.x0();
        super.h(s, s1);
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public final b j() {
        this.x0();
        return (b)this.e;
    }

    // 去混淆评级： 低(20)
    @Override  // org.jsoup.nodes.t
    public String l() [...] // 潜在的解密器

    @Override  // org.jsoup.nodes.t
    public int p() {
        return 0;
    }

    String u0() {
        return this.g(this.N());
    }

    @Override  // org.jsoup.nodes.t
    protected t v(t t0) {
        return this.w0(t0);
    }

    void v0(String s) {
        this.h(this.N(), s);
    }

    @Override  // org.jsoup.nodes.t
    protected void w(String s) {
    }

    protected s w0(t t0) {
        s s0 = (s)super.v(t0);
        if(this.E()) {
            s0.e = ((b)this.e).n();
        }
        return s0;
    }

    @Override  // org.jsoup.nodes.t
    public t x() {
        return this;
    }

    private void x0() {
        if(!this.E()) {
            Object object0 = this.e;
            b b0 = new b();
            this.e = b0;
            if(object0 != null) {
                b0.H(this.N(), ((String)object0));
            }
        }
    }

    @Override  // org.jsoup.nodes.t
    protected List y() {
        return t.c;
    }
}

