package com.google.android.gms.internal.ads;

final class zzcbf implements Runnable {
    final boolean zza;
    final zzcbg zzb;

    zzcbf(zzcbg zzcbg0, boolean z) {
        this.zza = z;
        this.zzb = zzcbg0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}

