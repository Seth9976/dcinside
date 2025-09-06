package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import y4.l;

public interface StoreExceptionHandler {
    void handleStoreException(@l StoreEvent arg1, int arg2, @l Exception arg3);
}

