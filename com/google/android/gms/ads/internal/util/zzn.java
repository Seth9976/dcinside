package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import java.util.concurrent.Callable;

public final class zzn implements Callable {
    public final Uri zza;

    public zzn(Uri uri0) {
        this.zza = uri0;
    }

    @Override
    public final Object call() {
        return zzs.zzP(this.zza);
    }
}

