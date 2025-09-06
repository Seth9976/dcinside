package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzetn implements zzetq {
    private final Bundle zza;

    public zzetn(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        if(!this.zza.isEmpty()) {
            ((zzcuv)object0).zzb.putBundle("shared_pref", this.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        if(!this.zza.isEmpty()) {
            ((zzcuv)object0).zza.putBundle("shared_pref", this.zza);
        }
    }
}

