package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzbwz implements RewardItem {
    private final zzbwm zza;

    public zzbwz(zzbwm zzbwm0) {
        this.zza = zzbwm0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbwm zzbwm0 = this.zza;
        if(zzbwm0 != null) {
            try {
                return zzbwm0.zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Could not forward getAmount to RewardItem", remoteException0);
            }
        }
        return 0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzbwm zzbwm0 = this.zza;
        if(zzbwm0 != null) {
            try {
                return zzbwm0.zzf();
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Could not forward getType to RewardItem", remoteException0);
            }
        }
        return null;
    }
}

