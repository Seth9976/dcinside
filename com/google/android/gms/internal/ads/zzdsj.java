package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public final class zzdsj {
    private final Clock zza;

    public zzdsj(Clock clock0) {
        this.zza = clock0;
    }

    public final void zza(List list0, String s, String s1, Object[] arr_object) {
        if(!((Boolean)zzben.zza.zze()).booleanValue()) {
            return;
        }
        long v = this.zza.currentTimeMillis();
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        try {
            jsonWriter0.beginObject();
            jsonWriter0.name("timestamp").value(v);
            jsonWriter0.name("source").value(s);
            jsonWriter0.name("event").value(s1);
            jsonWriter0.name("components").beginArray();
            for(Object object0: list0) {
                jsonWriter0.value(object0.toString());
            }
            jsonWriter0.endArray();
            jsonWriter0.name("params").beginArray();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object1 = arr_object[v1];
                jsonWriter0.value((object1 == null ? null : object1.toString()));
            }
            jsonWriter0.endArray();
            jsonWriter0.endObject();
            jsonWriter0.flush();
            jsonWriter0.close();
        }
        catch(IOException iOException0) {
            zzo.zzh("unable to log", iOException0);
        }
        zzo.zzi(("AD-DBG " + stringWriter0.toString()));
    }
}

