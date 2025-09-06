package androidx.core.view;

import android.view.MotionEvent;

class VelocityTrackerFallback {
    private final float[] a;
    private final long[] b;
    private float c;
    private int d;
    private int e;
    private static final long f = 100L;
    private static final int g = 20;
    private static final long h = 40L;

    VelocityTrackerFallback() {
        this.a = new float[20];
        this.b = new long[20];
        this.c = 0.0f;
        this.d = 0;
        this.e = 0;
    }

    void a(MotionEvent motionEvent0) {
        long v = motionEvent0.getEventTime();
        if(this.d != 0 && v - this.b[this.e] > 40L) {
            this.b();
        }
        int v1 = (this.e + 1) % 20;
        this.e = v1;
        int v2 = this.d;
        if(v2 != 20) {
            this.d = v2 + 1;
        }
        this.a[v1] = motionEvent0.getAxisValue(26);
        this.b[this.e] = v;
    }

    private void b() {
        this.d = 0;
        this.c = 0.0f;
    }

    void c(int v) {
        this.d(v, 3.402823E+38f);
    }

    void d(int v, float f) {
        float f1 = this.f() * ((float)v);
        this.c = f1;
        if(f1 < -Math.abs(f)) {
            this.c = -Math.abs(f);
            return;
        }
        if(this.c > Math.abs(f)) {
            this.c = Math.abs(f);
        }
    }

    float e(int v) {
        return v == 26 ? this.c : 0.0f;
    }

    private float f() {
        long v3;
        long[] arr_v;
        int v = this.d;
        if(v < 2) {
            return 0.0f;
        }
        int v1 = (this.e + 20 - (v - 1)) % 20;
        long v2 = this.b[this.e];
        while(true) {
            arr_v = this.b;
            v3 = arr_v[v1];
            if(v2 - v3 <= 100L) {
                break;
            }
            --this.d;
            v1 = (v1 + 1) % 20;
        }
        int v4 = this.d;
        if(v4 < 2) {
            return 0.0f;
        }
        if(v4 == 2) {
            int v5 = (v1 + 1) % 20;
            long v6 = arr_v[v5];
            return v3 == v6 ? 0.0f : this.a[v5] / ((float)(v6 - v3));
        }
        int v8 = 0;
        float f = 0.0f;
        for(int v7 = 0; v7 < this.d - 1; ++v7) {
            int v9 = v7 + v1;
            long v10 = this.b[v9 % 20];
            int v11 = (v9 + 1) % 20;
            if(this.b[v11] != v10) {
                ++v8;
                float f1 = this.a[v11] / ((float)(this.b[v11] - v10));
                f += (f1 - VelocityTrackerFallback.g(f)) * Math.abs(f1);
                if(v8 == 1) {
                    f *= 0.5f;
                }
            }
        }
        return VelocityTrackerFallback.g(f);
    }

    private static float g(float f) {
        return f < 0.0f ? -1.0f * ((float)Math.sqrt(Math.abs(f) * 2.0f)) : 1.0f * ((float)Math.sqrt(Math.abs(f) * 2.0f));
    }
}

