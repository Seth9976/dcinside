package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.BiConsumer;

public final class o implements Runnable {
    public final BiConsumer a;
    public final String b;
    public final h c;

    public o(BiConsumer biConsumer0, String s, h h0) {
        this.a = biConsumer0;
        this.b = s;
        this.c = h0;
    }

    @Override
    public final void run() {
        p.r(this.a, this.b, this.c);
    }
}

