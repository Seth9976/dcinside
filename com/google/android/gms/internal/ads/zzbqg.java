package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbqg extends zzbpm {
    private final MediationInterscrollerAd zza;

    public zzbqg(MediationInterscrollerAd mediationInterscrollerAd0) {
        this.zza = mediationInterscrollerAd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpn
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpn
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}

