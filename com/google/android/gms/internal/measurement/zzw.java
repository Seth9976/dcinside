package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzw extends zzal {
    private zzaa zzk;

    public zzw(zzaa zzaa0) {
        super("internal.registerCallback");
        this.zzk = zzaa0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        zzg.zza(this.zza, 3, list0);
        String s = zzh0.zza(((zzaq)list0.get(0))).zzf();
        zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(1)));
        if(!(zzaq0 instanceof zzar)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(2)));
        if(!(zzaq1 instanceof zzap)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        if(!((zzap)zzaq1).zzc("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String s1 = ((zzap)zzaq1).zza("type").zzf();
        int v = ((zzap)zzaq1).zzc("priority") ? zzg.zzb(((double)((zzap)zzaq1).zza("priority").zze())) : 1000;
        this.zzk.zza(s, v, ((zzar)zzaq0), s1);
        return zzaq.zzc;
    }
}

