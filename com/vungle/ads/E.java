package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends d1 {
    public e(@l String s) {
        L.p(s, "message");
        super(b.AD_EXPIRED, s, null);
    }
}

