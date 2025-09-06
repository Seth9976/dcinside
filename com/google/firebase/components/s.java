package com.google.firebase.components;

import h2.b;

public final class s implements Runnable {
    public final D a;
    public final b b;

    public s(D d0, b b0) {
        this.a = d0;
        this.b = b0;
    }

    @Override
    public final void run() {
        this.a.a(this.b);
    }
}

