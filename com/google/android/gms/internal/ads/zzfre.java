package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

public final class zzfre extends zzfrd {
    private static zzfre zzd;

    static {
    }

    private zzfre(Context context0) {
        super(context0, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public final zzfra zzh(long v, boolean z) throws IOException {
        synchronized(zzfre.class) {
        }
        return this.zzb(null, null, v, z);
    }

    public final zzfra zzi(String s, String s1, long v, boolean z) throws IOException {
        synchronized(zzfre.class) {
        }
        return this.zzb(s, s1, v, z);
    }

    public static final zzfre zzj(Context context0) {
        synchronized(zzfre.class) {
            if(zzfre.zzd == null) {
                zzfre.zzd = new zzfre(context0);
            }
            return zzfre.zzd;
        }
    }

    public final void zzk() throws IOException {
        synchronized(zzfre.class) {
            this.zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized(zzfre.class) {
            this.zzf(true);
        }
    }
}

