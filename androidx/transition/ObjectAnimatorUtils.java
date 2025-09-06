package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

class ObjectAnimatorUtils {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static ObjectAnimator a(Object object0, Property property0, Path path0) {
            return ObjectAnimator.ofObject(object0, property0, null, path0);
        }
    }

    static ObjectAnimator a(Object object0, Property property0, Path path0) {
        return Api21Impl.a(object0, property0, path0);
    }
}

