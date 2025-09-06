package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

final class zzgcm extends AbstractOwnableSynchronizer implements Runnable {
    private final zzgcp zza;

    zzgcm(zzgcp zzgcp0, zzgco zzgco0) {
        this.zza = zzgcp0;
    }

    @Override
    public final void run() {
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }
}

