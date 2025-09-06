package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class g extends f {
    float a;

    public g() {
        this.a = -1.0f;
    }

    @Deprecated
    public g(float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.f
    public void b(@NonNull r r0, float f, float f1, float f2) {
        r0.r(0.0f, f2 * f1, 180.0f, 180.0f - f);
        r0.n(((float)(Math.sin(Math.toRadians(f)) * ((double)f2) * ((double)f1))), ((float)(Math.sin(Math.toRadians(90.0f - f)) * ((double)f2) * ((double)f1))));
    }
}

