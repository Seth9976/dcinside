package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzerp implements zzetq {
    public final Bundle zza;

    public zzerp(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = zzfcx.zza(((zzcuv)object0).zza, "device");
        bundle0.putBundle("android_mem_info", this.zza);
        ((zzcuv)object0).zza.putBundle("device", bundle0);
    }
}

