package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

final class zzbjg implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(((zzcex)object0).zzJ() != null) {
            ((zzcex)object0).zzJ().zza();
        }
        zzm zzm0 = ((zzcex)object0).zzL();
        if(zzm0 != null) {
            zzm0.zzb();
            return;
        }
        zzm zzm1 = ((zzcex)object0).zzM();
        if(zzm1 != null) {
            zzm1.zzb();
            return;
        }
        zzo.zzj("A GMSG tried to close something that wasn\'t an overlay.");
    }
}

