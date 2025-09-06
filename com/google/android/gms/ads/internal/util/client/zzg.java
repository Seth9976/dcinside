package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.util.Map;

public final class zzg implements zzk {
    public final String zza;
    public final String zzb;
    public final Map zzc;
    public final byte[] zzd;

    public zzg(String s, String s1, Map map0, byte[] arr_b) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = map0;
        this.zzd = arr_b;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter0) {
        zzl.zza(this.zza, this.zzb, this.zzc, this.zzd, jsonWriter0);
    }
}

