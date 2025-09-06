package com.coupang.ads.token;

import kotlin.jvm.functions.Function1;

public final class c implements Runnable {
    public final Function1 a;
    public final Result b;

    public c(Function1 function10, Result result0) {
        this.a = function10;
        this.b = result0;
    }

    @Override
    public final void run() {
        AdTokenRequester.getAdTokenInCallback$lambda-13$lambda-12(this.a, this.b);
    }
}

