package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzbzc implements Runnable {
    final Context zza;
    final zzcab zzb;

    zzbzc(zzbzd zzbzd0, Context context0, zzcab zzcab0) {
        this.zza = context0;
        this.zzb = zzcab0;
        super();
    }

    @Override
    public final void run() {
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
            this.zzb.zzc(advertisingIdClient$Info0);
        }
        catch(IOException | IllegalStateException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
            this.zzb.zzd(iOException0);
            zzo.zzh("Exception while getting advertising Id info", iOException0);
        }
    }
}

