package com.unity3d.services.ads.api;

import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Topics {
    private static final TopicsService topicsService;

    static {
        Topics.topicsService = (TopicsService)Utilities.getService(TopicsService.class);
    }

    @WebViewExposed
    public static void checkAvailability(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Topics.topicsService.checkAvailability()});
    }

    @WebViewExposed
    public static void getTopics(String s, Boolean boolean0, WebViewCallback webViewCallback0) {
        Topics.topicsService.getTopics(s, boolean0.booleanValue());
        webViewCallback0.invoke(new Object[0]);
    }
}

