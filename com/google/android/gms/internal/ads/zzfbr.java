package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import j..util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbr {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    @Nullable
    public final zzfbq zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    zzfbr(JsonReader jsonReader0) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Bundle bundle1;
        List list0 = Collections.emptyList();
        Bundle bundle0 = new Bundle();
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        jsonReader0.beginObject();
        String s = "";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        zzfbq zzfbq0 = null;
        int v = 0;
        int v1 = 0;
        boolean z = false;
        long v2 = -1L;
        long v3 = -1L;
        long v4 = 0L;
        int v5 = -1;
        int v6 = 1;
        String s6 = "";
        while(jsonReader0.hasNext()) {
            String s7 = jsonReader0.nextName();
            if(Objects.equals(s7, "nofill_urls")) {
                list0 = zzbs.zzd(jsonReader0);
            }
            else if("refresh_interval".equals(s7)) {
                v = jsonReader0.nextInt();
            }
            else if(Objects.equals(s7, "refresh_load_delay_time_interval")) {
                v5 = jsonReader0.nextInt();
            }
            else if("gws_query_id".equals(s7)) {
                s = jsonReader0.nextString();
            }
            else if("analytics_query_ad_event_id".equals(s7)) {
                s1 = jsonReader0.nextString();
            }
            else if("is_idless".equals(s7)) {
                z = jsonReader0.nextBoolean();
            }
            else if("response_code".equals(s7)) {
                v1 = jsonReader0.nextInt();
            }
            else if("latency".equals(s7)) {
                v4 = jsonReader0.nextLong();
            }
            else if(((Boolean)zzbe.zzc().zza(zzbcl.zzig)).booleanValue() && "public_error".equals(s7) && jsonReader0.peek() == JsonToken.BEGIN_OBJECT) {
                zzfbq0 = new zzfbq(jsonReader0);
            }
            else if("bidding_data".equals(s7)) {
                s6 = jsonReader0.nextString();
            }
            else if(((Boolean)zzbe.zzc().zza(zzbcl.zzkm)).booleanValue() && Objects.equals(s7, "topics_should_record_observation")) {
                jsonReader0.nextBoolean();
            }
            else if("adapter_response_replacement_key".equals(s7)) {
                s3 = jsonReader0.nextString();
            }
            else if("response_info_extras".equals(s7)) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzgE)).booleanValue()) {
                    try {
                        bundle1 = zzbs.zza(zzbs.zzi(jsonReader0));
                        if(bundle1 == null) {
                            continue;
                        }
                        goto label_67;
                    }
                    catch(JSONException | IOException unused_ex) {
                        continue;
                    }
                    catch(IllegalStateException unused_ex) {
                    }
                    jsonReader0.skipValue();
                    continue;
                label_67:
                    bundle0 = bundle1;
                }
                else {
                    jsonReader0.skipValue();
                }
            }
            else if("adRequestPostBody".equals(s7)) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjg)).booleanValue()) {
                    s5 = jsonReader0.nextString();
                }
                else {
                    jsonReader0.skipValue();
                }
            }
            else if(!"adRequestUrl".equals(s7)) {
                zzbcc zzbcc0 = zzbcl.zzjh;
                if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() && Objects.equals(s7, "adResponseBody")) {
                    s2 = jsonReader0.nextString();
                }
                else if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() && Objects.equals(s7, "adResponseHeaders")) {
                    jSONObject0 = zzbs.zzi(jsonReader0);
                }
                else if(Objects.equals(s7, "max_parallel_renderers")) {
                    v6 = Math.max(1, jsonReader0.nextInt());
                }
                else if(((Boolean)zzbe.zzc().zza(zzbcl.zzjo)).booleanValue() && Objects.equals(s7, "inspector_ad_transaction_extras")) {
                    jSONObject1 = zzbs.zzi(jsonReader0);
                }
                else {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzcl)).booleanValue() && Objects.equals(s7, "latency_extras")) {
                        try {
                            Bundle bundle2 = zzbs.zza(zzbs.zzi(jsonReader0));
                            if(bundle2 == null) {
                                continue;
                            }
                            v3 = zzfbr.zza(bundle2.getDouble("start_time"));
                            v2 = zzfbr.zza(bundle2.getDouble("end_time"));
                        }
                        catch(JSONException | IOException unused_ex) {
                        }
                        catch(IllegalStateException unused_ex) {
                            jsonReader0.skipValue();
                        }
                        continue;
                    }
                    jsonReader0.skipValue();
                }
            }
            else if(((Boolean)zzbe.zzc().zza(zzbcl.zzjg)).booleanValue()) {
                s4 = jsonReader0.nextString();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        this.zza = list0;
        this.zzc = v;
        if(((Boolean)zzber.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        }
        else {
            zzbdv zzbdv0 = zzbdz.zza;
            this.zzd = ((long)(((Long)zzbdv0.zze()))) > -1L ? ((Long)zzbdv0.zze()).intValue() : v5;
        }
        this.zzb = s;
        this.zze = s1;
        this.zzf = v1;
        this.zzg = v4;
        this.zzj = zzfbq0;
        this.zzh = z;
        this.zzi = s6;
        this.zzk = bundle0;
        this.zzl = s4;
        this.zzm = s5;
        this.zzn = s2;
        this.zzo = jSONObject0;
        this.zzp = jSONObject1;
        this.zzq = s3;
        zzbdv zzbdv1 = zzbep.zza;
        if(((long)(((Long)zzbdv1.zze()))) > 0L) {
            v6 = ((Long)zzbdv1.zze()).intValue();
        }
        this.zzr = v6;
        this.zzs = v3;
        this.zzt = v2;
    }

    private static final long zza(double f) {
        return f > 9223372036854776000.0 || f < -9223372036854776000.0 ? -1L : ((long)f);
    }
}

