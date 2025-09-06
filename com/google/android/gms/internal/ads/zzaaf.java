package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

final class zzaaf implements zzbl {
    private final zzca zza;

    public zzaaf(zzca zzca0) {
        this.zza = zzca0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbl
    public final zzbm zza(Context context0, zzk zzk0, zzn zzn0, zzcc zzcc0, Executor executor0, List list0, long v) throws zzbz {
        try {
            return ((zzbl)Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzca.class).newInstance(this.zza)).zza(context0, zzk0, zzn0, zzcc0, executor0, list0, 0L);
        }
        catch(Exception exception0) {
            throw exception0 instanceof zzbz ? ((zzbz)exception0) : new zzbz(exception0, 0x8000000000000001L);
        }
    }
}

