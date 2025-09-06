package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TypedValueCompat {
    @RequiresApi(34)
    static class Api34Impl {
        public static float a(int v, float f, DisplayMetrics displayMetrics0) {
            return TypedValue.deriveDimension(v, f, displayMetrics0);
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    private static final float a = 0.013889f;
    private static final float b = 0.03937f;

    public static float a(int v, float f, DisplayMetrics displayMetrics0) {
        if(Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.a(v, f, displayMetrics0);
        }
        switch(v) {
            case 0: {
                return f;
            }
            case 1: {
                return displayMetrics0.density == 0.0f ? 0.0f : f / displayMetrics0.density;
            }
            case 2: {
                return displayMetrics0.scaledDensity == 0.0f ? 0.0f : f / displayMetrics0.scaledDensity;
            }
            case 3: {
                return displayMetrics0.xdpi == 0.0f ? 0.0f : f / displayMetrics0.xdpi / 0.013889f;
            }
            case 4: {
                return displayMetrics0.xdpi == 0.0f ? 0.0f : f / displayMetrics0.xdpi;
            }
            case 5: {
                return displayMetrics0.xdpi == 0.0f ? 0.0f : f / displayMetrics0.xdpi / 0.03937f;
            }
            default: {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + v);
            }
        }
    }

    public static float b(float f, DisplayMetrics displayMetrics0) {
        return TypedValue.applyDimension(1, f, displayMetrics0);
    }

    @SuppressLint({"WrongConstant"})
    public static int c(int v) [...] // Inlined contents

    public static float d(float f, DisplayMetrics displayMetrics0) {
        return TypedValueCompat.a(1, f, displayMetrics0);
    }

    public static float e(float f, DisplayMetrics displayMetrics0) {
        return TypedValueCompat.a(2, f, displayMetrics0);
    }

    public static float f(float f, DisplayMetrics displayMetrics0) {
        return TypedValue.applyDimension(2, f, displayMetrics0);
    }
}

