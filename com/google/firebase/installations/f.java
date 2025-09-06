package com.google.firebase.installations;

public final class f implements Runnable {
    public final j a;
    public final boolean b;

    public f(j j0, boolean z) {
        this.a = j0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.a.B(this.b);
    }
}

