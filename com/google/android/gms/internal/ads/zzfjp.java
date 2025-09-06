package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import j..util.Optional;
import java.util.Locale;
import java.util.Map;

public final class zzfjp {
    private final zzdrw zza;

    zzfjp(zzdrw zzdrw0) {
        this.zza = zzdrw0;
    }

    public final void zza(AdFormat adFormat0, long v, Optional optional0, Optional optional1) {
        zzdrv zzdrv0 = this.zza.zza();
        zzdrv0.zzb("plaac_ts", Long.toString(v));
        zzdrv0.zzb("ad_format", adFormat0.name());
        zzdrv0.zzb("action", "is_ad_available");
        optional0.ifPresent(new zzfjl(zzdrv0));
        optional1.ifPresent(new zzfjm(zzdrv0));
        zzdrv0.zzg();
    }

    public final void zzb(@Nullable AdFormat adFormat0, long v, Optional optional0) {
        this.zzg(adFormat0, Optional.empty(), "pano_ts", v, optional0);
    }

    public final void zzc(@Nullable AdFormat adFormat0, long v) {
        this.zzg(adFormat0, Optional.empty(), "paeo_ts", v, Optional.empty());
    }

    public final void zzd(AdFormat adFormat0, long v) {
        this.zzg(adFormat0, Optional.of("poll_ad"), "ppac_ts", v, Optional.empty());
    }

    public final void zze(AdFormat adFormat0, long v, Optional optional0) {
        this.zzg(adFormat0, Optional.of("poll_ad"), "ppla_ts", v, optional0);
    }

    public final void zzf(Map map0, long v) {
        zzdrv zzdrv0 = this.zza.zza();
        zzdrv0.zzb("action", "start_preload");
        zzdrv0.zzb("sp_ts", Long.toString(v));
        for(Object object0: map0.keySet()) {
            zzdrv0.zzb(((AdFormat)object0).name().toLowerCase(Locale.ENGLISH) + "_count", Integer.toString(((int)(((Integer)map0.get(((AdFormat)object0)))))));
        }
        zzdrv0.zzg();
    }

    private final void zzg(@Nullable AdFormat adFormat0, Optional optional0, String s, long v, Optional optional1) {
        zzdrv zzdrv0 = this.zza.zza();
        zzdrv0.zzb(s, Long.toString(v));
        zzdrv0.zzb("ad_format", (adFormat0 == null ? "unknown" : adFormat0.name()));
        optional0.ifPresent(new zzfjn(zzdrv0));
        optional1.ifPresent(new zzfjo(zzdrv0));
        zzdrv0.zzg();
    }
}

