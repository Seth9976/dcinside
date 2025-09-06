package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzfrg {
    final zzfrc zza;
    private static zzfrg zzb;

    static {
    }

    private zzfrg(Context context0) {
        this.zza = zzfrc.zzb(context0);
        zzfrb.zza(context0);
    }

    public static final zzfrg zza(Context context0) {
        synchronized(zzfrg.class) {
            if(zzfrg.zzb == null) {
                zzfrg.zzb = new zzfrg(context0);
            }
            return zzfrg.zzb;
        }
    }

    public final void zzb(@Nullable zzfra zzfra0) throws IOException {
        synchronized(zzfrg.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}

