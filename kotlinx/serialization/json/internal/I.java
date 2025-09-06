package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;

public final class i implements CharSequence {
    @l
    private final char[] a;
    private int b;

    public i(@l char[] arr_c) {
        L.p(arr_c, "buffer");
        super();
        this.a = arr_c;
        this.b = arr_c.length;
    }

    public char a(int v) {
        return this.a[v];
    }

    @l
    public final char[] b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public final char charAt(int v) {
        return this.a(v);
    }

    public void d(int v) {
        this.b = v;
    }

    @l
    public final String e(int v, int v1) {
        int v2 = Math.min(v1, this.length());
        return v.y1(this.a, v, v2);
    }

    public final void f(int v) {
        this.d(Math.min(this.a.length, v));
    }

    @Override
    public final int length() {
        return this.c();
    }

    @Override
    @l
    public CharSequence subSequence(int v, int v1) {
        int v2 = Math.min(v1, this.length());
        return v.y1(this.a, v, v2);
    }
}

