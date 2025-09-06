package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.R.attr;

@RestrictTo({Scope.b})
public abstract class a {
    @NonNull
    private final TimeInterpolator a;
    @NonNull
    protected final View b;
    protected final int c;
    protected final int d;
    protected final int e;
    @Nullable
    private BackEventCompat f;
    private static final String g = "MaterialBackHelper";
    private static final int h = 300;
    private static final int i = 150;
    private static final int j = 100;

    public a(@NonNull View view0) {
        this.b = view0;
        Context context0 = view0.getContext();
        Interpolator interpolator0 = PathInterpolatorCompat.b(0.0f, 0.0f, 0.0f, 1.0f);
        this.a = j.g(context0, attr.motionEasingStandardDecelerateInterpolator, interpolator0);
        this.c = j.f(context0, attr.motionDurationMedium2, 300);
        this.d = j.f(context0, attr.motionDurationShort3, 150);
        this.e = j.f(context0, attr.motionDurationShort2, 100);
    }

    public float a(float f) {
        return this.a.getInterpolation(f);
    }

    @Nullable
    protected BackEventCompat b() {
        if(this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat0 = this.f;
        this.f = null;
        return backEventCompat0;
    }

    @Nullable
    public BackEventCompat c() {
        BackEventCompat backEventCompat0 = this.f;
        this.f = null;
        return backEventCompat0;
    }

    protected void d(@NonNull BackEventCompat backEventCompat0) {
        this.f = backEventCompat0;
    }

    @Nullable
    protected BackEventCompat e(@NonNull BackEventCompat backEventCompat0) {
        if(this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat1 = this.f;
        this.f = backEventCompat0;
        return backEventCompat1;
    }
}

