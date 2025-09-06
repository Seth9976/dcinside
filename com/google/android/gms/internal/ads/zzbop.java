package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

public final class zzbop {
    private final zzbns zza;
    private t0 zzb;

    zzbop(zzbns zzbns0) {
        this.zza = zzbns0;
    }

    public final zzbos zza(String s, zzbnz zzbnz0, zzbny zzbny0) {
        this.zzd();
        return new zzbos(this.zzb, "google.afma.activeView.handleUpdate", zzbnz0, zzbny0);
    }

    public final void zzb(String s, zzbjp zzbjp0) {
        this.zzd();
        this.zzb = zzgch.zzn(this.zzb, new zzboo(s, zzbjp0), zzbzw.zzg);
    }

    public final void zzc(String s, zzbjp zzbjp0) {
        this.zzb = zzgch.zzm(this.zzb, new zzbol(s, zzbjp0), zzbzw.zzg);
    }

    private final void zzd() {
        if(this.zzb == null) {
            zzcab zzcab0 = new zzcab();
            this.zzb = zzcab0;
            this.zza.zzb(null).zzj(new zzbom(zzcab0), new zzbon(zzcab0));
        }
    }
}

