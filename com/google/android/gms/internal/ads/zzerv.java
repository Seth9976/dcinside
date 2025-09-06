package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.t0;

public final class zzerv implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;
    @Nullable
    private final PackageInfo zzc;
    private final zzg zzd;

    public zzerv(zzgcs zzgcs0, zzfcj zzfcj0, @Nullable PackageInfo packageInfo0, zzg zzg0) {
        this.zza = zzgcs0;
        this.zzb = zzfcj0;
        this.zzc = packageInfo0;
        this.zzd = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 26;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeru zzeru0 = () -> new zzerw(this.zzb, this.zzc, this.zzd);
        return this.zza.zzb(zzeru0);
    }

    // 检测为 Lambda 实现
    public static zzerw zzc(zzerv zzerv0) [...]
}

