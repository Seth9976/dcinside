package com.unity3d.ads.adplayer.model;

import y4.l;

public final class OnVolumeChangeEvent implements WebViewEvent {
    @l
    private final String category;
    @l
    private final String name;
    @l
    private final Object[] parameters;

    public OnVolumeChangeEvent(double f) {
        this.category = "ADVIEWER";
        this.name = "ON_VOLUME_CHANGE";
        this.parameters = new Object[]{f};
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

