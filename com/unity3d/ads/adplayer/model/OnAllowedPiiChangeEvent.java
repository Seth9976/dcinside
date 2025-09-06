package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.L;
import y4.l;

public final class OnAllowedPiiChangeEvent implements WebViewEvent {
    @l
    private final String category;
    @l
    private final String name;
    @l
    private final Object[] parameters;

    public OnAllowedPiiChangeEvent(@l String s) {
        L.p(s, "value");
        super();
        this.category = "ADVIEWER";
        this.name = "ON_ALLOWED_PII_CHANGE";
        this.parameters = new Object[]{s};
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

