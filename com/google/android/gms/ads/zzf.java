package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbuh;

public final class zzf implements Runnable {
    public final BaseAdView zza;

    public zzf(BaseAdView baseAdView0) {
        this.zza = baseAdView0;
    }

    @Override
    public final void run() {
        BaseAdView baseAdView0;
        try {
            baseAdView0 = this.zza;
            baseAdView0.zza.zzn();
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(baseAdView0.getContext()).zzh(illegalStateException0, "BaseAdView.pause");
        }
    }
}

