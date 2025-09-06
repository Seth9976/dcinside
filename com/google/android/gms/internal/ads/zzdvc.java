package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdvc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final JSONObject zza;
    private List zzb;

    @VisibleForTesting
    zzdvc() {
        this.zza = new JSONObject();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, @Nullable String s) {
        if(s != null && this.zzb.contains(s)) {
            try {
                Object object0 = sharedPreferences0.getAll().get(s);
                if(object0 == null) {
                    this.zza.remove(s);
                    return;
                }
                this.zza.put(s, object0);
                return;
            }
            catch(JSONException jSONException0) {
            }
            zzv.zzp().zzv(jSONException0, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
        }
    }

    public final JSONObject zza() throws JSONException {
        return this.zza;
    }

    final void zzb(SharedPreferences sharedPreferences0, List list0) {
        this.zzb = list0;
        sharedPreferences0.registerOnSharedPreferenceChangeListener(this);
        for(Object object0: list0) {
            this.onSharedPreferenceChanged(sharedPreferences0, ((String)object0));
        }
    }
}

