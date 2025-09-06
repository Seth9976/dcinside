package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzbaq implements BaseOnConnectionFailedListener {
    final zzbar zza;

    zzbaq(zzbar zzbar0) {
        this.zza = zzbar0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        synchronized(this.zza.zzc) {
            this.zza.zzf = null;
            zzbar zzbar0 = this.zza;
            if(zzbar0.zzd != null) {
                zzbar.zzf(zzbar0, null);
            }
            this.zza.zzc.notifyAll();
        }
    }
}

