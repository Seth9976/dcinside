package javassist.compiler.ast;

import javassist.compiler.c;

public class h extends a {
    private static final long e = 1L;

    public h(b b0, b b1, b b2) {
        super(b0, new a(b1, new a(b2)));
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws c {
        x0.g(this);
    }

    @Override  // javassist.compiler.ast.b
    public String d() {
        return "?:";
    }

    public b r() {
        return this.i();
    }

    public b s() {
        return this.q().q().i();
    }

    public void u(b b0) {
        this.m(b0);
    }

    public void w(b b0) {
        this.q().q().m(b0);
    }

    public void x(b b0) {
        this.q().m(b0);
    }

    public b y() {
        return this.q().i();
    }
}

