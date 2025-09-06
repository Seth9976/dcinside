package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.I;
import y4.l;
import y4.m;

public interface WebViewBridge {
    @l
    I getOnInvocation();

    void handleCallback(@l String arg1, @l String arg2, @l String arg3);

    void handleInvocation(@l String arg1);

    @m
    Object request(@l String arg1, @l String arg2, @l Object[] arg3, @l d arg4);

    @m
    Object sendEvent(@l WebViewEvent arg1, @l d arg2);
}

