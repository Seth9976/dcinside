package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

public final class zzfrf extends zzfrd {
    private static zzfrf zzd;

    static {
    }

    private zzfrf(Context context0) {
        super(context0, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public final zzfra zzh(long v, boolean z) throws IOException {
        synchronized(zzfrf.class) {
            if(!this.zzc.zzd()) {
                return new zzfra();
            }
        }
        return this.zzb(null, null, v, z);
    }

    public static final zzfrf zzi(Context context0) {
        synchronized(zzfrf.class) {
            if(zzfrf.zzd == null) {
                zzfrf.zzd = new zzfrf(context0);
            }
            return zzfrf.zzd;
        }
    }

    public final void zzj() throws IOException {
        synchronized(zzfrf.class) {
            if(this.zzg(false)) {
                this.zzf(false);
            }
        }
    }
}

