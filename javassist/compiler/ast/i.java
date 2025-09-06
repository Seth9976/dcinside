package javassist.compiler.ast;

import javassist.compiler.c;
import javassist.compiler.q;

public class i extends a implements q {
    protected int e;
    protected int f;
    protected int g;
    protected String h;
    private static final long i = 1L;

    public i(int v, int v1) {
        super(null);
        this.e = v;
        this.f = v1;
        this.g = -1;
        this.h = null;
    }

    public i(int v, String s, int v1, int v2, v v3) {
        super(null);
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = s;
        this.e(v3);
        a.g(this, null);
    }

    public i(a a0, int v) {
        super(null);
        this.e = 307;
        this.f = v;
        this.g = -1;
        this.h = i.s(a0, '/');
    }

    public int A() {
        return this.e;
    }

    public v B() {
        return (v)this.b();
    }

    public i C(v v0, int v1, b b0) {
        i i0 = new i(this.e, this.f + v1);
        i0.h = this.h;
        i0.e(v0);
        a.g(i0, b0);
        return i0;
    }

    public void D(String s) {
        this.h = s;
    }

    public void E(int v) {
        this.g = v;
    }

    public void F(v v0) {
        this.e(v0);
    }

    @Override  // javassist.compiler.ast.a
    public void a(x x0) throws c {
        x0.h(this);
    }

    @Override  // javassist.compiler.ast.b
    public String d() {
        return "decl";
    }

    public void r(int v) {
        this.f += v;
    }

    public static String s(a a0, char c) {
        if(a0 == null) {
            return null;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        i.u(stringBuffer0, a0, c);
        return stringBuffer0.toString();
    }

    private static void u(StringBuffer stringBuffer0, a a0, char c) {
        while(true) {
            b b0 = a0.i();
            if(b0 instanceof v) {
                stringBuffer0.append(((v)b0).g());
            }
            else if(b0 instanceof a) {
                i.u(stringBuffer0, ((a)b0), c);
            }
            a0 = a0.q();
            if(a0 == null) {
                break;
            }
            stringBuffer0.append(c);
        }
    }

    public int w() {
        return this.f;
    }

    public String x() {
        return this.h;
    }

    public b y() {
        a a0 = this.q();
        return a0 == null ? null : a0.i();
    }

    public int z() {
        return this.g;
    }
}

