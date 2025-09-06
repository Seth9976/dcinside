package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzaip {
    public final zzadt zza;
    public final zzajd zzb;
    public final zzdy zzc;
    public zzaje zzd;
    public zzail zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzdy zzj;
    private final zzdy zzk;
    private boolean zzl;

    public zzaip(zzadt zzadt0, zzaje zzaje0, zzail zzail0) {
        this.zza = zzadt0;
        this.zzd = zzaje0;
        this.zze = zzail0;
        this.zzb = new zzajd();
        this.zzc = new zzdy();
        this.zzj = new zzdy(1);
        this.zzk = new zzdy();
        this.zzh(zzaje0, zzail0);
    }

    public final int zza() {
        int v;
        if(!this.zzl) {
            v = this.zzd.zzg[this.zzf];
            return this.zzf() == null ? v : v | 0x40000000;
        }
        v = this.zzb.zzj[this.zzf] ? 1 : 0;
        return this.zzf() == null ? v : v | 0x40000000;
    }

    public final int zzb() {
        return this.zzl ? this.zzb.zzh[this.zzf] : this.zzd.zzd[this.zzf];
    }

    public final int zzc(int v, int v1) {
        zzdy zzdy0;
        zzajc zzajc0 = this.zzf();
        if(zzajc0 == null) {
            return 0;
        }
        int v2 = zzajc0.zzd;
        if(v2 == 0) {
            this.zzk.zzJ(zzajc0.zze, zzajc0.zze.length);
            zzdy0 = this.zzk;
            v2 = zzajc0.zze.length;
        }
        else {
            zzdy0 = this.zzb.zzn;
        }
        boolean z = this.zzb.zzb(this.zzf);
        int v3 = !z && v1 == 0 ? 0 : 1;
        this.zzj.zzN()[0] = (byte)((1 == v3 ? 0x80 : 0) | v2);
        this.zzj.zzL(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzdy0, v2, 1);
        if(v3 == 0) {
            return v2 + 1;
        }
        if(!z) {
            this.zzc.zzI(8);
            byte[] arr_b = this.zzc.zzN();
            arr_b[0] = 0;
            arr_b[1] = 1;
            arr_b[2] = 0;
            arr_b[3] = (byte)v1;
            arr_b[4] = (byte)(v >> 24 & 0xFF);
            arr_b[5] = (byte)(v >> 16 & 0xFF);
            arr_b[6] = (byte)(v >> 8 & 0xFF);
            arr_b[7] = (byte)(v & 0xFF);
            this.zza.zzs(this.zzc, 8, 1);
            return v2 + 9;
        }
        zzdy zzdy1 = this.zzb.zzn;
        int v4 = zzdy1.zzq();
        zzdy1.zzM(-2);
        int v5 = v4 * 6 + 2;
        if(v1 != 0) {
            this.zzc.zzI(v5);
            byte[] arr_b1 = this.zzc.zzN();
            zzdy1.zzH(arr_b1, 0, v5);
            int v6 = ((arr_b1[2] & 0xFF) << 8 | arr_b1[3] & 0xFF) + v1;
            arr_b1[2] = (byte)(v6 >> 8 & 0xFF);
            arr_b1[3] = (byte)(v6 & 0xFF);
            zzdy1 = this.zzc;
        }
        this.zza.zzs(zzdy1, v5, 1);
        return v2 + 1 + v5;
    }

    public final long zzd() {
        return this.zzl ? this.zzb.zzf[this.zzh] : this.zzd.zzc[this.zzf];
    }

    public final long zze() {
        return this.zzl ? this.zzb.zzi[this.zzf] : this.zzd.zzf[this.zzf];
    }

    @Nullable
    public final zzajc zzf() {
        if(!this.zzl) {
            return null;
        }
        zzajc zzajc0 = this.zzb.zzm == null ? this.zzd.zza.zzb(this.zzb.zza.zza) : this.zzb.zzm;
        return zzajc0 == null || !zzajc0.zza ? null : zzajc0;
    }

    static void zzg(zzaip zzaip0, boolean z) {
        zzaip0.zzl = true;
    }

    public final void zzh(zzaje zzaje0, zzail zzail0) {
        this.zzd = zzaje0;
        this.zze = zzail0;
        this.zza.zzm(zzaje0.zza.zzg);
        this.zzi();
    }

    public final void zzi() {
        this.zzb.zzd = 0;
        this.zzb.zzp = 0L;
        this.zzb.zzq = false;
        this.zzb.zzk = false;
        this.zzb.zzo = false;
        this.zzb.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        ++this.zzf;
        if(!this.zzl) {
            return false;
        }
        int v = this.zzg + 1;
        this.zzg = v;
        int v1 = this.zzh;
        if(v == this.zzb.zzg[v1]) {
            this.zzh = v1 + 1;
            this.zzg = 0;
            return false;
        }
        return true;
    }
}

