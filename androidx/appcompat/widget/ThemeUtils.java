package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.a})
public class ThemeUtils {
    private static final String a = "ThemeUtils";
    private static final ThreadLocal b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    static final int[] f;
    static final int[] g;
    static final int[] h;
    static final int[] i;
    static final int[] j;
    private static final int[] k;

    static {
        ThemeUtils.b = new ThreadLocal();
        ThemeUtils.c = new int[]{0xFEFEFF62};
        ThemeUtils.d = new int[]{0x101009C};
        ThemeUtils.e = new int[]{0x10102FE};
        ThemeUtils.f = new int[]{0x10100A7};
        ThemeUtils.g = new int[]{0x10100A0};
        ThemeUtils.h = new int[]{0x10100A1};
        ThemeUtils.i = new int[]{0xFEFEFF59, 0xFEFEFF64};
        ThemeUtils.j = new int[0];
        ThemeUtils.k = new int[1];
    }

    public static void a(@NonNull View view0, @NonNull Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(styleable.AppCompatTheme);
        try {
            if(!typedArray0.hasValue(styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view0.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        }
        finally {
            typedArray0.recycle();
        }
    }

    @NonNull
    public static ColorStateList b(int v, int v1) {
        int[][] arr2_v = new int[2][];
        int[] arr_v = new int[2];
        arr2_v[0] = ThemeUtils.c;
        arr_v[0] = v1;
        arr2_v[1] = ThemeUtils.j;
        arr_v[1] = v;
        return new ColorStateList(arr2_v, arr_v);
    }

    public static int c(@NonNull Context context0, int v) {
        ColorStateList colorStateList0 = ThemeUtils.f(context0, v);
        if(colorStateList0 != null && colorStateList0.isStateful()) {
            int v1 = colorStateList0.getDefaultColor();
            return colorStateList0.getColorForState(ThemeUtils.c, v1);
        }
        TypedValue typedValue0 = ThemeUtils.g();
        context0.getTheme().resolveAttribute(0x1010033, typedValue0, true);
        return ThemeUtils.e(context0, v, typedValue0.getFloat());
    }

    public static int d(@NonNull Context context0, int v) {
        ThemeUtils.k[0] = v;
        TintTypedArray tintTypedArray0 = TintTypedArray.F(context0, null, ThemeUtils.k);
        try {
            return tintTypedArray0.c(0, 0);
        }
        finally {
            tintTypedArray0.I();
        }
    }

    static int e(@NonNull Context context0, int v, float f) {
        int v1 = ThemeUtils.d(context0, v);
        return ColorUtils.D(v1, Math.round(((float)Color.alpha(v1)) * f));
    }

    @Nullable
    public static ColorStateList f(@NonNull Context context0, int v) {
        ThemeUtils.k[0] = v;
        TintTypedArray tintTypedArray0 = TintTypedArray.F(context0, null, ThemeUtils.k);
        try {
            return tintTypedArray0.d(0);
        }
        finally {
            tintTypedArray0.I();
        }
    }

    private static TypedValue g() {
        ThreadLocal threadLocal0 = ThemeUtils.b;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        return typedValue0;
    }
}

