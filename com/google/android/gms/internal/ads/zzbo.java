package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzbo {
    @Nullable
    public Object zza;
    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg;

    static {
    }

    public zzbo() {
        this.zzg = zzb.zza;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzbo.class.equals(class0) && Objects.equals(this.zza, ((zzbo)object0).zza) && Objects.equals(this.zzb, ((zzbo)object0).zzb) && this.zzc == ((zzbo)object0).zzc && this.zzd == ((zzbo)object0).zzd && this.zzf == ((zzbo)object0).zzf && Objects.equals(this.zzg, ((zzbo)object0).zzg);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        Object object0 = this.zzb;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (((((v1 + 0xD9) * 0x1F + v) * 0x1F + this.zzc) * 0x1F + ((int)(this.zzd ^ this.zzd >>> 0x20))) * 961 + this.zzf) * 0x1F + this.zzg.hashCode();
    }

    public final int zza(int v) {
        return this.zzg.zza(v).zzb;
    }

    public final int zzb() [...] // Inlined contents

    public final int zzc(long v) [...] // Inlined contents

    public final int zzd(long v) {
        return -1;
    }

    public final int zze(int v) {
        return this.zzg.zza(v).zza(-1);
    }

    public final long zzf(int v, int v1) {
        zza zza0 = this.zzg.zza(v);
        return zza0.zzb == -1 ? 0x8000000000000001L : zza0.zzf[v1];
    }

    public final long zzg(int v) {
        return 0L;
    }

    public final long zzh() [...] // Inlined contents

    public final zzbo zzi(@Nullable Object object0, @Nullable Object object1, int v, long v1, long v2, zzb zzb0, boolean z) {
        this.zza = object0;
        this.zzb = object1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = 0L;
        this.zzg = zzb0;
        this.zzf = z;
        return this;
    }

    public final boolean zzj(int v) {
        return false;
    }

    public final boolean zzk(int v) {
        return false;
    }
}

