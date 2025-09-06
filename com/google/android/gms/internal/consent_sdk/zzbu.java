package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import j..util.Objects;

@UiThread
public final class zzbu extends WebView {
    private final Handler zza;
    private final zzca zzb;
    private boolean zzc;

    public zzbu(zzbw zzbw0, Handler handler0, zzca zzca0) {
        super(zzbw0);
        this.zzc = false;
        this.zza = handler0;
        this.zzb = zzca0;
    }

    static void zzb(zzbu zzbu0, boolean z) {
        zzbu0.zzc = true;
    }

    public final void zzc() {
        Objects.requireNonNull(this.zzb);
        zzbr zzbr0 = new zzbr(this.zzb);
        this.zza.post(zzbr0);
    }

    public final void zzd(String s, String s1) {
        zzbq zzbq0 = new zzbq(this, s + "(" + s1 + ");");
        this.zza.post(zzbq0);
    }

    static boolean zzf(zzbu zzbu0, String s) {
        return s != null && s.startsWith("consent://");
    }
}

