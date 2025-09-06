package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzfey {
    private final zzfer zza;
    private final t0 zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfey(zzfdw zzfdw0, zzfeq zzfeq0, zzfer zzfer0) {
        this.zzc = false;
        this.zzd = false;
        this.zza = zzfer0;
        t0 t00 = zzgch.zzn(zzfeq0.zza(zzfer0), (zzfef zzfef0) -> {
            synchronized(this) {
                this.zzd = true;
                zzfeq0.zzb(zzfef0);
                if(!this.zzc) {
                    zzfdw0.zzd(zzfer0.zza(), zzfef0);
                    return zzgch.zzh(null);
                }
            }
            return zzgch.zzh(new zzfep(zzfef0, zzfer0));
        }, zzfer0.zzb());
        zzfex zzfex0 = (Exception exception0) -> synchronized(this) {
            this.zzd = true;
            throw exception0;
        };
        Executor executor0 = zzfer0.zzb();
        this.zzb = zzgch.zzf(t00, Exception.class, zzfex0, executor0);
    }

    public final t0 zza(zzfer zzfer0) {
        synchronized(this) {
            if(!this.zzd && !this.zzc && this.zza.zza() != null && zzfer0.zza() != null && this.zza.zza().equals(zzfer0.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
    }

    // 检测为 Lambda 实现
    final t0 zzb(zzfeq zzfeq0, zzfdw zzfdw0, zzfer zzfer0, zzfef zzfef0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzc(zzfeq zzfeq0, Exception exception0) throws Exception [...]

    public final void zzd(zzgcd zzgcd0) {
        synchronized(this) {
            zzfev zzfev0 = new zzfev();
            Executor executor0 = this.zza.zzb();
            zzgch.zzr(zzgch.zzn(this.zzb, zzfev0, executor0), zzgcd0, this.zza.zzb());
        }
    }
}

