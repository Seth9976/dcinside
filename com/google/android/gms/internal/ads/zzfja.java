package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzfja {
    private final Context zza;
    private final Executor zzb;
    private final zzgct zzc;
    private final zzu zzd;
    private final zzfir zze;
    private final zzfhk zzf;

    zzfja(Context context0, Executor executor0, zzgct zzgct0, zzu zzu0, zzfir zzfir0, zzfhk zzfhk0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzgct0;
        this.zzd = zzu0;
        this.zze = zzfir0;
        this.zzf = zzfhk0;
    }

    // 检测为 Lambda 实现
    final zzt zza(String s) throws Exception [...]

    // 检测为 Lambda 实现
    @VisibleForTesting
    final t0 zzc(String s, @Nullable zzv zzv0) [...]

    public final void zzd(String s, @Nullable zzv zzv0, @Nullable zzfhh zzfhh0) {
        if(zzfhk.zza() && ((Boolean)zzbee.zzd.zze()).booleanValue()) {
            zzfgw zzfgw0 = zzfgv.zza(this.zza, 14);
            zzfgw0.zzi();
            zzgch.zzr(this.zzc(s, zzv0), new zzfiz(this, zzfgw0, zzfhh0), this.zzb);
            return;
        }
        zzfiy zzfiy0 = () -> {
            if(zzv0 != null) {
                return new zzfiq(zzv0.zzb(), this.zzd, this.zzc, this.zze).zzd(s);
            }
            zzfix zzfix0 = () -> this.zzd.zza(s);
            return this.zzc.zzb(zzfix0);
        };
        this.zzb.execute(zzfiy0);
    }

    public final void zze(List list0, @Nullable zzv zzv0) {
        for(Object object0: list0) {
            this.zzd(((String)object0), zzv0, null);
        }
    }
}

