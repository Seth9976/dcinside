package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

final class zzfbd implements OnAdMetadataChangedListener {
    final zzdo zza;
    final zzfbf zzb;

    zzfbd(zzfbf zzfbf0, zzdo zzdo0) {
        this.zza = zzdo0;
        this.zzb = zzfbf0;
        super();
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if(this.zzb.zzi != null) {
            try {
                this.zza.zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

