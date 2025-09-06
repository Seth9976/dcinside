package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdpt {
    public static String zza(@Nullable JSONObject jSONObject0, String s, String s1) {
        if(jSONObject0 != null) {
            JSONArray jSONArray0 = jSONObject0.optJSONArray(s1);
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
                    if(jSONObject1 != null) {
                        JSONArray jSONArray1 = jSONObject1.optJSONArray("including");
                        JSONArray jSONArray2 = jSONObject1.optJSONArray("excluding");
                        if(zzdpt.zzb(jSONArray1, s) && !zzdpt.zzb(jSONArray2, s)) {
                            return jSONObject1.optString("effective_ad_unit_id", "");
                        }
                    }
                }
            }
        }
        return "";
    }

    private static boolean zzb(@Nullable JSONArray jSONArray0, String s) {
        if(jSONArray0 != null && s != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                String s1 = jSONArray0.optString(v);
                try {
                    if((((Boolean)zzbe.zzc().zza(zzbcl.zzkN)).booleanValue() ? Pattern.compile(s1, 2) : Pattern.compile(s1)).matcher(s).lookingAt()) {
                        return true;
                    }
                }
                catch(PatternSyntaxException patternSyntaxException0) {
                    zzv.zzp().zzw(patternSyntaxException0, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}

