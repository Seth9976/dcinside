package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LoadOfferwallAd {
    @l
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(@l OfferwallManager offerwallManager0) {
        L.p(offerwallManager0, "offerwallManager");
        super();
        this.offerwallManager = offerwallManager0;
    }

    @m
    public final Object invoke(@l String s, @l d d0) {
        Object object0 = this.offerwallManager.loadAd(s, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

