package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

public final class zzfnx implements OnFailureListener {
    public final zzfob zza;

    public zzfnx(zzfob zzfob0) {
        this.zza = zzfob0;
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        this.zza.zzf(exception0);
    }
}

