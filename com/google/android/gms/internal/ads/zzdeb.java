package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdeb extends zzdbj implements zzbkg {
    public zzdeb(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbkg
    public final void zza(zzbwi zzbwi0) {
        this.zzq(new zzdea(zzbwi0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbkg
    public final void zzb() {
        this.zzq(new zzddz());
    }

    @Override  // com.google.android.gms.internal.ads.zzbkg
    public final void zzc() {
        synchronized(this) {
            this.zzq(new zzddy());
        }
    }
}

