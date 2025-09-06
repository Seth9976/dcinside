package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import y4.l;

public interface GetAdPlayer {
    @l
    AdPlayer invoke(@l WebViewBridge arg1, @l AndroidWebViewContainer arg2, @l ByteString arg3);
}

