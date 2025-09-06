package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.Map;

public final class zzbis implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        Object object1 = map0.get("u");
        if(((String)object1) == null) {
            zzo.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        zzv zzv0 = ((zzceo)(((zzcge)object0))).zzD() == null ? null : ((zzceo)(((zzcge)object0))).zzD().zzax;
        new zzbw(((zzcge)object0).getContext(), ((zzcgl)(((zzcge)object0))).zzn().afmaVersion, ((String)object1), null, zzv0).zzb();
    }
}

