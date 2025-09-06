package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class v extends d1 {
    public v(@l String s) {
        L.p(s, "msg");
        super(b.ASSET_RESPONSE_DATA_ERROR, s, null);
    }
}

