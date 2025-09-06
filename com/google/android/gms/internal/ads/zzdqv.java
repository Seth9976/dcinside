package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class zzdqv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdqv(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Set set0;
        String s = ((zzewd)this.zza).zza();
        Context context0 = ((zzche)this.zzb).zza();
        zzgcs zzgcs0 = zzffh.zzc();
        Map map0 = ((zzhev)this.zzc).zzd();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeW)).booleanValue()) {
            zzbbj zzbbj0 = new zzbbj(new zzbbp(context0));
            zzbbj0.zzb(new zzdqw(s));
            set0 = Collections.singleton(new zzddk(new zzdqy(zzbbj0, map0), zzgcs0));
        }
        else {
            set0 = Collections.emptySet();
        }
        zzhez.zzb(set0);
        return set0;
    }
}

