package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

final class zzfbk implements OnAdMetadataChangedListener {
    final zzcc zza;
    final zzfbl zzb;

    zzfbk(zzfbl zzfbl0, zzcc zzcc0) {
        this.zza = zzcc0;
        this.zzb = zzfbl0;
        super();
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if(this.zzb.zzd != null) {
            try {
                this.zza.zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

