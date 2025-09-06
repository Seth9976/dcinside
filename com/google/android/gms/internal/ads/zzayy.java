package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzcl;

public final class zzayy extends zzcl {
    private final AppEventListener zza;

    public zzayy(AppEventListener appEventListener0) {
        this.zza = appEventListener0;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String s, String s1) {
        this.zza.onAppEvent(s, s1);
    }
}

