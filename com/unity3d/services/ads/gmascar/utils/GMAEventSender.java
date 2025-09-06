package com.unity3d.services.ads.gmascar.utils;

import androidx.annotation.NonNull;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class GMAEventSender implements IEventSender {
    private final IEventSender _eventSender;

    public GMAEventSender() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public GMAEventSender(IEventSender iEventSender0) {
        this._eventSender = iEventSender0;
    }

    @Override  // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return this._eventSender.canSend();
    }

    public void send(c c0, Object[] arr_object) {
        this._eventSender.sendEvent(WebViewEventCategory.GMA, c0, arr_object);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NonNull Enum enum0, @NonNull Enum enum1, @NonNull Object[] arr_object) {
        return this._eventSender.sendEvent(enum0, enum1, arr_object);
    }

    public void sendVersion(String s) {
        this._eventSender.sendEvent(WebViewEventCategory.INIT_GMA, c.f, new Object[]{s});
    }
}

