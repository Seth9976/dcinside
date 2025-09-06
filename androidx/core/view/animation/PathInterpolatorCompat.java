package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;

public final class PathInterpolatorCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static Interpolator a(float f, float f1) {
            return new PathInterpolator(f, f1);
        }

        static Interpolator b(float f, float f1, float f2, float f3) {
            return new PathInterpolator(f, f1, f2, f3);
        }

        static Interpolator c(Path path0) {
            return new PathInterpolator(path0);
        }
    }

    public static Interpolator a(float f, float f1) {
        return Api21Impl.a(f, f1);
    }

    public static Interpolator b(float f, float f1, float f2, float f3) {
        return Api21Impl.b(f, f1, f2, f3);
    }

    public static Interpolator c(Path path0) {
        return Api21Impl.c(path0);
    }
}

