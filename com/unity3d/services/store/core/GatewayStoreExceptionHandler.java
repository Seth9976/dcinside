package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.jvm.internal.L;
import y4.l;

public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override  // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(@l StoreEvent storeEvent0, int v, @l Exception exception0) {
        L.p(storeEvent0, "storeEvent");
        L.p(exception0, "exception");
        throw exception0;
    }
}

