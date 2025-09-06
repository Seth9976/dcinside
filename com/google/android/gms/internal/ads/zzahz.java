package com.google.android.gms.internal.ads;

final class zzahz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private int zzh;
    private int zzi;

    public zzahz(zzdy zzdy0, zzdy zzdy1, boolean z) throws zzbc {
        this.zzg = zzdy0;
        this.zzf = zzdy1;
        this.zze = z;
        zzdy1.zzL(12);
        this.zza = zzdy1.zzp();
        zzdy0.zzL(12);
        this.zzi = zzdy0.zzp();
        zzacr.zzb(zzdy0.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int v = this.zzb + 1;
        this.zzb = v;
        if(v == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if(this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int v1 = -1;
            int v2 = this.zzi - 1;
            this.zzi = v2;
            if(v2 > 0) {
                v1 = this.zzg.zzp() - 1;
            }
            this.zzh = v1;
        }
        return true;
    }
}

