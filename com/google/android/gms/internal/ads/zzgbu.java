package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o3.a;

final class zzgbu extends zzgbh {
    @a
    private zzgbt zza;

    zzgbu(zzfxi zzfxi0, boolean z, Executor executor0, Callable callable0) {
        super(zzfxi0, z, false);
        this.zza = new zzgbs(this, callable0, executor0);
        this.zzv();
    }

    static void zzG(zzgbu zzgbu0, zzgbt zzgbt0) {
        zzgbu0.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbh
    final void zzf(int v, @a Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final void zzq() {
        zzgbt zzgbt0 = this.zza;
        if(zzgbt0 != null) {
            zzgbt0.zzh();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgbh
    final void zzu() {
        zzgbt zzgbt0 = this.zza;
        if(zzgbt0 != null) {
            zzgbt0.zzf();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgbh
    final void zzy(int v) {
        super.zzy(v);
        if(v == 1) {
            this.zza = null;
        }
    }
}

