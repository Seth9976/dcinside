package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

public final class zzez extends zzdg {
    private final String zza;
    private final String zzb;

    public zzez(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zzf() throws RemoteException {
        return this.zzb;
    }
}

