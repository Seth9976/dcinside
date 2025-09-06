package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzclq implements zzcla {
    private final Context zza;
    private final zzg zzb;

    public zzclq(Context context0) {
        this.zzb = zzv.zzp().zzi();
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        if(!map0.isEmpty()) {
            String s = (String)map0.get("gad_idless");
            if(s != null) {
                boolean z = Boolean.parseBoolean(s);
                this.zzb.zzD(z);
                if(z) {
                    zzad.zzc(this.zza);
                }
            }
        }
    }
}

