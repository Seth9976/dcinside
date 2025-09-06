package com.unity3d.ads.core.data.manager;

import kotlin.coroutines.d;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public interface OfferwallManager {
    @m
    Object getVersion(@l d arg1);

    @m
    Object isConnected(@l d arg1);

    @m
    Object isContentReady(@l d arg1);

    @m
    Object loadAd(@l String arg1, @l d arg2);

    @l
    i showAd(@l String arg1);
}

