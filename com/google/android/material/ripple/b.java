package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.color.v;

@RestrictTo({Scope.b})
public class b {
    @RequiresApi(21)
    static class a {
        @DoNotInline
        private static Drawable b(@NonNull Context context0, @Px int v) {
            GradientDrawable gradientDrawable0 = new GradientDrawable();
            gradientDrawable0.setColor(-1);
            gradientDrawable0.setShape(1);
            InsetDrawable insetDrawable0 = new InsetDrawable(gradientDrawable0, v, v, v, v);
            ColorStateList colorStateList0 = ColorStateList.valueOf(0);
            return new RippleDrawable(v.k(context0, attr.colorControlHighlight, colorStateList0), null, insetDrawable0);
        }
    }

    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean a = false;
    private static final int[] b = null;
    private static final int[] c = null;
    private static final int[] d = null;
    private static final int[] e = null;
    private static final int[] f = null;
    private static final int[] g = null;
    private static final int[] h = null;
    private static final int[] i = null;
    private static final int[] j = null;
    private static final int[] k = null;
    @VisibleForTesting
    static final String l = null;
    @VisibleForTesting
    static final String m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    static {
        b.a = true;
        b.b = new int[]{0x10100A7};
        b.c = new int[]{0x1010367, 0x101009C};
        b.d = new int[]{0x101009C};
        b.e = new int[]{0x1010367};
        b.f = new int[]{0x10100A1, 0x10100A7};
        b.g = new int[]{0x10100A1, 0x1010367, 0x101009C};
        b.h = new int[]{0x10100A1, 0x101009C};
        b.i = new int[]{0x10100A1, 0x1010367};
        b.j = new int[]{0x10100A1};
        b.k = new int[]{0x101009E, 0x10100A7};
        b.l = "b";
    }

    @NonNull
    public static ColorStateList a(@Nullable ColorStateList colorStateList0) {
        if(b.a) {
            int[][] arr2_v = new int[3][];
            int[] arr_v = new int[3];
            arr2_v[0] = b.j;
            arr_v[0] = b.d(colorStateList0, b.f);
            arr2_v[1] = b.d;
            arr_v[1] = b.d(colorStateList0, b.d);
            arr2_v[2] = StateSet.NOTHING;
            arr_v[2] = b.d(colorStateList0, b.b);
            return new ColorStateList(arr2_v, arr_v);
        }
        int[][] arr2_v1 = new int[10][];
        int[] arr_v1 = new int[10];
        arr2_v1[0] = b.f;
        arr_v1[0] = b.d(colorStateList0, b.f);
        arr2_v1[1] = b.g;
        arr_v1[1] = b.d(colorStateList0, b.g);
        arr2_v1[2] = b.h;
        arr_v1[2] = b.d(colorStateList0, b.h);
        arr2_v1[3] = b.i;
        arr_v1[3] = b.d(colorStateList0, b.i);
        arr2_v1[4] = b.j;
        arr_v1[4] = 0;
        arr2_v1[5] = b.b;
        arr_v1[5] = b.d(colorStateList0, b.b);
        arr2_v1[6] = b.c;
        arr_v1[6] = b.d(colorStateList0, b.c);
        arr2_v1[7] = b.d;
        arr_v1[7] = b.d(colorStateList0, b.d);
        arr2_v1[8] = b.e;
        arr_v1[8] = b.d(colorStateList0, b.e);
        arr2_v1[9] = StateSet.NOTHING;
        arr_v1[9] = 0;
        return new ColorStateList(arr2_v1, arr_v1);
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable b(@NonNull Context context0, @Px int v) {
        return a.b(context0, v);
    }

    @TargetApi(21)
    @ColorInt
    private static int c(@ColorInt int v) {
        return ColorUtils.D(v, Math.min(Color.alpha(v) * 2, 0xFF));
    }

    @ColorInt
    private static int d(@Nullable ColorStateList colorStateList0, int[] arr_v) {
        int v = colorStateList0 == null ? 0 : colorStateList0.getColorForState(arr_v, colorStateList0.getDefaultColor());
        return b.a ? b.c(v) : v;
    }

    @NonNull
    public static ColorStateList e(@Nullable ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            if(Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList0.getDefaultColor()) == 0 && Color.alpha(colorStateList0.getColorForState(b.k, 0)) != 0) {
                Log.w("b", "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList0;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean f(@NonNull int[] arr_v) {
        boolean z = false;
        boolean z1 = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == 0x101009E) {
                z = true;
            }
            else if(v1 == 0x101009C || v1 == 0x10100A7 || v1 == 0x1010367) {
                z1 = true;
            }
        }
        return z && z1;
    }
}

