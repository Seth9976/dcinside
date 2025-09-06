package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzum implements zzdb {
    public final zzuq zza;
    public final zztx zzb;
    public final zzuc zzc;
    public final IOException zzd;
    public final boolean zze;

    public zzum(zzuq zzuq0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        this.zza = zzuq0;
        this.zzb = zztx0;
        this.zzc = zzuc0;
        this.zzd = iOException0;
        this.zze = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzdb
    public final void zza(Object object0) {
        ((zzur)object0).zzai(0, this.zza.zzb, this.zzb, this.zzc, this.zzd, this.zze);
    }
}

