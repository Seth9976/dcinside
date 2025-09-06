package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzc extends zzb {
    private final Context zza;

    zzc(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        }
        catch(IOException | IllegalStateException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
            zzo.zzh("Fail to get isAdIdFakeForDebugLogging", iOException0);
            z = false;
        }
        zzl.zzj(z);
        zzo.zzj(("Update ad debug logging enablement as " + z));
    }
}

