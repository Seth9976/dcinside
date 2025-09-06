package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;

@RestrictTo({Scope.b})
public class d {
    private static final float a = 1.3f;
    private static final float b = 2.0f;

    @Nullable
    public static ColorStateList a(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = AppCompatResources.a(context0, v1);
                return colorStateList0 == null ? typedArray0.getColorStateList(v) : colorStateList0;
            }
        }
        return typedArray0.getColorStateList(v);
    }

    @Nullable
    public static ColorStateList b(@NonNull Context context0, @NonNull TintTypedArray tintTypedArray0, @StyleableRes int v) {
        if(tintTypedArray0.C(v)) {
            int v1 = tintTypedArray0.u(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = AppCompatResources.a(context0, v1);
                return colorStateList0 == null ? tintTypedArray0.d(v) : colorStateList0;
            }
        }
        return tintTypedArray0.d(v);
    }

    private static int c(TypedValue typedValue0) {
        return Build.VERSION.SDK_INT < 22 ? typedValue0.data & 15 : typedValue0.getComplexUnit();
    }

    public static int d(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v, int v1) {
        TypedValue typedValue0 = new TypedValue();
        if(typedArray0.getValue(v, typedValue0) && typedValue0.type == 2) {
            TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(new int[]{typedValue0.data});
            int v2 = typedArray1.getDimensionPixelSize(0, v1);
            typedArray1.recycle();
            return v2;
        }
        return typedArray0.getDimensionPixelSize(v, v1);
    }

    @Nullable
    public static Drawable e(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                Drawable drawable0 = AppCompatResources.b(context0, v1);
                return drawable0 == null ? typedArray0.getDrawable(v) : drawable0;
            }
        }
        return typedArray0.getDrawable(v);
    }

    public static float f(@NonNull Context context0) {
        return context0.getResources().getConfiguration().fontScale;
    }

    // 去混淆评级： 低(20)
    @StyleableRes
    static int g(@NonNull TypedArray typedArray0, @StyleableRes int v, @StyleableRes int v1) {
        return typedArray0.hasValue(v) ? v : v1;
    }

    @Nullable
    public static e h(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : new e(context0, v1);
        }
        return null;
    }

    public static int i(@NonNull Context context0, @StyleRes int v, int v1) {
        if(v == 0) {
            return v1;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.TextAppearance);
        TypedValue typedValue0 = new TypedValue();
        boolean z = typedArray0.getValue(styleable.TextAppearance_android_textSize, typedValue0);
        typedArray0.recycle();
        if(!z) {
            return v1;
        }
        return d.c(typedValue0) == 2 ? Math.round(TypedValue.complexToFloat(typedValue0.data) * context0.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
    }

    public static boolean j(@NonNull Context context0) {
        return context0.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean k(@NonNull Context context0) {
        return context0.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

