package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

final class zzad extends zzbb {
    final Activity zza;
    final zzba zzb;

    zzad(zzba zzba0, Activity activity0) {
        this.zza = activity0;
        this.zzb = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    protected final Object zza() {
        zzba.zzv(this.zza, "ad_overlay");
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzn(ObjectWrapper.wrap(this.zza));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzac zzac0 = new zzac();
                return zzbtd.zzI(((zzbth)zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzac0)).zze(iObjectWrapper0));
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
                zzbuj zzbuj0 = zzbuh.zza(this.zza.getApplicationContext());
                this.zzb.zzg = zzbuj0;
                this.zzb.zzg.zzh(zzr0, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        return this.zzb.zze.zza(this.zza);
    }
}

