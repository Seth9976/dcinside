package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKMetric.b;
import com.vungle.ads.internal.util.o;

public final class n implements Runnable {
    public final b a;
    public final long b;
    public final o c;
    public final String d;

    public n(b sdk$SDKMetric$b0, long v, o o0, String s) {
        this.a = sdk$SDKMetric$b0;
        this.b = v;
        this.c = o0;
        this.d = s;
    }

    @Override
    public final void run() {
        r.logMetric$lambda-3(this.a, this.b, this.c, this.d);
    }
}

