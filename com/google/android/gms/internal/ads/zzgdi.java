package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import o3.a;

final class zzgdi extends zzgbx implements RunnableFuture {
    @a
    private volatile zzgcp zza;

    zzgdi(zzgbn zzgbn0) {
        this.zza = new zzgdg(this, zzgbn0);
    }

    zzgdi(Callable callable0) {
        this.zza = new zzgdh(this, callable0);
    }

    @Override
    public final void run() {
        zzgcp zzgcp0 = this.zza;
        if(zzgcp0 != null) {
            zzgcp0.run();
        }
        this.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    @a
    protected final String zza() {
        zzgcp zzgcp0 = this.zza;
        return zzgcp0 == null ? super.zza() : "task=[" + zzgcp0.toString() + "]";
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        if(this.zzt()) {
            zzgcp zzgcp0 = this.zza;
            if(zzgcp0 != null) {
                zzgcp0.zzh();
            }
        }
        this.zza = null;
    }

    static zzgdi zze(Runnable runnable0, Object object0) {
        return new zzgdi(Executors.callable(runnable0, object0));
    }
}

