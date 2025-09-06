package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.AnalyticsError;
import com.unity3d.services.analytics.interfaces.IAnalytics;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Analytics {
    public static IAnalytics analyticsInterface;

    static {
    }

    @WebViewExposed
    public static void addExtras(String s, WebViewCallback webViewCallback0) {
        if(Analytics.analyticsInterface != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Analytics.analyticsInterface.onAddExtras(s);
                }
            });
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(AnalyticsError.API_NOT_FOUND, new Object[]{s});
    }

    public static void setAnalyticsInterface(IAnalytics iAnalytics0) {
        Analytics.analyticsInterface = iAnalytics0;
    }
}

