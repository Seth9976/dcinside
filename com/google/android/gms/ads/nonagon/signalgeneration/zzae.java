package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfuc;
import java.util.List;

public final class zzae implements zzfuc {
    public final zzau zza;
    public final List zzb;

    public zzae(zzau zzau0, List list0) {
        this.zza = zzau0;
        this.zzb = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        return this.zza.zzB(this.zzb, ((String)object0));
    }
}

