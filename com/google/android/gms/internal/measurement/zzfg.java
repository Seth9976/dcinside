package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzfg extends zza {
    private final Bundle zzc;
    private final Activity zzd;
    private final zzd zze;

    zzfg(zzd zzdy$zzd0, Bundle bundle0, Activity activity0) {
        this.zzc = bundle0;
        this.zzd = activity0;
        this.zze = zzdy$zzd0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        Bundle bundle0;
        if(this.zzc == null) {
            bundle0 = null;
        }
        else {
            bundle0 = new Bundle();
            if(this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object object0 = this.zzc.get("com.google.app_measurement.screen_service");
                if(object0 instanceof Bundle) {
                    bundle0.putBundle("com.google.app_measurement.screen_service", ((Bundle)object0));
                }
            }
        }
        ((zzdj)Preconditions.checkNotNull(zzdy.this.zzj)).onActivityCreated(ObjectWrapper.wrap(this.zzd), bundle0, this.zzb);
    }
}

