package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzfcs implements zzbjp {
    public final zzfja zza;
    public final zzebk zzb;

    public zzfcs(zzfja zzfja0, zzebk zzebk0) {
        this.zza = zzfja0;
        this.zzb = zzebk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        Object object1 = map0.get("u");
        if(((String)object1) == null) {
            zzo.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        zzfbo zzfbo0 = ((zzceo)object0).zzD();
        if(zzfbo0 != null && !zzfbo0.zzai) {
            this.zza.zzd(((String)object1), zzfbo0.zzax, null);
            return;
        }
        zzfbr zzfbr0 = ((zzcga)(((zzceo)object0))).zzR();
        if(zzfbr0 == null) {
            zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
            return;
        }
        zzebm zzebm0 = new zzebm(zzv.zzC().currentTimeMillis(), zzfbr0.zzb, ((String)object1), 2);
        this.zzb.zzd(zzebm0);
    }
}

