package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.a;
import com.vungle.ads.internal.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class g0 extends U {
    public g0(@l Context context0, @l String s, @l d d0) {
        L.p(context0, "context");
        L.p(s, "placementId");
        L.p(d0, "adConfig");
        super(context0, s, d0);
    }

    public g0(Context context0, String s, d d0, int v, w w0) {
        if((v & 4) != 0) {
            d0 = new d();
        }
        this(context0, s, d0);
    }

    @Override  // com.vungle.ads.K
    public a constructAdInternal$vungle_ads_release(Context context0) {
        return this.constructAdInternal$vungle_ads_release(context0);
    }

    @l
    public p constructAdInternal$vungle_ads_release(@l Context context0) {
        L.p(context0, "context");
        return new p(context0);
    }
}

