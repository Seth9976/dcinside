package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;

public final class zzbfe {
    private final Context zza;

    public zzbfe(Context context0) {
        this.zza = context0;
    }

    public final void zza(zzbuo zzbuo0) {
        try {
            zzbfd zzbfd0 = new zzbfd();
            ((zzbff)zzs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbfd0)).zze(zzbuo0);
        }
        catch(zzr zzr0) {
            zzo.zzj(("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:" + zzr0.getMessage()));
        }
        catch(RemoteException remoteException0) {
            zzo.zzj(("Error calling setFlagsAccessedBeforeInitializedListener: " + remoteException0.getMessage()));
        }
    }
}

