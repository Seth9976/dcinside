package kotlin.jvm.internal;

import y4.l;

public final class r0 extends d0 {
    @l
    private final short[] d;

    public r0(int v) {
        super(v);
        this.d = new short[v];
    }

    @Override  // kotlin.jvm.internal.d0
    public int c(Object object0) {
        return this.i(((short[])object0));
    }

    public final void h(short v) {
        int v1 = this.b();
        this.e(v1 + 1);
        this.d[v1] = v;
    }

    protected int i(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length;
    }

    @l
    public final short[] j() {
        short[] arr_v = new short[this.f()];
        return (short[])this.g(this.d, arr_v);
    }
}

