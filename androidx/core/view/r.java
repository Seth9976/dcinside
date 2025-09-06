package androidx.core.view;

import android.view.MotionEvent;
import android.view.VelocityTracker;

public final class r implements DifferentialVelocityProvider {
    @Override  // androidx.core.view.DifferentialMotionFlingController$DifferentialVelocityProvider
    public final float a(VelocityTracker velocityTracker0, MotionEvent motionEvent0, int v) {
        return DifferentialMotionFlingController.f(velocityTracker0, motionEvent0, v);
    }
}

