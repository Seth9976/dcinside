package com.google.firebase.concurrent;

public final class a implements Runnable {
    public final b a;
    public final Runnable b;

    public a(b b0, Runnable runnable0) {
        this.a = b0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        this.a.b(this.b);
    }
}

