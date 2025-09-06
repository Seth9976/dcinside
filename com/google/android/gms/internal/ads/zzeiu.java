package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;

public final class zzeiu implements zzecw {
    @Nullable
    private final zzbdg zza;
    private final zzgcs zzb;
    private final zzfgn zzc;
    private final zzejd zzd;

    public zzeiu(zzfgn zzfgn0, zzgcs zzgcs0, @Nullable zzbdg zzbdg0, zzejd zzejd0) {
        this.zzc = zzfgn0;
        this.zzb = zzgcs0;
        this.zza = zzbdg0;
        this.zzd = zzejd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        zzcab zzcab0 = new zzcab();
        zzeiz zzeiz0 = new zzeiz();
        zzeiz0.zzd(new zzeit(this, zzcab0, zzfca0, zzfbo0, zzeiz0));
        return zzffx.zzd(() -> this.zza.zze(new zzbdb(zzeiz0, zzfbo0.zzs.zzb, zzfbo0.zzs.zza)), this.zzb, zzfgh.zzt, this.zzc).zzb(zzfgh.zzu).zzd(zzcab0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return this.zza != null && (zzfbo0.zzs != null && zzfbo0.zzs.zza != null);
    }

    // 检测为 Lambda 实现
    final void zzc(zzbdb zzbdb0) throws Exception [...]
}

