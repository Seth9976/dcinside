package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public abstract class zzbkk extends WebViewClient {
    @Override  // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView0, String s, boolean z) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.doUpdateVisitedHistory(webView0, s, z);
    }

    @Nullable
    protected abstract WebViewClient getDelegate();

    @Override  // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView0, Message message0, Message message1) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onFormResubmission(webView0, message0, message1);
    }

    @Override  // android.webkit.WebViewClient
    public void onLoadResource(WebView webView0, String s) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onLoadResource(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onPageCommitVisible(WebView webView0, String s) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onPageCommitVisible(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(WebView webView0, String s) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onPageFinished(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onPageStarted(webView0, s, bitmap0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView0, ClientCertRequest clientCertRequest0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedClientCertRequest(webView0, clientCertRequest0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedError(webView0, v, s, s1);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedError(webView0, webResourceRequest0, webResourceError0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView0, HttpAuthHandler httpAuthHandler0, String s, String s1) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedHttpAuthRequest(webView0, httpAuthHandler0, s, s1);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView0, String s, @Nullable String s1, String s2) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedLoginRequest(webView0, s, s1, s2);
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onReceivedSslError(webView0, sslErrorHandler0, sslError0);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        WebViewClient webViewClient0 = this.getDelegate();
        return webViewClient0 == null ? false : webViewClient0.onRenderProcessGone(webView0, renderProcessGoneDetail0);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 27)
    public final void onSafeBrowsingHit(WebView webView0, WebResourceRequest webResourceRequest0, int v, SafeBrowsingResponse safeBrowsingResponse0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onSafeBrowsingHit(webView0, webResourceRequest0, v, safeBrowsingResponse0);
    }

    @Override  // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView0, float f, float f1) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onScaleChanged(webView0, f, f1);
    }

    @Override  // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView0, Message message0, Message message1) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onTooManyRedirects(webView0, message0, message1);
    }

    @Override  // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView0, KeyEvent keyEvent0) {
        WebViewClient webViewClient0 = this.getDelegate();
        if(webViewClient0 == null) {
            return;
        }
        webViewClient0.onUnhandledKeyEvent(webView0, keyEvent0);
    }

    @Override  // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        WebViewClient webViewClient0 = this.getDelegate();
        return webViewClient0 == null ? null : webViewClient0.shouldInterceptRequest(webView0, webResourceRequest0);
    }

    @Override  // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        WebViewClient webViewClient0 = this.getDelegate();
        return webViewClient0 == null ? null : webViewClient0.shouldInterceptRequest(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView0, KeyEvent keyEvent0) {
        WebViewClient webViewClient0 = this.getDelegate();
        return webViewClient0 == null ? false : webViewClient0.shouldOverrideKeyEvent(webView0, keyEvent0);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
        WebViewClient webViewClient0 = this.getDelegate();
        return webViewClient0 == null ? false : webViewClient0.shouldOverrideUrlLoading(webView0, webResourceRequest0);
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        WebViewClient webViewClient0 = this.getDelegate();
        return webViewClient0 == null ? false : webViewClient0.shouldOverrideUrlLoading(webView0, s);
    }
}

