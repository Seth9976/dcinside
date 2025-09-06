package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzfz extends zzed {
    private final VideoLifecycleCallbacks zza;

    public zzfz(VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0) {
        this.zza = videoController$VideoLifecycleCallbacks0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
        this.zza.onVideoEnd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
        this.zza.onVideoStart();
    }
}

