package com.unity3d.ads.adplayer;

import y4.l;

public final class WebViewAdPlayerKt {
    @l
    private static final String[] LOAD_EVENTS;
    @l
    private static final String[] REQUEST_EVENTS;
    @l
    private static final String[] SHOW_EVENTS;

    static {
        WebViewAdPlayerKt.SHOW_EVENTS = new String[]{"com.unity3d.services.ads.api.AdViewer.started", "com.unity3d.services.ads.api.AdViewer.clicked", "com.unity3d.services.ads.api.AdViewer.completed", "com.unity3d.services.ads.api.AdViewer.failed", "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout", "com.unity3d.services.ads.api.AdViewer.leftApplication"};
        WebViewAdPlayerKt.LOAD_EVENTS = new String[]{"com.unity3d.services.ads.api.AdViewer.loadComplete", "com.unity3d.services.ads.api.AdViewer.loadError"};
        WebViewAdPlayerKt.REQUEST_EVENTS = new String[]{"com.unity3d.services.core.api.Request.get", "com.unity3d.services.core.api.Request.post", "com.unity3d.services.core.api.Request.head"};
    }
}

