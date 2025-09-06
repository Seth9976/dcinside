package com.vungle.ads.internal.util;

import kotlin.jvm.functions.Function1;

public final class k implements Runnable {
    public final String a;
    public final Function1 b;

    public k(String s, Function1 function10) {
        this.a = s;
        this.b = function10;
    }

    @Override
    public final void run() {
        l.displayImage$lambda-0(this.a, this.b);
    }
}

