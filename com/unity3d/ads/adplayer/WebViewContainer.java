package com.unity3d.ads.adplayer;

import kotlin.coroutines.d;
import kotlinx.coroutines.flow.U;
import y4.l;
import y4.m;

public interface WebViewContainer {
    @m
    Object addJavascriptInterface(@l WebViewBridge arg1, @l String arg2, @l d arg3);

    @m
    Object destroy(@l d arg1);

    @m
    Object evaluateJavascript(@l String arg1, @l d arg2);

    @l
    U getLastInputEvent();

    @m
    Object loadUrl(@l String arg1, @l d arg2);
}

