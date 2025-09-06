package com.google.android.gms.internal.ads;

final class zzani {
    private final zzamj zza;
    private final zzef zzb;
    private final zzdx zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzani(zzamj zzamj0, zzef zzef0) {
        this.zza = zzamj0;
        this.zzb = zzef0;
        this.zzc = new zzdx(new byte[0x40], 0x40);
    }

    public final void zza(zzdy zzdy0) throws zzbc {
        long v8;
        long v6;
        zzdy0.zzH(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        int v = this.zzc.zzd(8);
        zzdy0.zzH(this.zzc.zza, 0, v);
        this.zzc.zzl(0);
        if(this.zzd) {
            this.zzc.zzn(4);
            long v1 = (long)this.zzc.zzd(3);
            this.zzc.zzn(1);
            int v2 = this.zzc.zzd(15);
            this.zzc.zzn(1);
            long v3 = (long)this.zzc.zzd(15);
            this.zzc.zzn(1);
            if(this.zzf || !this.zze) {
                v6 = v1;
            }
            else {
                this.zzc.zzn(4);
                long v4 = ((long)this.zzc.zzd(3)) << 30;
                this.zzc.zzn(1);
                int v5 = this.zzc.zzd(15);
                this.zzc.zzn(1);
                v6 = v1;
                long v7 = (long)this.zzc.zzd(15);
                this.zzc.zzn(1);
                this.zzb.zzb(((long)(v5 << 15)) | v4 | v7);
                this.zzf = true;
            }
            v8 = this.zzb.zzb(v6 << 30 | ((long)(v2 << 15)) | v3);
        }
        else {
            v8 = 0L;
        }
        this.zza.zzd(v8, 4);
        this.zza.zza(zzdy0);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}

