package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

final class zzbno implements zzcad {
    final zzbnm zza;

    zzbno(zzbnr zzbnr0, zzbnm zzbnm0) {
        this.zza = zzbnm0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        zze.zza("Rejecting reference for JS Engine.");
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
            IllegalStateException illegalStateException0 = new IllegalStateException("Unable to create JS engine reference.");
            this.zza.zzh(illegalStateException0, "SdkJavascriptFactory.createNewReference.FailureCallback");
            return;
        }
        this.zza.zzg();
    }
}

