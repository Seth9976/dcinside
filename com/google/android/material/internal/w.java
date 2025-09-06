package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class w implements TimeInterpolator {
    private final TimeInterpolator a;

    public w(@NonNull TimeInterpolator timeInterpolator0) {
        this.a = timeInterpolator0;
    }

    @NonNull
    public static TimeInterpolator a(boolean z, @NonNull TimeInterpolator timeInterpolator0) {
        return z ? timeInterpolator0 : new w(timeInterpolator0);
    }

    @Override  // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}

