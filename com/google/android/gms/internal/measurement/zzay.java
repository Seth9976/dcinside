package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class zzay {
    final List zza;

    protected zzay() {
        this.zza = new ArrayList();
    }

    final zzaq zza(String s) {
        zzbv zzbv0 = zzg.zza(s);
        if(!this.zza.contains(zzbv0)) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + s);
    }

    public abstract zzaq zza(String arg1, zzh arg2, List arg3);
}

