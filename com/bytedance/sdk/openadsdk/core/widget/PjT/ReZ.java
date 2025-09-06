package com.bytedance.sdk.openadsdk.core.widget.PjT;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.RD.PjT;
import java.lang.ref.WeakReference;

public class ReZ {
    private final boolean JQp;
    private final WeakReference PjT;
    private final boolean ReZ;
    private boolean XX;
    private boolean Zh;
    private final boolean cr;
    private final boolean cz;

    private ReZ(Context context0) {
        this.Zh = true;
        this.ReZ = true;
        this.cr = true;
        this.JQp = false;
        this.cz = true;
        this.XX = true;
        this.PjT = new WeakReference(context0);
    }

    public static ReZ PjT(Context context0) {
        return new ReZ(context0);
    }

    private void PjT(WebSettings webSettings0) {
        try {
            webSettings0.setMediaPlaybackRequiresUserGesture(false);
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.toString(), new Object[0]);
        }
    }

    public static void PjT(cz cz0) {
        if(cz0 == null) {
            return;
        }
        int v = PjT.PjT("clear_web_cache_new", 0);
        if(v == 0) {
            cz0.PjT(true);
            return;
        }
        if(v == 1) {
            cz0.PjT(false);
        }
    }

    public ReZ PjT(boolean z) {
        this.XX = z;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void PjT(WebView webView0) {
        if(webView0 != null && this.PjT.get() != null) {
            ReZ.Zh(webView0);
            WebSettings webSettings0 = webView0.getSettings();
            this.PjT(webSettings0);
            if(webSettings0 == null) {
                return;
            }
            try {
                webSettings0.setJavaScriptEnabled(true);
            }
            catch(Exception exception0) {
                RD.Zh("SSWebSettings", exception0.getMessage());
            }
            try {
                if(this.Zh) {
                    webSettings0.setSupportZoom(true);
                    webSettings0.setBuiltInZoomControls(true);
                }
                else {
                    webSettings0.setSupportZoom(false);
                }
            }
            catch(Throwable throwable0) {
                RD.Zh("SSWebSettings", throwable0.getMessage());
            }
            webSettings0.setLoadWithOverviewMode(true);
            webSettings0.setUseWideViewPort(true);
            webSettings0.setDomStorageEnabled(true);
            webSettings0.setAllowFileAccess(false);
            webSettings0.setBlockNetworkImage(false);
            webSettings0.setSavePassword(false);
            try {
                if(this.XX) {
                    webView0.setLayerType(2, null);
                    return;
                }
                webView0.setLayerType(0, null);
                return;
            }
            catch(Throwable throwable1) {
            }
            RD.Zh("SSWebSettings", throwable1.getMessage());
        }
    }

    public static void Zh(WebView webView0) {
        try {
            webView0.removeJavascriptInterface("searchBoxJavaBridge_");
            webView0.removeJavascriptInterface("accessibility");
            webView0.removeJavascriptInterface("accessibilityTraversal");
        }
        catch(Throwable throwable0) {
            RD.Zh(throwable0.toString(), new Object[0]);
        }
    }

    public ReZ Zh(boolean z) {
        this.Zh = z;
        return this;
    }
}

