package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaz;

final class zzcjj implements zzab {
    private final zzcih zza;
    private zzcvc zzb;
    private zzaz zzc;

    zzcjj(zzcih zzcih0, zzcjm zzcjm0) {
        this.zza = zzcih0;
    }

    @Override  // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final zzab zza(zzcvc zzcvc0) {
        this.zzb = zzcvc0;
        return this;
    }

    @Override  // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final zzab zzb(zzaz zzaz0) {
        this.zzc = zzaz0;
        return this;
    }

    @Override  // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final zzac zzc() {
        zzhez.zzc(this.zzb, zzcvc.class);
        zzhez.zzc(this.zzc, zzaz.class);
        zzaz zzaz0 = this.zzc;
        zzcsf zzcsf0 = new zzcsf();
        zzcue zzcue0 = new zzcue();
        zzdsl zzdsl0 = new zzdsl();
        return new zzcjk(this.zza, zzaz0, zzcsf0, zzcue0, zzdsl0, this.zzb, null, null, null);
    }
}

