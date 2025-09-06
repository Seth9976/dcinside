package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.ReplaceWith;

public final class ScaleGestureDetectorCompat {
    @ReplaceWith(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @Deprecated
    public static boolean a(ScaleGestureDetector scaleGestureDetector0) {
        return scaleGestureDetector0.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object object0) {
        return ScaleGestureDetectorCompat.a(((ScaleGestureDetector)object0));
    }

    @ReplaceWith(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @Deprecated
    public static void c(ScaleGestureDetector scaleGestureDetector0, boolean z) {
        scaleGestureDetector0.setQuickScaleEnabled(z);
    }

    @Deprecated
    public static void d(Object object0, boolean z) {
        ScaleGestureDetectorCompat.c(((ScaleGestureDetector)object0), z);
    }
}

