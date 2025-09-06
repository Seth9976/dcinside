package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzz extends zzal {
    private final zzl zzk;
    @e
    private final Map zzl;

    public zzz(zzl zzl0) {
        super("require");
        this.zzl = new HashMap();
        this.zzk = zzl0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        zzg.zza("require", 1, list0);
        String s = zzh0.zza(((zzaq)list0.get(0))).zzf();
        if(this.zzl.containsKey(s)) {
            return (zzaq)this.zzl.get(s);
        }
        zzaq zzaq0 = this.zzk.zza(s);
        if(zzaq0 instanceof zzal) {
            this.zzl.put(s, ((zzal)zzaq0));
        }
        return zzaq0;
    }
}

