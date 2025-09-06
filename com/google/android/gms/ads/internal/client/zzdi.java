package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzdi implements MuteThisAdReason {
    private final String zza;
    private final zzdh zzb;

    public zzdi(zzdh zzdh0) {
        String s;
        this.zzb = zzdh0;
        try {
            s = zzdh0.zze();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            s = null;
        }
        this.zza = s;
    }

    @Override  // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    @Override
    public final String toString() {
        return this.zza;
    }

    public final zzdh zza() {
        return this.zzb;
    }
}

