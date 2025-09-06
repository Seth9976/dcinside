package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbz {
    public final List zza;
    public final zzfbr zzb;
    public final List zzc;
    @Nullable
    public final zzbvk zzd;

    zzfbz(JsonReader jsonReader0, @Nullable zzbvk zzbvk0) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.zzd = zzbvk0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && zzbvk0 != null) {
            Bundle bundle0 = zzbvk0.zzm;
            if(bundle0 != null) {
                bundle0.putLong("server-response-parse-start", zzv.zzC().currentTimeMillis());
            }
        }
        List list0 = Collections.emptyList();
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginObject();
        zzfbr zzfbr0 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if("responses".equals(s)) {
                jsonReader0.beginArray();
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    if("ad_configs".equals(s1)) {
                        list0 = new ArrayList();
                        jsonReader0.beginArray();
                        while(jsonReader0.hasNext()) {
                            list0.add(new zzfbo(jsonReader0));
                        }
                        jsonReader0.endArray();
                    }
                    else if(s1.equals("common")) {
                        zzfbr0 = new zzfbr(jsonReader0);
                        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzcl)).booleanValue() || zzbvk0 == null) {
                            continue;
                        }
                        Bundle bundle1 = zzbvk0.zzm;
                        if(bundle1 == null) {
                            continue;
                        }
                        bundle1.putLong("normalize-ad-response-start", zzfbr0.zzs);
                        zzbvk0.zzm.putLong("normalize-ad-response-end", zzfbr0.zzt);
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                jsonReader0.endObject();
                jsonReader0.endArray();
            }
            else if(s.equals("actions")) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    jsonReader0.beginObject();
                    String s2 = null;
                    JSONObject jSONObject0 = null;
                    while(jsonReader0.hasNext()) {
                        String s3 = jsonReader0.nextName();
                        if("name".equals(s3)) {
                            s2 = jsonReader0.nextString();
                        }
                        else if("info".equals(s3)) {
                            jSONObject0 = zzbs.zzi(jsonReader0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    if(s2 != null) {
                        arrayList0.add(new zzfby(s2, jSONObject0));
                    }
                    jsonReader0.endObject();
                }
                jsonReader0.endArray();
            }
        }
        this.zzc = arrayList0;
        this.zza = list0;
        if(zzfbr0 == null) {
            zzfbr0 = new zzfbr(new JsonReader(new StringReader("{}")));
        }
        this.zzb = zzfbr0;
    }

    public static zzfbz zza(Reader reader0, @Nullable zzbvk zzbvk0) throws zzfbs {
        try {
            return new zzfbz(new JsonReader(reader0), zzbvk0);
        }
        catch(IOException | IllegalStateException | JSONException | NumberFormatException | AssertionError iOException0) {
            throw new zzfbs("unable to parse ServerResponse", iOException0);
        }
        finally {
            IOUtils.closeQuietly(reader0);
        }
    }
}

