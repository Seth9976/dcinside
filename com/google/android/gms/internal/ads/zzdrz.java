package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class zzdrz implements zzfgo {
    private final Map zza;
    private final zzdrq zzb;
    private final Clock zzc;
    private final Map zzd;

    public zzdrz(zzdrq zzdrq0, Set set0, Clock clock0) {
        this.zzb = zzdrq0;
        this.zza = new HashMap();
        this.zzd = new HashMap();
        for(Object object0: set0) {
            zzfgh zzfgh0 = ((zzdry)object0).zzc;
            this.zzd.put(zzfgh0, ((zzdry)object0));
        }
        this.zzc = clock0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfgh0, String s) {
        if(this.zza.containsKey(zzfgh0)) {
            long v = this.zzc.elapsedRealtime();
            long v1 = (long)(((Long)this.zza.get(zzfgh0)));
            this.zzb.zzb().put("task." + s, "s." + Long.toString(v - v1));
        }
        if(this.zzd.containsKey(zzfgh0)) {
            this.zze(zzfgh0, true);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfgh0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfgh0, String s, Throwable throwable0) {
        if(this.zza.containsKey(zzfgh0)) {
            long v = this.zzc.elapsedRealtime();
            long v1 = (long)(((Long)this.zza.get(zzfgh0)));
            this.zzb.zzb().put("task." + s, "f." + Long.toString(v - v1));
        }
        if(this.zzd.containsKey(zzfgh0)) {
            this.zze(zzfgh0, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfgh0, String s) {
        Long long0 = this.zzc.elapsedRealtime();
        this.zza.put(zzfgh0, long0);
    }

    private final void zze(zzfgh zzfgh0, boolean z) {
        zzdry zzdry0 = (zzdry)this.zzd.get(zzfgh0);
        if(zzdry0 != null) {
            zzfgh zzfgh1 = zzdry0.zzb;
            if(this.zza.containsKey(zzfgh1)) {
                long v = this.zzc.elapsedRealtime();
                long v1 = (long)(((Long)this.zza.get(zzfgh1)));
                this.zzb.zzb().put("label." + zzdry0.zza, (z ? "s." : "f.") + (v - v1));
            }
        }
    }
}

