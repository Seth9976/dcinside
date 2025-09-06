package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class a implements e {
    private final float a;

    public a(float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.e
    public float a(@NonNull RectF rectF0) {
        return this.a;
    }

    public float b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? this.a == ((a)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

