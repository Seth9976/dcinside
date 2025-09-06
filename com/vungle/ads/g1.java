package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.w;
import y4.m;

public final class g1 extends d1 {
    public g1() {
        this(null, 1, null);
    }

    public g1(@m String s) {
        super(b.WEBVIEW_ERROR, "WebRenderProcessUnresponsive: " + s, null);
    }

    public g1(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

