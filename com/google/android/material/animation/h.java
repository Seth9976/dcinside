package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

public class h implements TypeEvaluator {
    private final float[] a;
    private final float[] b;
    private final Matrix c;

    public h() {
        this.a = new float[9];
        this.b = new float[9];
        this.c = new Matrix();
    }

    @NonNull
    public Matrix a(float f, @NonNull Matrix matrix0, @NonNull Matrix matrix1) {
        matrix0.getValues(this.a);
        matrix1.getValues(this.b);
        for(int v = 0; v < 9; ++v) {
            float f1 = this.b[v];
            float f2 = this.a[v];
            this.b[v] = f2 + (f1 - f2) * f;
        }
        this.c.setValues(this.b);
        return this.c;
    }

    @Override  // android.animation.TypeEvaluator
    @NonNull
    public Object evaluate(float f, @NonNull Object object0, @NonNull Object object1) {
        return this.a(f, ((Matrix)object0), ((Matrix)object1));
    }
}

