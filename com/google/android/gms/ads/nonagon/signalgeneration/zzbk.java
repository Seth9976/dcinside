package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbvk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public final class zzbk {
    public final String zza;
    public String zzb;
    @Nullable
    public String zzc;
    @Nullable
    public zzbvk zzd;
    @Nullable
    public Bundle zze;
    public Bundle zzf;
    private long zzg;
    private long zzh;

    // This method was un-flattened
    public zzbk(JsonReader jsonReader0, @Nullable zzbvk zzbvk0) throws IOException {
        this.zzc = null;
        this.zzf = new Bundle();
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbvk0;
        HashMap hashMap0 = new HashMap();
        jsonReader0.beginObject();
        String s = "";
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            if(s1 == null) {
                s1 = "";
            }
            switch(s1) {
                case "end_time": {
                    this.zzh = jsonReader0.nextLong();
                    break;
                }
                case "params": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "signal_dictionary": {
                    hashMap0 = new HashMap();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        hashMap0.put(jsonReader0.nextName(), jsonReader0.nextString());
                    }
                    jsonReader0.endObject();
                    break;
                }
                case "start_time": {
                    this.zzg = jsonReader0.nextLong();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        this.zza = s;
        jsonReader0.endObject();
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null && map$Entry0.getValue() != null) {
                this.zzf.putString(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
            }
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && zzbvk0 != null) {
            Bundle bundle0 = zzbvk0.zzm;
            if(bundle0 != null) {
                bundle0.putLong("get-signals-sdkcore-start", this.zzg);
                zzbvk0.zzm.putLong("get-signals-sdkcore-end", this.zzh);
            }
        }
    }
}

