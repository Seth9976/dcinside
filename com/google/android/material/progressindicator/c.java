package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;

public abstract class c {
    @Px
    public int a;
    @Px
    public int b;
    @NonNull
    public int[] c;
    @ColorInt
    public int d;
    public int e;
    public int f;
    @Px
    public int g;

    protected c(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        this.c = new int[0];
        int v2 = context0.getResources().getDimensionPixelSize(dimen.mtrl_progress_track_thickness);
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.BaseProgressIndicator, v, v1, new int[0]);
        this.a = d.d(context0, typedArray0, styleable.BaseProgressIndicator_trackThickness, v2);
        this.b = Math.min(d.d(context0, typedArray0, styleable.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = typedArray0.getInt(styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = typedArray0.getInt(styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.g = typedArray0.getDimensionPixelSize(styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        this.c(context0, typedArray0);
        this.d(context0, typedArray0);
        typedArray0.recycle();
    }

    public boolean a() {
        return this.f != 0;
    }

    public boolean b() {
        return this.e != 0;
    }

    private void c(@NonNull Context context0, @NonNull TypedArray typedArray0) {
        if(!typedArray0.hasValue(styleable.BaseProgressIndicator_indicatorColor)) {
            this.c = new int[]{v.b(context0, attr.colorPrimary, -1)};
            return;
        }
        if(typedArray0.peekValue(2).type != 1) {
            this.c = new int[]{typedArray0.getColor(2, -1)};
            return;
        }
        int[] arr_v = context0.getResources().getIntArray(typedArray0.getResourceId(2, -1));
        this.c = arr_v;
        if(arr_v.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(@NonNull Context context0, @NonNull TypedArray typedArray0) {
        if(typedArray0.hasValue(styleable.BaseProgressIndicator_trackColor)) {
            this.d = typedArray0.getColor(7, -1);
            return;
        }
        this.d = this.c[0];
        TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(new int[]{0x1010033});
        float f = typedArray1.getFloat(0, 0.2f);
        typedArray1.recycle();
        this.d = v.a(this.d, ((int)(f * 255.0f)));
    }

    @CallSuper
    void e() {
        if(this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}

