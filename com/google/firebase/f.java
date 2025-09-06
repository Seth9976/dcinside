package com.google.firebase;

import android.content.Context;
import h2.b;

public final class f implements b {
    public final h a;
    public final Context b;

    public f(h h0, Context context0) {
        this.a = h0;
        this.b = context0;
    }

    @Override  // h2.b
    public final Object get() {
        return this.a.C(this.b);
    }
}

