package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;
import java.util.HashMap;

final class zzaz extends zzbb {
    final View zza;
    final HashMap zzb;
    final HashMap zzc;
    final zzba zzd;

    zzaz(zzba zzba0, View view0, HashMap hashMap0, HashMap hashMap1) {
        this.zza = view0;
        this.zzb = hashMap0;
        this.zzc = hashMap1;
        this.zzd = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    protected final Object zza() {
        zzba.zzv(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        zzbcl.zza(this.zza.getContext());
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zzb);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(this.zzc);
                return zzbgf.zze(((zzbgj)zzs.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzay())).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2));
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
                zzbuj zzbuj0 = zzbuh.zza(this.zza.getContext());
                this.zzd.zzg = zzbuj0;
                this.zzd.zzg.zzh(zzr0, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        return this.zzd.zzf.zza(this.zza, this.zzb, this.zzc);
    }
}

