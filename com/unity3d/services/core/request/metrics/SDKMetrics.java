package com.unity3d.services.core.request.metrics;

import androidx.annotation.NonNull;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SDKMetrics {
    static final class NullInstance implements SDKMetricsSender {
        private final String _metricEndpoint;

        public NullInstance(String s) {
            this._metricEndpoint = s;
        }

        @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public String getMetricEndPoint() {
            return this._metricEndpoint;
        }

        @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(@NonNull String s) {
            DeviceLog.debug(("Metric " + s + " was skipped from being sent"));
        }

        @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(@NonNull String s, String s1, Map map0) {
            this.sendEvent(s);
        }

        public void sendEvent(@NonNull String s, Map map0) {
            this.sendEvent(s);
        }

        @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetric(@NonNull Metric metric0) {
            DeviceLog.debug(("Metric " + metric0 + " was skipped from being sent"));
        }

        @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetricWithInitState(Metric metric0) {
            this.sendMetric(metric0);
        }

        @Override  // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetrics(@NonNull List list0) {
            DeviceLog.debug(("Metrics: " + list0 + " was skipped from being sent"));
        }
    }

    private static final String NULL_INSTANCE_METRICS_URL = "nullInstanceMetricsUrl";
    private static MetricSenderWithBatch _batchedSender;
    private static final AtomicBoolean _configurationIsSet;
    private static SDKMetricsSender _instance;

    static {
        SDKMetrics._configurationIsSet = new AtomicBoolean(false);
    }

    public static SDKMetricsSender getInstance() {
        synchronized(SDKMetrics.class) {
            if(SDKMetrics._instance == null) {
                SDKMetrics._instance = new NullInstance(null);
            }
            if(SDKMetrics._batchedSender == null) {
                SDKMetrics._batchedSender = new MetricSenderWithBatch(SDKMetrics._instance, new InitializationStatusReader());
            }
            return SDKMetrics._batchedSender;
        }
    }

    // 去混淆评级： 中等(50)
    private static boolean isAllowedToSetConfiguration(Configuration configuration0) {
        return false;
    }

    public static void setConfiguration(Configuration configuration0) {
        if(configuration0 == null) {
            DeviceLog.debug("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        if(!SDKMetrics.isAllowedToSetConfiguration(configuration0)) {
            return;
        }
        SDKMetricsSender sDKMetricsSender0 = SDKMetrics._instance;
        if(sDKMetricsSender0 instanceof MetricSender) {
            ((MetricSender)sDKMetricsSender0).shutdown();
        }
        if(configuration0.areMetricsEnabledForCurrentSession().booleanValue()) {
            SDKMetrics._instance = new MetricSender(configuration0, new InitializationStatusReader());
        }
        else {
            DeviceLog.debug("Metrics will not be sent from the device for this session");
            SDKMetrics._instance = new NullInstance("nullInstanceMetricsUrl");
        }
        MetricSenderWithBatch metricSenderWithBatch0 = SDKMetrics._batchedSender;
        if(metricSenderWithBatch0 == null) {
            SDKMetrics._batchedSender = new MetricSenderWithBatch(SDKMetrics._instance, new InitializationStatusReader());
        }
        else {
            metricSenderWithBatch0.updateOriginal(SDKMetrics._instance);
        }
        SDKMetrics._batchedSender.sendQueueIfNeeded();
    }
}

