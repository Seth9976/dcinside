package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;

final class zzaf extends zzbb {
    final Context zza;
    final zzbpe zzb;

    zzaf(zzba zzba0, Context context0, zzbpe zzbpe0) {
        this.zza = context0;
        this.zzb = zzbpe0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    protected final Object zza() {
        zzba.zzv(this.zza, "out_of_context_tester");
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbcl.zza(this.zza);
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzjm)).booleanValue() ? zzcp0.zzi(iObjectWrapper0, this.zzb, 244410000) : null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbcl.zza(this.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjm)).booleanValue()) {
            try {
                zzae zzae0 = new zzae();
                return ((zzdv)zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzae0)).zze(iObjectWrapper0, this.zzb, 244410000);
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
                zzbuh.zza(this.zza).zzh(zzr0, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}

