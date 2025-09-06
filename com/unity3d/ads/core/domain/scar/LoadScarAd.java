package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LoadScarAd {
    @l
    private final ScarManager scarManager;

    public LoadScarAd(@l ScarManager scarManager0) {
        L.p(scarManager0, "scarManager");
        super();
        this.scarManager = scarManager0;
    }

    @m
    public final Object invoke(@l String s, @l String s1, @l String s2, @l String s3, @l String s4, int v, @l d d0) {
        if(L.g(s, "banner")) {
            return S0.a;
        }
        Object object0 = this.scarManager.loadAd(s, s1, s3, s2, s4, v, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

