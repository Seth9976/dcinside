package com.vungle.ads.internal.persistence;

import java.io.Serializable;

public final class a implements Runnable {
    public final b a;
    public final Serializable b;

    public a(b b0, Serializable serializable0) {
        this.a = b0;
        this.b = serializable0;
    }

    @Override
    public final void run() {
        b.apply$lambda-0(this.a, this.b);
    }
}

