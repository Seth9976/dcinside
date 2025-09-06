package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbq extends zzay {
    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        if(s == null || s.isEmpty() || !zzh0.zzb(s)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", s));
        }
        zzaq zzaq0 = zzh0.zza(s);
        if(!(zzaq0 instanceof zzal)) {
            throw new IllegalArgumentException(String.format("Function %s is not defined", s));
        }
        return ((zzal)zzaq0).zza(zzh0, list0);
    }
}

