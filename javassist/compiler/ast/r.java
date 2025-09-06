package javassist.compiler.ast;

import javassist.compiler.q;

public class r extends a implements q {
    protected boolean e;
    protected int f;
    private static final long g = 1L;

    public r(int v, a a0, c c0) {
        super(null, new a(a0));
        this.e = true;
        this.f = v;
        if(c0 != null) {
            a.g(this, c0);
        }
    }

    public r(a a0, a a1) {
        super(a0, new a(a1));
        this.e = false;
        this.f = 307;
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws javassist.compiler.c {
        x0.q(this);
    }

    // 去混淆评级： 低(20)
    @Override  // javassist.compiler.ast.b
    protected String d() {
        return this.e ? "new[]" : "new";
    }

    public a r() {
        return (a)this.c().b();
    }

    public a s() {
        return this.r();
    }

    public int u() {
        return this.f;
    }

    public a w() {
        return (a)this.b();
    }

    public c x() {
        b b0 = this.c().c();
        return b0 == null ? null : ((c)b0.b());
    }

    public boolean y() {
        return this.e;
    }

    public static r z(a a0, a a1, c c0) {
        r r0 = new r(a0, a1);
        r0.e = true;
        if(c0 != null) {
            a.g(r0, c0);
        }
        return r0;
    }
}

