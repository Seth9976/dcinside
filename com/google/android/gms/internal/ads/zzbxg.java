package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzbxg extends zzbwl {
    private final String zza;
    private final int zzb;

    public zzbxg(@Nullable RewardItem rewardItem0) {
        this((rewardItem0 == null ? "" : rewardItem0.getType()), (rewardItem0 == null ? 1 : rewardItem0.getAmount()));
    }

    public zzbxg(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwm
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwm
    public final String zzf() throws RemoteException {
        return this.zza;
    }
}

