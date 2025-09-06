package javassist.compiler.ast;

import javassist.compiler.c;

public class w extends v {
    protected i d;
    private static final long e = 1L;

    public w(String s, i i0) {
        super(s);
        this.d = i0;
    }

    @Override  // javassist.compiler.ast.v
    public void a(x x0) throws c {
        x0.v(this);
    }

    public i h() {
        return this.d;
    }

    @Override  // javassist.compiler.ast.v
    public String toString() {
        return this.b + ":" + this.d.A();
    }
}

