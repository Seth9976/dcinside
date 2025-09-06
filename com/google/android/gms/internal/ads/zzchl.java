package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;

public final class zzchl implements zzher {
    private final zzhfj zza;

    public zzchl(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzduc zzduc0 = (zzduc)this.zza.zzb();
        zzgcs zzgcs0 = zzffh.zzc();
        Set set0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzbL)).booleanValue() ? Collections.singleton(new zzddk(zzduc0, zzgcs0)) : Collections.emptySet();
        zzhez.zzb(set0);
        return set0;
    }
}

