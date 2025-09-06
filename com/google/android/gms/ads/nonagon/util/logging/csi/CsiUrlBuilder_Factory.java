package com.google.android.gms.ads.nonagon.util.logging.csi;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzher;

public final class CsiUrlBuilder_Factory implements zzher {
    @NonNull
    public static CsiUrlBuilder_Factory create() {
        return zza.zza;
    }

    @NonNull
    public CsiUrlBuilder get() {
        return CsiUrlBuilder_Factory.newInstance();
    }

    @NonNull
    public static CsiUrlBuilder newInstance() {
        return new CsiUrlBuilder();
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @NonNull
    public final Object zzb() {
        return this.get();
    }
}

