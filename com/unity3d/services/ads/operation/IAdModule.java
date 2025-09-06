package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore;

public interface IAdModule extends IWebViewBridgeSharedObjectStore {
    void executeAdOperation(IWebViewBridgeInvoker arg1, Object arg2);

    SDKMetricsSender getMetricSender();
}

