package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.AdapterStatus;

final class zzet implements AdapterStatus {
    zzet(zzex zzex0) {
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final State getInitializationState() {
        return State.READY;
    }

    @Override  // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return 0;
    }
}

