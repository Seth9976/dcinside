package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbuh;

public final class zze implements Runnable {
    public final BaseAdView zza;

    public zze(BaseAdView baseAdView0) {
        this.zza = baseAdView0;
    }

    @Override
    public final void run() {
        BaseAdView baseAdView0;
        try {
            baseAdView0 = this.zza;
            baseAdView0.zza.zzk();
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(baseAdView0.getContext()).zzh(illegalStateException0, "BaseAdView.destroy");
        }
    }
}

