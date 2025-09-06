package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;

public final class IntStack {
    @l
    private int[] a;
    private int b;

    public IntStack() {
        this.a = new int[10];
    }

    public final void a() {
        this.b = 0;
    }

    public final int b() {
        return this.b;
    }

    public final int c(int v) {
        int v1 = this.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.a[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final int f() {
        return this.a[this.b - 1];
    }

    public final int g(int v) {
        return this.a[v];
    }

    public final int h(int v) {
        return this.b <= 0 ? v : this.f();
    }

    public final int i() {
        int v = this.b - 1;
        this.b = v;
        return this.a[v];
    }

    public final void j(int v) {
        int[] arr_v = this.a;
        if(this.b >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int v1 = this.b;
        this.b = v1 + 1;
        this.a[v1] = v;
    }
}

