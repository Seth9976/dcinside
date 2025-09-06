package com.google.android.material.internal;

import androidx.annotation.FloatRange;

final class k {
    static final float a = 0.5f;

    static void a(@FloatRange(from = 0.0, to = 1.0) float f, float[] arr_f) {
        if(f <= 0.5f) {
            arr_f[0] = 1.0f - f * 2.0f;
            arr_f[1] = 0.0f;
            return;
        }
        arr_f[0] = 0.0f;
        arr_f[1] = f * 2.0f - 1.0f;
    }
}

