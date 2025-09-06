package androidx.compose.ui.input.pointer.util;

import y4.l;

final class Matrix {
    @l
    private final Vector[] a;

    public Matrix(int v, int v1) {
        Vector[] arr_vector = new Vector[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_vector[v2] = new Vector(v1);
        }
        this.a = arr_vector;
    }

    public final float a(int v, int v1) {
        return this.a[v].a(v1);
    }

    @l
    public final Vector b(int v) {
        return this.a[v];
    }

    public final void c(int v, int v1, float f) {
        this.a[v].e(v1, f);
    }
}

