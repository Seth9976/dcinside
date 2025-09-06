package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzar {
    public final String zza;
    @Nullable
    public final zzam zzb;
    public final zzal zzc;
    public final zzav zzd;
    public final zzah zze;
    public final zzao zzf;

    static {
        new zzaf().zzc();
    }

    zzar(String s, zzai zzai0, zzam zzam0, zzal zzal0, zzav zzav0, zzao zzao0, zzaq zzaq0) {
        this.zza = s;
        this.zzb = zzam0;
        this.zzc = zzal0;
        this.zzd = zzav0;
        this.zze = zzai0;
        this.zzf = zzao0;
    }

    // 去混淆评级： 低(23)
    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzar ? Objects.equals(this.zza, ((zzar)object0).zza) && this.zze.equals(((zzar)object0).zze) && Objects.equals(this.zzb, ((zzar)object0).zzb) && Objects.equals(this.zzc, ((zzar)object0).zzc) && Objects.equals(this.zzd, ((zzar)object0).zzd) && Objects.equals(this.zzf, ((zzar)object0).zzf) : false;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        return this.zzb == null ? (648590145 + 0xE1781 * v + this.zzd.hashCode()) * 0x1F : (648590145 + 0xE1781 * v + 0x745F * this.zzb.hashCode() + this.zzd.hashCode()) * 0x1F;
    }
}

