package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import j..util.Objects;

public final class zzdnq {
    private final zzcvr zza;
    private final zzcxa zzb;
    private final zzcxn zzc;
    private final zzcxz zzd;
    private final zzdap zze;
    private final zzddq zzf;
    private final zzdrw zzg;
    private final zzfja zzh;
    private final zzebk zzi;
    private final zzcmk zzj;

    zzdnq(zzcvr zzcvr0, zzcxa zzcxa0, zzcxn zzcxn0, zzcxz zzcxz0, zzdap zzdap0, zzddq zzddq0, zzdrw zzdrw0, zzfja zzfja0, zzebk zzebk0, zzcmk zzcmk0) {
        this.zza = zzcvr0;
        this.zzb = zzcxa0;
        this.zzc = zzcxn0;
        this.zzd = zzcxz0;
        this.zze = zzdap0;
        this.zzf = zzddq0;
        this.zzg = zzdrw0;
        this.zzh = zzfja0;
        this.zzi = zzebk0;
        this.zzj = zzcmk0;
    }

    public final void zza(zzdnr zzdnr0, zzcex zzcex0) {
        Objects.requireNonNull(this.zzb);
        zzdnp zzdnp0 = new zzdnp(this.zzb);
        zzdnr0.zza.zzi(this.zza, this.zzc, this.zzd, this.zze, zzdnp0, this.zzf);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjZ)).booleanValue() && zzcex0 != null && zzcex0.zzN() != null) {
            zzcgp zzcgp0 = zzcex0.zzN();
            zzcgp0.zzK(this.zzj, this.zzi, this.zzh);
            zzcgp0.zzM(this.zzj, this.zzi, this.zzg);
        }
    }
}

