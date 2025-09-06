package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

public abstract class g {
    private float a;
    private float b;

    static int[] a(int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = arr_v[v] * 2;
        }
        return arr_v1;
    }

    @FloatRange(from = 0.0, to = 1.0)
    static float b(float f, float f1, float f2) [...] // Inlined contents

    public float c() {
        return this.b;
    }

    public float d() {
        return this.a;
    }

    void e(Context context0) {
        this.a = this.a > 0.0f ? this.a : h.h(context0);
        this.b = this.b > 0.0f ? this.b : h.g(context0);
    }

    boolean f() {
        return true;
    }

    abstract k g(@NonNull b arg1, @NonNull View arg2);

    public void h(float f) {
        this.b = f;
    }

    public void i(float f) {
        this.a = f;
    }

    boolean j(b b0, int v) {
        return false;
    }
}

