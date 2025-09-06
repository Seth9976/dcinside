package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzeyp implements zzgcd {
    zzeyp(zzeyr zzeyr0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zze.zza("Notification of cache hit failed.");
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@NullableDecl Object object0) {
        Void void0 = (Void)object0;
        zze.zza("Notification of cache hit successful.");
    }
}

