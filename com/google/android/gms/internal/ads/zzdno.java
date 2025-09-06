package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzr;

public final class zzdno extends zzdmy implements zzdds {
    private zzdds zza;

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        synchronized(this) {
            zzdds zzdds0 = this.zza;
            if(zzdds0 != null) {
                zzdds0.zzdd();
            }
        }
    }

    protected final void zzi(zza zza0, zzbif zzbif0, zzr zzr0, zzbih zzbih0, zzac zzac0, zzdds zzdds0) {
        synchronized(this) {
            super.zzh(zza0, zzbif0, zzr0, zzbih0, zzac0);
            this.zza = zzdds0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        synchronized(this) {
            zzdds zzdds0 = this.zza;
            if(zzdds0 != null) {
                zzdds0.zzu();
            }
        }
    }
}

