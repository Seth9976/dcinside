package javassist.compiler.ast;

import javassist.compiler.c;

public class d extends k {
    private static final long g = 1L;

    private d(int v, b b0, a a0) {
        super(v, b0, a0);
    }

    public static d B(int v, b b0, b b1) {
        return new d(v, b0, new a(b1));
    }

    @Override  // javassist.compiler.ast.k
    public void a(x x0) throws c {
        x0.c(this);
    }
}

