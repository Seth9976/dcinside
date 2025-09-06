package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import o3.j;

@Deprecated
@j
public final class zzbcy {
    private final Map zza;
    private final zzbda zzb;

    public zzbcy(zzbda zzbda0) {
        this.zzb = zzbda0;
        this.zza = new HashMap();
    }

    public final zzbda zza() {
        return this.zzb;
    }

    public final void zzb(String s, @Nullable zzbcx zzbcx0) {
        this.zza.put(s, zzbcx0);
    }

    public final void zzc(String s, String s1, long v) {
        zzbcx zzbcx0 = (zzbcx)this.zza.get(s1);
        String[] arr_s = {s};
        if(zzbcx0 != null) {
            this.zzb.zze(zzbcx0, v, arr_s);
        }
        zzbcx zzbcx1 = new zzbcx(v, null, null);
        this.zza.put(s, zzbcx1);
    }
}

