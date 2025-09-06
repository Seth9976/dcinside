package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbml {
    public static void zza(zzbmm zzbmm0, String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzbc.zzb().zzj(map0);
        }
        catch(JSONException unused_ex) {
            zzo.zzj("Could not convert parameters to JSON.");
            return;
        }
        zzbmm0.zze(s, jSONObject0);
    }

    public static void zzb(zzbmm zzbmm0, String s, JSONObject jSONObject0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("(window.AFMA_ReceiveMessage || function() {})(\'");
        stringBuilder0.append(s);
        stringBuilder0.append("\',");
        stringBuilder0.append(jSONObject0.toString());
        stringBuilder0.append(");");
        zzo.zze(("Dispatching AFMA event: " + stringBuilder0.toString()));
        zzbmm0.zza(stringBuilder0.toString());
    }

    public static void zzc(zzbmm zzbmm0, String s, String s1) {
        zzbmm0.zza(s + "(" + s1 + ");");
    }

    public static void zzd(zzbmm zzbmm0, String s, JSONObject jSONObject0) {
        zzbmm0.zzb(s, jSONObject0.toString());
    }
}

