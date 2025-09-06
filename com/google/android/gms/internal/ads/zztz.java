package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

final class zztz extends zztu {
    public static final Object zzc;
    @Nullable
    private final Object zzd;
    @Nullable
    private final Object zze;

    static {
        zztz.zzc = new Object();
    }

    private zztz(zzbq zzbq0, @Nullable Object object0, @Nullable Object object1) {
        super(zzbq0);
        this.zzd = object0;
        this.zze = object1;
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final int zza(Object object0) {
        if(zztz.zzc.equals(object0)) {
            Object object1 = this.zze;
            if(object1 != null) {
                object0 = object1;
            }
        }
        return this.zzb.zza(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zzbo zzd(int v, zzbo zzbo0, boolean z) {
        this.zzb.zzd(v, zzbo0, z);
        if(Objects.equals(zzbo0.zzb, this.zze) && z) {
            zzbo0.zzb = zztz.zzc;
        }
        return zzbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final zzbp zze(int v, zzbp zzbp0, long v1) {
        this.zzb.zze(v, zzbp0, v1);
        if(Objects.equals(zzbp0.zzb, this.zzd)) {
            zzbp0.zzb = zzbp.zza;
        }
        return zzbp0;
    }

    @Override  // com.google.android.gms.internal.ads.zztu
    public final Object zzf(int v) {
        Object object0 = this.zzb.zzf(v);
        return Objects.equals(object0, this.zze) ? zztz.zzc : object0;
    }

    public final zztz zzp(zzbq zzbq0) {
        return new zztz(zzbq0, this.zzd, this.zze);
    }

    public static zztz zzq(zzar zzar0) {
        return new zztz(new zzua(zzar0), zzbp.zza, zztz.zzc);
    }

    public static zztz zzr(zzbq zzbq0, @Nullable Object object0, @Nullable Object object1) {
        return new zztz(zzbq0, object0, object1);
    }
}

