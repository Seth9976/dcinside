package javassist.compiler.ast;

import javassist.compiler.c;
import javassist.compiler.q;

public class t extends a implements q {
    protected int e;
    private static final long f = 1L;

    public t(int v) {
        this(v, null);
    }

    public t(int v, b b0) {
        super(b0);
        this.e = v;
    }

    public t(int v, b b0, a a0) {
        super(b0, a0);
        this.e = v;
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws c {
        x0.s(this);
    }

    @Override  // javassist.compiler.ast.b
    protected String d() {
        return this.e >= 0x80 ? "stmnt:" + this.e : "stmnt:" + ((char)this.e);
    }

    public int r() {
        return this.e;
    }

    public static t s(int v, b b0, b b1) {
        return new t(v, b0, new a(b1));
    }

    public static t u(int v, b b0, b b1, b b2) {
        return new t(v, b0, new a(b1, new a(b2)));
    }
}

