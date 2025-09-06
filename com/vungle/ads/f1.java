package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.w;
import y4.m;

public final class f1 extends d1 {
    public f1() {
        this(null, 1, null);
    }

    public f1(@m String s) {
        super(b.WEBVIEW_ERROR, "WebViewError: " + s, null);
    }

    public f1(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }
}

