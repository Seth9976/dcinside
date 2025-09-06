package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo({Scope.b})
public class b {
    public static final TimeInterpolator a;
    public static final TimeInterpolator b;
    public static final TimeInterpolator c;
    public static final TimeInterpolator d;
    public static final TimeInterpolator e;

    static {
        b.a = new LinearInterpolator();
        b.b = new FastOutSlowInInterpolator();
        b.c = new FastOutLinearInInterpolator();
        b.d = new LinearOutSlowInInterpolator();
        b.e = new DecelerateInterpolator();
    }

    public static float a(float f, float f1, float f2) [...] // Inlined contents

    public static float b(float f, float f1, float f2, float f3, float f4) {
        if(f4 <= f2) {
            return f;
        }
        return f4 >= f3 ? f1 : b.a(f, f1, (f4 - f2) / (f3 - f2));
    }

    public static int c(int v, int v1, float f) {
        return v + Math.round(f * ((float)(v1 - v)));
    }
}

