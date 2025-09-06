package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.e;
import com.google.firebase.remoteconfig.interop.rollouts.f;

public final class d implements Runnable {
    public final f a;
    public final e b;

    public d(f f0, e e0) {
        this.a = f0;
        this.b = e0;
    }

    @Override
    public final void run() {
        this.a.a(this.b);
    }
}

