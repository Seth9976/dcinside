package com.google.android.gms.ads.h5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbkv;

public final class H5AdsRequestHandler {
    private final zzbkv zza;

    public H5AdsRequestHandler(@NonNull Context context0, @NonNull OnH5AdsEventListener onH5AdsEventListener0) {
        this.zza = new zzbkv(context0, onH5AdsEventListener0);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(@NonNull String s) {
        return this.zza.zzb(s);
    }

    public boolean shouldInterceptRequest(@NonNull String s) {
        return zzbkv.zzc(s);
    }
}

