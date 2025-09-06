package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

final class IntStack {
    @l
    private int[] a;
    private int b;

    public IntStack(int v) {
        this.a = new int[v];
    }

    private final boolean a(int v, int v1) {
        int[] arr_v = this.a;
        int v2 = arr_v[v];
        int v3 = arr_v[v1];
        return v2 < v3 || v2 == v3 && arr_v[v + 1] <= arr_v[v1 + 1];
    }

    public final boolean b() {
        return this.b != 0;
    }

    private final int c(int v, int v1, int v2) {
        int v3 = v - v2;
        while(v < v1) {
            if(this.a(v, v1)) {
                v3 += v2;
                this.i(v3, v);
            }
            v += v2;
        }
        int v4 = v3 + v2;
        this.i(v4, v1);
        return v4;
    }

    public final int d() {
        int v = this.b - 1;
        this.b = v;
        return this.a[v];
    }

    public final void e(int v, int v1, int v2) {
        int v3 = this.b;
        int[] arr_v = this.a;
        if(v3 + 3 >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int[] arr_v2 = this.a;
        arr_v2[v3] = v + v2;
        arr_v2[v3 + 1] = v1 + v2;
        arr_v2[v3 + 2] = v2;
        this.b = v3 + 3;
    }

    public final void f(int v, int v1, int v2, int v3) {
        int v4 = this.b;
        int[] arr_v = this.a;
        if(v4 + 4 >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int[] arr_v2 = this.a;
        arr_v2[v4] = v;
        arr_v2[v4 + 1] = v1;
        arr_v2[v4 + 2] = v2;
        arr_v2[v4 + 3] = v3;
        this.b = v4 + 4;
    }

    private final void g(int v, int v1, int v2) {
        if(v < v1) {
            int v3 = this.c(v, v1, v2);
            this.g(v, v3 - v2, v2);
            this.g(v3 + v2, v1, v2);
        }
    }

    public final void h() {
        int v = this.b;
        if(v % 3 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v > 3) {
            this.g(0, v - 3, 3);
        }
    }

    private final void i(int v, int v1) {
        int[] arr_v = this.a;
        MyersDiffKt.i(arr_v, v, v1);
        MyersDiffKt.i(arr_v, v + 1, v1 + 1);
        MyersDiffKt.i(arr_v, v + 2, v1 + 2);
    }
}

