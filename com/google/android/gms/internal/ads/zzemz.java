package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzy;

public final class zzemz implements zzetq {
    private final zzy zza;
    private final boolean zzb;

    public zzemz(zzy zzy0, boolean z) {
        this.zza = zzy0;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfp)).booleanValue()) {
            bundle0.putBoolean("app_switched", this.zzb);
        }
        zzy zzy0 = this.zza;
        if(zzy0 != null) {
            int v = zzy0.zza;
            if(v == 1) {
                bundle0.putString("avo", "p");
                return;
            }
            if(v == 2) {
                bundle0.putString("avo", "l");
            }
        }
    }
}

