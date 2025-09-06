package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzk extends zzal {
    private final zzac zzk;

    public zzk(zzac zzac0) {
        super("internal.eventLogger");
        this.zzk = zzac0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        zzg.zza(this.zza, 3, list0);
        String s = zzh0.zza(((zzaq)list0.get(0))).zzf();
        long v = (long)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(1))).zze()));
        zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(2)));
        Map map0 = zzaq0 instanceof zzap ? zzg.zza(((zzap)zzaq0)) : new HashMap();
        this.zzk.zza(s, v, map0);
        return zzaq.zzc;
    }
}

