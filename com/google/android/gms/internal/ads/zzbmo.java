package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

public final class zzbmo implements Predicate {
    public final zzbjp zza;

    public zzbmo(zzbjp zzbjp0) {
        this.zza = zzbjp0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.util.Predicate
    public final boolean apply(Object object0) {
        return ((zzbjp)object0) instanceof zzbmu && ((zzbmu)(((zzbjp)object0))).zzb.equals(this.zza);
    }
}

