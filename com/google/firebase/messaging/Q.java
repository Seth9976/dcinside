package com.google.firebase.messaging;

import android.content.Intent;

public final class q implements Runnable {
    public final r a;
    public final Intent b;

    public q(r r0, Intent intent0) {
        this.a = r0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

