package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzhj {
    public interface zza {
        void doStartService(Context arg1, Intent arg2);
    }

    private final zza zza;

    public zzhj(zza zzhj$zza0) {
        Preconditions.checkNotNull(zzhj$zza0);
        this.zza = zzhj$zza0;
    }

    @MainThread
    public final void zza(Context context0, Intent intent0) {
        zzgo zzgo0 = zzhy.zza(context0, null, null).zzj();
        if(intent0 == null) {
            zzgo0.zzu().zza("Receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        zzgo0.zzp().zza("Local receiver got", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementService");
            intent1.setAction("com.google.android.gms.measurement.UPLOAD");
            zzgo0.zzp().zza("Starting wakeful intent.");
            this.zza.doStartService(context0, intent1);
            return;
        }
        if("com.android.vending.INSTALL_REFERRER".equals(s)) {
            zzgo0.zzu().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}

