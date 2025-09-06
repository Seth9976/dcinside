package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlinx.coroutines.O;
import y4.l;

public interface GetWebViewBridgeUseCase {
    @l
    WebViewBridge invoke(@l AndroidWebViewContainer arg1, @l O arg2);
}

