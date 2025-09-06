package javassist.compiler.ast;

import javassist.compiler.c;

public class q extends a {
    private static final long e = 1L;
    public static final String f = "<init>";

    public q(b b0, a a0) {
        super(b0, a0);
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws c {
        x0.p(this);
    }

    public t r() {
        return (t)this.o(4).i();
    }

    public a s() {
        return (a)this.b();
    }

    public a u() {
        return (a)this.o(2).i();
    }

    public i w() {
        return (i)this.q().i();
    }

    public a x() {
        return (a)this.o(3).i();
    }

    public boolean y() {
        v v0 = this.w().B();
        return v0 != null && "<init>".equals(v0.g());
    }
}

