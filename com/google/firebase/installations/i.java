package com.google.firebase.installations;

public final class i implements Runnable {
    public final j a;
    public final boolean b;

    public i(j j0, boolean z) {
        this.a = j0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.a.D(this.b);
    }
}

