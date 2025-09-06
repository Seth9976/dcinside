package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

@RequiresApi(api = 21)
public final class zzbkl extends zzbkn {
    private final OnH5AdsEventListener zza;

    public zzbkl(OnH5AdsEventListener onH5AdsEventListener0) {
        this.zza = onH5AdsEventListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbko
    public final void zzb(String s) {
        this.zza.onH5AdsEvent(s);
    }
}

