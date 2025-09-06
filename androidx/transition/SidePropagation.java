package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SidePropagation extends VisibilityPropagation {
    private float d;
    private int e;

    public SidePropagation() {
        this.d = 3.0f;
        this.e = 80;
    }

    @Override  // androidx.transition.TransitionPropagation
    public long c(@NonNull ViewGroup viewGroup0, @NonNull Transition transition0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        int v8;
        int v7;
        int v;
        if(transitionValues0 == null && transitionValues1 == null) {
            return 0L;
        }
        Rect rect0 = transition0.K();
        if(transitionValues1 == null || this.e(transitionValues0) == 0) {
            v = -1;
        }
        else {
            transitionValues0 = transitionValues1;
            v = 1;
        }
        int v1 = this.f(transitionValues0);
        int v2 = this.g(transitionValues0);
        int[] arr_v = new int[2];
        viewGroup0.getLocationOnScreen(arr_v);
        int v3 = arr_v[0] + Math.round(viewGroup0.getTranslationX());
        int v4 = arr_v[1] + Math.round(viewGroup0.getTranslationY());
        int v5 = v3 + viewGroup0.getWidth();
        int v6 = v4 + viewGroup0.getHeight();
        if(rect0 == null) {
            v7 = (v3 + v5) / 2;
            v8 = (v4 + v6) / 2;
        }
        else {
            v7 = rect0.centerX();
            v8 = rect0.centerY();
        }
        float f = ((float)this.h(viewGroup0, v1, v2, v7, v8, v3, v4, v5, v6)) / ((float)this.i(viewGroup0));
        return (long)Math.round(((float)((transition0.J() >= 0L ? transition0.J() : 300L) * ((long)v))) / this.d * f);
    }

    private int h(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        int v8 = this.e;
        if(v8 != 0x800003) {
            if(v8 == 0x800005) {
                v8 = view0.getLayoutDirection() == 1 ? 3 : 5;
            }
        }
        else if(view0.getLayoutDirection() != 1) {
            v8 = 3;
        }
        else {
            v8 = 5;
        }
        switch(v8) {
            case 3: {
                return Math.abs(v3 - v1) + (v6 - v);
            }
            case 5: {
                return Math.abs(v3 - v1) + (v - v4);
            }
            case 0x30: {
                return Math.abs(v2 - v) + (v7 - v1);
            }
            case 80: {
                return Math.abs(v2 - v) + (v1 - v5);
            }
            default: {
                return 0;
            }
        }
    }

    private int i(ViewGroup viewGroup0) {
        return this.e == 3 || this.e == 5 || this.e == 0x800003 || this.e == 0x800005 ? viewGroup0.getWidth() : viewGroup0.getHeight();
    }

    public void j(float f) {
        if(f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.d = f;
    }

    public void k(int v) {
        this.e = v;
    }
}

