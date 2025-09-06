package kotlin.jvm.internal;

import y4.l;

public final class n extends d0 {
    @l
    private final boolean[] d;

    public n(int v) {
        super(v);
        this.d = new boolean[v];
    }

    @Override  // kotlin.jvm.internal.d0
    public int c(Object object0) {
        return this.i(((boolean[])object0));
    }

    public final void h(boolean z) {
        int v = this.b();
        this.e(v + 1);
        this.d[v] = z;
    }

    protected int i(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length;
    }

    @l
    public final boolean[] j() {
        boolean[] arr_z = new boolean[this.f()];
        return (boolean[])this.g(this.d, arr_z);
    }
}

