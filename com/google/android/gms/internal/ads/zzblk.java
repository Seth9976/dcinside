package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzblk implements BaseConnectionCallbacks {
    final zzcab zza;
    final zzblm zzb;

    zzblk(zzblm zzblm0, zzcab zzcab0) {
        this.zza = zzcab0;
        this.zzb = zzblm0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        try {
            zzblg zzblg0 = this.zzb.zza.zzp();
            this.zza.zzc(zzblg0);
        }
        catch(DeadObjectException deadObjectException0) {
            this.zza.zzd(deadObjectException0);
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        RuntimeException runtimeException0 = new RuntimeException("onConnectionSuspended: " + v);
        this.zza.zzd(runtimeException0);
    }
}

