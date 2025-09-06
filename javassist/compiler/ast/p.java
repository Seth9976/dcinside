package javassist.compiler.ast;

import javassist.compiler.c;
import javassist.o;

public class p extends v {
    private o d;
    private static final long e = 1L;

    public p(String s) {
        super(s);
        this.d = null;
    }

    @Override  // javassist.compiler.ast.v
    public void a(x x0) throws c {
        x0.o(this);
    }

    public o h() {
        return this.d;
    }

    public void i(o o0) {
        this.d = o0;
    }
}

