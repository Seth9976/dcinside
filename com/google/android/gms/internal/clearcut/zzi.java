package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Status;

final class zzi extends zzg {
    private final zzh zzap;

    zzi(zzh zzh0) {
        this.zzap = zzh0;
        super(null);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzg
    public final void zza(Status status0) {
        this.zzap.setResult(status0);
    }
}

