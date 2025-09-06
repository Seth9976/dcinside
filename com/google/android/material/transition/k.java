package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

public final class k extends PathMotion {
    @Override  // androidx.transition.PathMotion
    @NonNull
    public Path a(float f, float f1, float f2, float f3) {
        Path path0 = new Path();
        path0.moveTo(f, f1);
        PointF pointF0 = k.b(f, f1, f2, f3);
        path0.quadTo(pointF0.x, pointF0.y, f2, f3);
        return path0;
    }

    private static PointF b(float f, float f1, float f2, float f3) {
        return f1 > f3 ? new PointF(f2, f1) : new PointF(f, f3);
    }
}

