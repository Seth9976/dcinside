package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public final class zzah implements Callable {
    public final zzau zza;
    public final Uri zzb;
    public final IObjectWrapper zzc;

    public zzah(zzau zzau0, Uri uri0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzau0;
        this.zzb = uri0;
        this.zzc = iObjectWrapper0;
    }

    @Override
    public final Object call() {
        return this.zza.zzn(this.zzb, this.zzc);
    }
}

