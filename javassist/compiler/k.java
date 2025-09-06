package javassist.compiler;

import javassist.compiler.ast.b;

public class k extends c {
    private String d;
    private b e;
    private static final long f = 1L;

    public k(String s, b b0) {
        super("no such field: " + s);
        this.d = s;
        this.e = b0;
    }

    public b b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }
}

