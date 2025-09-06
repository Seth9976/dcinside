package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.w;
import y4.m;

public final class i extends d1 {
    public i() {
        this(null, 1, null);
    }

    public i(@m String s) {
        super(b.AD_NOT_LOADED, "Failed to retrieve the ad object: " + s, null);
    }

    public i(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

