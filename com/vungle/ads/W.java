package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class w extends d1 {
    public w(@l String s) {
        L.p(s, "msg");
        super(b.ASSET_WRITE_ERROR, s, null);
    }
}

