package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.color.utilities.a;
import com.google.android.material.color.utilities.l;
import com.google.android.material.resources.b;

public class v {
    public static final float a = 1.0f;
    public static final float b = 0.54f;
    public static final float c = 0.38f;
    public static final float d = 0.32f;
    public static final float e = 0.12f;
    private static final int f = 40;
    private static final int g = 100;
    private static final int h = 90;
    private static final int i = 10;
    private static final int j = 94;
    private static final int k = 92;
    private static final int l = 80;
    private static final int m = 20;
    private static final int n = 30;
    private static final int o = 90;
    private static final int p = 12;
    private static final int q = 17;
    private static final int r = 6;

    @ColorInt
    public static int a(@ColorInt int v, @IntRange(from = 0L, to = 0xFFL) int v1) {
        return ColorUtils.D(v, Color.alpha(v) * v1 / 0xFF);
    }

    @ColorInt
    public static int b(@NonNull Context context0, @AttrRes int v, @ColorInt int v1) {
        Integer integer0 = v.f(context0, v);
        return integer0 == null ? v1 : ((int)integer0);
    }

    @ColorInt
    public static int c(Context context0, @AttrRes int v, String s) {
        return v.w(context0, b.i(context0, v, s));
    }

    @ColorInt
    public static int d(@NonNull View view0, @AttrRes int v) {
        return v.w(view0.getContext(), b.j(view0, v));
    }

    @ColorInt
    public static int e(@NonNull View view0, @AttrRes int v, @ColorInt int v1) {
        return v.b(view0.getContext(), v, v1);
    }

    @ColorInt
    @Nullable
    public static Integer f(@NonNull Context context0, @AttrRes int v) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null ? null : v.w(context0, typedValue0);
    }

    @ColorInt
    private static int g(@ColorInt int v, @IntRange(from = 0L, to = 100L) int v1) {
        l l0 = l.b(v);
        l0.j(((double)v1));
        return l0.k();
    }

    @ColorInt
    private static int h(@ColorInt int v, @IntRange(from = 0L, to = 100L) int v1, int v2) {
        l l0 = l.b(v.g(v, v1));
        l0.g(((double)v2));
        return l0.k();
    }

    // 去混淆评级： 低(20)
    @NonNull
    public static o i(@ColorInt int v, boolean z) {
        return z ? new o(v.g(v, 40), v.g(v, 100), v.g(v, 90), v.g(v, 10)) : new o(v.g(v, 80), v.g(v, 20), v.g(v, 30), v.g(v, 90));
    }

    @NonNull
    public static o j(@NonNull Context context0, @ColorInt int v) {
        return v.i(v, v.r(context0));
    }

    @NonNull
    public static ColorStateList k(@NonNull Context context0, @AttrRes int v, @NonNull ColorStateList colorStateList0) {
        TypedValue typedValue0 = b.a(context0, v);
        ColorStateList colorStateList1 = typedValue0 == null ? null : v.x(context0, typedValue0);
        return colorStateList1 == null ? colorStateList0 : colorStateList1;
    }

    @Nullable
    public static ColorStateList l(@NonNull Context context0, @AttrRes int v) {
        TypedValue typedValue0 = b.a(context0, v);
        if(typedValue0 == null) {
            return null;
        }
        int v1 = typedValue0.resourceId;
        if(v1 != 0) {
            return ContextCompat.getColorStateList(context0, v1);
        }
        return typedValue0.data == 0 ? null : ColorStateList.valueOf(typedValue0.data);
    }

    // 去混淆评级： 低(20)
    @ColorInt
    @RestrictTo({Scope.b})
    public static int m(@NonNull Context context0, @ColorInt int v) {
        return v.r(context0) ? v.h(v, 94, 6) : v.h(v, 12, 6);
    }

    // 去混淆评级： 低(20)
    @ColorInt
    @RestrictTo({Scope.b})
    public static int n(@NonNull Context context0, @ColorInt int v) {
        return v.r(context0) ? v.h(v, 92, 6) : v.h(v, 17, 6);
    }

    @ColorInt
    public static int o(@ColorInt int v, @ColorInt int v1) {
        return a.b(v, v1);
    }

    @ColorInt
    public static int p(@NonNull Context context0, @ColorInt int v) {
        return v.o(v, v.c(context0, attr.colorPrimary, v.class.getCanonicalName()));
    }

    public static boolean q(@ColorInt int v) {
        return v != 0 && ColorUtils.n(v) > 0.5;
    }

    static boolean r(@NonNull Context context0) {
        return b.b(context0, attr.isLightTheme, true);
    }

    @ColorInt
    public static int s(@ColorInt int v, @ColorInt int v1) {
        return ColorUtils.v(v1, v);
    }

    @ColorInt
    public static int t(@ColorInt int v, @ColorInt int v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        return v.s(v, ColorUtils.D(v1, Math.round(((float)Color.alpha(v1)) * f)));
    }

    @ColorInt
    public static int u(@NonNull View view0, @AttrRes int v, @AttrRes int v1) {
        return v.v(view0, v, v1, 1.0f);
    }

    @ColorInt
    public static int v(@NonNull View view0, @AttrRes int v, @AttrRes int v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        return v.t(v.d(view0, v), v.d(view0, v1), f);
    }

    private static int w(@NonNull Context context0, @NonNull TypedValue typedValue0) {
        return typedValue0.resourceId == 0 ? typedValue0.data : ContextCompat.getColor(context0, typedValue0.resourceId);
    }

    private static ColorStateList x(@NonNull Context context0, @NonNull TypedValue typedValue0) {
        int v = typedValue0.resourceId;
        return v == 0 ? ColorStateList.valueOf(typedValue0.data) : ContextCompat.getColorStateList(context0, v);
    }
}

