package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.j;
import com.unity3d.scar.adapter.common.n;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class WebViewErrorHandler implements d {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender0) {
        this._eventSender = iEventSender0;
    }

    @Override  // com.unity3d.scar.adapter.common.d
    public void handleError(j j0) {
        this.handleError(((n)j0));
    }

    public void handleError(n n0) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(n0.getDomain()), n0.getErrorCategory(), n0.getErrorArguments());
    }
}

