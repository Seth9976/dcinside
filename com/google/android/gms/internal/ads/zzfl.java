package com.google.android.gms.internal.ads;

public final class zzfl {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzfl(byte[] arr_b, int v, int v1) {
        this.zza = arr_b;
        this.zzc = v;
        this.zzb = v1;
        this.zzd = 0;
        this.zzj();
    }

    public final int zza(int v) {
        int v3;
        int v2;
        this.zzd += v;
        int v1 = 0;
        while(true) {
            v2 = this.zzd;
            v3 = 2;
            if(v2 <= 8) {
                break;
            }
            this.zzd = v2 - 8;
            int v4 = this.zzc;
            v1 |= (this.zza[v4] & 0xFF) << v2 - 8;
            if(!this.zzk(v4 + 1)) {
                v3 = 1;
            }
            this.zzc = v4 + v3;
        }
        int v5 = this.zzc;
        int v6 = v1 | (this.zza[v5] & 0xFF) >> 8 - v2;
        if(v2 == 8) {
            this.zzd = 0;
            if(!this.zzk(v5 + 1)) {
                v3 = 1;
            }
            this.zzc = v5 + v3;
        }
        this.zzj();
        return -1 >>> 0x20 - v & v6;
    }

    public final int zzb() {
        int v = this.zzi();
        return (v % 2 == 0 ? -1 : 1) * ((v + 1) / 2);
    }

    public final int zzc() {
        return this.zzi();
    }

    public final void zzd() {
        int v = this.zzd;
        if(v > 0) {
            this.zzf(8 - v);
        }
    }

    public final void zze() {
        int v = 1;
        int v1 = this.zzd + 1;
        this.zzd = v1;
        if(v1 == 8) {
            this.zzd = 0;
            int v2 = this.zzc;
            if(this.zzk(v2 + 1)) {
                v = 2;
            }
            this.zzc = v2 + v;
        }
        this.zzj();
    }

    public final void zzf(int v) {
        int v1 = this.zzc;
        int v2 = v1 + v / 8;
        this.zzc = v2;
        int v3 = this.zzd + (v - v / 8 * 8);
        this.zzd = v3;
        if(v3 > 7) {
            this.zzc = v2 + 1;
            this.zzd = v3 - 8;
        }
        while(true) {
            ++v1;
            if(v1 > this.zzc) {
                break;
            }
            if(this.zzk(v1)) {
                ++this.zzc;
                v1 += 2;
            }
        }
        this.zzj();
    }

    public final boolean zzg(int v) {
        int v1 = this.zzc;
        int v2 = v1 + v / 8;
        int v3 = this.zzd + v - v / 8 * 8;
        if(v3 > 7) {
            ++v2;
            v3 -= 8;
        }
        while(true) {
            ++v1;
            if(v1 > v2 || v2 >= this.zzb) {
                break;
            }
            if(this.zzk(v1)) {
                ++v2;
                v1 += 2;
            }
        }
        return v2 < this.zzb || v2 == this.zzb && v3 == 0;
    }

    public final boolean zzh() {
        int v = this.zza[this.zzc] & 0x80 >> this.zzd;
        this.zze();
        return v != 0;
    }

    private final int zzi() {
        int v = 0;
        int v1;
        for(v1 = 0; !this.zzh(); ++v1) {
        }
        if(v1 > 0) {
            v = this.zza(v1);
        }
        return (1 << v1) - 1 + v;
    }

    private final void zzj() {
        zzcw.zzf(this.zzc >= 0 && (this.zzc < this.zzb || this.zzc == this.zzb && this.zzd == 0));
    }

    private final boolean zzk(int v) {
        return v >= 2 && v < this.zzb && (this.zza[v] == 3 && this.zza[v - 2] == 0 && this.zza[v - 1] == 0);
    }
}

