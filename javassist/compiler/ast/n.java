package javassist.compiler.ast;

import javassist.compiler.c;

public class n extends b {
    protected long b;
    protected int c;
    private static final long d = 1L;

    public n(long v, int v1) {
        this.b = v;
        this.c = v1;
    }

    @Override  // javassist.compiler.ast.b
    public void a(x x0) throws c {
        x0.m(this);
    }

    public b g(int v, b b0) {
        if(b0 instanceof n) {
            return this.i(v, ((n)b0));
        }
        return b0 instanceof j ? this.h(v, ((j)b0)) : null;
    }

    private j h(int v, j j0) {
        double f = (double)this.b;
        double f1 = j0.b;
        switch(v) {
            case 37: {
                return new j(f % f1, j0.c);
            }
            case 42: {
                return new j(f * f1, j0.c);
            }
            case 43: {
                return new j(f + f1, j0.c);
            }
            case 45: {
                return new j(f - f1, j0.c);
            }
            case 0x2F: {
                return new j(f / f1, j0.c);
            }
            default: {
                return null;
            }
        }
    }

    private n i(int v, n n0) {
        int v1 = this.c;
        int v2 = v1 == 403 || n0.c == 403 || v1 == 401 && n0.c == 401 ? 403 : 402;
        long v3 = this.b;
        long v4 = n0.b;
        switch(v) {
            case 37: {
                return new n(v3 % v4, v2);
            }
            case 38: {
                return new n(v3 & v4, v2);
            }
            case 42: {
                return new n(v3 * v4, v2);
            }
            case 43: {
                return new n(v3 + v4, v2);
            }
            case 45: {
                return new n(v3 - v4, v2);
            }
            case 0x2F: {
                return new n(v3 / v4, v2);
            }
            case 94: {
                return new n(v3 ^ v4, v2);
            }
            case 0x7C: {
                return new n(v3 | v4, v2);
            }
            case 364: {
                return new n(v3 << ((int)v4), v1);
            }
            case 366: {
                return new n(v3 >> ((int)v4), v1);
            }
            case 370: {
                return new n(v3 >>> ((int)v4), v1);
            }
            default: {
                return null;
            }
        }
    }

    public long j() {
        return this.b;
    }

    public int k() {
        return this.c;
    }

    public void l(long v) {
        this.b = v;
    }

    @Override  // javassist.compiler.ast.b
    public String toString() {
        return Long.toString(this.b);
    }
}

