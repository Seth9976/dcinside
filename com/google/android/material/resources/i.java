package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

@RestrictTo({Scope.b})
public class i {
    @Nullable
    public static Typeface a(@NonNull Context context0, @NonNull Typeface typeface0) {
        return i.b(context0.getResources().getConfiguration(), typeface0);
    }

    @Nullable
    public static Typeface b(@NonNull Configuration configuration0, @NonNull Typeface typeface0) {
        return Build.VERSION.SDK_INT < 0x1F || (configuration0.fontWeightAdjustment == 0 || configuration0.fontWeightAdjustment == 0x7FFFFFFF) || typeface0 == null ? null : Typeface.create(typeface0, MathUtils.e(typeface0.getWeight() + configuration0.fontWeightAdjustment, 1, 1000), typeface0.isItalic());
    }
}

