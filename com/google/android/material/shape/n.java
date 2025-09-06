package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

public final class n implements e {
    private final float a;

    public n(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF0) {
        float f = n.c(rectF0);
        return this.a * f;
    }

    // 去混淆评级： 低(20)
    @NonNull
    @RestrictTo({Scope.b})
    public static n b(@NonNull RectF rectF0, @NonNull e e0) {
        return e0 instanceof n ? ((n)e0) : new n(e0.a(rectF0) / n.c(rectF0));
    }

    private static float c(@NonNull RectF rectF0) {
        return Math.min(rectF0.width(), rectF0.height());
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n ? this.a == ((n)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

