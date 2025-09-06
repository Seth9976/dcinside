package com.google.android.gms.internal.ads;

final class zzamr {
    private final zzadt zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzamr(zzadt zzadt0) {
        this.zza = zzadt0;
    }

    public final void zza(long v) {
        this.zzm = this.zzc;
        this.zzf(((int)(v - this.zzb)));
        this.zzk = this.zzb;
        this.zzb = v;
        this.zzf(0);
        this.zzi = false;
    }

    public final void zzb(long v, int v1, boolean z) {
        if(this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
            return;
        }
        if(!this.zzh && !this.zzg) {
            return;
        }
        if(z && this.zzi) {
            this.zzf(v1 + ((int)(v - this.zzb)));
        }
        this.zzk = this.zzb;
        this.zzl = this.zze;
        this.zzm = this.zzc;
        this.zzi = true;
    }

    public final void zzc(byte[] arr_b, int v, int v1) {
        if(this.zzf) {
            int v2 = this.zzd;
            int v3 = v + 2 - v2;
            if(v3 < v1) {
                this.zzg = (arr_b[v3] & 0x80) != 0;
                this.zzf = false;
                return;
            }
            this.zzd = v2 + (v1 - v);
        }
    }

    public final void zzd() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zze(long v, int v1, int v2, long v3, boolean z) {
        boolean z1 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = v3;
        this.zzd = 0;
        this.zzb = v;
        if(v2 >= 0x20 && v2 != 40) {
            if(this.zzi && !this.zzj) {
                if(z) {
                    this.zzf(v1);
                }
                this.zzi = false;
            }
            if(v2 <= 35 || v2 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z2 = v2 >= 16 && v2 <= 21;
        this.zzc = z2;
        if(z2 || v2 <= 9) {
            z1 = true;
        }
        this.zzf = z1;
    }

    private final void zzf(int v) {
        long v1 = this.zzl;
        if(v1 == 0x8000000000000001L) {
            return;
        }
        this.zza.zzt(v1, ((int)this.zzm), ((int)(this.zzb - this.zzk)), v, null);
    }
}

