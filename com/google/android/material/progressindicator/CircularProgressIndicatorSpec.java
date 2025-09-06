package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;

public final class CircularProgressIndicatorSpec extends c {
    @Px
    public int h;
    @Px
    public int i;
    public int j;

    public CircularProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, CircularProgressIndicator.z);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        int v2 = context0.getResources().getDimensionPixelSize(dimen.mtrl_progress_circular_size_medium);
        int v3 = context0.getResources().getDimensionPixelSize(dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.CircularProgressIndicator, v, v1, new int[0]);
        this.h = Math.max(d.d(context0, typedArray0, styleable.CircularProgressIndicator_indicatorSize, v2), this.a * 2);
        this.i = d.d(context0, typedArray0, styleable.CircularProgressIndicator_indicatorInset, v3);
        this.j = typedArray0.getInt(styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArray0.recycle();
        this.e();
    }

    int f() {
        return this.g == 0 ? 0 : ((int)Math.round(360.0 / (((double)(this.h - this.i * 2 - this.a)) * 3.141593 / ((double)(this.g + this.b)))));
    }
}

