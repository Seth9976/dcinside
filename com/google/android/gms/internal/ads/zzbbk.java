package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbbk implements Runnable {
    public final zzbbp zza;
    public final Context zzb;

    public zzbbk(zzbbp zzbbp0, Context context0) {
        this.zza = zzbbp0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzeW)).booleanValue();
        zzbbp zzbbp0 = this.zza;
        Context context0 = this.zzb;
        if(z) {
            try {
                zzbbp0.zza = (zzayf)zzs.zzb(context0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzbbl());
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                zzbbp0.zza.zze(iObjectWrapper0, "GMA_SDK");
                zzbbp0.zzb = true;
            }
            catch(zzr | RemoteException | NullPointerException unused_ex) {
                zzo.zze("Cannot dynamite load clearcut");
            }
        }
    }
}

