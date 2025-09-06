package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzht {
    public final String zza;
    public final zzab zzb;
    public final zzab zzc;
    public final int zzd;
    public final int zze;

    public zzht(String s, zzab zzab0, zzab zzab1, int v, int v1) {
        boolean z = true;
        if(v != 0) {
            if(v1 == 0) {
                v1 = 0;
            }
            else {
                z = false;
            }
        }
        zzcw.zzd(z);
        zzcw.zzc(s);
        this.zza = s;
        this.zzb = zzab0;
        zzab1.getClass();
        this.zzc = zzab1;
        this.zzd = v;
        this.zze = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzht.class == class0 && this.zzd == ((zzht)object0).zzd && this.zze == ((zzht)object0).zze && this.zza.equals(((zzht)object0).zza) && this.zzb.equals(((zzht)object0).zzb) && this.zzc.equals(((zzht)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((this.zzd + 0x20F) * 0x1F + this.zze) * 0x1F + this.zza.hashCode()) * 0x1F + this.zzb.hashCode()) * 0x1F + this.zzc.hashCode();
    }
}

