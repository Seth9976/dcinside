package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

public final class zzwc extends zzbq {
    private static final Object zzb;
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    @Nullable
    private final zzar zzf;
    @Nullable
    private final zzal zzg;

    static {
        zzwc.zzb = new Object();
        zzaf zzaf0 = new zzaf();
        zzaf0.zza("SinglePeriodTimeline");
        zzaf0.zzb(Uri.EMPTY);
        zzaf0.zzc();
    }

    public zzwc(long v, long v1, long v2, long v3, long v4, long v5, long v6, boolean z, boolean z1, boolean z2, @Nullable Object object0, zzar zzar0, @Nullable zzal zzal0) {
        this.zzc = v3;
        this.zzd = v4;
        this.zze = z;
        zzar0.getClass();
        this.zzf = zzar0;
        this.zzg = zzal0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object object0) {
        return zzwc.zzb.equals(object0) ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int v, zzbo zzbo0, boolean z) {
        zzcw.zza(v, 0, 1);
        zzbo0.zzi(null, (z ? zzwc.zzb : null), 0, this.zzc, 0L, zzb.zza, false);
        return zzbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int v, zzbp zzbp0, long v1) {
        zzcw.zza(v, 0, 1);
        zzbp0.zza(zzbp.zza, this.zzf, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, this.zze, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int v) {
        zzcw.zza(v, 0, 1);
        return zzwc.zzb;
    }
}

