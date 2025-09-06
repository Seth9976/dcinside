package com.coupang.ads.token;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

public final class b implements Runnable {
    public final AdTokenRequester a;
    public final Executor b;
    public final Handler c;
    public final Function1 d;

    public b(AdTokenRequester adTokenRequester0, Executor executor0, Handler handler0, Function1 function10) {
        this.a = adTokenRequester0;
        this.b = executor0;
        this.c = handler0;
        this.d = function10;
    }

    @Override
    public final void run() {
        AdTokenRequester.getAdTokenInCallback$lambda-13(this.a, this.b, this.c, this.d);
    }
}

