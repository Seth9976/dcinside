package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

final class zzbjf implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcex zzcex0 = (zzcex)object0;
        String s = (String)map0.get("args");
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            SharedPreferences.Editor sharedPreferences$Editor0 = PreferenceManager.getDefaultSharedPreferences(zzcex0.getContext()).edit();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                sharedPreferences$Editor0.remove(jSONArray0.getString(v));
            }
            sharedPreferences$Editor0.apply();
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzv.zzp().zzw(jSONException0, "GMSG clear local storage keys handler");
    }
}

