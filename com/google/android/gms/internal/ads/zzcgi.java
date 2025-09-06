package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcgi {
    private static final Pattern zza;
    private static final Pattern zzb;

    static {
        zzcgi.zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
        zzcgi.zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
    }

    @Nullable
    public static String zza(zzfbo zzfbo0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && zzfbo0.zzT && zzfbo0.zzV.zzb() && zzfbo0.zzb != 4) {
            zzecn zzecn0 = zzfbo0.zzV.zzc() == 1 ? zzecn.zzc : zzecn.zza;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("creativeType", zzecn0.toString());
                jSONObject0.put("contentUrl", zzfbo0.zzal);
                return "<script>Object.defineProperty(window,\'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV\',{get:function(){return " + jSONObject0.toString() + "}});</script>";
            }
            catch(JSONException jSONException0) {
                zzo.zzk("Unable to build OMID ENV JSON", jSONException0);
            }
        }
        return null;
    }

    public static String zzb(@NonNull String s, @Nullable String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Matcher matcher0 = zzcgi.zza.matcher(s);
        if(matcher0.find()) {
            int v = matcher0.end();
            stringBuilder0.append(s.substring(0, v));
            String s1 = arr_s[0];
            if(s1 != null) {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append(s.substring(v));
            return stringBuilder0.toString();
        }
        if(!zzcgi.zzb.matcher(s).find()) {
            String s2 = arr_s[0];
            if(s2 != null) {
                stringBuilder0.append(s2);
            }
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

