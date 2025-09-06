package kotlin.jvm.internal;

import y4.l;

public abstract class d0 {
    private final int a;
    private int b;
    @l
    private final Object[] c;

    public d0(int v) {
        this.a = v;
        this.c = new Object[v];
    }

    public final void a(@l Object object0) {
        L.p(object0, "spreadArgument");
        int v = this.b;
        this.b = v + 1;
        this.c[v] = object0;
    }

    protected final int b() {
        return this.b;
    }

    protected abstract int c(@l Object arg1);

    private static void d() {
    }

    protected final void e(int v) {
        this.b = v;
    }

    protected final int f() {
        int v = this.a - 1;
        int v1 = 0;
        if(v >= 0) {
            for(int v2 = 0; true; ++v2) {
                Object object0 = this.c[v2];
                v1 += (object0 == null ? 1 : this.c(object0));
                if(v2 == v) {
                    break;
                }
            }
        }
        return v1;
    }

    @l
    protected final Object g(@l Object object0, @l Object object1) {
        int v4;
        L.p(object0, "values");
        L.p(object1, "result");
        int v = this.a - 1;
        int v1 = 0;
        if(v >= 0) {
            int v3 = 0;
            v4 = 0;
            for(int v2 = 0; true; ++v2) {
                Object object2 = this.c[v2];
                if(object2 != null) {
                    if(v3 < v2) {
                        int v5 = v2 - v3;
                        System.arraycopy(object0, v3, object1, v4, v5);
                        v4 += v5;
                    }
                    int v6 = this.c(object2);
                    System.arraycopy(object2, 0, object1, v4, v6);
                    v4 += v6;
                    v3 = v2 + 1;
                }
                if(v2 == v) {
                    break;
                }
            }
            v1 = v3;
        }
        else {
            v4 = 0;
        }
        int v7 = this.a;
        if(v1 < v7) {
            System.arraycopy(object0, v1, object1, v4, v7 - v1);
        }
        return object1;
    }
}

