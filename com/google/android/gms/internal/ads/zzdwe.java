package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;

public final class zzdwe implements zzgbo {
    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        Throwable throwable0 = (ExecutionException)object0;
        if(throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        return zzgch.zzg(throwable0);
    }
}

