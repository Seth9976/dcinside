package com.unity3d.services.core.device;

import y4.l;

public interface VolumeChange {
    void clearAllListeners();

    void registerListener(@l VolumeChangeListener arg1);

    void startObserving();

    void stopObserving();

    void unregisterListener(@l VolumeChangeListener arg1);
}

