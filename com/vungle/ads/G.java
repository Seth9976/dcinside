package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class g extends d1 {
    public g(@l String s) {
        L.p(s, "message");
        super(b.INVALID_ADUNIT_BID_PAYLOAD, s, null);
    }
}

