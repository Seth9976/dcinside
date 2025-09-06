package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class zzdrv {
    final zzdrw zza;
    private final Map zzb;

    @VisibleForTesting
    zzdrv(zzdrw zzdrw0) {
        this.zza = zzdrw0;
        super();
        this.zzb = new ConcurrentHashMap();
    }

    static zzdrv zza(zzdrv zzdrv0) {
        Map map0 = zzdrv0.zza.zzc;
        zzdrv0.zzb.putAll(map0);
        return zzdrv0;
    }

    public final zzdrv zzb(String s, @Nullable String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            this.zzb.put(s, s1);
        }
        return this;
    }

    public final zzdrv zzc(zzfbo zzfbo0) {
        this.zzb("aai", zzfbo0.zzw);
        this.zzb("request_id", zzfbo0.zzan);
        this.zzb("ad_format", zzfbo.zza(zzfbo0.zzb));
        return this;
    }

    public final zzdrv zzd(zzfbr zzfbr0) {
        this.zzb("gqi", zzfbr0.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(() -> this.zza.zza.zze(this.zzb));
    }

    public final void zzg() {
        zzdrs zzdrs0 = () -> this.zza.zza.zzg(this.zzb);
        this.zza.zzb.execute(zzdrs0);
    }

    public final void zzh() {
        zzdrt zzdrt0 = () -> this.zza.zza.zzf(this.zzb);
        this.zza.zzb.execute(zzdrt0);
    }

    // 检测为 Lambda 实现
    final void zzi() [...]

    // 检测为 Lambda 实现
    final void zzj() [...]

    // 检测为 Lambda 实现
    final void zzk() [...]
}

