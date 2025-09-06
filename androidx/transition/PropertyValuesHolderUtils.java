package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

class PropertyValuesHolderUtils {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static PropertyValuesHolder a(Property property0, Path path0) {
            return PropertyValuesHolder.ofObject(property0, null, path0);
        }
    }

    static PropertyValuesHolder a(Property property0, Path path0) {
        return Api21Impl.a(property0, path0);
    }
}

