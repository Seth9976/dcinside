package com.google.android.material.progressindicator;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import java.util.ArrayList;
import java.util.List;

abstract class i {
    protected j a;
    protected final List b;

    protected i(int v) {
        this.b = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            a h$a0 = new a();
            this.b.add(h$a0);
        }
    }

    abstract void a();

    protected float b(int v, int v1, int v2) [...] // Inlined contents

    public abstract void c();

    public abstract void d(@NonNull AnimationCallback arg1);

    protected void e(@NonNull j j0) {
        this.a = j0;
    }

    abstract void f();

    @VisibleForTesting
    abstract void g();

    @VisibleForTesting
    abstract void h(float arg1);

    abstract void i();

    public abstract void j();
}

