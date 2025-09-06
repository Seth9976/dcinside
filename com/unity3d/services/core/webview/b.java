package com.unity3d.services.core.webview;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat.WebMessageListener;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;

public final class b implements WebMessageListener {
    public final WebViewBridgeInterface a;

    public b(WebViewBridgeInterface webViewBridgeInterface0) {
        this.a = webViewBridgeInterface0;
    }

    @Override  // androidx.webkit.WebViewCompat$WebMessageListener
    public final void onPostMessage(WebView webView0, WebMessageCompat webMessageCompat0, Uri uri0, boolean z, JavaScriptReplyProxy javaScriptReplyProxy0) {
        this.a.onHandleCallback(webView0, webMessageCompat0, uri0, z, javaScriptReplyProxy0);
    }
}

