package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.WebViewStoreEventListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import kotlin.jvm.internal.L;
import y4.l;
import z3.j;

public final class StoreEventListenerFactory {
    @l
    private final StoreWebViewEventSender storeWebViewEventSender;

    public StoreEventListenerFactory(@l StoreWebViewEventSender storeWebViewEventSender0) {
        L.p(storeWebViewEventSender0, "storeWebViewEventSender");
        super();
        this.storeWebViewEventSender = storeWebViewEventSender0;
    }

    @l
    @j
    public final StoreEventListener invoke() {
        return StoreEventListenerFactory.invoke$default(this, 0, false, 3, null);
    }

    @l
    @j
    public final StoreEventListener invoke(int v) {
        return StoreEventListenerFactory.invoke$default(this, v, false, 2, null);
    }

    @l
    @j
    public final StoreEventListener invoke(int v, boolean z) {
        return new WebViewStoreEventListener(v, this.storeWebViewEventSender, z);
    }

    public static StoreEventListener invoke$default(StoreEventListenerFactory storeEventListenerFactory0, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -1;
        }
        if((v1 & 2) != 0) {
            z = false;
        }
        return storeEventListenerFactory0.invoke(v, z);
    }
}

