package androidx.compose.ui.graphics;

import kotlin.jvm.internal.L;
import y4.l;

public final class PixelMap {
    @l
    private final int[] a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public PixelMap(@l int[] arr_v, int v, int v1, int v2, int v3) {
        L.p(arr_v, "buffer");
        super();
        this.a = arr_v;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    public final long a(int v, int v1) {
        return ColorKt.b(this.a[this.d + v1 * this.e + v]);
    }

    @l
    public final int[] b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.b;
    }
}

