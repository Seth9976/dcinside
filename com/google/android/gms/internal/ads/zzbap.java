package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

final class zzbap implements BaseConnectionCallbacks {
    final zzbar zza;

    zzbap(zzbar zzbar0) {
        this.zza = zzbar0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        synchronized(this.zza.zzc) {
            zzbar zzbar0 = this.zza;
            if(zzbar0.zzd != null) {
                try {
                    zzbar0.zzf = zzbar0.zzd.zzq();
                }
                catch(DeadObjectException deadObjectException0) {
                    zzo.zzh("Unable to obtain a cache service instance.", deadObjectException0);
                    zzbar.zzh(this.zza);
                }
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        synchronized(this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}

