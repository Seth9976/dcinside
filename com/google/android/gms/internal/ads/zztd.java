package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
final class zztd implements zzse {
    private final MediaCodec zza;

    public zztd(MediaCodec mediaCodec0) {
        this.zza = mediaCodec0;
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzd(int v, int v1, int v2, long v3, int v4) {
        this.zza.queueInputBuffer(v, 0, v2, v3, v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zze(int v, int v1, zzhe zzhe0, long v2, int v3) {
        this.zza.queueSecureInputBuffer(v, 0, zzhe0.zza(), v2, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzf(Bundle bundle0) {
        this.zza.setParameters(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzg() {
    }

    @Override  // com.google.android.gms.internal.ads.zzse
    public final void zzh() {
    }
}

