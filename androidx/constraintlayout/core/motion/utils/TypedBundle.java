package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class TypedBundle {
    int[] a;
    int[] b;
    int c;
    int[] d;
    float[] e;
    int f;
    int[] g;
    String[] h;
    int i;
    int[] j;
    boolean[] k;
    int l;
    private static final int m = 4;
    private static final int n = 10;
    private static final int o = 10;
    private static final int p = 5;

    public TypedBundle() {
        this.a = new int[10];
        this.b = new int[10];
        this.c = 0;
        this.d = new int[10];
        this.e = new float[10];
        this.f = 0;
        this.g = new int[5];
        this.h = new String[5];
        this.i = 0;
        this.j = new int[4];
        this.k = new boolean[4];
        this.l = 0;
    }

    public void a(int v, float f) {
        int[] arr_v = this.d;
        if(this.f >= arr_v.length) {
            this.d = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.e = Arrays.copyOf(this.e, this.e.length * 2);
        }
        int v1 = this.f;
        this.d[v1] = v;
        this.f = v1 + 1;
        this.e[v1] = f;
    }

    public void b(int v, int v1) {
        int[] arr_v = this.a;
        if(this.c >= arr_v.length) {
            this.a = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.b = Arrays.copyOf(this.b, this.b.length * 2);
        }
        int v2 = this.c;
        this.a[v2] = v;
        this.c = v2 + 1;
        this.b[v2] = v1;
    }

    public void c(int v, String s) {
        int[] arr_v = this.g;
        if(this.i >= arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.h = (String[])Arrays.copyOf(this.h, this.h.length * 2);
        }
        int v1 = this.i;
        this.g[v1] = v;
        this.i = v1 + 1;
        this.h[v1] = s;
    }

    public void d(int v, boolean z) {
        int[] arr_v = this.j;
        if(this.l >= arr_v.length) {
            this.j = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.k = Arrays.copyOf(this.k, this.k.length * 2);
        }
        int v1 = this.l;
        this.j[v1] = v;
        this.l = v1 + 1;
        this.k[v1] = z;
    }

    public void e(int v, String s) {
        if(s != null) {
            this.c(v, s);
        }
    }

    public void f(TypedBundle typedBundle0) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            typedBundle0.b(this.a[v1], this.b[v1]);
        }
        for(int v2 = 0; v2 < this.f; ++v2) {
            typedBundle0.a(this.d[v2], this.e[v2]);
        }
        for(int v3 = 0; v3 < this.i; ++v3) {
            typedBundle0.c(this.g[v3], this.h[v3]);
        }
        for(int v = 0; v < this.l; ++v) {
            typedBundle0.d(this.j[v], this.k[v]);
        }
    }

    public void g(TypedValues typedValues0) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            typedValues0.a(this.a[v1], this.b[v1]);
        }
        for(int v2 = 0; v2 < this.f; ++v2) {
            typedValues0.b(this.d[v2], this.e[v2]);
        }
        for(int v3 = 0; v3 < this.i; ++v3) {
            typedValues0.d(this.g[v3], this.h[v3]);
        }
        for(int v = 0; v < this.l; ++v) {
            typedValues0.c(this.j[v], this.k[v]);
        }
    }

    public void h() {
        this.l = 0;
        this.i = 0;
        this.f = 0;
        this.c = 0;
    }

    public int i(int v) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            if(this.a[v1] == v) {
                return this.b[v1];
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "TypedBundle{mCountInt=" + this.c + ", mCountFloat=" + this.f + ", mCountString=" + this.i + ", mCountBoolean=" + this.l + '}';
    }
}

