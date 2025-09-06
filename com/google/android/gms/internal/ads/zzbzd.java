package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.common.util.concurrent.t0;

public final class zzbzd {
    public final t0 zza(Context context0, int v) {
        t0 t00 = new zzcab();
        if(zzf.zzt(context0)) {
            zzbzc zzbzc0 = new zzbzc(this, context0, ((zzcab)t00));
            zzbzw.zza.execute(zzbzc0);
        }
        return t00;
    }
}

