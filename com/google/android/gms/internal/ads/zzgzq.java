package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgzq extends zzgwc {
    final zzgzs zza;
    zzgwe zzb;
    final zzgzu zzc;

    zzgzq(zzgzu zzgzu0) {
        this.zzc = zzgzu0;
        super();
        this.zza = new zzgzs(zzgzu0, null);
        this.zzb = this.zzb();
    }

    @Override
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        zzgwe zzgwe0 = this.zzb;
        if(zzgwe0 == null) {
            throw new NoSuchElementException();
        }
        byte b = zzgwe0.zza();
        if(!this.zzb.hasNext()) {
            this.zzb = this.zzb();
        }
        return b;
    }

    // 去混淆评级： 低(20)
    private final zzgwe zzb() {
        return this.zza.hasNext() ? this.zza.zza().zzs() : null;
    }
}

