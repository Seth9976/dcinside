package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class zzbje implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcex zzcex0 = (zzcex)object0;
        String s = (String)map0.get("args");
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            Iterator iterator0 = jSONObject0.keys();
            SharedPreferences.Editor sharedPreferences$Editor0 = PreferenceManager.getDefaultSharedPreferences(zzcex0.getContext()).edit();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                String s1 = (String)object1;
                Object object2 = jSONObject0.get(s1);
                if(object2 instanceof Integer) {
                    sharedPreferences$Editor0.putInt(s1, ((int)(((Integer)object2))));
                }
                else if(object2 instanceof Long) {
                    sharedPreferences$Editor0.putLong(s1, ((long)(((Long)object2))));
                }
                else if(object2 instanceof Double) {
                    sharedPreferences$Editor0.putFloat(s1, ((Double)object2).floatValue());
                }
                else if(object2 instanceof Float) {
                    sharedPreferences$Editor0.putFloat(s1, ((float)(((Float)object2))));
                }
                else if(object2 instanceof Boolean) {
                    sharedPreferences$Editor0.putBoolean(s1, ((Boolean)object2).booleanValue());
                }
                else if(object2 instanceof String) {
                    sharedPreferences$Editor0.putString(s1, ((String)object2));
                }
            }
            sharedPreferences$Editor0.apply();
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzv.zzp().zzw(jSONException0, "GMSG write local storage KV pairs handler");
    }
}

