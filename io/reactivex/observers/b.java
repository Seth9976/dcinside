package io.reactivex.observers;

import d3.f;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.i;

public abstract class b implements I {
    private c a;

    protected final void a() {
        c c0 = this.a;
        this.a = d.a;
        c0.dispose();
    }

    @Override  // io.reactivex.I
    public final void b(@f c c0) {
        if(i.e(this.a, c0, this.getClass())) {
            this.a = c0;
        }
    }

    protected void c() {
    }
}

