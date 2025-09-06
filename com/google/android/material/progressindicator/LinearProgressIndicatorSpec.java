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
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;

public final class LinearProgressIndicatorSpec extends c {
    public int h;
    public int i;
    boolean j;
    @Px
    public int k;

    public LinearProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, LinearProgressIndicator.z);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        boolean z = false;
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.LinearProgressIndicator, attr.linearProgressIndicatorStyle, LinearProgressIndicator.z, new int[0]);
        this.h = typedArray0.getInt(styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.i = typedArray0.getInt(styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.k = Math.min(typedArray0.getDimensionPixelSize(styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.a);
        typedArray0.recycle();
        this.e();
        if(this.i == 1) {
            z = true;
        }
        this.j = z;
    }

    @Override  // com.google.android.material.progressindicator.c
    void e() {
        super.e();
        if(this.k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if(this.h == 0) {
            if(this.b > 0 && this.g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if(this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}

