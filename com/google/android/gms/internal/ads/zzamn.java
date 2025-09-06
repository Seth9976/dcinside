package com.google.android.gms.internal.ads;

final class zzamn {
    private final zzadt zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzamn(zzadt zzadt0) {
        this.zza = zzadt0;
    }

    public final void zza(byte[] arr_b, int v, int v1) {
        if(this.zzc) {
            int v2 = this.zzf;
            int v3 = v + 1 - v2;
            if(v3 < v1) {
                this.zzd = (arr_b[v3] & 0xC0) >> 6 == 0;
                this.zzc = false;
                return;
            }
            this.zzf = v2 + (v1 - v);
        }
    }

    public final void zzb(long v, int v1, boolean z) {
        zzcw.zzf(this.zzh != 0x8000000000000001L);
        if(this.zze == 0xB6 && z && this.zzb) {
            this.zza.zzt(this.zzh, ((int)this.zzd), ((int)(v - this.zzg)), v1, null);
        }
        if(this.zze != 0xB3) {
            this.zzg = v;
        }
    }

    public final void zzc(int v, long v1) {
        boolean z1;
        this.zze = v;
        this.zzd = false;
        boolean z = true;
        switch(v) {
            case 0xB3: {
                v = 0xB3;
                z1 = true;
                break;
            }
            case 0xB6: {
                z1 = true;
                break;
            }
            default: {
                z1 = false;
            }
        }
        this.zzb = z1;
        if(v != 0xB6) {
            z = false;
        }
        this.zzc = z;
        this.zzf = 0;
        this.zzh = v1;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}

