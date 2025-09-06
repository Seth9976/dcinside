package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class j extends h {
    private final float a;

    public j(float f) {
        this.a = f - 0.001f;
    }

    @Override  // com.google.android.material.shape.h
    boolean a() {
        return true;
    }

    @Override  // com.google.android.material.shape.h
    public void b(float f, float f1, float f2, @NonNull r r0) {
        float f3 = (float)(((double)this.a) * 1.414214 / 2.0);
        float f4 = (float)Math.sqrt(Math.pow(this.a, 2.0) - Math.pow(f3, 2.0));
        r0.q(f1 - f3, ((float)(-(((double)this.a) * 1.414214 - ((double)this.a)))) + f4);
        r0.n(f1, ((float)(-(((double)this.a) * 1.414214 - ((double)this.a)))));
        r0.n(f1 + f3, ((float)(-(((double)this.a) * 1.414214 - ((double)this.a)))) + f4);
    }
}

