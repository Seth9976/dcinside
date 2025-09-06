package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class o extends f {
    float a;

    public o() {
        this.a = -1.0f;
    }

    @Deprecated
    public o(float f) {
        this.a = f;
    }

    @Override  // com.google.android.material.shape.f
    public void b(@NonNull r r0, float f, float f1, float f2) {
        r0.r(0.0f, f2 * f1, 180.0f, 180.0f - f);
        float f3 = f2 * 2.0f * f1;
        r0.a(0.0f, 0.0f, f3, f3, 180.0f, f);
    }
}

