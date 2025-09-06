package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutorService;

public final class zzbbp {
    @VisibleForTesting
    zzayf zza;
    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbp() {
        this.zzc = zzb.zzb;
    }

    public zzbbp(Context context0) {
        this.zzc = zzb.zzb;
        zzbbk zzbbk0 = new zzbbk(this, context0);
        zzb.zzb.execute(zzbbk0);
    }
}

