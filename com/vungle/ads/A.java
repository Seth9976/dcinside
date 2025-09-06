package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.w;
import y4.m;

public final class a extends d1 {
    public a() {
        this(null, 1, null);
    }

    public a(@m String s) {
        super(b.API_FAILED_STATUS_CODE, "Failed to get a successful response: " + s, null);
    }

    public a(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

