package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.AdapterStatus;

public final class zzblv implements AdapterStatus {
    private final State zza;
    private final String zzb;
    private final int zzc;

    public zzblv(State adapterStatus$State0, String s, int v) {
        this.zza = adapterStatus$State0;
        this.zzb = s;
        this.zzc = v;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final State getInitializationState() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzc;
    }
}

