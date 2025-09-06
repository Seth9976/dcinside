package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class zzx extends zzal {
    private final Callable zzk;

    public zzx(String s, Callable callable0) {
        super(s);
        this.zzk = callable0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        try {
            return zzj.zza(this.zzk.call());
        }
        catch(Exception unused_ex) {
            return zzaq.zzc;
        }
    }
}

