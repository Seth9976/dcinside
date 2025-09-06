package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MetricSenderWithBatch extends MetricSenderBase {
    @l
    private SDKMetricsSender _original;
    @l
    private final LinkedBlockingQueue _queue;

    public MetricSenderWithBatch(@l SDKMetricsSender sDKMetricsSender0, @l InitializationStatusReader initializationStatusReader0) {
        L.p(sDKMetricsSender0, "_original");
        L.p(initializationStatusReader0, "initializationStatusReader");
        super(initializationStatusReader0);
        this._original = sDKMetricsSender0;
        this._queue = new LinkedBlockingQueue();
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @m
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@l String s, @m String s1, @l Map map0) {
        L.p(s, "event");
        L.p(map0, "tags");
        if(s.length() == 0) {
            DeviceLog.debug(("Metric event not sent due to being empty: " + s));
            return;
        }
        this.sendMetrics(u.k(new Metric(s, s1, map0)));
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@l Metric metric0) {
        L.p(metric0, "metric");
        this.sendMetrics(u.k(metric0));
    }

    @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(@l List list0) {
        synchronized(this) {
            L.p(list0, "metrics");
            this._queue.addAll(list0);
            if(!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
                ArrayList arrayList0 = new ArrayList();
                this._queue.drainTo(arrayList0);
                this._original.sendMetrics(arrayList0);
            }
        }
    }

    public final void sendQueueIfNeeded() {
        this.sendMetrics(u.H());
    }

    public final void updateOriginal(@l SDKMetricsSender sDKMetricsSender0) {
        L.p(sDKMetricsSender0, "metrics");
        this._original = sDKMetricsSender0;
    }
}

