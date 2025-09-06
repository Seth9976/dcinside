package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.b;

public class j {
    private static final String a = "cubic-bezier";
    private static final String b = "path";
    private static final String c = "(";
    private static final String d = ")";

    private static float a(String[] arr_s, int v) {
        float f = Float.parseFloat(arr_s[v]);
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
        }
        return f;
    }

    private static String b(String s, String s1) {
        return s.substring(s1.length() + 1, s.length() - 1);
    }

    private static TimeInterpolator c(String s) {
        if(j.e(s, "cubic-bezier")) {
            String[] arr_s = j.b(s, "cubic-bezier").split(",");
            if(arr_s.length != 4) {
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + arr_s.length);
            }
            return PathInterpolatorCompat.b(j.a(arr_s, 0), j.a(arr_s, 1), j.a(arr_s, 2), j.a(arr_s, 3));
        }
        if(!j.e(s, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: " + s);
        }
        return PathInterpolatorCompat.c(PathParser.e(j.b(s, "path")));
    }

    // 去混淆评级： 低(20)
    private static boolean d(String s) {
        return j.e(s, "cubic-bezier") || j.e(s, "path");
    }

    // 去混淆评级： 低(20)
    private static boolean e(String s, String s1) {
        return s.startsWith(s1 + "(") && s.endsWith(")");
    }

    public static int f(@NonNull Context context0, @AttrRes int v, int v1) {
        return b.e(context0, v, v1);
    }

    @NonNull
    public static TimeInterpolator g(@NonNull Context context0, @AttrRes int v, @NonNull TimeInterpolator timeInterpolator0) {
        TypedValue typedValue0 = new TypedValue();
        if(!context0.getTheme().resolveAttribute(v, typedValue0, true)) {
            return timeInterpolator0;
        }
        if(typedValue0.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String s = String.valueOf(typedValue0.string);
        return j.d(s) ? j.c(s) : AnimationUtils.loadInterpolator(context0, typedValue0.resourceId);
    }
}

