package javassist.compiler.ast;

import javassist.compiler.c;

public class u extends b {
    protected String b;
    private static final long c = 1L;

    public u(String s) {
        this.b = s;
    }

    @Override  // javassist.compiler.ast.b
    public void a(x x0) throws c {
        x0.t(this);
    }

    public String g() {
        return this.b;
    }

    @Override  // javassist.compiler.ast.b
    public String toString() {
        return "\"" + this.b + "\"";
    }
}

