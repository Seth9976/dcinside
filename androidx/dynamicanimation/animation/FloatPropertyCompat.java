package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

public abstract class FloatPropertyCompat {
    final String a;

    public FloatPropertyCompat(String s) {
        this.a = s;
    }

    @RequiresApi(24)
    public static FloatPropertyCompat a(FloatProperty floatProperty0) {
        return new FloatPropertyCompat(floatProperty0.getName()) {
            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float b(Object object0) {
                return (float)(((Float)floatProperty0.get(object0)));
            }

            @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void c(Object object0, float f) {
                floatProperty0.setValue(object0, f);
            }
        };
    }

    public abstract float b(Object arg1);

    public abstract void c(Object arg1, float arg2);
}

