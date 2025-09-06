package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

public final class zzflp {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzflp zza;
    private Context zzb;

    static {
        zzflp.zza = new zzflp();
    }

    public final Context zza() {
        return this.zzb;
    }

    public static zzflp zzb() {
        return zzflp.zza;
    }

    public final void zzc(Context context0) {
        this.zzb = context0 == null ? null : context0.getApplicationContext();
    }
}

