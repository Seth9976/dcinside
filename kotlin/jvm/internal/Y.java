package kotlin.jvm.internal;

import y4.l;

public final class y extends d0 {
    @l
    private final double[] d;

    public y(int v) {
        super(v);
        this.d = new double[v];
    }

    @Override  // kotlin.jvm.internal.d0
    public int c(Object object0) {
        return this.i(((double[])object0));
    }

    public final void h(double f) {
        int v = this.b();
        this.e(v + 1);
        this.d[v] = f;
    }

    protected int i(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return arr_f.length;
    }

    @l
    public final double[] j() {
        double[] arr_f = new double[this.f()];
        return (double[])this.g(this.d, arr_f);
    }
}

