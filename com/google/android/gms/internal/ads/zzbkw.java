package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

public final class zzbkw implements OnH5AdsEventListener {
    public final WebView zza;

    public zzbkw(WebView webView0) {
        this.zza = webView0;
    }

    @Override  // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public final void onH5AdsEvent(String s) {
        this.zza.evaluateJavascript(s, null);
    }
}

