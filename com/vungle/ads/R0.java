package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class r0 extends d1 {
    public r0(@l String s) {
        L.p(s, "msg");
        super(b.JSON_ENCODE_ERROR, s, null);
    }
}

