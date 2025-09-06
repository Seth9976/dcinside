package com.bumptech.glide.request.target;

import androidx.annotation.NonNull;

@Deprecated
public abstract class n extends b {
    private final int b;
    private final int c;

    public n() {
        this(0x80000000, 0x80000000);
    }

    public n(int v, int v1) {
        this.b = v;
        this.c = v1;
    }

    @Override  // com.bumptech.glide.request.target.p
    public void A(@NonNull o o0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public final void G(@NonNull o o0) {
        if(!com.bumptech.glide.util.o.x(this.b, this.c)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.b + " and height: " + this.c + ", either provide dimensions in the constructor or call override()");
        }
        o0.d(this.b, this.c);
    }
}

