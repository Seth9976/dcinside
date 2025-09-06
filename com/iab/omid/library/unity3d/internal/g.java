package com.iab.omid.library.unity3d.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.adsession.h;
import com.iab.omid.library.unity3d.utils.d;
import org.json.JSONObject;

public class g {
    private static g a;

    static {
        g.a = new g();
    }

    public static final g a() {
        return g.a;
    }

    public void b(WebView webView0, String s) {
        this.i(webView0, "finishSession", new Object[]{s});
    }

    public void c(WebView webView0, String s, float f) {
        this.i(webView0, "setDeviceVolume", new Object[]{f, s});
    }

    public void d(WebView webView0, String s, h h0, String s1) {
        this.i(webView0, "error", new Object[]{h0.toString(), s1, s});
    }

    public void e(WebView webView0, String s, String s1) {
        this.i(webView0, "setNativeViewHierarchy", new Object[]{s1, s});
    }

    public void f(WebView webView0, String s, String s1, @Nullable JSONObject jSONObject0) {
        this.i(webView0, "publishMediaEvent", new Object[]{s1, jSONObject0, s});
    }

    public void g(WebView webView0, String s, JSONObject jSONObject0) {
        this.i(webView0, "init", new Object[]{jSONObject0, s});
    }

    public void h(WebView webView0, String s, JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2) {
        this.i(webView0, "startSession", new Object[]{s, jSONObject0, jSONObject1, jSONObject2});
    }

    @VisibleForTesting
    void i(WebView webView0, String s, Object[] arr_object) {
        if(webView0 != null) {
            StringBuilder stringBuilder0 = new StringBuilder(0x80);
            stringBuilder0.append("if(window.omidBridge!==undefined){omidBridge.");
            stringBuilder0.append(s);
            stringBuilder0.append("(");
            this.l(stringBuilder0, arr_object);
            stringBuilder0.append(")}");
            this.j(webView0, stringBuilder0);
            return;
        }
        d.a(("The WebView is null for " + s));
    }

    @VisibleForTesting
    void j(WebView webView0, StringBuilder stringBuilder0) {
        class a implements Runnable {
            final WebView a;
            final String b;
            final g c;

            a(WebView webView0, String s) {
                this.a = webView0;
                this.b = s;
                super();
            }

            @Override
            public void run() {
                g.this.q(this.a, this.b);
            }
        }

        String s = stringBuilder0.toString();
        Handler handler0 = webView0.getHandler();
        if(handler0 != null && Looper.myLooper() != handler0.getLooper()) {
            handler0.post(new a(this, webView0, s));
            return;
        }
        this.q(webView0, s);
    }

    public void k(WebView webView0, @NonNull JSONObject jSONObject0) {
        this.i(webView0, "setLastActivity", new Object[]{jSONObject0});
    }

    @VisibleForTesting
    void l(StringBuilder stringBuilder0, Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                if(object0 == null) {
                    stringBuilder0.append("null");
                }
                else if(object0 instanceof String) {
                    String s = object0.toString();
                    if(s.startsWith("{")) {
                        stringBuilder0.append(s);
                    }
                    else {
                        stringBuilder0.append('\"');
                        stringBuilder0.append(s);
                        stringBuilder0.append('\"');
                    }
                }
                else {
                    stringBuilder0.append(object0);
                }
                stringBuilder0.append(",");
            }
            stringBuilder0.setLength(stringBuilder0.length() - 1);
        }
    }

    public void m(WebView webView0, String s) {
        this.i(webView0, "publishImpressionEvent", new Object[]{s});
    }

    public void n(WebView webView0, String s, String s1) {
        this.i(webView0, "setState", new Object[]{s1, s});
    }

    public void o(WebView webView0, String s, @Nullable JSONObject jSONObject0) {
        this.i(webView0, "publishLoadedEvent", new Object[]{jSONObject0, s});
    }

    public void p(WebView webView0, String s, String s1) {
        if(s != null && !TextUtils.isEmpty(s1)) {
            this.q(webView0, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, \'injectionId\', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute(\'data-injection-id\');}, configurable: true});var script = document.createElement(\'script\');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", s).replace("%INJECTION_ID%", s1));
        }
    }

    public boolean q(WebView webView0, String s) {
        if(webView0 != null && !TextUtils.isEmpty(s)) {
            try {
                webView0.evaluateJavascript(s, null);
            }
            catch(IllegalStateException unused_ex) {
                webView0.loadUrl("javascript: " + s);
            }
            return true;
        }
        return false;
    }
}

