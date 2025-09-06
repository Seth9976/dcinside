package com.coupang.ads.coupangapp;

import kotlin.jvm.functions.Function1;

public final class a implements Runnable {
    public final Function1 a;
    public final Object b;

    public a(Function1 function10, Object object0) {
        this.a = function10;
        this.b = object0;
    }

    @Override
    public final void run() {
        d.i(this.a, this.b);
    }
}

