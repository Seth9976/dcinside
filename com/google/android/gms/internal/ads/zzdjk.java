package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzdjk implements zzbjp {
    public final zzdjl zza;
    public final zzbhq zzb;

    public zzdjk(zzdjl zzdjl0, zzbhq zzbhq0) {
        this.zza = zzdjl0;
        this.zzb = zzbhq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzdjl zzdjl0;
        try {
            zzdjl0 = this.zza;
            zzdjl0.zzb = Long.parseLong(((String)map0.get("timestamp")));
        }
        catch(NumberFormatException unused_ex) {
            zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzbhq zzbhq0 = this.zzb;
        zzdjl0.zza = (String)map0.get("id");
        String s = (String)map0.get("asset_id");
        if(zzbhq0 == null) {
            zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbhq0.zzf(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

