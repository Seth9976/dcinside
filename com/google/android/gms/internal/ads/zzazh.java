package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class zzazh implements Runnable {
    final ValueCallback zza;
    final zzayz zzb;
    final WebView zzc;
    final boolean zzd;
    final zzazj zze;

    zzazh(zzazj zzazj0, zzayz zzayz0, WebView webView0, boolean z) {
        this.zzb = zzayz0;
        this.zzc = webView0;
        this.zzd = z;
        this.zze = zzazj0;
        super();
        this.zza = new zzazg(this, zzayz0, webView0, z);
    }

    @Override
    public final void run() {
        if(this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            }
            catch(Throwable unused_ex) {
                this.zza.onReceiveValue("");
            }
        }
    }
}

