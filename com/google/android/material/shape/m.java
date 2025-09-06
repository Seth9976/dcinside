package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class m extends h {
    private final h a;
    private final float b;

    public m(@NonNull h h0, float f) {
        this.a = h0;
        this.b = f;
    }

    @Override  // com.google.android.material.shape.h
    boolean a() {
        return this.a.a();
    }

    @Override  // com.google.android.material.shape.h
    public void b(float f, float f1, float f2, @NonNull r r0) {
        this.a.b(f, f1 - this.b, f2, r0);
    }
}

