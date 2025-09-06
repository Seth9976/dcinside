package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

final class zzgbp extends zzgbr {
    zzgbp(zzfxi zzfxi0, boolean z) {
        super(zzfxi0, z);
        this.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzgbr
    public final Object zzG(List list0) {
        ArrayList arrayList0 = zzfyd.zza(list0.size());
        for(Object object0: list0) {
            zzgbq zzgbq0 = (zzgbq)object0;
            arrayList0.add((zzgbq0 == null ? null : zzgbq0.zza));
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }
}

