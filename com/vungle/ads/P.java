package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import com.vungle.ads.internal.util.o;

public final class p implements Runnable {
    public final b a;
    public final String b;
    public final o c;

    public p(b sdk$SDKError$b0, String s, o o0) {
        this.a = sdk$SDKError$b0;
        this.b = s;
        this.c = o0;
    }

    @Override
    public final void run() {
        r.logError$lambda-2(this.a, this.b, this.c);
    }
}

