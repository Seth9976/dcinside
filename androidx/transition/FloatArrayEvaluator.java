package androidx.transition;

import android.animation.TypeEvaluator;

class FloatArrayEvaluator implements TypeEvaluator {
    private float[] a;

    FloatArrayEvaluator(float[] arr_f) {
        this.a = arr_f;
    }

    public float[] a(float f, float[] arr_f, float[] arr_f1) {
        float[] arr_f2 = this.a == null ? new float[arr_f.length] : this.a;
        for(int v = 0; v < arr_f2.length; ++v) {
            float f1 = arr_f[v];
            arr_f2[v] = f1 + (arr_f1[v] - f1) * f;
        }
        return arr_f2;
    }

    @Override  // android.animation.TypeEvaluator
    public Object evaluate(float f, Object object0, Object object1) {
        return this.a(f, ((float[])object0), ((float[])object1));
    }
}

