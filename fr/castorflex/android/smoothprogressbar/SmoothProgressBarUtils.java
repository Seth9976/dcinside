package fr.castorflex.android.smoothprogressbar;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

public final class SmoothProgressBarUtils {
    static void checkAngle(int v) {
        if(v < 0 || v > 360) {
            throw new IllegalArgumentException(String.format("Illegal angle %d: must be >=0 and <= 360", v));
        }
    }

    static void checkColors(int[] arr_v) {
        if(arr_v == null || arr_v.length == 0) {
            throw new IllegalArgumentException("You must provide at least 1 color");
        }
    }

    static void checkNotNull(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.format("%s must be not null", s));
        }
    }

    static void checkPositive(int v, String s) {
        if(v <= 0) {
            throw new IllegalArgumentException(String.format("%s must not be null", s));
        }
    }

    static void checkPositiveOrZero(float f, String s) {
        if(f < 0.0f) {
            throw new IllegalArgumentException(String.format("%s %d must be positive", s, f));
        }
    }

    static void checkSpeed(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Speed must be >= 0");
        }
    }

    public static Drawable generateDrawableWithColors(int[] arr_v, float f) {
        return arr_v != null && arr_v.length != 0 ? new ShapeDrawable(new ColorsShape(f, arr_v)) : null;
    }
}

