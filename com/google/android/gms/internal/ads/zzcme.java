package com.google.android.gms.internal.ads;

import android.net.Uri.Builder;
import android.view.InputEvent;
import com.google.common.util.concurrent.t0;

public final class zzcme implements zzgbo {
    public final zzcmk zza;
    public final Uri.Builder zzb;
    public final String zzc;
    public final InputEvent zzd;

    public zzcme(zzcmk zzcmk0, Uri.Builder uri$Builder0, String s, InputEvent inputEvent0) {
        this.zza = zzcmk0;
        this.zzb = uri$Builder0;
        this.zzc = s;
        this.zzd = inputEvent0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, ((Integer)object0));
    }
}

