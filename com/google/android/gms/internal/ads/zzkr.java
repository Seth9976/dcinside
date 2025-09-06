package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

public final class zzkr implements Runnable {
    public final zzkw zza;
    public final Pair zzb;
    public final zztx zzc;
    public final zzuc zzd;
    public final IOException zze;
    public final boolean zzf;

    public zzkr(zzkw zzkw0, Pair pair0, zztx zztx0, zzuc zzuc0, IOException iOException0, boolean z) {
        this.zza = zzkw0;
        this.zzb = pair0;
        this.zzc = zztx0;
        this.zzd = zzuc0;
        this.zze = iOException0;
        this.zzf = z;
    }

    @Override
    public final void run() {
        this.zza.zza.zzh.zzai(((int)(((Integer)this.zzb.first))), ((zzug)this.zzb.second), this.zzc, this.zzd, this.zze, this.zzf);
    }
}

