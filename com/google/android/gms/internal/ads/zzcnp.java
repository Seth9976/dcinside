package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

public final class zzcnp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcnp(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzcnh zzcnh0 = (zzcnh)this.zza.zzb();
        zzgcs zzgcs0 = zzffh.zzc();
        Set set0 = ((JSONObject)this.zzb.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzddk(zzcnh0, zzgcs0));
        zzhez.zzb(set0);
        return set0;
    }
}

