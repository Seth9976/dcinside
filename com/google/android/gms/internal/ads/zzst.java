package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

final class zzst {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzst(String s, boolean z, boolean z1) {
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && object0.getClass() == zzst.class && TextUtils.equals(this.zza, ((zzst)object0).zza) && this.zzb == ((zzst)object0).zzb && this.zzc == ((zzst)object0).zzc;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        int v1 = 0x4CF;
        int v2 = this.zzb ? 0x4CF : 0x4D5;
        if(!this.zzc) {
            v1 = 0x4D5;
        }
        return ((v + 0x1F) * 0x1F + v2) * 0x1F + v1;
    }
}

