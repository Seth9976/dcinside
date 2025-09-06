package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;

public final class zzaxf extends zzaxr {
    public zzaxf(zzawd zzawd0, String s, String s1, zzasc zzasc0, int v, int v1) {
        super(zzawd0, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", zzasc0, v, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean boolean0 = (Boolean)zzbe.zzc().zza(zzbcl.zzcV);
        boolean0.booleanValue();
        zzavj zzavj0 = new zzavj(((String)this.zze.invoke(null, this.zza.zzb(), boolean0)));
        synchronized(this.zzd) {
            this.zzd.zzj(zzavj0.zza);
            this.zzd.zzC(zzavj0.zzb);
        }
    }
}

