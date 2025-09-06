package com.unity3d.services.core.request.metrics;

import java.util.List;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface SDKMetricsSender {
    public static final class DefaultImpls {
        public static void sendEvent(@l SDKMetricsSender sDKMetricsSender0, @l String s) {
            L.p(s, "event");
            DefaultImpls.sendEvent$default(sDKMetricsSender0, s, null, null, 4, null);
        }

        public static void sendEvent$default(SDKMetricsSender sDKMetricsSender0, String s, String s1, Map map0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            if((v & 4) != 0) {
                map0 = Y.z();
            }
            sDKMetricsSender0.sendEvent(s, s1, map0);
        }
    }

    @m
    String getMetricEndPoint();

    void sendEvent(@l String arg1);

    void sendEvent(@l String arg1, @m String arg2, @l Map arg3);

    void sendMetric(@l Metric arg1);

    void sendMetricWithInitState(@l Metric arg1);

    void sendMetrics(@l List arg1);
}

