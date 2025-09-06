package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CircularPropagation extends VisibilityPropagation {
    private float d;

    public CircularPropagation() {
        this.d = 3.0f;
    }

    @Override  // androidx.transition.TransitionPropagation
    public long c(@NonNull ViewGroup viewGroup0, @NonNull Transition transition0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        int v4;
        int v3;
        int v;
        if(transitionValues0 == null && transitionValues1 == null) {
            return 0L;
        }
        if(transitionValues1 == null || this.e(transitionValues0) == 0) {
            v = -1;
        }
        else {
            transitionValues0 = transitionValues1;
            v = 1;
        }
        int v1 = this.f(transitionValues0);
        int v2 = this.g(transitionValues0);
        Rect rect0 = transition0.K();
        if(rect0 == null) {
            int[] arr_v = new int[2];
            viewGroup0.getLocationOnScreen(arr_v);
            int v5 = Math.round(((float)(arr_v[0] + viewGroup0.getWidth() / 2)) + viewGroup0.getTranslationX());
            v4 = Math.round(((float)(arr_v[1] + viewGroup0.getHeight() / 2)) + viewGroup0.getTranslationY());
            v3 = v5;
        }
        else {
            v3 = rect0.centerX();
            v4 = rect0.centerY();
        }
        float f = CircularPropagation.h(0.0f, 0.0f, viewGroup0.getWidth(), viewGroup0.getHeight());
        return (long)Math.round(((float)((transition0.J() >= 0L ? transition0.J() : 300L) * ((long)v))) / this.d * (CircularPropagation.h(v1, v2, v3, v4) / f));
    }

    private static float h(float f, float f1, float f2, float f3) {
        return (float)Math.sqrt((f2 - f) * (f2 - f) + (f3 - f1) * (f3 - f1));
    }

    public void i(float f) {
        if(f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.d = f;
    }
}

