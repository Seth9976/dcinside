package com.google.android.gms.vision;

import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;
import p3.a;

@VisibleForTesting
public final class zzc {
    private static final Object zza;
    @a("lock")
    private static int zzb;
    @a("lock")
    private final SparseIntArray zzc;
    @a("lock")
    private final SparseIntArray zzd;

    static {
        zzc.zza = new Object();
    }

    public zzc() {
        this.zzc = new SparseIntArray();
        this.zzd = new SparseIntArray();
    }

    public final int zza(int v) {
        synchronized(zzc.zza) {
            int v2 = this.zzc.get(v, -1);
            if(v2 != -1) {
                return v2;
            }
            int v3 = zzc.zzb;
            zzc.zzb = v3 + 1;
            this.zzc.append(v, v3);
            this.zzd.append(v3, v);
            return v3;
        }
    }

    public final int zzb(int v) {
        synchronized(zzc.zza) {
        }
        return this.zzd.get(v);
    }
}

