package com.google.android.gms.common.util;

import android.os.StrictMode.VmPolicy.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(0x1F)
final class zzb {
    @DoNotInline
    static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder strictMode$VmPolicy$Builder0) {
        return strictMode$VmPolicy$Builder0.permitUnsafeIntentLaunch();
    }
}

