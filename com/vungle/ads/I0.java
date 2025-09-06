package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class i0 extends d1 {
    public i0(@l b sdk$SDKError$b0, @l String s) {
        L.p(sdk$SDKError$b0, "loggableReason");
        L.p(s, "errorMessage");
        super(sdk$SDKError$b0, s, null);
    }

    public i0(b sdk$SDKError$b0, String s, int v, w w0) {
        if((v & 2) != 0) {
            s = "Ad state is invalid";
        }
        this(sdk$SDKError$b0, s);
    }
}

