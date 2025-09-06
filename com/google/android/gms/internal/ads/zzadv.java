package com.google.android.gms.internal.ads;

public final class zzadv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzadv(byte[] arr_b) {
        this.zza = arr_b;
        this.zzb = arr_b.length;
    }

    public final int zza() {
        return this.zzc * 8 + this.zzd;
    }

    public final int zzb(int v) {
        int v1 = this.zzc + 1;
        int v2 = Math.min(v, 8 - this.zzd);
        int v3 = (this.zza[this.zzc] & 0xFF) >> this.zzd & 0xFF >> 8 - v2;
        while(v2 < v) {
            v3 |= (this.zza[v1] & 0xFF) << v2;
            v2 += 8;
            ++v1;
        }
        this.zzc(v);
        return v3 & -1 >>> 0x20 - v;
    }

    public final void zzc(int v) {
        int v1 = this.zzc + v / 8;
        this.zzc = v1;
        int v2 = this.zzd + (v - v / 8 * 8);
        this.zzd = v2;
        if(v2 > 7) {
            ++v1;
            this.zzc = v1;
            v2 -= 8;
            this.zzd = v2;
        }
        zzcw.zzf(v1 >= 0 && (v1 < this.zzb || v1 == this.zzb && v2 == 0));
    }

    public final boolean zzd() {
        int v = (this.zza[this.zzc] & 0xFF) >> this.zzd;
        this.zzc(1);
        return 1 == (v & 1);
    }
}

