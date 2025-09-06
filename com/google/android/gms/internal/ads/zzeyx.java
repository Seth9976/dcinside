package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzeyx implements zzfuc {
    final zzezb zza;

    zzeyx(zzezb zzezb0) {
        this.zza = zzezb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    @NullableDecl
    public final Object apply(@NullableDecl Object object0) {
        zzo.zzh("", ((zzdyh)object0));
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyz zzeyz0 = new zzeyz(null, this.zza.zze(), null);
        this.zza.zzd = zzeyz0;
        return this.zza.zzd;
    }
}

