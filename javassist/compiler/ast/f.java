package javassist.compiler.ast;

import javassist.compiler.c;
import javassist.compiler.j.a;

public class f extends k {
    private a g;
    private static final long h = 1L;

    private f(b b0, javassist.compiler.ast.a a0) {
        super(67, b0, a0);
        this.g = null;
    }

    public a B() {
        return this.g;
    }

    public static f C(b b0, b b1) {
        return new f(b0, new javassist.compiler.ast.a(b1));
    }

    public void D(a j$a0) {
        this.g = j$a0;
    }

    @Override  // javassist.compiler.ast.k
    public void a(x x0) throws c {
        x0.e(this);
    }
}

