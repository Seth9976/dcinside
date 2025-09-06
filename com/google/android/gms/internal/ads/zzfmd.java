package com.google.android.gms.internal.ads;

import android.webkit.WebView;

final class zzfmd implements Runnable {
    final zzfme zza;
    private final WebView zzb;

    zzfmd(zzfme zzfme0) {
        this.zza = zzfme0;
        super();
        this.zzb = zzfme0.zza;
    }

    @Override
    public final void run() {
        this.zzb.destroy();
    }
}

