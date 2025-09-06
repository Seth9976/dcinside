package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzesy implements zzetq {
    private final String zza;
    private final Bundle zzb;

    public zzesy(String s, Bundle bundle0) {
        this.zza = s;
        this.zzb = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        ((zzcuv)object0).zza.putString("rtb", this.zza);
        if(!this.zzb.isEmpty()) {
            ((zzcuv)object0).zza.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}

