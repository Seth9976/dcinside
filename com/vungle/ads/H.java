package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk.SDKError.b;
import y4.m;

public final class h extends d1 {
    public h(@m String s) {
        super(b.INVALID_JSON_BID_PAYLOAD, "Unable to decode payload into BidPayload object. Error: " + s, null);
    }
}

