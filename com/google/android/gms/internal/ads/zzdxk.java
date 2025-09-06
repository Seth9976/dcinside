package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.TimeoutException;

public final class zzdxk implements zzgbo {
    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        zzv.zzp().zzv(((Exception)object0), "PreloadedLoader.getTypeTwoAdResponseString");
        if(((Exception)object0) instanceof TimeoutException) {
            return zzgch.zzg(new zzegu(1, "Timed out waiting for ad response."));
        }
        if(((Exception)object0) instanceof zzegu) {
            return zzgch.zzg(((zzegu)(((Exception)object0))));
        }
        return ((Exception)object0).getMessage() == null ? zzgch.zzg(new zzegu(1, "Fetch failed.")) : zzgch.zzg(new zzegu(1, ((Exception)object0).getMessage()));
    }
}

