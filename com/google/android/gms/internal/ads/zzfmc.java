package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class zzfmc extends WebViewClient {
    final zzfme zza;

    zzfmc(zzfme zzfme0) {
        this.zza = zzfme0;
        super();
    }

    @Override  // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail0.toString() + "for WebView: " + webView0);
        if(this.zza.zza() == webView0) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.zza.zzn(null);
        }
        webView0.destroy();
        return true;
    }
}

