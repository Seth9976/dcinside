package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;

@RestrictTo({Scope.b})
public class b {
    @Nullable
    public static TypedValue a(@NonNull Context context0, @AttrRes int v) {
        TypedValue typedValue0 = new TypedValue();
        return context0.getTheme().resolveAttribute(v, typedValue0, true) ? typedValue0 : null;
    }

    public static boolean b(@NonNull Context context0, @AttrRes int v, boolean z) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null || typedValue0.type != 18 ? z : typedValue0.data != 0;
    }

    public static boolean c(@NonNull Context context0, @AttrRes int v, @NonNull String s) {
        return b.g(context0, v, s) != 0;
    }

    @Px
    public static int d(@NonNull Context context0, @AttrRes int v, @DimenRes int v1) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null || typedValue0.type != 5 ? ((int)context0.getResources().getDimension(v1)) : ((int)typedValue0.getDimension(context0.getResources().getDisplayMetrics()));
    }

    public static int e(@NonNull Context context0, @AttrRes int v, int v1) {
        TypedValue typedValue0 = b.a(context0, v);
        return typedValue0 == null || typedValue0.type != 16 ? v1 : typedValue0.data;
    }

    @Px
    public static int f(@NonNull Context context0) {
        return b.d(context0, attr.minTouchTargetSize, dimen.mtrl_min_touch_target_size);
    }

    public static int g(@NonNull Context context0, @AttrRes int v, @NonNull String s) {
        return b.i(context0, v, s).data;
    }

    public static int h(@NonNull View view0, @AttrRes int v) {
        return b.j(view0, v).data;
    }

    @NonNull
    public static TypedValue i(@NonNull Context context0, @AttrRes int v, @NonNull String s) {
        TypedValue typedValue0 = b.a(context0, v);
        if(typedValue0 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context0.getResources().getResourceName(v)));
        }
        return typedValue0;
    }

    @NonNull
    public static TypedValue j(@NonNull View view0, @AttrRes int v) {
        return b.i(view0.getContext(), v, view0.getClass().getCanonicalName());
    }
}

