package com.unity3d.services.core.api;

import com.unity3d.services.core.request.IResolveHostListener;
import com.unity3d.services.core.request.ResolveHostError;
import com.unity3d.services.core.request.ResolveHostEvent;
import com.unity3d.services.core.request.WebRequestThread;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Resolve {
    @WebViewExposed
    public static void resolve(String s, String s1, WebViewCallback webViewCallback0) {
        if(WebRequestThread.resolve(s1, new IResolveHostListener() {
            @Override  // com.unity3d.services.core.request.IResolveHostListener
            public void onFailed(String s, ResolveHostError resolveHostError0, String s1) {
                if(WebViewApp.getCurrentApp() != null) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.RESOLVE, ResolveHostEvent.FAILED, new Object[]{s, s, resolveHostError0.name(), s1});
                }
            }

            @Override  // com.unity3d.services.core.request.IResolveHostListener
            public void onResolve(String s, String s1) {
                if(WebViewApp.getCurrentApp() != null) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.RESOLVE, ResolveHostEvent.COMPLETE, new Object[]{s, s, s1});
                }
            }
        })) {
            webViewCallback0.invoke(new Object[]{s});
            return;
        }
        webViewCallback0.error(ResolveHostError.INVALID_HOST, new Object[]{s});
    }
}

