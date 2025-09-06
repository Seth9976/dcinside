package com.google.android.gms.internal.ads;

import java.util.ArrayList;

public final class zzbmz implements Runnable {
    public final zzbns zza;
    public final zzbnr zzb;
    public final zzbmn zzc;
    public final ArrayList zzd;
    public final long zze;

    public zzbmz(zzbns zzbns0, zzbnr zzbnr0, zzbmn zzbmn0, ArrayList arrayList0, long v) {
        this.zza = zzbns0;
        this.zzb = zzbnr0;
        this.zzc = zzbmn0;
        this.zzd = arrayList0;
        this.zze = v;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

