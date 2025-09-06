package com.google.android.gms.measurement.internal;

import com.google.android.gms.tasks.OnFailureListener;

public final class zzgl implements OnFailureListener {
    private zzgm zza;
    private long zzb;

    public zzgl(zzgm zzgm0, long v) {
        this.zza = zzgm0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        this.zza.zza(this.zzb, exception0);
    }
}

