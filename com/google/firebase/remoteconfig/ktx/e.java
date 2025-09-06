package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.remoteconfig.c;
import kotlinx.coroutines.channels.D;

public final class e implements Runnable {
    public final D a;
    public final c b;

    public e(D d0, c c0) {
        this.a = d0;
        this.b = c0;
    }

    @Override
    public final void run() {
        b.d(this.a, this.b);
    }
}

