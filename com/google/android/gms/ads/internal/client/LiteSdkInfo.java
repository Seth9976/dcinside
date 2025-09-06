package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbpe;

@KeepForSdk
public class LiteSdkInfo extends zzcv {
    public LiteSdkInfo(@NonNull Context context0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcw
    public zzbpe getAdapterCreator() {
        return new zzbpa();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcw
    public zzfb getLiteSdkVersion() {
        return new zzfb(244410203, 244410000, "23.6.0");
    }
}

