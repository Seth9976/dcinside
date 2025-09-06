package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;

public final class zzcs {
    @GuardedBy("WebViewUtil.class")
    private static Boolean zza;

    public static void zza(WebView webView0, String s) {
        synchronized(zzcs.class) {
            if(zzcs.zza == null) {
                try {
                    webView0.evaluateJavascript("(function(){})()", null);
                    zzcs.zza = Boolean.TRUE;
                }
                catch(IllegalStateException unused_ex) {
                    zzcs.zza = Boolean.FALSE;
                }
            }
            boolean z = zzcs.zza.booleanValue();
        }
        if(z) {
            webView0.evaluateJavascript(s, null);
            return;
        }
        webView0.loadUrl("javascript:" + s);
    }
}

