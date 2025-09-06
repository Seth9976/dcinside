package javassist.compiler.ast;

import javassist.compiler.c;
import javassist.compiler.q;

public class g extends a implements q {
    protected int e;
    protected int f;
    private static final long g = 1L;

    public g(int v, int v1, b b0) {
        super(null, new a(b0));
        this.e = v;
        this.f = v1;
    }

    public g(a a0, int v, b b0) {
        super(a0, new a(b0));
        this.e = 307;
        this.f = v;
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws c {
        x0.f(this);
    }

    @Override  // javassist.compiler.ast.b
    public String d() {
        return "cast:" + this.e + ":" + this.f;
    }

    public int r() {
        return this.f;
    }

    public a s() {
        return (a)this.b();
    }

    public b u() {
        return this.c().b();
    }

    public int w() {
        return this.e;
    }

    public void x(b b0) {
        this.c().e(b0);
    }
}

