package javassist.compiler.ast;

import javassist.compiler.c;

public class a extends b {
    private b b;
    private a c;
    private static final long d = 1L;

    public a(b b0) {
        this.b = b0;
        this.c = null;
    }

    public a(b b0, a a0) {
        this.b = b0;
        this.c = a0;
    }

    @Override  // javassist.compiler.ast.b
    public void a(x x0) throws c {
        x0.a(this);
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
        this.c = (a)b0;
    }

    public static a g(a a0, b b0) {
        return a.h(a0, new a(b0));
    }

    public static a h(a a0, a a1) {
        if(a0 == null) {
            return a1;
        }
        a a2 = a0;
        a a3;
        while((a3 = a2.c) != null) {
            a2 = a3;
        }
        a2.c = a1;
        return a0;
    }

    public b i() {
        return this.b;
    }

    public int j() [...] // 潜在的解密器

    public static int k(a a0) {
        int v = 0;
        if(a0 == null) {
            return 0;
        }
        while(a0 != null) {
            a0 = a0.c;
            ++v;
        }
        return v;
    }

    public static a l(b b0, b b1, b b2) {
        return new a(b0, new a(b1, new a(b2)));
    }

    public void m(b b0) {
        this.b = b0;
    }

    public void n(a a0) {
        this.c = a0;
    }

    public a o(int v) {
        while(v > 0) {
            this = this.c;
            --v;
        }
        return this;
    }

    public boolean p(b b0, b b1) {
        while(this != null) {
            if(this.b == b1) {
                this.b = b0;
                return true;
            }
            this = this.c;
        }
        return false;
    }

    public a q() {
        return this.c;
    }

    @Override  // javassist.compiler.ast.b
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("(<");
        stringBuffer0.append("b");
        stringBuffer0.append('>');
        for(a a0 = this; a0 != null; a0 = a0.c) {
            stringBuffer0.append(' ');
            stringBuffer0.append((a0.b == null ? "<null>" : "<b>"));
        }
        stringBuffer0.append(')');
        return stringBuffer0.toString();
    }
}

