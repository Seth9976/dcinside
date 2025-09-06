package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.b1;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class m extends a {
    public m(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // com.vungle.ads.internal.a
    @y4.m
    public b1 getAdSizeForAdRequest() {
        return null;
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdSize(@y4.m b1 b10) {
        return true;
    }
}

