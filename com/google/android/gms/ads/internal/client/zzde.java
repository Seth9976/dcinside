package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

public final class zzde extends zzdc {
    private final MuteThisAdListener zza;

    public zzde(MuteThisAdListener muteThisAdListener0) {
        this.zza = muteThisAdListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        this.zza.onAdMuted();
    }
}

