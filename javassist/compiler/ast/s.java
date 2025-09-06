package javassist.compiler.ast;

import javassist.compiler.c;

public class s extends b {
    protected b b;
    protected b c;
    private static final long d = 1L;

    public s(b b0, b b1) {
        this.b = b0;
        this.c = b1;
    }

    @Override  // javassist.compiler.ast.b
    public void a(x x0) throws c {
        x0.r(this);
    }

    @Override  // javassist.compiler.ast.b
    public b b() {
        return this.b;
    }

    @Override  // javassist.compiler.ast.b
    public b c() {
        return this.c;
    }

    @Override  // javassist.compiler.ast.b
    public void e(b b0) {
        this.b = b0;
    }

    @Override  // javassist.compiler.ast.b
    public void f(b b0) {
        this.c = b0;
    }

    @Override  // javassist.compiler.ast.b
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("(<Pair> ");
        String s = "<null>";
        stringBuffer0.append((this.b == null ? "<null>" : "<b>"));
        stringBuffer0.append(" . ");
        if(this.c != null) {
            s = "<b>";
        }
        stringBuffer0.append(s);
        stringBuffer0.append(')');
        return stringBuffer0.toString();
    }
}

