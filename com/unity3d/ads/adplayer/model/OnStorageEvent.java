package com.unity3d.ads.adplayer.model;

import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager.StorageType;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnStorageEvent implements WebViewEvent {
    @l
    private final String category;
    @l
    private final String name;
    @l
    private final Object[] parameters;

    public OnStorageEvent(@l StorageEvent storageEvent0, @l StorageType storageManager$StorageType0, @m Object object0) {
        L.p(storageEvent0, "eventType");
        L.p(storageManager$StorageType0, "storageType");
        super();
        this.category = "STORAGE";
        this.name = storageEvent0.name();
        this.parameters = new Object[]{storageManager$StorageType0.name(), object0};
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

