package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

public abstract class MotionInterpolator implements Interpolator {
    public abstract float a();

    @Override  // android.animation.TimeInterpolator
    public abstract float getInterpolation(float arg1);
}

