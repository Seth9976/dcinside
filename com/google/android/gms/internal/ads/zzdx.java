package com.google.android.gms.internal.ads;

public final class zzdx {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzdx() {
        this.zza = zzei.zzf;
    }

    public zzdx(byte[] arr_b, int v) {
        this.zza = arr_b;
        this.zzd = v;
    }

    public final int zza() {
        return (this.zzd - this.zzb) * 8 - this.zzc;
    }

    public final int zzb() {
        zzcw.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb * 8 + this.zzc;
    }

    public final int zzd(int v) {
        if(v == 0) {
            return 0;
        }
        this.zzc += v;
        int v1 = 0;
        int v2;
        while((v2 = this.zzc) > 8) {
            this.zzc = v2 - 8;
            int v3 = this.zzb;
            this.zzb = v3 + 1;
            v1 |= (this.zza[v3] & 0xFF) << v2 - 8;
        }
        int v4 = this.zzb;
        int v5 = v1 | (this.zza[v4] & 0xFF) >> 8 - v2;
        if(v2 == 8) {
            this.zzc = 0;
            this.zzb = v4 + 1;
        }
        this.zzq();
        return -1 >>> 0x20 - v & v5;
    }

    public final long zze(int v) {
        if(v <= 0x20) {
            return 0xFFFFFFFFL & ((long)this.zzd(v));
        }
        int v1 = this.zzd(v - 0x20);
        return 0xFFFFFFFFL & ((long)this.zzd(0x20)) | (((long)v1) & 0xFFFFFFFFL) << 0x20;
    }

    public final void zzf() {
        if(this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        ++this.zzb;
        this.zzq();
    }

    public final void zzg(int v, int v1) {
        int v2 = Math.min(8 - this.zzc, 14);
        int v3 = 8 - this.zzc - v2;
        byte[] arr_b = this.zza;
        int v4 = this.zzb;
        byte b = (byte)((0xFF00 >> this.zzc | (1 << v3) - 1) & arr_b[v4]);
        arr_b[v4] = b;
        int v5 = 14 - v2;
        arr_b[v4] = (byte)(b | (v & 0x3FFF) >>> v5 << v3);
        int v6;
        for(v6 = v4 + 1; v5 > 8; ++v6) {
            v5 -= 8;
            this.zza[v6] = (byte)((v & 0x3FFF) >>> v5);
        }
        byte[] arr_b1 = this.zza;
        byte b1 = (byte)(arr_b1[v6] & (1 << 8 - v5) - 1);
        arr_b1[v6] = b1;
        arr_b1[v6] = (byte)((v & 0x3FFF & (1 << v5) - 1) << 8 - v5 | b1);
        this.zzn(14);
        this.zzq();
    }

    public final void zzh(byte[] arr_b, int v, int v1) {
        for(int v2 = 0; v2 < v1 >> 3; ++v2) {
            byte[] arr_b1 = this.zza;
            int v3 = this.zzb;
            this.zzb = v3 + 1;
            int v4 = this.zzc;
            byte b = (byte)(arr_b1[v3] << v4);
            arr_b[v2] = b;
            arr_b[v2] = (byte)((arr_b1[v3 + 1] & 0xFF) >> 8 - v4 | b);
        }
        if((v1 & 7) == 0) {
            return;
        }
        byte b1 = (byte)(arr_b[v1 >> 3] & 0xFF >> (v1 & 7));
        arr_b[v1 >> 3] = b1;
        int v5 = this.zzc;
        if(v5 + (v1 & 7) > 8) {
            int v6 = this.zzb;
            this.zzb = v6 + 1;
            b1 = (byte)(b1 | (this.zza[v6] & 0xFF) << v5);
            arr_b[v1 >> 3] = b1;
            v5 -= 8;
        }
        int v7 = v5 + (v1 & 7);
        this.zzc = v7;
        int v8 = this.zzb;
        arr_b[v1 >> 3] = (byte)(((byte)((0xFF & this.zza[v8]) >> 8 - v7 << 8 - (v1 & 7))) | b1);
        if(v7 == 8) {
            this.zzc = 0;
            this.zzb = v8 + 1;
        }
        this.zzq();
    }

    public final void zzi(byte[] arr_b, int v, int v1) {
        zzcw.zzf(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, arr_b, 0, v1);
        this.zzb += v1;
        this.zzq();
    }

    public final void zzj(zzdy zzdy0) {
        this.zzk(zzdy0.zzN(), zzdy0.zze());
        this.zzl(zzdy0.zzd() * 8);
    }

    public final void zzk(byte[] arr_b, int v) {
        this.zza = arr_b;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = v;
    }

    public final void zzl(int v) {
        this.zzb = v / 8;
        this.zzc = v - v / 8 * 8;
        this.zzq();
    }

    public final void zzm() {
        int v = this.zzc + 1;
        this.zzc = v;
        if(v == 8) {
            this.zzc = 0;
            ++this.zzb;
        }
        this.zzq();
    }

    public final void zzn(int v) {
        int v1 = this.zzb + v / 8;
        this.zzb = v1;
        int v2 = this.zzc + (v - v / 8 * 8);
        this.zzc = v2;
        if(v2 > 7) {
            this.zzb = v1 + 1;
            this.zzc = v2 - 8;
        }
        this.zzq();
    }

    public final void zzo(int v) {
        zzcw.zzf(this.zzc == 0);
        this.zzb += v;
        this.zzq();
    }

    public final boolean zzp() {
        int v = this.zza[this.zzb] & 0x80 >> this.zzc;
        this.zzm();
        return v != 0;
    }

    private final void zzq() {
        zzcw.zzf(this.zzb >= 0 && (this.zzb < this.zzd || this.zzb == this.zzd && this.zzc == 0));
    }
}

