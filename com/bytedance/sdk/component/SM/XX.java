package com.bytedance.sdk.component.SM;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

public class XX extends WebViewClient {
    private final WebViewClient PjT;
    private final List ReZ;
    private final PjT Zh;

    public XX(PjT pjT$PjT0, WebViewClient webViewClient0, List list0) {
        this.Zh = pjT$PjT0;
        this.PjT = webViewClient0;
        this.ReZ = list0;
    }

    private int PjT(WebView webView0) {
        try {
            WebBackForwardList webBackForwardList0 = webView0.copyBackForwardList();
            return webBackForwardList0 == null ? -1 : webBackForwardList0.getCurrentIndex() + 1;
        }
        catch(Throwable unused_ex) {
        }
        return -1;
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(WebView webView0, String s) {
        this.PjT.onPageFinished(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        PjT pjT$PjT0 = this.Zh;
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT(this.PjT(webView0));
        }
        this.PjT.onPageStarted(webView0, s, bitmap0);
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedError(WebView webView0, int v, String s, String s1) {
        this.PjT.onReceivedError(webView0, v, s, s1);
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        if(Build.VERSION.SDK_INT >= 23) {
            this.PjT.onReceivedError(webView0, webResourceRequest0, webResourceError0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
        if(Build.VERSION.SDK_INT >= 23) {
            this.PjT.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
        this.PjT.onReceivedSslError(webView0, sslErrorHandler0, sslError0);
    }

    @Override  // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        return Build.VERSION.SDK_INT < 26 ? super.onRenderProcessGone(webView0, renderProcessGoneDetail0) : this.PjT.onRenderProcessGone(webView0, renderProcessGoneDetail0);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        String s = webResourceRequest0.getUrl().toString();
        if(Zh.PjT(this.ReZ, s)) {
            PjT pjT$PjT0 = this.Zh;
            if(pjT$PjT0 != null) {
                pjT$PjT0.PjT();
            }
        }
        return this.PjT.shouldInterceptRequest(webView0, webResourceRequest0);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        return this.PjT.shouldInterceptRequest(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        PjT pjT$PjT0 = this.Zh;
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT();
        }
        return this.PjT.shouldOverrideUrlLoading(webView0, s);
    }
}

