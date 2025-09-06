package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.WebViewBridgeSharedObjectStore;
import com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationSingleThreadedExecutor;
import java.util.concurrent.ExecutorService;

public abstract class AdModule extends WebViewBridgeSharedObjectStore implements IAdModule {
    protected ExecutorService _executorService;
    protected SDKMetricsSender _sdkMetrics;

    protected AdModule(SDKMetricsSender sDKMetricsSender0) {
        this._sdkMetrics = sDKMetricsSender0;
        this._executorService = WebViewBridgeInvocationSingleThreadedExecutor.getInstance().getExecutorService();
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public SDKMetricsSender getMetricSender() {
        return this._sdkMetrics;
    }
}

