package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;

public final class zzeip implements zzecw {
    private final Context zza;
    private final zzcpq zzb;
    @Nullable
    private final zzbdg zzc;
    private final zzgcs zzd;
    private final zzfgn zze;

    public zzeip(Context context0, zzcpq zzcpq0, zzfgn zzfgn0, zzgcs zzgcs0, @Nullable zzbdg zzbdg0) {
        this.zza = context0;
        this.zzb = zzcpq0;
        this.zze = zzfgn0;
        this.zzd = zzgcs0;
        this.zzc = zzbdg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        zzein zzein0 = new zzein(this, new View(this.zza), null, new zzeil(), ((zzfbp)zzfbo0.zzu.get(0)));
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
        zzcon zzcon0 = this.zzb.zza(zzcrp0, zzein0);
        return zzffx.zzd(() -> this.zzc.zze(new zzbdb(zzcon0.zzl(), zzfbo0.zzs.zzb, zzfbo0.zzs.zza)), this.zzd, zzfgh.zzt, this.zze).zzb(zzfgh.zzu).zzd(zzgch.zzh(zzcon0.zza())).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return this.zzc != null && (zzfbo0.zzs != null && zzfbo0.zzs.zza != null);
    }

    // 检测为 Lambda 实现
    final void zzc(zzbdb zzbdb0) throws Exception [...]
}

