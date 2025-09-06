package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

public final class zzbnm extends zzcai {
    private final Object zza;
    private final zzbnr zzb;
    private boolean zzc;

    public zzbnm(zzbnr zzbnr0) {
        this.zza = new Object();
        this.zzb = zzbnr0;
    }

    public final void zzb() {
        zze.zza("release: Trying to acquire lock");
        synchronized(this.zza) {
            zze.zza("release: Lock acquired");
            if(this.zzc) {
                zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            this.zzj(new zzbnj(this), new zzcae());
            this.zzj(new zzbnk(this), new zzbnl(this));
        }
        zze.zza("release: Lock released");
    }
}

