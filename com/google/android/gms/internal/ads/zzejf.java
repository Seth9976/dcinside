package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import j..util.concurrent.ConcurrentHashMap;
import o3.a;

public final class zzejf {
    private final ConcurrentHashMap zza;
    private final zzdpm zzb;

    public zzejf(zzdpm zzdpm0) {
        this.zza = new ConcurrentHashMap();
        this.zzb = zzdpm0;
    }

    // 去混淆评级： 低(20)
    @a
    public final zzbrd zza(String s) {
        return this.zza.containsKey(s) ? ((zzbrd)this.zza.get(s)) : null;
    }

    public final void zzb(String s) {
        try {
            zzbrd zzbrd0 = this.zzb.zzb(s);
            this.zza.put(s, zzbrd0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Couldn\'t create RTB adapter : ", remoteException0);
        }
    }
}

