package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.util.Map;

public final class zzj implements zzk {
    public final int zza;
    public final Map zzb;

    public zzj(int v, Map map0) {
        this.zza = v;
        this.zzb = map0;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter0) {
        zzl.zzb(this.zza, this.zzb, jsonWriter0);
    }
}

