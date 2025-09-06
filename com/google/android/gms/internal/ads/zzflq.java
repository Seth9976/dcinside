package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzflq implements Runnable {
    final WebView zza;
    final String zzb;

    zzflq(zzflr zzflr0, WebView webView0, String s) {
        this.zza = webView0;
        this.zzb = s;
        super();
    }

    @Override
    public final void run() {
        zzflr.zzk(this.zza, this.zzb);
    }
}

