package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class WebViewWithCache extends WebView {
    public WebViewWithCache(Context context0, boolean z, IExperiments iExperiments0) {
        this(context0, z, SharedInstances.INSTANCE.getWebViewBridge(), SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iExperiments0);
    }

    public WebViewWithCache(Context context0, boolean z, IWebViewBridge iWebViewBridge0, IInvocationCallbackInvoker iInvocationCallbackInvoker0, IExperiments iExperiments0) {
        super(context0, z, iWebViewBridge0, iInvocationCallbackInvoker0, iExperiments0);
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setCacheMode(-1);
        webSettings0.setDomStorageEnabled(true);
        if(z) {
            webSettings0.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}

