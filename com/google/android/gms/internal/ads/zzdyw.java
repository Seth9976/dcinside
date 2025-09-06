package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.common.util.concurrent.t0;

public final class zzdyw implements zzgbo {
    public final zzeuu zza;
    public final zzbvk zzb;

    public zzdyw(zzeuu zzeuu0, zzbvk zzbvk0) {
        this.zza = zzeuu0;
        this.zzb = zzbvk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzb().zza(zzbc.zzb().zzi(((Bundle)object0)), this.zzb.zzm, false);
    }
}

