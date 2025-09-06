package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzbvt extends zzbvv {
    private final String zza;
    private final int zzb;

    public zzbvt(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof zzbvt && Objects.equal(this.zza, ((zzbvt)object0).zza) && Objects.equal(this.zzb, ((zzbvt)object0).zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final String zzc() {
        return this.zza;
    }
}

