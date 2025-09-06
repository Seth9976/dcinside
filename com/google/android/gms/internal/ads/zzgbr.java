package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o3.a;

abstract class zzgbr extends zzgbh {
    @a
    private List zza;

    zzgbr(zzfxi zzfxi0, boolean z) {
        super(zzfxi0, z, true);
        List list0 = zzfxi0.isEmpty() ? Collections.emptyList() : zzfyd.zza(zzfxi0.size());
        for(int v = 0; v < zzfxi0.size(); ++v) {
            list0.add(null);
        }
        this.zza = list0;
    }

    abstract Object zzG(List arg1);

    @Override  // com.google.android.gms.internal.ads.zzgbh
    final void zzf(int v, Object object0) {
        List list0 = this.zza;
        if(list0 != null) {
            list0.set(v, new zzgbq(object0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgbh
    final void zzu() {
        List list0 = this.zza;
        if(list0 != null) {
            this.zzc(this.zzG(list0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgbh
    final void zzy(int v) {
        super.zzy(v);
        this.zza = null;
    }
}

