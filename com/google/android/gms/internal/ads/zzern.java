package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

public final class zzern implements Callable {
    @Override
    public final Object call() {
        Bundle bundle0 = new Bundle();
        Runtime runtime0 = Runtime.getRuntime();
        bundle0.putLong("runtime_free", runtime0.freeMemory());
        bundle0.putLong("runtime_max", runtime0.maxMemory());
        bundle0.putLong("runtime_total", runtime0.totalMemory());
        bundle0.putInt("web_view_count", zzv.zzp().zzb());
        return new zzerp(bundle0);
    }
}

