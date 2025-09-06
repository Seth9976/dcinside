package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class t extends d1 {
    public t(@l String s, @m Integer integer0, @m String s1) {
        L.p(s, "url");
        super(b.ASSET_FAILED_STATUS_CODE, "Asset fail to download: " + s + ", Error code:" + integer0 + ", Error message: " + s1, null);
    }

    public t(String s, Integer integer0, String s1, int v, w w0) {
        if((v & 2) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        this(s, integer0, s1);
    }
}

