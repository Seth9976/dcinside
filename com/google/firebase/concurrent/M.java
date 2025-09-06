package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final class m implements Callable {
    public final o a;
    public final Callable b;
    public final b c;

    public m(o o0, Callable callable0, b p$b0) {
        this.a = o0;
        this.b = callable0;
        this.c = p$b0;
    }

    @Override
    public final Object call() {
        return this.a.q(this.b, this.c);
    }
}

