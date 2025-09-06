package androidx.compose.foundation.layout;

import kotlin.jvm.internal.L;
import y4.l;

public final class RowColumnMeasureHelperResult {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    @l
    private final int[] f;

    public RowColumnMeasureHelperResult(int v, int v1, int v2, int v3, int v4, @l int[] arr_v) {
        L.p(arr_v, "mainAxisPositions");
        super();
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = arr_v;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    @l
    public final int[] d() {
        return this.f;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.c;
    }
}

