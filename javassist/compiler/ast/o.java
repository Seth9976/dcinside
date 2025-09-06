package javassist.compiler.ast;

import javassist.compiler.c;

public class o extends b {
    protected int b;
    private static final long c = 1L;

    public o(int v) {
        this.b = v;
    }

    @Override  // javassist.compiler.ast.b
    public void a(x x0) throws c {
        x0.n(this);
    }

    public int g() {
        return this.b;
    }

    @Override  // javassist.compiler.ast.b
    public String toString() {
        return "id:" + this.b;
    }
}

