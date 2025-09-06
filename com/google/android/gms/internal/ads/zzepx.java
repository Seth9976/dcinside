package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;

public final class zzepx implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepx(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzeqv zzeqv0 = ((zzeqx)this.zza).zza();
        Context context0 = ((zzche)this.zzb).zza();
        zzfxs zzfxs0 = !((Boolean)zzbe.zzc().zza(zzbcl.zzlk)).booleanValue() || !zzs.zzC(context0) ? zzfxs.zzn() : zzfxs.zzo(zzeqv0);
        zzhez.zzb(zzfxs0);
        return zzfxs0;
    }
}

