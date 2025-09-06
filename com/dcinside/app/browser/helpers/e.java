package com.dcinside.app.browser.helpers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class e {
    public class a {
        final e a;

        @JavascriptInterface
        public void notifyVideoEnd() {
            class com.dcinside.app.browser.helpers.e.a.a implements Runnable {
                final a a;

                @Override
                public void run() {
                    e.this.a.onHideCustomView();
                }
            }

            Log.d("___", "GOT IT");
            if(e.this.a != null) {
                new Handler(Looper.getMainLooper()).post(new com.dcinside.app.browser.helpers.e.a.a(this));
            }
        }
    }

    private com.dcinside.app.browser.views.a a;
    private boolean b;

    public void b(WebView webView0) {
        if(!this.b) {
            webView0.addJavascriptInterface(new a(this), "_VideoEnabledWebView");
            this.b = true;
        }
    }

    public boolean c() {
        return this.a != null && this.a.a();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void d(WebChromeClient webChromeClient0) {
        if(webChromeClient0 instanceof com.dcinside.app.browser.views.a) {
            this.a = (com.dcinside.app.browser.views.a)webChromeClient0;
        }
    }
}

