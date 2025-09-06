package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.t0;

public final class zzeng implements zzgbo {
    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return ((AppSetIdInfo)object0) == null ? zzgch.zzh(new zzenj(null, -1)) : zzgch.zzh(new zzenj(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope()));
    }
}

