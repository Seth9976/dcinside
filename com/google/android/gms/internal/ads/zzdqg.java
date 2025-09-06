package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;

public final class zzdqg implements zzher {
    private final zzhfj zza;

    public zzdqg(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzgcs zzgcs0 = zzffh.zzc();
        zzdqy zzdqy0 = ((zzdqz)this.zza).zza();
        Set set0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzeW)).booleanValue() ? Collections.singleton(new zzddk(zzdqy0, zzgcs0)) : Collections.emptySet();
        zzhez.zzb(set0);
        return set0;
    }
}

