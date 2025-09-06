package com.bytedance.sdk.component.PjT;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class cRA extends PjT {
    protected String Au;
    static final boolean DWo = true;
    protected WebView SM;

    static {
    }

    private void PjT(String s, String s1) {
        if(this.cz) {
            return;
        }
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        com.bytedance.sdk.component.PjT.cRA.1 cRA$10 = new Runnable() {
            final cRA Zh;

            @Override
            public void run() {
                if(cRA.this.cz) {
                    return;
                }
                try {
                    cRA.this.SM.evaluateJavascript(s1, null);
                }
                catch(Throwable unused_ex) {
                }
            }
        };
        if(Looper.myLooper() != Looper.getMainLooper()) {
            this.cr.post(cRA$10);
            return;
        }
        cRA$10.run();
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    protected Context PjT(DWo dWo0) {
        Context context0 = dWo0.JQp;
        if(context0 != null) {
            return context0;
        }
        WebView webView0 = dWo0.PjT;
        if(webView0 == null) {
            throw new IllegalStateException("WebView cannot be null!");
        }
        return webView0.getContext();
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    protected String PjT() {
        return this.SM.getUrl();
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    protected void PjT(String s) {
        this.PjT(s, "javascript:" + this.Au + "._handleMessageFromToutiao(" + s + ")");
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    protected void PjT(String s, xE xE0) {
        if(xE0 != null && !TextUtils.isEmpty(xE0.Au)) {
            String s1 = Base64.encodeToString(xE0.Au.getBytes(), 2);
            this.PjT(s, String.format("javascript:(function(){   const iframe = document.querySelector(atob(\'%s\'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob(\'%s\'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", xE0.Au).getBytes(), 2), s, s1));
            return;
        }
        super.PjT(s, xE0);
    }

    @SuppressLint({"AddJavascriptInterface"})
    protected void ReZ() {
        if(!cRA.DWo && this.SM == null) {
            throw new AssertionError();
        }
        this.SM.addJavascriptInterface(this, this.Au);
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    protected void Zh() {
        super.Zh();
        this.cr();
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    protected void Zh(DWo dWo0) {
        this.SM = dWo0.PjT;
        this.Au = dWo0.ReZ;
        if(!dWo0.fDm) {
            this.ReZ();
        }
    }

    protected void cr() {
        this.SM.removeJavascriptInterface(this.Au);
    }

    @Override  // com.bytedance.sdk.component.PjT.PjT
    @JavascriptInterface
    public void invokeMethod(String s) {
        super.invokeMethod(s);
    }
}

