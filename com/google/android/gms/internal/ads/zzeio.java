package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzeio implements zzg {
    final AtomicBoolean zza;
    private final zzcvr zzb;
    private final zzcwl zzc;
    private final zzddu zzd;
    private final zzddm zze;
    private final zzcnh zzf;

    zzeio(zzcvr zzcvr0, zzcwl zzcwl0, zzddu zzddu0, zzddm zzddm0, zzcnh zzcnh0) {
        this.zza = new AtomicBoolean(false);
        this.zzb = zzcvr0;
        this.zzc = zzcwl0;
        this.zzd = zzddu0;
        this.zze = zzddm0;
        this.zzf = zzcnh0;
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zza(View view0) {
        synchronized(this) {
            if(!this.zza.compareAndSet(false, true)) {
                return;
            }
            this.zzf.zzr();
            this.zze.zza(view0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if(this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if(this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}

