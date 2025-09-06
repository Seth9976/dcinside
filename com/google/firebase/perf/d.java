package com.google.firebase.perf;

import com.google.firebase.components.K;
import com.google.firebase.components.i;
import com.google.firebase.components.l;

public final class d implements l {
    public final K a;

    public d(K k0) {
        this.a = k0;
    }

    @Override  // com.google.firebase.components.l
    public final Object a(i i0) {
        return FirebasePerfRegistrar.lambda$getComponents$0(this.a, i0);
    }
}

