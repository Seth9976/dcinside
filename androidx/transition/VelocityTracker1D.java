package androidx.transition;

import java.util.Arrays;

class VelocityTracker1D {
    private long[] a;
    private float[] b;
    private int c;
    private static final int d = 20;
    private static final int e = 40;
    private static final int f = 100;

    VelocityTracker1D() {
        long[] arr_v = new long[20];
        this.a = arr_v;
        this.b = new float[20];
        this.c = 0;
        Arrays.fill(arr_v, 0x8000000000000000L);
    }

    public void a(long v, float f) {
        int v1 = (this.c + 1) % 20;
        this.c = v1;
        this.a[v1] = v;
        this.b[v1] = f;
    }

    float b() {
        int v = this.c;
        if(v == 0 && this.a[0] == 0x8000000000000000L) {
            return 0.0f;
        }
        long v1 = this.a[v];
        int v2 = 0;
        for(long v3 = v1; true; v3 = v4) {
            long v4 = this.a[v];
            if(v4 == 0x8000000000000000L || (((float)(v1 - v4)) > 100.0f || ((float)Math.abs(v4 - v3)) > 40.0f)) {
                break;
            }
            if(v == 0) {
                v = 20;
            }
            --v;
            ++v2;
            if(v2 >= 20) {
                break;
            }
        }
        if(v2 < 2) {
            return 0.0f;
        }
        if(v2 == 2) {
            int v5 = this.c;
            int v6 = v5 == 0 ? 19 : v5 - 1;
            float f = (float)(this.a[v5] - this.a[v6]);
            return f == 0.0f ? 0.0f : (this.b[v5] - this.b[v6]) / f * 1000.0f;
        }
        int v7 = (this.c - v2 + 21) % 20;
        int v8 = (this.c + 21) % 20;
        long v9 = this.a[v7];
        float f1 = this.b[v7];
        int v10 = (v7 + 1) % 20;
        float f2 = 0.0f;
        while(v10 != v8) {
            long v11 = this.a[v10];
            float f3 = (float)(v11 - v9);
            if(f3 != 0.0f) {
                float f4 = this.b[v10];
                float f5 = (f4 - f1) / f3;
                f2 += (f5 - this.c(f2)) * Math.abs(f5);
                f2 = v10 == v7 + 1 ? f2 * 0.5f : f2 + (f5 - this.c(f2)) * Math.abs(f5);
                f1 = f4;
                v9 = v11;
            }
            v10 = (v10 + 1) % 20;
        }
        return this.c(f2) * 1000.0f;
    }

    private float c(float f) {
        return (float)(((double)Math.signum(f)) * Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void d() {
        this.c = 0;
        Arrays.fill(this.a, 0x8000000000000000L);
        Arrays.fill(this.b, 0.0f);
    }
}

