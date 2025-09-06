package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

public final class zzabb {
    @Nullable
    private final Handler zza;
    @Nullable
    private final zzabc zzb;

    public zzabb(@Nullable Handler handler0, @Nullable zzabc zzabc0) {
        if(zzabc0 == null) {
            handler0 = null;
        }
        this.zza = handler0;
        this.zzb = zzabc0;
    }

    public final void zza(String s, long v, long v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzp(s, v, v1));
        }
    }

    public final void zzb(String s) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzq(s));
        }
    }

    public final void zzc(zzhs zzhs0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzr(zzhs0));
        }
    }

    public final void zzd(int v, long v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzl(v, v1));
        }
    }

    public final void zze(zzhs zzhs0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzs(zzhs0));
        }
    }

    public final void zzf(zzab zzab0, @Nullable zzht zzht0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzu(zzab0, zzht0));
        }
    }

    // 检测为 Lambda 实现
    final void zzg(String s, long v, long v1) [...]

    // 检测为 Lambda 实现
    final void zzh(String s) [...]

    // 检测为 Lambda 实现
    final void zzi(zzhs zzhs0) [...]

    // 检测为 Lambda 实现
    final void zzj(int v, long v1) [...]

    // 检测为 Lambda 实现
    final void zzk(zzhs zzhs0) [...]

    // 检测为 Lambda 实现
    final void zzl(zzab zzab0, zzht zzht0) [...]

    // 检测为 Lambda 实现
    final void zzm(Object object0, long v) [...]

    // 检测为 Lambda 实现
    final void zzn(long v, int v1) [...]

    // 检测为 Lambda 实现
    final void zzo(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void zzp(zzcd zzcd0) [...]

    public final void zzq(Object object0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzm(object0, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long v, int v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzt(v, v1));
        }
    }

    public final void zzs(Exception exception0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzo(exception0));
        }
    }

    public final void zzt(zzcd zzcd0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzv(zzcd0));
        }
    }
}

