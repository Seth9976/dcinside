package com.google.firebase.components;

import h2.b;

public final class r implements Runnable {
    public final I a;
    public final b b;

    public r(I i0, b b0) {
        this.a = i0;
        this.b = b0;
    }

    @Override
    public final void run() {
        this.a.j(this.b);
    }
}

