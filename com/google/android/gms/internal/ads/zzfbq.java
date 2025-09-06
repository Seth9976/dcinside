package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

public final class zzfbq {
    private String zza;

    // This method was un-flattened
    zzfbq(JsonReader jsonReader0) throws IOException {
        jsonReader0.beginObject();
        String s = "";
        while(jsonReader0.hasNext()) {
            switch(jsonReader0.nextName()) {
                case "code": {
                    jsonReader0.nextInt();
                    break;
                }
                case "description": {
                    s = jsonReader0.nextString();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        this.zza = s;
    }

    public final String zza() {
        return this.zza;
    }
}

