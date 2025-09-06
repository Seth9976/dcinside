package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzbb {
    @e
    private Map zza;
    private zzbq zzb;

    public zzbb() {
        this.zza = new HashMap();
        this.zzb = new zzbq();
        this.zza(new zzaw());
        this.zza(new zzba());
        this.zza(new zzbc());
        this.zza(new zzbg());
        this.zza(new zzbi());
        this.zza(new zzbo());
        this.zza(new zzbt());
    }

    private final void zza(zzay zzay0) {
        for(Object object0: zzay0.zza) {
            this.zza.put(((zzbv)object0).toString(), zzay0);
        }
    }

    public final zzaq zza(zzh zzh0, zzaq zzaq0) {
        zzg.zza(zzh0);
        if(zzaq0 instanceof zzat) {
            ArrayList arrayList0 = ((zzat)zzaq0).zzb();
            String s = ((zzat)zzaq0).zza();
            return this.zza.containsKey(s) ? ((zzay)this.zza.get(s)).zza(s, zzh0, arrayList0) : this.zzb.zza(s, zzh0, arrayList0);
        }
        return zzaq0;
    }
}

