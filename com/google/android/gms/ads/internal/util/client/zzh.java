package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;

public final class zzh implements zzk {
    public final byte[] zza;

    public zzh(byte[] arr_b) {
        this.zza = arr_b;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter0) {
        jsonWriter0.name("params").beginObject();
        String s = Base64Utils.encode(this.zza);
        if(this.zza.length < 10000) {
            jsonWriter0.name("body").value(s);
        }
        else {
            String s1 = zzf.zzf(s);
            if(s1 != null) {
                jsonWriter0.name("bodydigest").value(s1);
            }
        }
        jsonWriter0.name("bodylength").value(((long)this.zza.length));
        jsonWriter0.endObject();
    }
}

