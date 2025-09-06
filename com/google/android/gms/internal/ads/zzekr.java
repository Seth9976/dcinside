package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzekr implements zza, zzdds {
    private zzbi zza;

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            zzbi zzbi0 = this.zza;
            if(zzbi0 != null) {
                try {
                    zzbi0.zzb();
                }
                catch(RemoteException remoteException0) {
                    zzo.zzk("Remote Exception at onAdClicked.", remoteException0);
                }
            }
        }
    }

    public final void zza(zzbi zzbi0) {
        synchronized(this) {
            this.zza = zzbi0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        synchronized(this) {
            zzbi zzbi0 = this.zza;
            if(zzbi0 != null) {
                try {
                    zzbi0.zzb();
                }
                catch(RemoteException remoteException0) {
                    zzo.zzk("Remote Exception at onPhysicalClick.", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        synchronized(this) {
        }
    }
}

