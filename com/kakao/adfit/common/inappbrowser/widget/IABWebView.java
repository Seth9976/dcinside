package com.kakao.adfit.common.inappbrowser.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.kakao.adfit.m.k;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@SuppressLint({"SetJavaScriptEnabled"})
public final class IABWebView extends WebView {
    @j
    public IABWebView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public IABWebView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public IABWebView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString(k.a(this));
        webSettings0.setSaveFormData(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setCacheMode(-1);
        webSettings0.setTextZoom(100);
        webSettings0.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setMixedContentMode(0);
        webSettings0.setBuiltInZoomControls(false);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setEnableSmoothTransition(true);
        webSettings0.setAllowContentAccess(false);
        webSettings0.setPluginState(WebSettings.PluginState.ON);
    }

    public IABWebView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }
}

