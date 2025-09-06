package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzgj extends zzfxd {
    private final Map zza;

    public zzgj(Map map0) {
        this.zza = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final boolean containsKey(@Nullable Object object0) {
        return object0 != null && super.containsKey(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final boolean containsValue(@Nullable Object object0) {
        return super.zzd(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final Set entrySet() {
        return zzfzp.zzc(this.zza.entrySet(), new zzgh());
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final boolean equals(@Nullable Object object0) {
        return object0 != null && super.zze(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    @Nullable
    public final Object get(@Nullable Object object0) {
        return object0 == null ? null : ((List)this.zza.get(object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final int hashCode() {
        return super.zzc();
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final boolean isEmpty() {
        return this.zza.isEmpty() || super.size() == 1 && super.containsKey(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final Set keySet() {
        return zzfzp.zzc(this.zza.keySet(), new zzgi());
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    public final int size() {
        int v = super.containsKey(null);
        return super.size() - v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    protected final Object zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    protected final Map zzb() {
        return this.zza;
    }
}

