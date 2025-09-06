package javassist.compiler.ast;

import javassist.compiler.c;

public class j extends b {
    protected double b;
    protected int c;
    private static final long d = 1L;

    public j(double f, int v) {
        this.b = f;
        this.c = v;
    }

    @Override  // javassist.compiler.ast.b
    public void a(x x0) throws c {
        x0.i(this);
    }

    public b g(int v, b b0) {
        if(b0 instanceof n) {
            return this.j(v, ((n)b0));
        }
        return b0 instanceof j ? this.i(v, ((j)b0)) : null;
    }

    private static j h(int v, double f, double f1, int v1) {
        switch(v) {
            case 37: {
                return new j(f % f1, v1);
            }
            case 42: {
                return new j(f * f1, v1);
            }
            case 43: {
                return new j(f + f1, v1);
            }
            case 45: {
                return new j(f - f1, v1);
            }
            case 0x2F: {
                return new j(f / f1, v1);
            }
            default: {
                return null;
            }
        }
    }

    private j i(int v, j j0) {
        return this.c == 405 || j0.c == 405 ? j.h(v, this.b, j0.b, 405) : j.h(v, this.b, j0.b, 404);
    }

    private j j(int v, n n0) {
        return j.h(v, this.b, ((double)n0.b), this.c);
    }

    public double k() {
        return this.b;
    }

    public int l() {
        return this.c;
    }

    public void m(double f) {
        this.b = f;
    }

    @Override  // javassist.compiler.ast.b
    public String toString() {
        return Double.toString(this.b);
    }
}

