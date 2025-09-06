package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbic extends zzbhg {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbic(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener0) {
        this.zza = onAdManagerAdViewLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbhh
    public final void zze(zzby zzby0, IObjectWrapper iObjectWrapper0) {
        if(zzby0 != null && iObjectWrapper0 != null) {
            AdManagerAdView adManagerAdView0 = new AdManagerAdView(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            AppEventListener appEventListener0 = null;
            try {
                if(zzby0.zzi() instanceof zzg) {
                    zzg zzg0 = (zzg)zzby0.zzi();
                    adManagerAdView0.setAdListener((zzg0 == null ? null : zzg0.zzb()));
                }
                goto label_9;
            }
            catch(RemoteException remoteException0) {
            }
            zzo.zzh("", remoteException0);
            try {
            label_9:
                if(zzby0.zzj() instanceof zzayy) {
                    zzayy zzayy0 = (zzayy)zzby0.zzj();
                    if(zzayy0 != null) {
                        appEventListener0 = zzayy0.zzb();
                    }
                    adManagerAdView0.setAppEventListener(appEventListener0);
                }
            }
            catch(RemoteException remoteException1) {
                zzo.zzh("", remoteException1);
            }
            zzbib zzbib0 = new zzbib(this, adManagerAdView0, zzby0);
            zzf.zza.post(zzbib0);
        }
    }
}

