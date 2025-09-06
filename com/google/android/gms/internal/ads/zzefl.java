package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzefl implements Callable {
    public final zzefq zza;
    public final t0 zzb;
    public final t0 zzc;
    public final zzfca zzd;
    public final zzfbo zze;
    public final JSONObject zzf;

    public zzefl(zzefq zzefq0, t0 t00, t0 t01, zzfca zzfca0, zzfbo zzfbo0, JSONObject jSONObject0) {
        this.zza = zzefq0;
        this.zzb = t00;
        this.zzc = t01;
        this.zzd = zzfca0;
        this.zze = zzfbo0;
        this.zzf = jSONObject0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

