package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zze;
import com.google.android.gms.ads.internal.util.client.zzt;

public final class zzl implements zze {
    public final Context zza;
    public final String zzb;

    public zzl(Context context0, String s) {
        this.zza = context0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String s) {
        zzs.zzM(this.zza, this.zzb, s);
        return zzt.zza;
    }
}

