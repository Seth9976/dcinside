package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.e;
import com.google.firebase.remoteconfig.interop.rollouts.f;

public final class c implements Runnable {
    public final f a;
    public final e b;

    public c(f f0, e e0) {
        this.a = f0;
        this.b = e0;
    }

    @Override
    public final void run() {
        com.google.firebase.remoteconfig.internal.rollouts.e.e(this.a, this.b);
    }
}

