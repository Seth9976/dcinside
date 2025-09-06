package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({Scope.b})
public final class b implements e {
    private final e a;
    private final float b;

    public b(float f, @NonNull e e0) {
        while(e0 instanceof b) {
            e0 = ((b)e0).a;
            f += ((b)e0).b;
        }
        this.a = e0;
        this.b = f;
    }

    @Override  // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF0) {
        return Math.max(0.0f, this.a.a(rectF0) + this.b);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a.equals(((b)object0).a) && this.b == ((b)object0).b : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

