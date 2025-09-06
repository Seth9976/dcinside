package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

public final class zzpe {
    @Nullable
    private final Handler zza;
    @Nullable
    private final zzpf zzb;

    public zzpe(@Nullable Handler handler0, @Nullable zzpf zzpf0) {
        if(zzpf0 == null) {
            handler0 = null;
        }
        this.zza = handler0;
        this.zzb = zzpf0;
    }

    public final void zza(Exception exception0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zza(exception0));
        }
    }

    public final void zzb(Exception exception0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzh(exception0));
        }
    }

    public final void zzc(zzpg zzpg0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzi(zzpg0));
        }
    }

    public final void zzd(zzpg zzpg0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzj(zzpg0));
        }
    }

    public final void zze(String s, long v, long v1) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzb(s, v, v1));
        }
    }

    public final void zzf(String s) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzc(s));
        }
    }

    public final void zzg(zzhs zzhs0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzd(zzhs0));
        }
    }

    public final void zzh(zzhs zzhs0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zze(zzhs0));
        }
    }

    public final void zzi(zzab zzab0, @Nullable zzht zzht0) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzf(zzab0, zzht0));
        }
    }

    // 检测为 Lambda 实现
    final void zzj(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void zzk(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void zzl(zzpg zzpg0) [...]

    // 检测为 Lambda 实现
    final void zzm(zzpg zzpg0) [...]

    // 检测为 Lambda 实现
    final void zzn(String s, long v, long v1) [...]

    // 检测为 Lambda 实现
    final void zzo(String s) [...]

    // 检测为 Lambda 实现
    final void zzp(zzhs zzhs0) [...]

    // 检测为 Lambda 实现
    final void zzq(zzhs zzhs0) [...]

    // 检测为 Lambda 实现
    final void zzr(zzab zzab0, zzht zzht0) [...]

    // 检测为 Lambda 实现
    final void zzs(long v) [...]

    // 检测为 Lambda 实现
    final void zzt(boolean z) [...]

    // 检测为 Lambda 实现
    final void zzu(int v, long v1, long v2) [...]

    public final void zzv(long v) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzg(v));
        }
    }

    public final void zzw(boolean z) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzn(z));
        }
    }

    public final void zzx(int v, long v1, long v2) {
        Handler handler0 = this.zza;
        if(handler0 != null) {
            handler0.post(() -> this.zzb.zzk(v, v1, v2));
        }
    }
}

