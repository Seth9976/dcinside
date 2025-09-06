package androidx.compose.runtime.snapshots;

import y4.l;

public final class SnapshotDoubleIndexHeap {
    private int a;
    @l
    private int[] b;
    @l
    private int[] c;
    @l
    private int[] d;
    private int e;

    public SnapshotDoubleIndexHeap() {
        this.b = new int[16];
        this.c = new int[16];
        int[] arr_v = new int[16];
        for(int v = 0; v < 16; ++v) {
            arr_v[v] = v + 1;
        }
        this.d = arr_v;
    }

    public final int a(int v) {
        this.c(this.a + 1);
        int v1 = this.a;
        this.a = v1 + 1;
        int v2 = this.b();
        this.b[v1] = v;
        this.c[v1] = v2;
        this.d[v2] = v1;
        this.j(v1);
        return v2;
    }

    private final int b() {
        int v = this.d.length;
        if(this.e >= v) {
            int[] arr_v = new int[v * 2];
            for(int v1 = 0; v1 < v * 2; ++v1) {
                arr_v[v1] = v1 + 1;
            }
            kotlin.collections.l.I0(this.d, arr_v, 0, 0, 0, 14, null);
            this.d = arr_v;
        }
        int v2 = this.e;
        this.e = this.d[v2];
        return v2;
    }

    private final void c(int v) {
        int[] arr_v = this.b;
        if(v <= arr_v.length) {
            return;
        }
        int[] arr_v1 = new int[arr_v.length * 2];
        int[] arr_v2 = new int[arr_v.length * 2];
        kotlin.collections.l.I0(arr_v, arr_v1, 0, 0, 0, 14, null);
        kotlin.collections.l.I0(this.c, arr_v2, 0, 0, 0, 14, null);
        this.b = arr_v1;
        this.c = arr_v2;
    }

    private final void d(int v) {
        this.d[v] = this.e;
        this.e = v;
    }

    public final int e() {
        return this.a;
    }

    public final int f(int v) {
        return this.a <= 0 ? v : this.b[0];
    }

    public static int g(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return snapshotDoubleIndexHeap0.f(v);
    }

    public final void h(int v) {
        int v1 = this.d[v];
        this.k(v1, this.a - 1);
        --this.a;
        this.j(v1);
        this.i(v1);
        this.d(v);
    }

    private final void i(int v) {
        int[] arr_v = this.b;
        int v1 = this.a >> 1;
        while(v < v1) {
            int v2 = v + 1 << 1;
            int v3 = v2 - 1;
            if(v2 < this.a) {
                int v4 = arr_v[v2];
                if(v4 < arr_v[v3]) {
                    if(v4 < arr_v[v]) {
                        this.k(v2, v);
                        v = v2;
                        continue;
                    }
                    return;
                }
            }
            if(arr_v[v3] >= arr_v[v]) {
                break;
            }
            this.k(v3, v);
            v = v3;
        }
    }

    private final void j(int v) {
        int[] arr_v = this.b;
        int v1 = arr_v[v];
        while(v > 0) {
            int v2 = (v + 1 >> 1) - 1;
            if(arr_v[v2] <= v1) {
                break;
            }
            this.k(v2, v);
            v = v2;
        }
    }

    private final void k(int v, int v1) {
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        int[] arr_v2 = this.d;
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
        int v3 = arr_v1[v];
        arr_v1[v] = arr_v1[v1];
        arr_v1[v1] = v3;
        arr_v2[arr_v1[v]] = v;
        arr_v2[arr_v1[v1]] = v1;
    }

    public final void l() {
        int v = this.a;
        for(int v1 = 1; v1 < v; ++v1) {
            if(this.b[(v1 + 1 >> 1) - 1] > this.b[v1]) {
                throw new IllegalStateException(("Index " + v1 + " is out of place").toString());
            }
        }
    }

    public final void m(int v, int v1) {
        int v2 = this.d[v];
        if(this.c[v2] != v) {
            throw new IllegalStateException(("Index for handle " + v + " is corrupted").toString());
        }
        if(this.b[v2] != v1) {
            throw new IllegalStateException(("Value for handle " + v + " was " + this.b[v2] + " but was supposed to be " + v1).toString());
        }
    }
}

