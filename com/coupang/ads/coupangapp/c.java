package com.coupang.ads.coupangapp;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

public final class c implements Runnable {
    public final d a;
    public final Executor b;
    public final Handler c;
    public final Function1 d;

    public c(d d0, Executor executor0, Handler handler0, Function1 function10) {
        this.a = d0;
        this.b = executor0;
        this.c = handler0;
        this.d = function10;
    }

    @Override
    public final void run() {
        d.h(this.a, this.b, this.c, this.d);
    }
}

