package com.unity3d.ads.adplayer;

import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;

public final class AdPlayerScope implements O {
    private final O $$delegate_0;
    @l
    private final K defaultDispatcher;

    public AdPlayerScope(@l K k0) {
        L.p(k0, "defaultDispatcher");
        super();
        this.defaultDispatcher = k0;
        this.$$delegate_0 = P.a(k0);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}

