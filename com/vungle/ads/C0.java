package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class c0 extends d1 {
    public c0(@l String s) {
        L.p(s, "msg");
        super(b.GZIP_ENCODE_ERROR, s, null);
    }
}

