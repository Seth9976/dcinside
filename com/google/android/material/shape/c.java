package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({Scope.b})
public final class c implements e {
    private final float a;

    public c(float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF0) {
        float f = c.c(rectF0);
        return Math.min(this.a, f);
    }

    @NonNull
    public static c b(@NonNull a a0) {
        return new c(a0.b());
    }

    private static float c(@NonNull RectF rectF0) {
        return Math.min(rectF0.width() / 2.0f, rectF0.height() / 2.0f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? this.a == ((c)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

