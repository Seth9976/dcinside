package com.facebook.imagepipeline.backends.okhttp3;

import okhttp3.Call;

public final class c implements Runnable {
    public final Call a;

    public c(Call call0) {
        this.a = call0;
    }

    @Override
    public final void run() {
        com.facebook.imagepipeline.backends.okhttp3.b.c.f(this.a);
    }
}

