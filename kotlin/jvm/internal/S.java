package kotlin.jvm.internal;

import y4.l;

public final class s extends d0 {
    @l
    private final char[] d;

    public s(int v) {
        super(v);
        this.d = new char[v];
    }

    @Override  // kotlin.jvm.internal.d0
    public int c(Object object0) {
        return this.i(((char[])object0));
    }

    public final void h(char c) {
        int v = this.b();
        this.e(v + 1);
        this.d[v] = c;
    }

    protected int i(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length;
    }

    @l
    public final char[] j() {
        char[] arr_c = new char[this.f()];
        return (char[])this.g(this.d, arr_c);
    }
}

