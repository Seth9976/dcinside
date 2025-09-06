package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class s extends d1 {
    public s(@l b sdk$SDKError$b0, @l String s) {
        L.p(sdk$SDKError$b0, "reason");
        L.p(s, "message");
        super(sdk$SDKError$b0, s, null);
    }
}

