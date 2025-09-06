package com.github.mikephil.charting.data.filter;

import android.annotation.TargetApi;
import java.util.Arrays;

public class a {
    class com.github.mikephil.charting.data.filter.a.a {
        private float[] a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        final a g;

        public com.github.mikephil.charting.data.filter.a.a(float f, float f1, float f2, float f3) {
            float f4 = f - f2;
            this.d = f4;
            float f5 = f1 - f3;
            this.e = f5;
            this.b = f * f3;
            this.c = f2 * f1;
            this.f = (float)Math.sqrt(f4 * f4 + f5 * f5);
            this.a = new float[]{f, f1, f2, f3};
        }

        public float a(float f, float f1) {
            return Math.abs(this.e * f - this.d * f1 + this.b - this.c) / this.f;
        }

        public float[] b() {
            return this.a;
        }
    }

    float[] a(float[][] arr2_f) {
        int v1 = 0;
        for(int v = 0; v < arr2_f.length; ++v) {
            v1 += arr2_f[v].length;
        }
        float[] arr_f = new float[v1];
        int v3 = 0;
        for(int v2 = 0; v2 < arr2_f.length; ++v2) {
            float[] arr_f1 = arr2_f[v2];
            for(int v4 = 0; v4 < arr_f1.length; ++v4) {
                arr_f[v3] = arr_f1[v4];
                ++v3;
            }
        }
        return arr_f;
    }

    @TargetApi(9)
    public float[] b(float[] arr_f, float f) {
        com.github.mikephil.charting.data.filter.a.a a$a0 = new com.github.mikephil.charting.data.filter.a.a(this, arr_f[0], arr_f[1], arr_f[arr_f.length - 2], arr_f[arr_f.length - 1]);
        float f1 = 0.0f;
        int v1 = 0;
        for(int v = 2; v < arr_f.length - 2; v += 2) {
            float f2 = a$a0.a(arr_f[v], arr_f[v + 1]);
            if(f2 > f1) {
                v1 = v;
                f1 = f2;
            }
        }
        if(f1 > f) {
            float[] arr_f1 = this.b(Arrays.copyOfRange(arr_f, 0, v1 + 2), f);
            float[] arr_f2 = this.b(Arrays.copyOfRange(arr_f, v1, arr_f.length), f);
            return this.a(new float[][]{arr_f1, Arrays.copyOfRange(arr_f2, 2, arr_f2.length)});
        }
        return a$a0.b();
    }
}

