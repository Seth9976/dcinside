package com.google.android.gms.internal.ads;

public final class zzkh {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkh() {
        this.zza = 0x8000000000000001L;
        this.zzb = -3.402823E+38f;
        this.zzc = 0x8000000000000001L;
    }

    zzkh(zzkj zzkj0, zzki zzki0) {
        this.zza = zzkj0.zza;
        this.zzb = zzkj0.zzb;
        this.zzc = zzkj0.zzc;
    }

    public final zzkh zzd(long v) {
        boolean z = true;
        if(v < 0L) {
            if(v == 0x8000000000000001L) {
                v = 0x8000000000000001L;
            }
            else {
                z = false;
            }
        }
        zzcw.zzd(z);
        this.zzc = v;
        return this;
    }

    public final zzkh zze(long v) {
        this.zza = v;
        return this;
    }

    public final zzkh zzf(float f) {
        zzcw.zzd(f > 0.0f || f == -3.402823E+38f);
        this.zzb = f;
        return this;
    }

    public final zzkj zzg() {
        return new zzkj(this, null);
    }
}

