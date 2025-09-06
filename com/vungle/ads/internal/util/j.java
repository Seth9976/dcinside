package com.vungle.ads.internal.util;

import A3.o;

public final class j implements Runnable {
    public final String a;
    public final o b;

    public j(String s, o o0) {
        this.a = s;
        this.b = o0;
    }

    @Override
    public final void run() {
        l.getImageSize$lambda-1(this.a, this.b);
    }
}

