package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class y extends h {
    private final float a;
    private final boolean b;

    public y(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override  // com.google.android.material.shape.h
    public void b(float f, float f1, float f2, @NonNull r r0) {
        if(this.b) {
            r0.n(f1 - this.a * f2, 0.0f);
            r0.o(f1, this.a * f2, this.a * f2 + f1, 0.0f);
            r0.n(f, 0.0f);
            return;
        }
        r0.o(f1 - this.a * f2, 0.0f, f1, -this.a * f2);
        r0.o(f1 + this.a * f2, 0.0f, f, 0.0f);
    }
}

