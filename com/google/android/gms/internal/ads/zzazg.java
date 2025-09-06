package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

public final class zzazg implements ValueCallback {
    public final zzazh zza;
    public final zzayz zzb;
    public final WebView zzc;
    public final boolean zzd;

    public zzazg(zzazh zzazh0, zzayz zzayz0, WebView webView0, boolean z) {
        this.zza = zzazh0;
        this.zzb = zzayz0;
        this.zzc = webView0;
        this.zzd = z;
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        this.zza.zze.zzc(this.zzb, this.zzc, ((String)object0), this.zzd);
    }
}

