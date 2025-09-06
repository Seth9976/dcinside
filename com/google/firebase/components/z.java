package com.google.firebase.components;

import e2.a;
import java.util.Map.Entry;

public final class z implements Runnable {
    public final Map.Entry a;
    public final a b;

    public z(Map.Entry map$Entry0, a a0) {
        this.a = map$Entry0;
        this.b = a0;
    }

    @Override
    public final void run() {
        A.h(this.a, this.b);
    }
}

