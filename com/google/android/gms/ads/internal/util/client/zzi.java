package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;

public final class zzi implements zzk {
    public final String zza;

    public zzi(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter0) {
        jsonWriter0.name("params").beginObject();
        String s = this.zza;
        if(s != null) {
            jsonWriter0.name("error_description").value(s);
        }
        jsonWriter0.endObject();
    }
}

