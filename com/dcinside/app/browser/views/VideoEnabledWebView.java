package com.dcinside.app.browser.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.dcinside.app.browser.helpers.e;
import java.util.Map;

public class VideoEnabledWebView extends WebView {
    private e a;

    public VideoEnabledWebView(Context context0) {
        super(context0);
        this.a = new e();
    }

    public VideoEnabledWebView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new e();
    }

    public VideoEnabledWebView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new e();
    }

    public boolean a() {
        return this.a.c();
    }

    @Override  // android.webkit.WebView
    public void loadData(String s, String s1, String s2) {
        this.a.b(this);
        super.loadData(s, s1, s2);
    }

    @Override  // android.webkit.WebView
    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        this.a.b(this);
        super.loadDataWithBaseURL(s, s1, s2, s3, s4);
    }

    @Override  // android.webkit.WebView
    public void loadUrl(String s) {
        this.a.b(this);
        super.loadUrl(s);
    }

    @Override  // android.webkit.WebView
    public void loadUrl(String s, Map map0) {
        this.a.b(this);
        super.loadUrl(s, map0);
    }

    @Override  // android.webkit.WebView
    @SuppressLint({"SetJavaScriptEnabled"})
    public void setWebChromeClient(WebChromeClient webChromeClient0) {
        this.getSettings().setJavaScriptEnabled(true);
        this.a.d(webChromeClient0);
        super.setWebChromeClient(webChromeClient0);
    }
}

