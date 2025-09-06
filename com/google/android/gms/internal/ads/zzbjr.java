package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzbjr implements zzbjp {
    private final zzbjs zza;

    public zzbjr(zzbjs zzbjs0) {
        this.zza = zzbjs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        boolean z = "1".equals(map0.get("transparentBackground"));
        boolean z1 = "1".equals(map0.get("blur"));
        float f = 0.0f;
        try {
            if(map0.get("blurRadius") != null) {
                f = Float.parseFloat(((String)map0.get("blurRadius")));
            }
        }
        catch(NumberFormatException numberFormatException0) {
            zzo.zzh("Fail to parse float", numberFormatException0);
        }
        this.zza.zzc(z);
        this.zza.zzb(z1, f);
        ((zzcex)object0).zzay(z);
    }
}

