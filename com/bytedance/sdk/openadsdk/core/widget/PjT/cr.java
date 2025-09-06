package com.bytedance.sdk.openadsdk.core.widget.PjT;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.utils.gK;

public class cr extends WebChromeClient {
    private static final String PjT;
    private qj ReZ;
    private final KM Zh;
    private com.bytedance.sdk.openadsdk.common.cr cr;

    static {
        cr.PjT = "WebChromeClient";
    }

    public cr(KM kM0) {
        this.Zh = kM0;
    }

    public cr(KM kM0, qj qj0) {
        this.Zh = kM0;
        this.ReZ = qj0;
    }

    public cr(KM kM0, qj qj0, com.bytedance.sdk.openadsdk.common.cr cr0) {
        this(kM0, qj0);
        this.cr = cr0;
    }

    private boolean PjT(@NonNull String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            if(s.regionMatches(true, 0, "bytedance:", 0, 10)) {
                fDm.ReZ().post(new Runnable() {
                    final cr Zh;

                    @Override
                    public void run() {
                        gK.PjT(Uri.parse(s), cr.this.Zh);
                    }
                });
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    @Override  // android.webkit.WebChromeClient
    public void onConsoleMessage(String s, int v, String s1) {
        if(!TextUtils.isEmpty(s)) {
            this.PjT(s);
        }
        super.onConsoleMessage(s, v, s1);
    }

    // 去混淆评级： 低(20)
    @Override  // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
        return consoleMessage0 == null || TextUtils.isEmpty(consoleMessage0.message()) || !this.PjT(consoleMessage0.message()) ? super.onConsoleMessage(consoleMessage0) : true;
    }

    @Override  // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView0, int v) {
        super.onProgressChanged(webView0, v);
        qj qj0 = this.ReZ;
        if(qj0 != null) {
            qj0.PjT(webView0, v);
        }
        com.bytedance.sdk.openadsdk.common.cr cr0 = this.cr;
        if(cr0 != null) {
            cr0.PjT(webView0, v);
        }
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        super.onShowCustomView(view0, webChromeClient$CustomViewCallback0);
    }
}

