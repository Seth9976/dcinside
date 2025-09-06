package javassist.compiler.ast;

import javassist.compiler.c;
import javassist.compiler.q;

public class k extends a implements q {
    protected int e;
    private static final long f = 1L;

    k(int v, b b0) {
        super(b0);
        this.e = v;
    }

    k(int v, b b0, a a0) {
        super(b0, a0);
        this.e = v;
    }

    public void A(b b0) {
        this.c().e(b0);
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws c {
        x0.j(this);
    }

    @Override  // javassist.compiler.ast.b
    protected String d() {
        return "op:" + this.getName();
    }

    public String getName() {
        int v = this.e;
        if(v < 0x80) {
            return String.valueOf(((char)v));
        }
        if(350 <= v && v <= 371) {
            return q.f8[v - 350];
        }
        return v == 323 ? "instanceof" : String.valueOf(v);
    }

    public int r() {
        return this.e;
    }

    public static k s(int v, b b0) {
        return new k(v, b0);
    }

    public static k u(int v, b b0, b b1) {
        return new k(v, b0, new a(b1));
    }

    public b w() {
        return this.b();
    }

    public b x() {
        return this.c().b();
    }

    public void y(int v) {
        this.e = v;
    }

    public void z(b b0) {
        this.e(b0);
    }
}

