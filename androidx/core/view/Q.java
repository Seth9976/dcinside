package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;

public final class q implements FlingVelocityThresholdCalculator {
    @Override  // androidx.core.view.DifferentialMotionFlingController$FlingVelocityThresholdCalculator
    public final void a(Context context0, int[] arr_v, MotionEvent motionEvent0, int v) {
        DifferentialMotionFlingController.c(context0, arr_v, motionEvent0, v);
    }
}

