package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfvc;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzad {
    public static Bundle zza(Context context0, String s, SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        if(TextUtils.isEmpty(s)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context0).registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener0);
        return zzad.zzb(context0, s);
    }

    @NonNull
    public static Bundle zzb(Context context0, String s) {
        Object object0;
        String s3;
        SharedPreferences sharedPreferences0;
        int v1;
        JSONArray jSONArray0;
        if(TextUtils.isEmpty(s)) {
            jSONArray0 = null;
        }
        else {
            try {
                jSONArray0 = new JSONArray(s);
            }
            catch(JSONException jSONException0) {
                zzo.zzf("JSON parsing error", jSONException0);
                jSONArray0 = null;
            }
        }
        if(jSONArray0 == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle0 = new Bundle();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            String s1 = jSONObject0.optString("bk");
            String s2 = jSONObject0.optString("sk");
            switch(jSONObject0.optInt("type", -1)) {
                case 0: {
                    v1 = 1;
                    break;
                }
                case 1: {
                    v1 = 2;
                    break;
                }
                case 2: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && v1 != 0) {
                List list0 = zzfvc.zzb(zzfty.zzc('/')).zzf(s2);
                if(list0.size() <= 2 && !list0.isEmpty()) {
                    if(list0.size() == 1) {
                        sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(context0);
                        s3 = (String)list0.get(0);
                    }
                    else {
                        sharedPreferences0 = context0.getSharedPreferences(((String)list0.get(0)), 0);
                        s3 = (String)list0.get(1);
                    }
                    object0 = sharedPreferences0.getAll().get(s3);
                }
                else {
                    object0 = null;
                }
                if(object0 != null) {
                    switch(v1 - 1) {
                        case 0: {
                            if(object0 instanceof String) {
                                bundle0.putString(s1, ((String)object0));
                            }
                            break;
                        }
                        case 1: {
                            if(object0 instanceof Integer) {
                                bundle0.putInt(s1, ((int)(((Integer)object0))));
                            }
                            else if(object0 instanceof Long) {
                                bundle0.putLong(s1, ((long)(((Long)object0))));
                            }
                            else if(object0 instanceof Float) {
                                bundle0.putFloat(s1, ((float)(((Float)object0))));
                            }
                            break;
                        }
                        default: {
                            if(object0 instanceof Boolean) {
                                bundle0.putBoolean(s1, ((Boolean)object0).booleanValue());
                            }
                        }
                    }
                }
            }
        }
        return bundle0;
    }

    public static void zzc(Context context0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && context0 != null) {
            context0.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfre zzfre0 = zzfre.zzj(context0);
            zzfrf zzfrf0 = zzfrf.zzi(context0);
            zzfrg zzfrg0 = zzfrg.zza(context0);
            zzfre0.zzk();
            zzfre0.zzl();
            zzfrf0.zzj();
            zzfrg0.zzb(null);
        }
        catch(IOException iOException0) {
            zzv.zzp().zzw(iOException0, "clearStorageOnIdlessMode");
        }
        try {
            if(!context0.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        }
        catch(IOException iOException1) {
            zzv.zzp().zzw(iOException1, "clearStorageOnIdlessMode_scar");
        }
    }
}

