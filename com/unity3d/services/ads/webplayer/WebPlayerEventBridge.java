package com.unity3d.services.ads.webplayer;

import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

public class WebPlayerEventBridge {
    public static void error(String s, String s1, String s2) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.ERROR, new Object[]{s1, s2, s});
        }
    }

    public static void sendFrameUpdate(String s, int v, int v1, int v2, int v3, float f) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.FRAME_UPDATE, new Object[]{s, v, v1, v2, v3, f});
        }
    }

    public static void sendGetFrameResponse(String s, String s1, int v, int v1, int v2, int v3, float f) {
        WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
        if(webViewApp0 != null) {
            webViewApp0.sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.GET_FRAME_RESPONSE, new Object[]{s, s1, v, v1, v2, v3, f});
        }
    }
}

