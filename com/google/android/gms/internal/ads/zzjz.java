package com.google.android.gms.internal.ads;

public final class zzjz {
    public zzlb zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzjz(zzlb zzlb0) {
        this.zza = zzlb0;
    }

    public final void zza(int v) {
        this.zze = 1 == (this.zze | v);
        this.zzb += v;
    }

    public final void zzb(zzlb zzlb0) {
        this.zze |= this.zza != zzlb0;
        this.zza = zzlb0;
    }

    public final void zzc(int v) {
        boolean z = true;
        if(this.zzc && this.zzd != 5) {
            if(v != 5) {
                z = false;
            }
            zzcw.zzd(z);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = v;
    }
}

