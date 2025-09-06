package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties.InitializationState;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.r0;
import y4.l;

public abstract class MetricSenderBase implements SDKMetricsSender {
    @l
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(@l InitializationStatusReader initializationStatusReader0) {
        L.p(initializationStatusReader0, "_initStatusReader");
        super();
        this._initStatusReader = initializationStatusReader0;
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@l String s) {
        DefaultImpls.sendEvent(this, s);
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetricWithInitState(@l Metric metric0) {
        L.p(metric0, "metric");
        InitializationState sdkProperties$InitializationState0 = SdkProperties.getCurrentInitializationState();
        this.sendMetric(Metric.copy$default(metric0, null, null, Y.n0(metric0.getTags(), Y.k(r0.a("state", this._initStatusReader.getInitializationStateString(sdkProperties$InitializationState0)))), 3, null));
    }
}

