package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbsl implements DisplayOpenMeasurement {
    private final zzbgq zza;

    public zzbsl(zzbgq zzbgq0) {
        this.zza = zzbgq0;
        try {
            zzbgq0.zzm();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement
    public final void setView(View view0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            this.zza.zzp(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return false;
        }
    }
}

