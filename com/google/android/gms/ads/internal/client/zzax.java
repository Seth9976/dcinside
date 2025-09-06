package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

final class zzax extends zzbb {
    final FrameLayout zza;
    final FrameLayout zzb;
    final Context zzc;
    final zzba zzd;

    zzax(zzba zzba0, FrameLayout frameLayout0, FrameLayout frameLayout1, Context context0) {
        this.zza = frameLayout0;
        this.zzb = frameLayout1;
        this.zzc = context0;
        this.zzd = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    protected final Object zza() {
        zzba.zzv(this.zzc, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        zzbcl.zza(this.zzc);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zzc);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(this.zza);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(this.zzb);
                zzaw zzaw0 = new zzaw();
                return zzbfz.zzdy(((zzbgd)zzs.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzaw0)).zze(iObjectWrapper0, iObjectWrapper1, iObjectWrapper2, 244410000));
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
                zzbuj zzbuj0 = zzbuh.zza(this.zzc);
                this.zzd.zzg = zzbuj0;
                this.zzd.zzg.zzh(zzr0, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        return this.zzd.zzd.zza(this.zzc, this.zza, this.zzb);
    }
}

