package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnBroadcastEvent implements WebViewEvent {
    @l
    private final String category;
    @l
    private final String name;
    @l
    private final Object[] parameters;

    public OnBroadcastEvent(@l String s, @m String s1) {
        L.p(s, "name");
        super();
        this.name = s;
        this.category = "ADVIEWER";
        this.parameters = new Object[]{s1};
    }

    @Override  // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public String getCategory() {
        return this.category;
    }

    @Override  // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public String getName() {
        return this.name;
    }

    @Override  // com.unity3d.ads.adplayer.model.WebViewEvent
    @l
    public Object[] getParameters() {
        return this.parameters;
    }
}

