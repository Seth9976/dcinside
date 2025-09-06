package com.unity3d.services.analytics.interfaces;

public class Analytics {
    public static void initialize(IAnalytics iAnalytics0) {
        com.unity3d.services.analytics.core.api.Analytics.setAnalyticsInterface(iAnalytics0);
    }
}

