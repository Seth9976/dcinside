package javassist.compiler.ast;

import javassist.compiler.c;

public class m extends g {
    private static final long h = 1L;

    public m(int v, int v1, b b0) {
        super(v, v1, b0);
    }

    public m(a a0, int v, b b0) {
        super(a0, v, b0);
    }

    @Override  // javassist.compiler.ast.g
    public void a(x x0) throws c {
        x0.l(this);
    }

    @Override  // javassist.compiler.ast.g
    public String d() {
        return "instanceof:" + this.e + ":" + this.f;
    }
}

