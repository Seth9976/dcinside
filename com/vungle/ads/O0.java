package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class o0 extends d1 {
    public o0(@l String s) {
        L.p(s, "msg");
        super(b.INVALID_EVENT_ID_ERROR, s, null);
    }
}

