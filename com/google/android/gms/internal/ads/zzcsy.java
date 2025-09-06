package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

public final class zzcsy implements zza {
    private final zzctc zza;
    private final zzfcj zzb;

    zzcsy(zzctc zzctc0, zzfcj zzfcj0) {
        this.zza = zzctc0;
        this.zzb = zzfcj0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}

