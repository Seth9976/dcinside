package com.google.android.gms.ads.nonagon.signalgeneration;

public final class zzbs implements Runnable {
    public final zzbu zza;
    public final String zzb;

    public zzbs(zzbu zzbu0, String s) {
        this.zza = zzbu0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzb.zzb.evaluateJavascript(this.zzb, null);
    }
}

