package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.w;
import y4.m;

public final class l0 extends d1 {
    public l0() {
        this(null, 1, null);
    }

    public l0(@m String s) {
        super(b.BANNER_VIEW_INVALID_SIZE, "Invalidate size for banner ad: " + s, null);
    }

    public l0(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

