package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings.Global;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.common.util.concurrent.t0;

public final class zzd {
    public static void zza(Context context0) {
        if(((Boolean)zzbeh.zza.zze()).booleanValue()) {
            try {
                int v = Settings.Global.getInt(context0.getContentResolver(), "development_settings_enabled", 0);
            }
            catch(Exception exception0) {
                zzo.zzk("Fail to determine debug setting.", exception0);
                return;
            }
            if(v != 0 && !zzl.zzl()) {
                t0 t00 = new zzc(context0).zzb();
                zzo.zzi("Updating ad debug logging enablement.");
                zzbzz.zza(t00, "AdDebugLogUpdater.updateEnablement");
            }
        }
    }
}

