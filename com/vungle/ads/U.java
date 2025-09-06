package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class u extends d1 {
    public u(@l String s) {
        L.p(s, "msg");
        super(b.ASSET_REQUEST_ERROR, s, null);
    }
}

