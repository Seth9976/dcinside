package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;

public interface IInitializeEventsMetricSender {
    Long configRequestDuration();

    void didConfigRequestEnd(boolean arg1);

    void didConfigRequestStart();

    void didInitStart();

    void didPrivacyConfigRequestEnd(boolean arg1);

    void didPrivacyConfigRequestStart();

    Long duration();

    Map getRetryTags();

    Long initializationStartTimeStamp();

    void onRetryConfig();

    void onRetryWebview();

    Long privacyConfigDuration();

    void sdkDidInitialize();

    void sdkInitializeFailed(String arg1, ErrorState arg2);

    void sdkTokenDidBecomeAvailableWithConfig(boolean arg1);

    void sendMetric(Metric arg1);

    Long tokenDuration();
}

