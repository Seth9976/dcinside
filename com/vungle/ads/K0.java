package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class k0 extends d1 {
    public k0(@l String s) {
        L.p(s, "msg");
        super(b.INVALID_ASSET_URL, s, null);
    }
}

