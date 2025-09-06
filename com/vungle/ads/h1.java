package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.w;
import y4.m;

public final class h1 extends d1 {
    public h1() {
        this(null, 1, null);
    }

    public h1(@m String s) {
        super(b.WEBVIEW_ERROR, "WebRenderingProcessGone: " + s, null);
    }

    public h1(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

