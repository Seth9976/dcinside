package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final class zzq implements Callable {
    private final long zza;

    zzq(long v) {
        this.zza = v;
    }

    @Override
    public final Object call() {
        if(AdOverlayInfoParcel.zzz.remove(this.zza) != null) {
            zzv.zzp().zzw(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        }
        return null;
    }
}

