package com.google.android.gms.common.util;

import android.os.StrictMode.VmPolicy.Builder;
import android.os.StrictMode.VmPolicy;
import android.os.StrictMode;

public final class zzc {
    public static StrictMode.VmPolicy zza() {
        StrictMode.VmPolicy strictMode$VmPolicy0 = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(zzb.zza(new StrictMode.VmPolicy.Builder(strictMode$VmPolicy0)).build());
        return strictMode$VmPolicy0;
    }
}

