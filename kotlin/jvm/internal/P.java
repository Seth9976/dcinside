package kotlin.jvm.internal;

import y4.l;

public final class p extends d0 {
    @l
    private final byte[] d;

    public p(int v) {
        super(v);
        this.d = new byte[v];
    }

    @Override  // kotlin.jvm.internal.d0
    public int c(Object object0) {
        return this.i(((byte[])object0));
    }

    public final void h(byte b) {
        int v = this.b();
        this.e(v + 1);
        this.d[v] = b;
    }

    protected int i(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length;
    }

    @l
    public final byte[] j() {
        byte[] arr_b = new byte[this.f()];
        return (byte[])this.g(this.d, arr_b);
    }
}

